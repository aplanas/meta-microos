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

RPM_NAME = "python39-libkdumpfile-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "5c3f2f0168f2d3409b20b6b7f3a627b02e23a96649bb936479ea371fc52944ff5c009b6210949e8e99c1d5bf25d002c3761d4894fc927a54e067ca91d18093ce"

RPROVIDES:${PN} += "python3.9dist-libkdumpfile \
python39-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
