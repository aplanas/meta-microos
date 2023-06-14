SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python39-flasgger-0.9.5-3.1.noarch.rpm"
RPM_HASH = "3b2f485c22d556f3165255b352f57f1e3230dd2bb97cf522ce823591678784c03e14e0575bed0a0b802a684bb55d1146c042b6e8e25c01445df8486d94e606b2"
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
