SUMMARY = "Files for Developing with libpagemaker"
DESCRIPTION = "libpagemaker is library providing ability to interpret and import \
Adobe PageMaker documents into various applications. \
 \
This package contains the libpagemaker development files."
LICENSE = "MPL-2.0"

PV = "0.0.4"

RPM_NAME = "libpagemaker-devel-0.0.4-1.30.aarch64.rpm"
RPM_HASH = "8f1bef21e1fac0b90cfb14d03f21b323b56dce8b2b1dab6573b9ccc7a5927458d4f98e1e9b20b98a49c903ac35df95f59679af4f6fcda03c2768874aaca2a60a"

RPROVIDES:${PN} += "libpagemaker-devel \
pkgconfig-libpagemaker-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpagemaker-0-0-0 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
