SUMMARY = "Library and utilities for reading Personal Storage Table files"
DESCRIPTION = "The libpst utilities include readpst, which can convert email messages \
to both mbox and MH mailbox formats, pst2ldif, which can convert the \
contacts to .ldif format for import into LDAP databases, and pst2dii, \
which can convert email messages to the DII load file format used by \
Summation."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-0.6.76-1.4.aarch64.rpm"
RPM_HASH = "99ea185bd350db943b4c5539286e05b3faf4afecf05bf2612e9df1e9c286661f8b3713ce27e270816d8eb4b0e2d42073aa30990f305ca419215516d0625bffde"

RPROVIDES:${PN} += "libpst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libpst.so.4 \
libstdc++.so.6"

inherit rpm
