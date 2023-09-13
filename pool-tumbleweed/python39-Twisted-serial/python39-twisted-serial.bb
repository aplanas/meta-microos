SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-serial-22.10.0-8.1.noarch.rpm"
RPM_HASH = "4b34cfa7b1d7f7558469651dbf7dcf3195ae425cf1500d171db1b2464f93b128c7b4a84d9cc8c9e1fa24e8270c8bf2675f48f76d78c0134238cf457a3d6469ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-serial"

RDEPENDS:${PN} += "python39-Twisted \
python39-pyserial"

inherit rpm
