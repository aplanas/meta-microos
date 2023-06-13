SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libftoa0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "48542f8f83e67565b7de93dce43729888966e8072b4b349960a64bd67d9aa074bcc48a09ab7a9bd0fbd65bbe3dae5ed5caa658b1b8c79271f71be9fa9a1261c4"

RPROVIDES:${PN} += "libftoa.so.0.3()(64bit) \
libftoa0_3 \
libftoa0_3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
