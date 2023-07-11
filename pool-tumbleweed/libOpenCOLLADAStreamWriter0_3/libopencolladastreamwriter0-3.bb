SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADAStreamWriter contains the library to write COLLADA files."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADAStreamWriter0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "740bdc623b97659eaa32e7f3765358c9649e88e2849ff461bdd409744b7ec2c07aaf40835f89e35876fff9bcbe0795c7d24e4a30ce8b4535fa2d2aa9f3110a23"

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
