SUMMARY = "Development files for open-isns"
DESCRIPTION = "Files to develop an application using the open-isns library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "open-isns-devel-0.102-1.5.aarch64.rpm"
RPM_HASH = "02deb87d5ec5e5fcc751573e196a85c931d5db5a5cc81e383553717f05ee5ab3a94ff8ee5365235d2e0d628703386f23a3029b3b89377bf3a466ff096dc9fe27"

RPROVIDES:${PN} += "open-isns-devel \
pkgconfig-libisns"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
open-isns \
pkgconfig-libcrypto"

inherit rpm
