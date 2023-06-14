SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python311-notify2-0.3.1-4.11.noarch.rpm"
RPM_HASH = "995463bb134c71e243a43e5d1149e8eac9edc36f8ce743778b74c60b785f77f8711cc6c8d24eb7561ef9b3db04cdca52d14d0b2b88f2b09deea97c06ca3736e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-notify2 \
python311-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python311-dbus-python"

inherit rpm
