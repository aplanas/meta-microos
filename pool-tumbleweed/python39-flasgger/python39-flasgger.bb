SUMMARY = "Tool to extract swagger specs from Flask projects"
DESCRIPTION = "Flasgger is a Flask extension to extract OpenAPI=Specification from all Flask views registered in an API."
LICENSE = "MIT"

PV = "0.9.7.1"

RPM_NAME = "python39-flasgger-0.9.7.1-1.1.noarch.rpm"
RPM_HASH = "70da9ef60253c1758127bc989dc62095bcd51b2683c47ea42077aa846bbde9f841bf7006eb626d5f0ab42f39b87e8f114eaf010423a989ab1312620a5fafd918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flasgger \
python39-flasgger \
python3dist-flasgger"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-PyYAML \
python39-jsonschema \
python39-mistune \
python39-packaging \
python39-six"

inherit rpm
