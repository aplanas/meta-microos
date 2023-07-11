SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-yappi-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "664663885567488e74bacf410a8e6ea76725bd4ca1996535b57974b5dd1e30e096b4da16e032651b61e922b59a1dfda0f8f70f26679a9969b9783e7d5a55a85d"

RPROVIDES:${PN} += "python3-yappi \
python3.11dist-yappi \
python311-yappi \
python3dist-yappi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
