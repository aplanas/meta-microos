SUMMARY = "C wrapper for libcmis, a library for accessing CMIS-enabled servers"
DESCRIPTION = "libcmis-c is a C client library for the CMIS (Content Management \
Interoperability Services) interface. This allows C applications to \
connect to any CMIS-enabled repositories. It is only a wrapper for \
its C++ sister library libcmis."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "0.5.2"

RPM_NAME = "libcmis-c-0_5-5-0.5.2-1.24.aarch64.rpm"
RPM_HASH = "3f4e0d9148dab4d4c527c72189110fd7e416e9a0191c7210012ba9df6cf492ce5d1238314fa946d187f16f60695bda8f172ce9feaef8bae3442e399fcd465e18"

RPROVIDES:${PN} += "libcmis-c-0-5-5 \
libcmis-c-0.5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmis-0.5.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
