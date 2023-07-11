SUMMARY = "Conch for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
Twisted Conch: The Twisted Shell. Terminal emulation, SSHv2 and telnet."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-conch-22.10.0-7.1.noarch.rpm"
RPM_HASH = "498b00e7457ce900f9bc68c59eb2f18a39ac79a9f3e950deee9dc625c215eda239120603891a5172579c27273a06ad49597a52a5284e74be2bc5c56745b9aa1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch \
python311-Twisted-conch"

RDEPENDS:${PN} += "python311-Twisted \
python311-appdirs \
python311-bcrypt \
python311-cryptography \
python311-pyasn1"

inherit rpm
