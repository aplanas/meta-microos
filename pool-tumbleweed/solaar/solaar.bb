SUMMARY = "Linux devices manager for the Logitech Unifying Receiver"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-1.1.9-1.2.noarch.rpm"
RPM_HASH = "1128e7d28065ace82c313a006020abe4b5f30df208a8245b95659f9893feae42305257e7c5654bab72a3276440ced5cb28b35ed1687187e66eb9c0311f8913f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-solaar \
python3dist-solaar \
solaar \
solaar-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-hid-parser \
python3-psutil \
python3-python-xlib \
python3-pyudev \
python3-typing-extensions \
solaar-udev \
typelib-1-0-Gtk-3-0"

inherit rpm
