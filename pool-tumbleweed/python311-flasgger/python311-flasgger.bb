SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.7.1"

RPM_NAME = "python311-flasgger-0.9.7.1-1.1.noarch.rpm"
RPM_HASH = "2acd113f99fff0cf15b5be9595b18a635a37a4f30cb762ac009eb28158b0a68fcf6eda21b39973a88523de337beda1b172e9e2416620027279166f0f87ce94b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flasgger \
python3.11dist-flasgger \
python311-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-PyYAML \
python311-jsonschema \
python311-mistune \
python311-packaging \
python311-six"

inherit rpm
