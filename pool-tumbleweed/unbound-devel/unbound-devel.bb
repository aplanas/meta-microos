SUMMARY = "Development files for libunbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the development files to work with libunbound."
LICENSE = "BSD-3-Clause"

PV = "1.17.1"

RPM_NAME = "unbound-devel-1.17.1-1.3.aarch64.rpm"
RPM_HASH = "00842367953c96e761a697957508dec88a7e9ce020940134c92df3c381eedd7bef70c9599c4d354688c6f387ac5b335598b52b557e6274464275595647b18d7a"

RPROVIDES:${PN} += "libunbound-devel \
pkgconfig(libunbound) \
unbound-devel \
unbound-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ldns-devel \
libunbound8 \
openssl-devel \
pkgconfig(libevent) \
pkgconfig(python3)"

inherit rpm
