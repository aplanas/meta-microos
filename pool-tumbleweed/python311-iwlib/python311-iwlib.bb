SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python311-iwlib-1.6.2-1.20.aarch64.rpm"
RPM_HASH = "5676830676574cb515ee855ffe43ac120e54c10e6aac4e6edb7fe2b18aea1f3df7c98c5316d97c02d37e2a151312dda619742e4041086a77aa2af6b66c20ae5a"

RPROVIDES:${PN} += "python3.11dist(iwlib) \
python311-iwlib \
python311-iwlib(aarch-64) \
python3dist(iwlib)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libiw.so.30()(64bit) \
python(abi) \
python311-cffi"

inherit rpm
