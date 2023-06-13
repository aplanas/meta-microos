SUMMARY = "Development files for liblilv"
DESCRIPTION = "Lilv is a C library to make use of LV2 plugins in applications. \
This subpackage contains the development files for liblilv."
LICENSE = "ISC"

PV = "0.24.20"

RPM_NAME = "liblilv-0-devel-0.24.20-1.1.aarch64.rpm"
RPM_HASH = "fa2e1229e06223092998211be10058565290fd4889cfaa9d4bebf97f46f37e7f574447a7de1559be22c234d08c8767f29c21aa4ca293d0159d737095db83b84d"

RPROVIDES:${PN} += "liblilv-0-devel \
liblilv-0-devel(aarch-64) \
pkgconfig(lilv-0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblilv-0-0 \
pkgconfig(lv2) \
pkgconfig(serd-0) \
pkgconfig(sord-0) \
pkgconfig(sratom-0)"

inherit rpm
