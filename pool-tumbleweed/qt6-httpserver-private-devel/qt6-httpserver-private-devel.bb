SUMMARY = "Non-ABI stable API for the Qt 6 HttpServer Library"
DESCRIPTION = "This package provides private headers of libQt6HttpServer that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "899c540db510cd14101fae2b11bfef8e4ab32d4600a91a71b097f500e52232b949e730dee54b0232d7acf2fca92b001badab470b4b1be6c362fb14f6d3519851"

RPROVIDES:${PN} += "qt6-httpserver-private-devel \
qt6-httpserver-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6HttpServer)"

inherit rpm
