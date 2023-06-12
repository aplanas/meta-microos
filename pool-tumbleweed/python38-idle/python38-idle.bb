SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-idle-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "3f68bf70ab75abc319a65ccd85091853b254e6b2769317569443468f42710236fc45e17a8e0ead8de9a73e426c43f34be69d153a11d7bac18719476d75d15e1c"

RPROVIDES:${PN} += "application() \
application(idle3.8.desktop) \
config(python38-idle) \
metainfo() \
metainfo(idle3.8.appdata.xml) \
mimehandler(text/x-python) \
python38-idle \
python38-idle(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.8 \
python(abi) \
python38 \
python38-tk"

inherit rpm
