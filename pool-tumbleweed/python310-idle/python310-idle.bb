SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.13"

RPM_NAME = "python310-idle-3.10.13-1.1.aarch64.rpm"
RPM_HASH = "85d9fc59205bf5b6e0fa5161d213925920b3538549e9f7a9e616acd6656e8b7c6c9aff3c9fcdd13c7d89e0883c684df973f7d58d03901c2e97fd57262738da35"

RPROVIDES:${PN} += "config-python310-idle \
python310-idle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310 \
python310-tk"

inherit rpm
