SUMMARY = "C-based SPMD programming language compiler library"
DESCRIPTION = "Libary for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.18.1"

RPM_NAME = "libispcrt1-1.18.1-2.1.aarch64.rpm"
RPM_HASH = "4bffc496f6a9e0a188d0e54f3ac9d96d3eaa12a27fdc242a8f201c995b2171ab7a2756fea57207a0bd06d9c35246e22ee813f4e57f20b6fd293ca791ff094786"

RPROVIDES:${PN} += "libispcrt.so.1()(64bit) \
libispcrt1 \
libispcrt1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libomp.so()(64bit) \
libomp.so(VERSION)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
