SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch-22.10.0-6.1.noarch.rpm"
RPM_HASH = "e8786fec8192f3ff010e4781babac63ef59a4c12624a2f06f35b9b04dce2ce4d027e4a907cb84b474e2a7c75ae3852a1b31b68840b0f3149d6e267f53f334dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch"

RDEPENDS:${PN} += "python39-Twisted \
python39-appdirs \
python39-bcrypt \
python39-cryptography \
python39-pyasn1"

inherit rpm
