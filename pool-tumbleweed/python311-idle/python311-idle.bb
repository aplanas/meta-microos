SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-idle-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "9ef6c4ed34e6a6f13304f879fcea343910d746dd8a08ddef5f6d48591421fbbb7e4f3be87daa896edd3add31709f9e57f46ce743abdebf7cd2f54c21d152c665"

RPROVIDES:${PN} += "application() \
application(idle3.11.desktop) \
config(python311-idle) \
metainfo() \
metainfo(idle3.11.appdata.xml) \
mimehandler(text/x-python) \
python311-idle \
python311-idle(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python(abi) \
python311 \
python311-tk"

inherit rpm
