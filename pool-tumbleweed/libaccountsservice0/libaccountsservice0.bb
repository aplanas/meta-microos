SUMMARY = "Client library for the user account information manipulation D-Bus service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides a client library for the service."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "libaccountsservice0-23.13.9-3.1.aarch64.rpm"
RPM_HASH = "aa2525100acf196d56e6a6ff2d9a4a46f700ed4d203fef659ec215e2b5f42c77d135031d6e5af7195fa04da18d4c57c67393077d7753de2d7947aca739572c34"

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
