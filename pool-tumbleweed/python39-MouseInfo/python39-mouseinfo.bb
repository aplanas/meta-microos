SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python39-MouseInfo-0.1.3-1.14.noarch.rpm"
RPM_HASH = "cba6f5d455b27f4339c989f311cbe99afcd84702ee15650ed7ecfad052f1cf7366f9fb4ba2348735137a25e35caa0d3399df78a09582831478096f0ef94b7e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mouseinfo \
python39-MouseInfo \
python3dist-mouseinfo"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-pyperclip"

inherit rpm
