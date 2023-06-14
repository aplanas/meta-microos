SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python310-flasgger-0.9.5-3.1.noarch.rpm"
RPM_HASH = "2c2a3acd3cb1b3ee85e398f39c2a662901b93c719ca58a061a78d82ab7d653376ac8730fcef98be70db92046dae96dab80f095ed1ced37dcae26f89739496d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flasgger \
python3.10dist-flasgger \
python310-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-PyYAML \
python310-jsonschema \
python310-mistune \
python310-six"

inherit rpm
