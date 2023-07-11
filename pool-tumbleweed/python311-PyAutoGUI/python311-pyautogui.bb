SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python311-PyAutoGUI-0.9.53-1.5.noarch.rpm"
RPM_HASH = "3205e558e8a5aa2b98e4d8f36c881d53da1d82c8d81dae2d80b23428d3529363381810f856a95fa9e35d18c7a401e27e3693f921d00f3aa5d1094d9dd989751c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyAutoGUI \
python3.11dist-pyautogui \
python311-PyAutoGUI \
python3dist-pyautogui"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-PyMsgBox \
python311-PyScreeze \
python311-PyTweening \
python311-python-xlib"

inherit rpm
