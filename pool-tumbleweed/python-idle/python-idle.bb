SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-idle-2.7.18-36.1.aarch64.rpm"
RPM_HASH = "7624220d44782c082cca42784b829c7fcacb815a988bb8bcb937ee7af37c92f2052a4c5505090f526c2d16e5fbf4eaee5e6db2c666cba9799ae2e9ca85c70281"

RPROVIDES:${PN} += "config-python-idle \
python-idle \
python2-idle"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/python2.7 \
python-base \
python-tk"

inherit rpm
