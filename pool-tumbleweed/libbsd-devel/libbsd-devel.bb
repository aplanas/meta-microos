SUMMARY = "Development headers and files for libbsd"
DESCRIPTION = "This library provides functions commonly found on BSD systems, and \
lacking on others like GNU systems, thus making it easier to port projects \
with strong BSD origins, without needing to embed the same code over and \
over again on each project."
LICENSE = "BSD-3-Clause"

PV = "0.11.7"

RPM_NAME = "libbsd-devel-0.11.7-2.2.aarch64.rpm"
RPM_HASH = "09e65c215368bbb6607fcc2c70d248d8dd60ed4a91df25879aaf2f67d493fe6933b0072499f81fd64f6371965945195ee6592a07b887ad6dbc6798118522b358"

RPROVIDES:${PN} += "libbsd-devel \
pkgconfig-libbsd \
pkgconfig-libbsd-overlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libbsd0 \
libmd-devel"

inherit rpm
