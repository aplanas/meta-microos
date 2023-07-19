SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.0b4"

RPM_NAME = "python312-idle-3.12.0b4-1.1.aarch64.rpm"
RPM_HASH = "1bc57b05c7f90a7d8a859e3e038d536777c9a9c2207debdbb46102d93f689ff21fd3c4f10715ed78421af5eee575530e65dc28acb7b0f27a8ed011ea6f9de953"

RPROVIDES:${PN} += "config-python312-idle \
python312-idle"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312 \
python312-tk"

inherit rpm
