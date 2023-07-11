SUMMARY = "Python module and GUI for OpenIPMI"
DESCRIPTION = "The Python parts provide an OpenIPMI Python library and a GUI, openipmigui, \
that makes use of it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-python3-2.0.31-5.13.aarch64.rpm"
RPM_HASH = "ab353fe9fa4454b1d47fd6de5df66f30548386fe58c460f6cac7888d155fda4e0189f7f9c36647de017219a1d1a1f544e6427eed0545f460cea7e4d5d595044e"

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
