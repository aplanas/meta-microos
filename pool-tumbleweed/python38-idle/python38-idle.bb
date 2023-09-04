SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-idle-3.8.17-2.1.aarch64.rpm"
RPM_HASH = "a714473ae1b35afc851521b51cc50c47e4c39f6a94e3b993833acec78a90aa7b831dc726c467854b64e5163d93576a7835de687e396f26cbf002f04843117870"

RPROVIDES:${PN} += "config-python38-idle \
python38-idle"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
python-abi \
python38 \
python38-tk"

inherit rpm
