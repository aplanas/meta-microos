SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python311-PyAutoGUI-0.9.53-1.3.noarch.rpm"
RPM_HASH = "60888ad67cc73ed69ff2617d0a9a0c932b5769ab7195a81f1d978ad1fd79cd9436fafbedc6bdffc4ca4549fc274c31f983b99c28be92648145572ce84d8a9c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyautogui) \
python311-PyAutoGUI \
python3dist(pyautogui)"

RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-PyMsgBox \
python311-PyScreeze \
python311-PyTweening \
python311-python-xlib"

inherit rpm
