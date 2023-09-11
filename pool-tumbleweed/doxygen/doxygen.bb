SUMMARY = "Automated C, C++, and Java Documentation Generator"
DESCRIPTION = "Doxygen is a documentation system for C, C++, Java, and IDL. It can \
generate an online class browser (in HTML) and an offline reference \
manual (in LaTeX) from a set of documented source files. The \
documentation is extracted directly from the sources. Doxygen is \
developed on a Linux platform, but it runs on most other UNIX flavors \
as well."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxygen-1.9.6-5.1.aarch64.rpm"
RPM_HASH = "615a935a1c6a490bbaa83e2c29d23de218080ac51ddc85575719ca41d48f10e3234faf503091fddc45fbea70689033863c49cbdb4e7062f602df51d25dfa1cda"

RPROVIDES:${PN} += "doxygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
