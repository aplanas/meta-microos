SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python39-iwlib-1.6.2-1.20.aarch64.rpm"
RPM_HASH = "58733f79089bec641d8c91441cb803c28a2bef930684a820447f75abc46a7ffd377dee3f89c7b8ea7461a9a6f5f75fe37e52aa43699c5f2c3dba8a3beb2860d7"

RPROVIDES:${PN} += "python3.9dist(iwlib) \
python39-iwlib \
python39-iwlib(aarch-64) \
python3dist(iwlib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libiw.so.30()(64bit) \
python(abi) \
python39-cffi"

inherit rpm
