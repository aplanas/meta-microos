SUMMARY = "Development files for open-isns"
DESCRIPTION = "Files to develop an application using the open-isns library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.102"

RPM_NAME = "open-isns-devel-0.102-1.4.aarch64.rpm"
RPM_HASH = "865ee81c7acc18f08958c3b0f238187dca6b7448555f3b6ddd2898583d9f079c55018cc22b4dc10476a4975a539bb4ee86a4d5135c34eb2cff362be653be6bd5"

RPROVIDES:${PN} += "open-isns-devel \
open-isns-devel(aarch-64) \
pkgconfig(libisns)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
open-isns \
pkgconfig(libcrypto)"

inherit rpm
