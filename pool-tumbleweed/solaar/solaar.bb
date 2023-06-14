SUMMARY = "Linux devices manager for the Logitech Unifying Receiver"
DESCRIPTION = "Solaar will detect all devices paired with your Unifying Receiver, and \
at the very least display some basic information about them. \
 \
For some devices, extra settings (usually not available through the \
standard Linux system configuration) are supported. For a full list of \
supported devices and their features, see docs/devices.md."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-1.1.9-1.1.noarch.rpm"
RPM_HASH = "9ef0b08ca456df90f25450d7f960fc9fd8e01769e09c55c7e89fc339a8e86e6cf9c00f6ca0dbb5f88e8ee69c05e2d8bac6f62b9580a6c29f6d56c94206a74658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-solaar \
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
