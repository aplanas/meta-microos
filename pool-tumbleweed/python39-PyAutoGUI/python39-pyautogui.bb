SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python39-PyAutoGUI-0.9.53-1.5.noarch.rpm"
RPM_HASH = "3531367aa277cfb3696b46d9f329bc168337ca3bd4af581d140e395a69aee1b7c875e66584acebf55ab0ae3be90be792e41f18abe7c4e833351a4b96569c6533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyautogui \
python39-PyAutoGUI \
python3dist-pyautogui"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-PyMsgBox \
python39-PyScreeze \
python39-PyTweening \
python39-python-xlib"

inherit rpm
