SUMMARY = "Xfce Development Tools"
DESCRIPTION = "The Xfce development tools are a collection of tools and macros for \
Xfce developers and people that want to build unreleased development \
versions of Xfce."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.0"

RPM_NAME = "xfce4-dev-tools-4.16.0-1.12.aarch64.rpm"
RPM_HASH = "fee244ca52ac5a61647144b5555dbd4ae275b47dc4ee4e66bdfd5e4b50d1185e895cf73d626131fce1a2b09a57436f2b41edd30a7e2aea3194034360556688e6"

RPROVIDES:${PN} += "xfce4-dev-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
autoconf \
automake \
intltool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtool \
make"

inherit rpm
