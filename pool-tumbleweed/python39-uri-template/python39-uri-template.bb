SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-uri-template-1.2.0-3.1.noarch.rpm"
RPM_HASH = "fd930ed086102ab071814d9a2f44a821c5af03c56478b1ae83e9dc17fbafea10d13865e5c568f97f11276c320c83d68cd61aadf36608e8cfd861b145fa31f229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uri-template) \
python39-uri-template \
python39-uri_template \
python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
