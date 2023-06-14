SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADAStreamWriter contains the library to write COLLADA files."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADAStreamWriter0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "0620203c2569eea5e392c7b476e2229e9b15d6546fbb472e66073ca0a1df4c5397ff076ccd8ac8ab8948f283d467a3e82fa861117646c6aa6fbfa614906dbd5c"

RPROVIDES:${PN} += "libOpenCOLLADAStreamWriter.so.0.3 \
libOpenCOLLADAStreamWriter0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCOLLADABaseUtils.so.0.3 \
libbuffer.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
