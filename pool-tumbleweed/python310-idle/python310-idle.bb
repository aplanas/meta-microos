SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-idle-3.10.12-2.1.aarch64.rpm"
RPM_HASH = "84fdc3ce705bc7de2f33186e1e601aab9a73456adaa6361a11ee74efd59fac51939a2d4b0419e5e73784982bc97ffc612cb3d6bba69215c492b70798f2abd6da"

RPROVIDES:${PN} += "config-python310-idle \
python310-idle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310 \
python310-tk"

inherit rpm
