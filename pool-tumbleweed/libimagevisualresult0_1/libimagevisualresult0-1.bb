SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "This package contains the libraries for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult0_1-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "8a5a8dac6e3373495de0683d8a83d45721d999d16b31b25fa571a65cc4eb6907f73bc3a6e4bd8efa5d5a3dd7109dbc5ec816a52ee0271f7d6f64be6b0d58fd75"

RPROVIDES:${PN} += "libimagevisualresult.so.0.1 \
libimagevisualresult0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libimagevisualresult-data \
libm.so.6 \
libstdc++.so.6"

inherit rpm
