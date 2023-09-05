SUMMARY = "Development files for bemenu"
DESCRIPTION = "Files required for development for Bemenu."
LICENSE = "MIT"

PV = "0.6.16"

RPM_NAME = "bemenu-devel-0.6.16-1.1.aarch64.rpm"
RPM_HASH = "2bac69879a8bb5b8253d475c1e96d6f9758ad9fcc099d4117701548e2c448f409996bd4ec6168c903bace68e5616dd5910ad175ff38243bb128d949ad8f852a0"

RPROVIDES:${PN} += "bemenu-devel \
pkgconfig-bemenu"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
gcc-c++ \
libbemenu0 \
pkgconfig"

inherit rpm
