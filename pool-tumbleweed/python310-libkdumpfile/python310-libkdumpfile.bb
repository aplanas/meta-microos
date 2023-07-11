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

RPM_NAME = "python310-libkdumpfile-0.5.1+git3.g97c716a-3.2.aarch64.rpm"
RPM_HASH = "b0f75aff3136d33796103cefdd47cff92548392bae438662d5b33f2a4ff586749a5fc25ed56e535e9afbcecc333d7b46334111f708fcbb5fc3871e8b66e6ae92"

RPROVIDES:${PN} += "python3.10dist-libkdumpfile \
python310-libkdumpfile \
python3dist-libkdumpfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaddrxlat.so.3 \
libc.so.6 \
libkdumpfile.so.10 \
python-abi"

inherit rpm
