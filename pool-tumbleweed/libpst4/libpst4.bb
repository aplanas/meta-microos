SUMMARY = "A library for reading Personal Storage Table files"
DESCRIPTION = "libpst is a library that can decode the email messages stored in a \
.pst (Personal Storage Table) file as created by Outlook."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.76"

RPM_NAME = "libpst4-0.6.76-1.4.aarch64.rpm"
RPM_HASH = "7ffb9bb2c33ba8bfbbe8e58b5b7dd37ba3df2ab448a62901a84f667d89d89af38e175d670c3a66e4a1187594424dc26cde2fd1fb150b85077670854068390ae8"

RPROVIDES:${PN} += "libpst.so.4 \
libpst4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
