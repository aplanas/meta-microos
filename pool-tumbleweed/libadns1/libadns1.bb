SUMMARY = "Advanced DNS resolver client library"
DESCRIPTION = "Libadns is an advanced, easy to use, asynchronous-capable DNS resolver \
client library for C (and C++) programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libadns1-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "c6415b8baf6920a0e72fe808e632f220421ea3fbf5715b3c20f53ece96555eebef59f7bd4f1f1491e51f51a5d37587e8354e443baae082cbd3762f1ab127e7e5"

RPROVIDES:${PN} += "libadns \
libadns.so.1 \
libadns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
