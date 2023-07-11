SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python310-flasgger-0.9.5-3.2.noarch.rpm"
RPM_HASH = "a4b22c8f26c1ef1db36c07c2d951fe471542180586decb34cc9769f56018b1d31ab83051ab638827e070ce1fa7a138089c7ec38d741be7af2299042d33cd7fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flasgger \
python310-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-PyYAML \
python310-jsonschema \
python310-mistune \
python310-six"

inherit rpm
