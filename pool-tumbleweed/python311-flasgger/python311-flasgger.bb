SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python311-flasgger-0.9.5-3.2.noarch.rpm"
RPM_HASH = "571c81b7d1ad17d8f386dd4b0374772981bc7ad9fa556eb905a8930dec34c3fc598756bfca665c8984d6ff4fb5ad11afdfef06149fe172a85a5d8229bdf716fd"
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
python311-six"

inherit rpm
