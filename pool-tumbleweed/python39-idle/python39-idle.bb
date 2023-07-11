SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-idle-3.9.17-1.1.aarch64.rpm"
RPM_HASH = "01979c48feff814f082c82d864725a07bfc23d8d4d939c02c16229c4051983e208bab46902810c5d5bb44120692c86e3c17ca3b6ab69395fbe69d599c5804eef"

RPROVIDES:${PN} += "config-python39-idle \
python39-idle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39 \
python39-tk"

inherit rpm
