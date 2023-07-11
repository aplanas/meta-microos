SUMMARY = "Development headers for coin-or-Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. \
 \
This package contains the development headers for coin-or-Cbc."
LICENSE = "EPL-2.0"

PV = "2.10.8"

RPM_NAME = "coin-or-Cbc-devel-2.10.8-1.4.aarch64.rpm"
RPM_HASH = "46a16351446fa391781875be797afb0aaf5bf63f5e784ada74f512c09e7026bdffa226cedcd8b0ccd5d32e60371def6fef9a7040ee739e4fb52d1cdab0339133"

RPROVIDES:${PN} += "coin-or-Cbc-devel \
pkgconfig-cbc \
pkgconfig-osi-cbc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCbc3 \
libOsiCbc3 \
pkgconfig-cbc \
pkgconfig-cgl \
pkgconfig-clp \
pkgconfig-coinutils \
pkgconfig-osi \
pkgconfig-osi-clp"

inherit rpm
