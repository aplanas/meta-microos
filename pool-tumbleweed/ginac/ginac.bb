SUMMARY = "C++ library for symbolic calculations"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "ginac-1.8.5-2.3.aarch64.rpm"
RPM_HASH = "6ad94c2292489d889e32c572fe86f967c1403e382e28db06449356cf69821f89de8b285471cde620ff07c63b6a56474b309022c5909d40640323f5484afbd900"

RPROVIDES:${PN} += "ginac"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcln.so.6 \
libgcc-s.so.1 \
libginac.so.11 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
