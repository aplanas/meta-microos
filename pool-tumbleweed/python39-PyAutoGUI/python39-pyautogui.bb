SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python39-PyAutoGUI-0.9.53-1.3.noarch.rpm"
RPM_HASH = "27755ba67b69c477b937afbf112ca2f31dea2b52ec63a07bcf7377d3a760884da8e41db594ecbfb27633ae4812960def7e8d141a5604537011ffc0f3588fcedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyautogui) \
python39-PyAutoGUI \
python3dist(pyautogui)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-PyMsgBox \
python39-PyScreeze \
python39-PyTweening \
python39-python-xlib"

inherit rpm
