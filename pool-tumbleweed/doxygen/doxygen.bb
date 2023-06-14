SUMMARY = "Automated C, C++, and Java Documentation Generator"
DESCRIPTION = "Doxygen is a documentation system for C, C++, Java, and IDL. It can \
generate an online class browser (in HTML) and an offline reference \
manual (in LaTeX) from a set of documented source files. The \
documentation is extracted directly from the sources. Doxygen is \
developed on a Linux platform, but it runs on most other UNIX flavors \
as well."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxygen-1.9.6-4.1.aarch64.rpm"
RPM_HASH = "664cbfed4f1ab640a2875663b56804399fd22e3f12c60bf59e61aba6c141624579307996b52b4c1b9ade0745c591197f6f598cbf49d9803645ef1e5f13539913"

RPROVIDES:${PN} += "doxygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
