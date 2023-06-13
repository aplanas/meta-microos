SUMMARY = "Utilities for HMACs"
DESCRIPTION = "Use hmacsum to calculate a Hash-based Message Authentication Code (HMAC) of the data in a file."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac-tools-20230407-1.1.aarch64.rpm"
RPM_HASH = "5a95ef13156c21fe924ee54f36c35a60531741ef25b80c5f42fd562781894f989db57c3f1a5fc71ef70fa42f84f4b68a8a60de973c0c6505e1b0d1008a3dc9c0"

RPROVIDES:${PN} += "libhmac-tools \
libhmac-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcfile.so.1()(64bit) \
libcfile.so.1(V_20220106)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcsplit.so.1()(64bit) \
libcsplit.so.1(V_20220109)(64bit) \
libhmac.so.1()(64bit) \
libhmac.so.1(V_20230407)(64bit)"

inherit rpm
