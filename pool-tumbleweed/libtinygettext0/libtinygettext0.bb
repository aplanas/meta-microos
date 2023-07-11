SUMMARY = "Shared library of tinygettext"
DESCRIPTION = "This package contains the shared library of tinygettext"
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "libtinygettext0-0.1.1469459657.bf66a57-1.27.aarch64.rpm"
RPM_HASH = "f6095423be22c2d95efa67db03aaf143c36c92db1a0c2c51afdace486b9dcbd5a8117ab062aafb22bf283c5e2b21a600f24ec400bf2b71fda266aedc58bbe2f3"

RPROVIDES:${PN} += "libtinygettext.so.0 \
libtinygettext0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
