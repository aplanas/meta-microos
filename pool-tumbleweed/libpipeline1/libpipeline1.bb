SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.7"

RPM_NAME = "libpipeline1-1.5.7-1.3.aarch64.rpm"
RPM_HASH = "4b61fbca412610ff1f54cc24eb4826c32db59377dab1681f8f67caba2c93e119027df23870660be5f07fd3d5b33d26216fac04aad808ec4b087cbb066675962d"

RPROVIDES:${PN} += "libpipeline.so.1 \
libpipeline1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
