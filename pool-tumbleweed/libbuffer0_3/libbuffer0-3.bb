SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libbuffer0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "430bdc5362ee90cfe6109376c4d42dfe64cc2244ece05ee33f7ebdcb7d583eede569119ea44603bfc0803309b02d4d3a94990bb6dc66bf7b23d29d00a8c9fab0"

RPROVIDES:${PN} += "libbuffer.so.0.3 \
libbuffer0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libUTF.so.0.3 \
libc.so.6 \
libftoa.so.0.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
