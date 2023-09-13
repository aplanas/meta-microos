SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-serial-22.10.0-8.1.noarch.rpm"
RPM_HASH = "095ba75883c094a082b75aa8ab0dc95ea82499a1e11ebb688bcf5457a45caf71a9503597e4e914e21f4f523a8d1f42b9c57e1c9e47fc8c3fb13df1b3125f81ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-serial \
python311-Twisted-serial"

RDEPENDS:${PN} += "python311-Twisted \
python311-pyserial"

inherit rpm
