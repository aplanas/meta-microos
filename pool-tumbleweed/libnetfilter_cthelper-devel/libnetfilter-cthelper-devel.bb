SUMMARY = "Userspace library for the Netfilter Conntrack Helper extension"
DESCRIPTION = "This library provides the programming interface (API) to the \
Netfilter userspace helper infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "libnetfilter_cthelper-devel-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "df68a3881fa7fd4e532370868879cdce6aca701ad71c200b711e61b70cd3b846ac2ca95016583c962e954aa92fb12f347e16915e9fd3880925ff92874cf11394"

RPROVIDES:${PN} += "libnetfilter-cthelper-devel \
pkgconfig-libnetfilter-cthelper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter-cthelper0"

inherit rpm
