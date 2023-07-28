SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "python311-libkdumpfile-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "f0b45c8ac56bbe88f9cfd4c3cbb55999d0cab8524ece1827b7297cffd3ae6a0a0291b60b88ad8f6ea9a518ab05738d9142856efa7f9ab9bb6e28cf3cdeaea189"

RPROVIDES:${PN} += "python3-libkdumpfile \
python3.11dist-libkdumpfile \
python311-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
