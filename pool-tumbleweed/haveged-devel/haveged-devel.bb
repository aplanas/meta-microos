SUMMARY = "Haveged development files"
DESCRIPTION = "Headers and for the haveged library \
 \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.18"

RPM_NAME = "haveged-devel-1.9.18-2.3.aarch64.rpm"
RPM_HASH = "9ea816a18be26e427206bd2164e65761e73a37e1a24e267edfd3ff85e8dee55b2e15c6758f541401827d89af40c0ba0bc2409592f9d8c55fa254757cfbea0fc1"

RPROVIDES:${PN} += "haveged-devel"

RDEPENDS:${PN} += "libhavege2"

inherit rpm
