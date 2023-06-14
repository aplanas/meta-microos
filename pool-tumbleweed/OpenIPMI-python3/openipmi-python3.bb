SUMMARY = "Python module and GUI for OpenIPMI"
DESCRIPTION = "The Python parts provide an OpenIPMI Python library and a GUI, openipmigui, \
that makes use of it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-python3-2.0.31-5.10.aarch64.rpm"
RPM_HASH = "adf0ee0955fc3c4a6deb4de39410e2462e33aba619488c84c6084113df1b1c2c6d4c89cb9d5a15b093e1a3ce976e9b2b4ef53890a774fc5b4946fa8e66c09b2e"

RPROVIDES:${PN} += "OpenIPMI-python3 \
openipmigui"

RDEPENDS:${PN} += "/usr/bin/python3 \
OpenIPMI \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIpthread.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
python-abi \
python3-tk \
tix"

inherit rpm
