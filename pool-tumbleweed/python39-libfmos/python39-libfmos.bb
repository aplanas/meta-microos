SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "python39-libfmos-20220811-2.4.aarch64.rpm"
RPM_HASH = "2631e32712b311f18ce987c76345ae46c81e08c1471831f1941c18520e2402699fe61062af000d7c10385bd3eb2b5f5819da000433411fe4c04460acfa829e89"

RPROVIDES:${PN} += "python39-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
