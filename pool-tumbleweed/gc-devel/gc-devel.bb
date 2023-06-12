SUMMARY = "A garbage collector for C and C++"
DESCRIPTION = "The Boehm-Demers-Weiser conservative garbage collector can be used as a \
garbage collecting replacement for C malloc or C++ new. It allows you \
to allocate memory basically as you normally would, without explicitly \
deallocating memory that is no longer useful. The collector \
automatically recycles memory when it determines that it can no longer \
be otherwise accessed."
LICENSE = "BSD-3-Clause"

PV = "8.2.4"

RPM_NAME = "gc-devel-8.2.4-1.1.aarch64.rpm"
RPM_HASH = "9768438d8c429cb08b74023ace8e193d38c03cbd5374f4335ed2b5c099332672534a240a21f9d3029867d15b8d4e6fa91fb4069f632488fa1dd506ba046cce9f"

RPROVIDES:${PN} += "gc-devel \
gc-devel(aarch-64) \
gc:/usr/include/gc/gc.h \
pkgconfig(bdw-gc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libatomic_ops-devel \
libgc1"

inherit rpm
