SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-0.0.3-1.4.aarch64.rpm"
RPM_HASH = "5f0a453e2db69b76df39569d96edd40b2ac5a570cdd0297e38cf40440c6cded09155e3d592cb06d427be64ab9f1a65cd12c102941a87b544d6bcf76844d073fd"

RPROVIDES:${PN} += "librvngabw-devel \
pkgconfig-librvngabw-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librvngabw-0-0-0 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
