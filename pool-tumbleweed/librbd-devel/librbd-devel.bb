SUMMARY = "RADOS block device headers"
DESCRIPTION = "This package contains libraries and headers needed to develop programs \
that use RADOS block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librbd-devel-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "010f13a37ed43fc77f73f49673082e2c199f4dc5843819d0d42b4cba959c31d3ec5d3169a7421645c17f436a66e259ec66d794455ee8e22464294c5176776f4d"

RPROVIDES:${PN} += "librbd-devel \
librbd1-devel"

RDEPENDS:${PN} += "librados-devel \
libradospp-devel \
librbd1"

inherit rpm
