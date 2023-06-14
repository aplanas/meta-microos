SUMMARY = "Pythonic DBus library"
DESCRIPTION = "A dbus library for Python."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "python310-pydbus-0.6.0-1.17.noarch.rpm"
RPM_HASH = "8f19ffb31b118b60ce146b97e3ac7295f639eb67c4679c0df72fade0adf1b796c5cea72b5cee49eeafb32a1e23fd7a6d40fe93dc2b13f6344d40ab9a56c5af1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydbus \
python3.10dist-pydbus \
python310-pydbus \
python3dist-pydbus"

RDEPENDS:${PN} += "girepository-1-0 \
python-abi \
python310-gobject"

inherit rpm
