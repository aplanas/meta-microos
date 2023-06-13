SUMMARY = "Library and utilities for reading Personal Storage Table files"
DESCRIPTION = "The libpst utilities include readpst, which can convert email messages \
to both mbox and MH mailbox formats, pst2ldif, which can convert the \
contacts to .ldif format for import into LDAP databases, and pst2dii, \
which can convert email messages to the DII load file format used by \
Summation."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst-0.6.76-1.3.aarch64.rpm"
RPM_HASH = "9e0bd2435e1a410c4b813b844c6c6b08ee659e9c14ef7764c219938c931675563de306f99631ab649dc07aeaef3f58c0340d39d1732d88c3edd477f1f82ea0fd"

RPROVIDES:${PN} += "libpst \
libpst(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libpst.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
