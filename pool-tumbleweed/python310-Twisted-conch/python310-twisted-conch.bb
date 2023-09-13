SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch-22.10.0-8.1.noarch.rpm"
RPM_HASH = "2145b74638db9af147a4ca573c210d0aa7991a5d67ae994cc4a4cec1e84cf2b27df2222d6d23f017dc19c03220dac95301f89493c55049b54ad24e64bf862276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-conch"

RDEPENDS:${PN} += "python310-Twisted \
python310-appdirs \
python310-bcrypt \
python310-cryptography \
python310-pyasn1"

inherit rpm
