SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wincmd1-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "510c5258658a36ec5c18074f1cf2f85370a1c3bf75a116e6becfb983a8ac9bcdeb8efea25223a4e43bcc973cad326e0316559f8959f6349c11200c767f682fe5"

RPROVIDES:${PN} += "libopenvas-wincmd.so.1 \
libopenvas-wincmd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgssapi.so.3 \
libhdb.so.9 \
libkrb5.so.26 \
libpopt.so.0"

inherit rpm
