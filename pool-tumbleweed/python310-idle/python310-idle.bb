SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-idle-3.10.12-1.1.aarch64.rpm"
RPM_HASH = "3e927222517e33adbec7b2b73691b9a85745d7e29a07239127f76d3092d046ae008b4afea160d4d69397514e9a5e52fa25efe0c2b28c1e9281286e26fc3d0fd8"

RPROVIDES:${PN} += "config-python310-idle \
python310-idle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310 \
python310-tk"

inherit rpm
