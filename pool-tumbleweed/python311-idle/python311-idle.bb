SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.5"

RPM_NAME = "python311-idle-3.11.5-1.1.aarch64.rpm"
RPM_HASH = "b30f222036887b9d72b39db8f1907d819d29e7b467cb385fa8fe2e660639ce68ec521f4793d9745d4ca6c0b635f7add5e2a24d1e3cfeab01c6a1982ed59c0106"

RPROVIDES:${PN} += "config-python311-idle \
python3-idle \
python311-idle"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311 \
python311-tk"

inherit rpm
