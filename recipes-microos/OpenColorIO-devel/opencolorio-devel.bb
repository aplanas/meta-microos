SUMMARY = "Development Files for OpenColorIO"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-devel-2.1.2-3.1.aarch64.rpm"
RPM_HASH = "5bacdd63a9493a779152eae2b769ed523fd119e4baa1bdd06d3587c6e81013b56b29ddb89e0b223b729fc10ddc02f9407af94df4bd213d229d7854d9f20ee1a0"

RPROVIDES:${PN} += "OpenColorIO-devel \
OpenColorIO-devel(aarch-64) \
cmake(OpenColorIO) \
pkgconfig(OpenColorIO)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenColorIO2_1"

inherit rpm
