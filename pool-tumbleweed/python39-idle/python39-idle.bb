SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-idle-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "53d22b88c8212be60e562e21134ba293214f67a227568c04168fb5e0987b2fe2d5c9677412e54d42311334ad8e147fc44795937d9220a3c2c0eb01bf67d89a4b"

RPROVIDES:${PN} += "application() \
application(idle3.9.desktop) \
config(python39-idle) \
metainfo() \
metainfo(idle3.9.appdata.xml) \
mimehandler(text/x-python) \
python39-idle \
python39-idle(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python(abi) \
python39 \
python39-tk"

inherit rpm
