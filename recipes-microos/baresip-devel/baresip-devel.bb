SUMMARY = "Development files for the baresip library"
DESCRIPTION = "The baresip-devel package includes header files and libraries necessary \
for developing programs which use the baresip C library."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-devel-2.10.0-1.7.aarch64.rpm"
RPM_HASH = "ed23c7d3f9a1637badb6d7bea5eca91ee56af9bf34f0d1c6ce677796009afbf8ee08ed0d7d4f4193476265a06e6dd87cea1c58870fd5b833f15648b3dc8729ab"

RPROVIDES:${PN} += "baresip-devel baresip-devel(aarch-64) pkgconfig(libbaresip)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbaresip2 pkgconfig"

inherit rpm
