SUMMARY = "Development files for audaspace"
DESCRIPTION = "The audaspace-devel package contains libraries and header files for \
developing applications that use audaspace."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-devel-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "78de24dd294292c03fe86a2fd5ad5b00dd1fd3d78ddce6342072aa5c899259ca2376b10b09ac0165d3e357ee5c4b4b48f0b10969b5e27dc8fd0aa3bf5fdf2ac5"

RPROVIDES:${PN} += "audaspace-devel \
pkgconfig-audaspace"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudaspace-c1-4 \
libaudaspace-py1-4 \
libaudaspace1-4"

inherit rpm
