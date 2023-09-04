SUMMARY = "Python module and GUI for OpenIPMI"
DESCRIPTION = "The Python parts provide an OpenIPMI Python library and a GUI, openipmigui, \
that makes use of it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.31"

RPM_NAME = "OpenIPMI-python3-2.0.31-5.14.aarch64.rpm"
RPM_HASH = "72cf3ee19cdee888a95ff6273d5e2a1a0063fdfe89d5df592249c0e8682da32d9cbf9d91fab8eb12248dd316394f0af88b03758cf33f9dc98e1538bbd73d68a2"

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
