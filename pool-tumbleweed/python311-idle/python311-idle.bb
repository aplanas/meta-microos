SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-idle-3.11.4-1.1.aarch64.rpm"
RPM_HASH = "3b8622ce15e3ceba60396d05a280d053e22dbfc9fb104c214001a5cbe63bbfc60d6475d5545b8cd29f841a47d8090575981e6da08d374bea6f67783c2c26bf2e"

RPROVIDES:${PN} += "config-python311-idle \
python3-idle \
python311-idle"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311 \
python311-tk"

inherit rpm
