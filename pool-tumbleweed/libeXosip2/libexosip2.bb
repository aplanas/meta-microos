SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-5.3.0-1.3.aarch64.rpm"
RPM_HASH = "72a981513b53d01b7fb6ea17bdb845893a73718e0bc32b5c11175e69ab7e4d6146939fe629e8e3d42e05d06adcb34cda23a27fc5f9773c00b5ec2901681c3fa3"

RPROVIDES:${PN} += "libeXosip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeXosip2.so.15 \
libosip2.so.15 \
libosipparser2.so.15"

inherit rpm
