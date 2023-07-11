SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python310-iwlib-1.6.2-1.22.aarch64.rpm"
RPM_HASH = "d34a4fcd99ee8ad425046ff1dda60c4fcb1a9a43bbe4b920ee9db9a2155a354a2c28adc616ac08f1e19e424e5290221e71ac8c8d7c8d26b94a19a871fc754e54"

RPROVIDES:${PN} += "python3.10dist-iwlib \
python310-iwlib \
python3dist-iwlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiw.so.30 \
python-abi \
python310-cffi"

inherit rpm
