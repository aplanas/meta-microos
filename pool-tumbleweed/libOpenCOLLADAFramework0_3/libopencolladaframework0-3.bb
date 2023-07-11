SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADAFramework is the datamodel used to load COLLADA files."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADAFramework0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "d4cffa4cbfa3f92da2496d9355d2b9c70e8b41a22ae3499f7d9858605643f54f94508ce95e891f7abe95f621590c599a9c385e70829abf26b1ca65d37a176146"

RPROVIDES:${PN} += "libOpenCOLLADAFramework.so.0.3 \
libOpenCOLLADAFramework0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCOLLADABaseUtils.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
