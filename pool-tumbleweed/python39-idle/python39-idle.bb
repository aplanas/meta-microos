SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.9.17"

RPM_NAME = "python39-idle-3.9.17-3.1.aarch64.rpm"
RPM_HASH = "9300b8469918d6d7b8cee7cbc8d4be8beea5d3bb0d9b2d469f258de45c7ef773cbfae398b166c8a51d2647be0f136225f5c938f75e66820687309d1c108a1641"

RPROVIDES:${PN} += "config-python39-idle \
python39-idle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
python-abi \
python39 \
python39-tk"

inherit rpm
