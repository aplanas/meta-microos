SUMMARY = "A Python module for GUI automation that can control the keyboard and mouse"
DESCRIPTION = "PyAutoGUI is a GUI automation Python module. It can be used to \
programmatically control the mouse and keyboard."
LICENSE = "BSD-3-Clause"

PV = "0.9.53"

RPM_NAME = "python310-PyAutoGUI-0.9.53-1.5.noarch.rpm"
RPM_HASH = "4f3fa4e9abc0788fbf7c1984e51aa0e856c5d074b803d0adc4ef29837376b0af6e649461e7ae0d9e1af151a8ef83616357d3868ed909a5e9fb519341fbccbb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyautogui \
python310-PyAutoGUI \
python3dist-pyautogui"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-PyMsgBox \
python310-PyScreeze \
python310-PyTweening \
python310-python-xlib"

inherit rpm
