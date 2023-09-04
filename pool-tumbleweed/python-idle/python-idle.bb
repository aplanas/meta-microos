SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-idle-2.7.18-37.1.aarch64.rpm"
RPM_HASH = "f05c6c654b5b68210ef9834c2f461b0efc9fd3f07b9de3851d2b603d9b63cdb7169426a4f3a08ee13cfeba71aab6f4d1f399545de51ea4aa079aea40acf33330"

RPROVIDES:${PN} += "config-python-idle \
python-idle \
python2-idle"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/python2.7 \
python-base \
python-tk"

inherit rpm
