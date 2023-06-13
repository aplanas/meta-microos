SUMMARY = "Backend library for pkgconf"
DESCRIPTION = "This package provides libraries for applications to use the functionality \
of pkgconf."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "libpkgconf3-1.8.0-2.3.aarch64.rpm"
RPM_HASH = "3940a879f0c166da7fa5ce8765eec98eddfd91d03a20066d34a37375b69576dc80e2876d5db29c7c03a1de9a964bed5600718d918080b1b6d3ae302ceef32a18"

RPROVIDES:${PN} += "libpkgconf.so.3()(64bit) \
libpkgconf3 \
libpkgconf3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
