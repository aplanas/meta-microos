SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.11.4"

RPM_NAME = "python311-idle-3.11.4-3.1.aarch64.rpm"
RPM_HASH = "3f6ff5b3040d8bc3bdb0f29c54c3aaac4fec2d4c4c25bb465214be0bc93322a82da0f05fdf90b3990834fc2fffccbe30e3f7f5b08beb34e4f53162a7f8af097b"

RPROVIDES:${PN} += "config-python311-idle \
python3-idle \
python311-idle"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.11 \
python-abi \
python311 \
python311-tk"

inherit rpm
