SUMMARY = "Direct3D 12 to Vulkan translation shader library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan shader library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libvkd3d-shader1-1.8-1.2.aarch64.rpm"
RPM_HASH = "03fbc7dafbd33abb3e0348ad5cc1c4db80e2737de026f40572e649b54de2bda9ddb9487f6232ad931102a884d44c99e4aea097945410ae01b9f22ebfdf52cae8"

RPROVIDES:${PN} += "libvkd3d-shader.so.1 \
libvkd3d-shader1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-shared-2023.4~rc2.so \
libc.so.6"

inherit rpm
