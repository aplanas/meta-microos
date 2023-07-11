SUMMARY = "Backend library for pkgconf"
DESCRIPTION = "This package provides libraries for applications to use the functionality \
of pkgconf."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "libpkgconf3-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "4e305a31a26b950a4a23671a846e9c562b716ff2afd61370a3de17dc7162a50c0010809fbbea16068b5929b61b31f4d56093d65ced18a2d4acda90ae5657bd87"

RPROVIDES:${PN} += "libpkgconf.so.3 \
libpkgconf3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
