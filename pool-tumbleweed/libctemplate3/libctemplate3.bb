SUMMARY = "Library for a C++ template languaging"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate3-2.4-1.10.aarch64.rpm"
RPM_HASH = "00c41428e31bb7db2428cf0459c34ac44e4b2b479970eb079035370443ff8c7fb34ae2d99ee2c6c9161f862b134805857c3f1966de1583584511dee30b7ac847"

RPROVIDES:${PN} += "libctemplate-nothreads.so.3 \
libctemplate.so.3 \
libctemplate3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
