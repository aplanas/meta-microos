SUMMARY = "Support libraries for GVM"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wmiclient1-1.0.5-2.2.aarch64.rpm"
RPM_HASH = "021984f93c88899979ae09a40684bcd9f62aa682e6a263b518c1fdce4571719cd0bc571a9231c67ec5e629a390fdd850c6a04528d2109c7e7077db6264372ad8"

RPROVIDES:${PN} += "libopenvas-wmiclient.so.1 \
libopenvas-wmiclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libgnutls.so.30 \
libgssapi.so.3 \
libhdb.so.9 \
libkrb5.so.26 \
libpopt.so.0"

inherit rpm
