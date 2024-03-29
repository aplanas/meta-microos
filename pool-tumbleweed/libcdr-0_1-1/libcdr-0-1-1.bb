SUMMARY = "Library for parsing the Corel Draw file format structure"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-0_1-1-0.1.7-1.18.aarch64.rpm"
RPM_HASH = "091d3586e2bb594acaf824170f8efa88b479cf4e6c693fc40e00b66b66997db40abc9507fa70b172c2e6a5d65f63e2b60b2e6c16740ef70fc6b2bedf5c561d9b"

RPROVIDES:${PN} += "libcdr-0-1-1 \
libcdr-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
liblcms2.so.2 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
