SUMMARY = "Microsoft Publisher file format parser library"
DESCRIPTION = "libmspub is a library for parsing the Corel Draw file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-0_1-1-0.1.4-2.24.aarch64.rpm"
RPM_HASH = "6826d4c74590d5a977de20bf32494df996f43c0ae7e2d425671a71f7bd9c2bd38b7e2e38da57b06edf308e656773c49840d4e97a86fd39888ff75a3342420e11"

RPROVIDES:${PN} += "libmspub-0-1-1 \
libmspub-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
