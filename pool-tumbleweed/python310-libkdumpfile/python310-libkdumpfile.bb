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

RPM_NAME = "python310-libkdumpfile-0.5.2-1.1.aarch64.rpm"
RPM_HASH = "c2b2de2c3efaf2a96ee8eab5139f096c964c3bd5767fcf393cf0446c23420c7fff5b6b75bb6ae8b55f48566577598a02b01944644479bf9c074c8863b94fb172"

RPROVIDES:${PN} += "python3.10dist-libkdumpfile \
python310-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
