SUMMARY = "An advanced multi monitor wallpaper manager"
DESCRIPTION = "Cross-platform wallpaper manager that focuses on multi-monitor support. \
Features include ppi corrections, keyboard shortcuts, and slideshow."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "superpaper-2.1.0-3.9.noarch.rpm"
RPM_HASH = "e594b2b75caeeb8bfe3a0dcd6c9c9e4175d049b16efc5f6198de690e17336de8df8d5c83e50f239caf56c207b674872ffd3f9b590fac9e9393db128e15bc1126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-superpaper \
python3.11dist-superpaper \
python38-superpaper \
python3dist-superpaper \
superpaper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pillow \
python3-numpy \
python3-screeninfo \
python3-system-hotkey \
python3-wxPython \
python3-xcffib \
python3-xpybutil"

inherit rpm
