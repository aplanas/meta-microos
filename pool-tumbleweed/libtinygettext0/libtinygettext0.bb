SUMMARY = "Shared library of tinygettext"
DESCRIPTION = "This package contains the shared library of tinygettext"
LICENSE = "Zlib"

PV = "0.1.1469459657.bf66a57"

RPM_NAME = "libtinygettext0-0.1.1469459657.bf66a57-1.26.aarch64.rpm"
RPM_HASH = "7b8580babb36504862b85631a9d6e02c65ca8dbbb52c8197a79d8121f99b52cf6fe006b9f263b73fe91a70296765b7eb8c2c416be74e169670adfeb3b436c01d"

RPROVIDES:${PN} += "libtinygettext.so.0()(64bit) \
libtinygettext0 \
libtinygettext0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
