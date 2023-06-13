SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch-22.10.0-6.1.noarch.rpm"
RPM_HASH = "986a30d7cbd5c8885e9366210c7a77bd49369621321834e297b082a32ffa5990e7fd83f6a416396aa21a9cf1b701cb856d1ecb3c93b00d3224c25cbe8e7063c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-Twisted-conch"

RDEPENDS:${PN} += "python311-Twisted \
python311-appdirs \
python311-bcrypt \
python311-cryptography \
python311-pyasn1"

inherit rpm
