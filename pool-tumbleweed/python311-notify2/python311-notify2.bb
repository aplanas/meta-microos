SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python311-notify2-0.3.1-4.13.noarch.rpm"
RPM_HASH = "1cc8c8bc6d5c651b076e3f4a7c73cd6ecd00de6bec3cfa81eaf7e08f7dc7491d4752720aa9586c675d63a4350d6f68b232886607d4931de110a2d226b69000d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notify2 \
python3.11dist-notify2 \
python311-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python311-dbus-python"

inherit rpm
