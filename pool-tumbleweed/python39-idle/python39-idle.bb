SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.18"

RPM_NAME = "python39-idle-3.9.18-1.1.aarch64.rpm"
RPM_HASH = "0a2109566852670fa96b3b58cbc5928ee4c1e50a1cd1afa0348b4ea985d309338520d70b2b390a8d2f973d602fe9237178990e0388a01d1d1fd3222f29a68ad0"

RPROVIDES:${PN} += "config-python39-idle \
python39-idle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39 \
python39-tk"

inherit rpm
