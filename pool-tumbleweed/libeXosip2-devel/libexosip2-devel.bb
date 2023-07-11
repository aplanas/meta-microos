SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-devel-5.3.0-1.4.aarch64.rpm"
RPM_HASH = "e3f14aed5ac068a89d4d0a12221e5857c41c8d5937cdf534b641be888cba9f26ec20bd125d8294f6bd4734fd860142aa7a2b3ec45d91d84020b5eb0a864aff74"

RPROVIDES:${PN} += "libeXosip2-15-devel \
libeXosip2-devel"

RDEPENDS:${PN} += "glibc-devel \
libeXosip2-15 \
libosip2-devel \
openssl-devel"

inherit rpm
