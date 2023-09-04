SUMMARY = "Development files for jimtcl"
DESCRIPTION = "The jimtcl-devel package contains libraries and header files for \
developing applications that use jimtcl."
LICENSE = "BSD-2-Clause"

PV = "0.82"

RPM_NAME = "jimtcl-devel-0.82-1.1.aarch64.rpm"
RPM_HASH = "ef4dc557b16bc16d9ef1e27aad57ef80cfa2c89769e55f86160aeb68d8ceda749c3503584ebe02e593d0c001efe0ac02a3ae372294f4c5fa3bc583cbf646b4f9"

RPROVIDES:${PN} += "jimtcl-devel \
pkgconfig-jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
jimtcl \
libjim0-82 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
