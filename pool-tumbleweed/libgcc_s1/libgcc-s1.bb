SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libgcc_s1-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "aa6aafea7d101df0de47487bad8e9be06e462802c6818d6bd5043bafbc139b39e5c48025f6e7576597ea1b0d65cf343e5b855954969fcd15c77da7456b83553a"

RPROVIDES:${PN} += "libgcc-s.so.1 \
libgcc-s1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
