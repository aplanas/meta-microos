SUMMARY = "Library for a C++ template languaging"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate3-2.4-1.9.aarch64.rpm"
RPM_HASH = "a3e3fbca7308e1e5ddcfd5ee5723098b6b641e793ae0357c001b03080c503be4c96d6eb57734f7e7fcf112884538735ab06a02ab2b078dc4b538755acb70dbbb"

RPROVIDES:${PN} += "libctemplate.so.3()(64bit) \
libctemplate3 \
libctemplate3(aarch-64) \
libctemplate_nothreads.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
