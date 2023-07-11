SUMMARY = "Serial support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature serial"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-serial-22.10.0-7.1.noarch.rpm"
RPM_HASH = "77717e1e3e255346923216c72ebe201dddeb85c94938e9334e2734510a9d38920444883fe1c80c61e7e8496d9a1ef950255ddba3256bda525320775be2522e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-serial \
python311-Twisted-serial"

RDEPENDS:${PN} += "python311-Twisted \
python311-pyserial"

inherit rpm
