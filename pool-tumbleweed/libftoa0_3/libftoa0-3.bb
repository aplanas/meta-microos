SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libftoa0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "12fa17635132e008540f0d6b183ebedf56610597b1231b1ec87f9682883b3fb1e3f893e21b402a0d01e1dc46cb3f421c127a68ee0ad7be1531d690e93533d45d"

RPROVIDES:${PN} += "libftoa.so.0.3 \
libftoa0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
