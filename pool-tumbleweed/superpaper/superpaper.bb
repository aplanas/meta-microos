SUMMARY = "An advanced multi monitor wallpaper manager"
DESCRIPTION = "Cross-platform wallpaper manager that focuses on multi-monitor support. \
Features include ppi corrections, keyboard shortcuts, and slideshow."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "superpaper-2.1.0-3.8.noarch.rpm"
RPM_HASH = "3870f5ec25e112a770c186eaf63c95fb97f281b1d303825c86caf6198b903b56a95d05f7cd0d038c4da9716bf78be1b41f7f02405d30e3de1e1f13e476426dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-superpaper \
python3.10dist-superpaper \
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
