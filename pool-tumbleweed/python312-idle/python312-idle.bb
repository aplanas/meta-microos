SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.0rc1"

RPM_NAME = "python312-idle-3.12.0rc1-2.1.aarch64.rpm"
RPM_HASH = "29cf5780e23fe61ce30292c4cdc0ac630b747a243e9815fb9c62a09fc4be1e44c5d266a2595fb03b5de0de7ef7dc62fa51b89f5e681d6e168dac18264e836219"

RPROVIDES:${PN} += "config-python312-idle \
python312-idle"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312 \
python312-tk"

inherit rpm
