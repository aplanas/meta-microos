SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.8.17"

RPM_NAME = "python38-idle-3.8.17-1.1.aarch64.rpm"
RPM_HASH = "3a60a8f67f34a3f7b59eabea43407598f1040c1aa5498d27fd6c336a2b019cfab6ce065c7391049e3b3b53c8216292a5cec959bed2de7ae1b53880d8c68cb0ca"

RPROVIDES:${PN} += "config-python38-idle \
python38-idle"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
python-abi \
python38 \
python38-tk"

inherit rpm
