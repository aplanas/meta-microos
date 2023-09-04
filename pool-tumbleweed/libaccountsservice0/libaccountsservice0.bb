SUMMARY = "Client library for the user account information manipulation D-Bus service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides a client library for the service."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "libaccountsservice0-23.13.9-4.1.aarch64.rpm"
RPM_HASH = "2df0b4e7a9499d5cdc8fadbcd9fdba9885fa5cdff0df3e4e9800d60c98070580e539595bc0f9644774b485750340942afb77fcac5dc2b5dc7ed3fb969e0f0a71"

RPROVIDES:${PN} += "libaccountsservice.so.0 \
libaccountsservice0"

RDEPENDS:${PN} += "/sbin/ldconfig \
accountsservice \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
