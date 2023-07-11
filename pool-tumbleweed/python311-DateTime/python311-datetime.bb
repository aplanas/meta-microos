SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "5.1"

RPM_NAME = "python311-DateTime-5.1-1.3.noarch.rpm"
RPM_HASH = "54d82f240d57578309573dee3df91fe45fc6195168630bc8b76d7394b6643f099dd0f8790f7de10f106a4e7f158ca5bcafba090c366aa57c171bb8db5b4a0d5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DateTime \
python3.11dist-datetime \
python311-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python311-pytz \
python311-zope.interface"

inherit rpm
