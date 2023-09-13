SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch-22.10.0-8.1.noarch.rpm"
RPM_HASH = "bf0242ef23a1b24809076a686c2b27886f4aa7de8f06db301681da433bc0b6c8460a322bee00401158872d07fa9905a55883b85708c966f967819cb1e0c9381a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch \
python311-Twisted-conch"

RDEPENDS:${PN} += "python311-Twisted \
python311-appdirs \
python311-bcrypt \
python311-cryptography \
python311-pyasn1"

inherit rpm
