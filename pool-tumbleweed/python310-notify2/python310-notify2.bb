SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python310-notify2-0.3.1-4.13.noarch.rpm"
RPM_HASH = "2d2d1c10587ac1712c6ab7abd91a78849930981195294f5ff37f46b1c94db30f1c69f3882acc91df5ab03752a32961f86a70a517df4a3389020e156dc9f49996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-notify2 \
python310-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python310-dbus-python"

inherit rpm
