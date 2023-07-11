SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-uritools-4.0.0-1.4.noarch.rpm"
RPM_HASH = "4e194c26e61670d9d69f9edf3fb7ab7070fa66055f1790ddeda4b2f9588e73f1ba3d4f16863087c96210101d655b31fb1f22f36be95239458a4eeb7ab795b53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritools \
python3.11dist-uritools \
python311-uritools \
python3dist-uritools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
