SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch-22.10.0-7.1.noarch.rpm"
RPM_HASH = "4dadffed1b44db24f89631dad7f92ffeea502b00e08a09409a48a2162bedde845b7795fd4c6039ee7f739b7f470dbea5ec9ff0ab58e2e24f52af08bbba46b38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch"

RDEPENDS:${PN} += "python39-Twisted \
python39-appdirs \
python39-bcrypt \
python39-cryptography \
python39-pyasn1"

inherit rpm
