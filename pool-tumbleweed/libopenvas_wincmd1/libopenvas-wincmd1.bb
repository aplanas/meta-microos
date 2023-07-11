SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wincmd1-1.0.5-2.2.aarch64.rpm"
RPM_HASH = "f8b79c0df889725bdcd5738c24edaaa508455f4392a00690d29108e0163c3f40215f6cf166a9cf46af875468de673787271fb29142260853fdbde5c6ffc3e631"

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
