SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch-22.10.0-8.1.noarch.rpm"
RPM_HASH = "5bcd51b3e3fef70e81939b0a1506b9d826a49170ebcbf886abf3a3f053962522e778e9b2214d5fcf42856e20d7ca33bf9c8d689e55203d057797d27784845c4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch"

RDEPENDS:${PN} += "python39-Twisted \
python39-appdirs \
python39-bcrypt \
python39-cryptography \
python39-pyasn1"

inherit rpm
