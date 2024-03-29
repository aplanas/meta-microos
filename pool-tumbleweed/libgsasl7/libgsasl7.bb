SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g., IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl7-1.10.0-6.1.aarch64.rpm"
RPM_HASH = "fe5d06595872fe9c32e615fc932ca55e24c8200be61069108fe3c070a1e7b8e4681315ba25db98dbbdf7f482622605dec6c38e1dfd01d7354ea6895172a80adc"

RPROVIDES:${PN} += "libgsasl \
libgsasl.so.7 \
libgsasl7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libidn.so.12 \
libntlm.so.0"

inherit rpm
