SUMMARY = "Python module to interface with iwlib"
DESCRIPTION = "Python-iwlib is a package for interfacing with iwlib, providing an implementation to \
the wireless tools in Linux. \
 \
It provides scanning, setting the ESSID of a device, and getting the current configuration \
back from a device."
LICENSE = "GPL-2.0-only"

PV = "1.6.2"

RPM_NAME = "python311-iwlib-1.6.2-1.22.aarch64.rpm"
RPM_HASH = "cf53e49cfe537d999e5c0030aa08fc604edfdd6c23dff943416f0b1706467d106cb65a292a0cbc24a004aeabf842ab862635d66b398b8a52c80f913f1efed59b"

RPROVIDES:${PN} += "python3-iwlib \
python3.11dist-iwlib \
python311-iwlib \
python3dist-iwlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiw.so.30 \
python-abi \
python311-cffi"

inherit rpm
