SUMMARY = "Development files for ctemplate, a C++ language templating library"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate-devel-2.4-1.10.aarch64.rpm"
RPM_HASH = "817d8e11f584e166bd6c84c1a6a14581c37b06680235f9361918e68811816b053c844e2305f0851bd4b17bcecef730d23404ec242bdf701bc1b6517954042ed7"

RPROVIDES:${PN} += "libctemplate-devel \
pkgconfig-libctemplate \
pkgconfig-libctemplate-nothreads"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctemplate-nothreads.so.3 \
libctemplate3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
