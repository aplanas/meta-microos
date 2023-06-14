SUMMARY = "Development files for libserd"
DESCRIPTION = "Development files for libserd."
LICENSE = "ISC"

PV = "0.30.16"

RPM_NAME = "serd-devel-0.30.16-1.1.aarch64.rpm"
RPM_HASH = "71683a963321449b3dda0408024b63dd2c062f665dc020d225a8c6185dd08eb58fe552526d5c95b9b06d504981b4dcb1676d9499523b4381e14087c808a84659"

RPROVIDES:${PN} += "libserd-0-devel \
pkgconfig-serd-0 \
serd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserd-0-0"

inherit rpm
