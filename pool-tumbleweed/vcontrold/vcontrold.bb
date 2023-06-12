SUMMARY = "Daemon for communication with Viessmann heating controllers"
DESCRIPTION = "vcontrold is a software daemon written in C for communication with \
the 'Optolink' interface of Viessmann heating controllers."
LICENSE = "GPL-3.0-or-later"

PV = "v0.98.10+git20210418.977e6f5"

RPM_NAME = "vcontrold-v0.98.10+git20210418.977e6f5-1.9.aarch64.rpm"
RPM_HASH = "5a310f46481270d6e8751caeb751da3ebf5154abe32c9bce45a779accdb0fefb7e66fc71e58dd4beb1a7b8c1270fad76b7c64ee5642c4a3b92c2054a0d901f21"

RPROVIDES:${PN} += "config(vcontrold) \
group(vcontrold) \
user(vcontrold) \
vcontrold \
vcontrold(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
group(dialout) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
sysuser-shadow"

inherit rpm