SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "python310-libkdumpfile-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "3cad986651ecb1e3594ba3455b26cce9fc9dd752659464b9c8a11decab5c284daedc1a25d71548ece62e6cfd7d15dc0144a6b757b3ed3503c22f87e7058cdc91"

RPROVIDES:${PN} += "python3-libkdumpfile \
python3.10dist(libkdumpfile) \
python310-libkdumpfile \
python310-libkdumpfile(aarch-64) \
python3dist(libkdumpfile)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaddrxlat.so.3()(64bit) \
libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libkdumpfile.so.10()(64bit) \
libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) \
python(abi)"

inherit rpm
