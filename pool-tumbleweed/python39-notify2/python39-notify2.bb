SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python39-notify2-0.3.1-4.11.noarch.rpm"
RPM_HASH = "a6c87dee9b80ba1b0a6a23c1c3b8ff25eb0cb93c57bc39c0f386cf8add1455505705a4e04b6e7ad3c35bf481efdf97a8d66e5da1e4bee39aa77f1900def263fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-notify2 \
python39-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python39-dbus-python"

inherit rpm
