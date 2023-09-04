SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-idle-3.9.17-4.1.aarch64.rpm"
RPM_HASH = "1984333ee9e75e03a97912289411045bc350cf69b2e5cd4a4bd1770389f48da5d9feb6bff2c56cd0c5d45cfacc3c11a8aabc8aa0e656de1e1b4930a705b78264"

RPROVIDES:${PN} += "config-python39-idle \
python39-idle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39 \
python39-tk"

inherit rpm
