SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-idle-3.10.11-1.1.aarch64.rpm"
RPM_HASH = "cfee54a2944629873a80fd199ca14cc46c6a412111b250318667b15c4653b9659d4661a3a80bccfda9c64f79670475f8f94d66775f2feb5d068a67b2b7327d9c"

RPROVIDES:${PN} += "application() \
application(idle3.10.desktop) \
config(python310-idle) \
metainfo() \
metainfo(idle3.10.appdata.xml) \
mimehandler(text/x-python) \
python3-idle \
python310-idle \
python310-idle(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.10 \
python(abi) \
python310 \
python310-tk"

inherit rpm
