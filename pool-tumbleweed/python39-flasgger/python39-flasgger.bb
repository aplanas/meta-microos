SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python39-flasgger-0.9.5-3.2.noarch.rpm"
RPM_HASH = "826a037a453fb8585c236898bdea24de605ceb79367c435daf5755b7b1e6ffc4b2a2052673b077dc1c525ec16d8a344e9925d64542f66ff722d83804e37c45b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flasgger \
python39-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-PyYAML \
python39-jsonschema \
python39-mistune \
python39-six"

inherit rpm
