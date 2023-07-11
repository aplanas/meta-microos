SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python39-notify2-0.3.1-4.13.noarch.rpm"
RPM_HASH = "e7b631000a9fbef0b110360e384c9c1ff10530ed3517529f11c2f93e67137e58dcec873fa99d53826fad824391f8b18e2d6059a3582fc9629e76de73df098241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notify2 \
python39-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python39-dbus-python"

inherit rpm
