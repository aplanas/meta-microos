SUMMARY = "Development files for Varnish"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
This package holds the development files for varnish."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "varnish-devel-7.2.1-1.4.aarch64.rpm"
RPM_HASH = "b22a291cb3ee5c126d8247dced4053f15a7bee49cc87acc5885118d1695041886debf421d6de876d2b60b2e899f509988077202ebf638fc5c592df250d67b1e0"

RPROVIDES:${PN} += "pkgconfig-varnishapi \
varnish-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
varnish"

inherit rpm
