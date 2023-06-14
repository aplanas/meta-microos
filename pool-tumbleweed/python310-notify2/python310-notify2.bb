SUMMARY = "Python interface to DBus notifications"
DESCRIPTION = "This is a pure-python replacement for notify-python, using python-dbus \
to communicate with the notifications server directly. It's compatible \
with Python 2 and 3, and its callbacks can work with Gtk 3 or Qt 4 \
applications."
LICENSE = "BSD-2-Clause"

PV = "0.3.1"

RPM_NAME = "python310-notify2-0.3.1-4.11.noarch.rpm"
RPM_HASH = "d1d88d95f7724e604a58a21279db950294ce85cc17ba408d8122e725d11f97bc8459841d3cc5be0bce3c25d7096b97e3d92275a1b99227b0052357f04f5bb105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-notify2 \
python3.10dist-notify2 \
python310-notify2 \
python3dist-notify2"

RDEPENDS:${PN} += "python-abi \
python310-dbus-python"

inherit rpm
