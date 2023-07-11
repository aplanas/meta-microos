SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch_nacl-22.10.0-7.1.noarch.rpm"
RPM_HASH = "4cea9ead48a96d9ffec611a7e022d6d4f68e130d91e641a4250fde920475e4151e7d5f6a1bfb2557f698a6b9d2616fdec75aef6985e30c4f896874c027a2eccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch-nacl \
python311-Twisted-conch-nacl"

RDEPENDS:${PN} += "python311-Twisted-conch"

inherit rpm
