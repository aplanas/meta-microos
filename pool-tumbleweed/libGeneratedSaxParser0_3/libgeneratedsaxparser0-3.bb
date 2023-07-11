SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
GeneratedSaxParser is the library used to load xml files in the way \
used by COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libGeneratedSaxParser0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "66cb0145ee9c913fcc594c384b41f39e3f143373ffd971e8b79c39dfdc6b1320fb2e6724e0244577739f952568dfbdf975fcbdbf429c13cfe260160b3e52c666"

RPROVIDES:${PN} += "libGeneratedSaxParser.so.0.3 \
libGeneratedSaxParser0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCOLLADABaseUtils.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
