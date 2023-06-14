SUMMARY = "Library for a C++ template languaging"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate3-2.4-1.9.aarch64.rpm"
RPM_HASH = "a3e3fbca7308e1e5ddcfd5ee5723098b6b641e793ae0357c001b03080c503be4c96d6eb57734f7e7fcf112884538735ab06a02ab2b078dc4b538755acb70dbbb"

RPROVIDES:${PN} += "libctemplate-nothreads.so.3 \
libctemplate.so.3 \
libctemplate3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
