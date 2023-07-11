SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-uri-template-1.2.0-3.3.noarch.rpm"
RPM_HASH = "791301dce4a6dd5125c15a7fef60763fae811cb46488dba1192f7d7b697fe4721bec3d920445df26a1894ab7d8ab230706892e9466773d416e81a82a7bd3ad56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uri-template \
python310-uri-template \
python3dist-uri-template"

RDEPENDS:${PN} += "python-abi"

inherit rpm
