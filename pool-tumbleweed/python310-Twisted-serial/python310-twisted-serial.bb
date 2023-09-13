SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-serial-22.10.0-8.1.noarch.rpm"
RPM_HASH = "5dfce5002d5b6c683f2e4dde17d4a552a005288310dcd00587f4fb1c0b6b83aae0d2634a0f2a14e24bab13d9252d23cb099e52a4746d81582cb1561a0700e22b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-serial"

RDEPENDS:${PN} += "python310-Twisted \
python310-pyserial"

inherit rpm
