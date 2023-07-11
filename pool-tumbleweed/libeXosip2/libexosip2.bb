SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-5.3.0-1.4.aarch64.rpm"
RPM_HASH = "a8247583a0416ff9ceb469e678d47190948abb92007a62739a6f9be7fcdde4492ad2d2276d7138147f5100bda19327202dbe84e8389df97f9e25290846a210e2"

RPROVIDES:${PN} += "libeXosip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeXosip2.so.15 \
libosip2.so.15 \
libosipparser2.so.15"

inherit rpm
