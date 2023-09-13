SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-idle-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "07d9ed604944598fc9cb4d62532779d8f14f0f092946633abf57b631cfced3050e624efdd6e1e24c147e7f9c748d3f356d44f41700d16421ae54e3b9aa0c6447"

RPROVIDES:${PN} += "config-python38-idle \
python38-idle"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
python-abi \
python38 \
python38-tk"

inherit rpm
