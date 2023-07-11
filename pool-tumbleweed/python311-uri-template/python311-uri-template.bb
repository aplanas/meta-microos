SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-uri-template-1.2.0-3.3.noarch.rpm"
RPM_HASH = "e2e205e9073afc5d301efe240a3a4b760cd6cdffca2a98dc66f44d000041d59278751431772077aff623f3154d114e962c25f427f424884999499285606b14c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uri-template \
python3.11dist-uri-template \
python311-uri-template \
python3dist-uri-template"

RDEPENDS:${PN} += "python-abi"

inherit rpm
