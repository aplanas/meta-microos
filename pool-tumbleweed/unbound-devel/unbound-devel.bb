SUMMARY = "Development files for libunbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the development files to work with libunbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-devel-1.17.1-1.5.aarch64.rpm"
RPM_HASH = "a407822b9f801a2722ca19f6a81bec3ec1283a84fac0621a67a00023587aa7a5f97b70ecb13103aea6573eb84d7ade9fed765a6039c7507b77774224f56deda3"

RPROVIDES:${PN} += "libunbound-devel \
pkgconfig-libunbound \
unbound-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ldns-devel \
libunbound8 \
openssl-devel \
pkgconfig-libevent \
pkgconfig-python3"

inherit rpm
