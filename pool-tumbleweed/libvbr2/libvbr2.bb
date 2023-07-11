SUMMARY = "Library for assisting in Vouch By Refence functions"
DESCRIPTION = "This package provides the shared library libvbr which \
assists in Vouch By Refence functions."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libvbr2-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "6911427414cd619b53a87c4811802a655532dd912f1dc1865598b7b55d6f22af1b1218c25c58c4c66092359e281f5f16ddcef88aeeddd9de2fe5b5eb7e9b8e47"

RPROVIDES:${PN} += "libvbr.so.2 \
libvbr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
