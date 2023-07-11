SUMMARY = "Automated C, C++, and Java Documentation Generator"
DESCRIPTION = "Doxygen is a documentation system for C, C++, Java, and IDL. It can \
generate an online class browser (in HTML) and an offline reference \
manual (in LaTeX) from a set of documented source files. The \
documentation is extracted directly from the sources. Doxygen is \
developed on a Linux platform, but it runs on most other UNIX flavors \
as well."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxygen-1.9.6-4.2.aarch64.rpm"
RPM_HASH = "193b15074aab713911a20ea922a9ac1f853e2e276e3e5a8577e7a10ad4241989f96de778423ed0caba35b1580a321364e31bf4baf00409d00de72589a3e0326f"

RPROVIDES:${PN} += "doxygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
