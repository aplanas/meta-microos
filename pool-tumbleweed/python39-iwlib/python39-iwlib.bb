SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python39-iwlib-1.6.2-1.22.aarch64.rpm"
RPM_HASH = "1710f00381feb619ed83b5240037ec1bcabb00666c0598123c928ded4c7a36c128ab8f7bac373f546d992337ee40edecbaadc76d4ea22c71046be4407592f8be"

RPROVIDES:${PN} += "python3.9dist-iwlib \
python39-iwlib \
python3dist-iwlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiw.so.30 \
python-abi \
python39-cffi"

inherit rpm
