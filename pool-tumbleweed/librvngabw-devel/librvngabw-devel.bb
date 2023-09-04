SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-0.0.3-2.1.aarch64.rpm"
RPM_HASH = "e67e1cbe7448df44d4ea953d880ad301dc98d823cb3b7fe04e0f61b4426ca2593673e96e2c87152e89deb993c3d6ad948178f63c07bf95da66b26401bc176c7f"

RPROVIDES:${PN} += "librvngabw-devel \
pkgconfig-librvngabw-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librvngabw-0-0-0 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
