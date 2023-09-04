SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.10.12"

RPM_NAME = "python310-idle-3.10.12-3.1.aarch64.rpm"
RPM_HASH = "3557ef36ee577dd35992be7f2e137ef069d65e77ae242be7474b3d01d1c45ffc70b9bd3fb43f5f15ffd81054164b6d139224ad4869227c2abc5f9e4c07bc7ab7"

RPROVIDES:${PN} += "config-python310-idle \
python310-idle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python310 \
python310-tk"

inherit rpm
