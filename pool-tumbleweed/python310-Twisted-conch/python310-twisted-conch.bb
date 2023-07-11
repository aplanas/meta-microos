SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch-22.10.0-7.1.noarch.rpm"
RPM_HASH = "e760e50da20e015b8426a48d273c8c88059859f588329e8c290ea85df8b0e06c53e7fdaeb5ca883be2c77d0717404124fadbad7034b47f61e45a5c9e6a46910e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-conch"

RDEPENDS:${PN} += "python310-Twisted \
python310-appdirs \
python310-bcrypt \
python310-cryptography \
python310-pyasn1"

inherit rpm
