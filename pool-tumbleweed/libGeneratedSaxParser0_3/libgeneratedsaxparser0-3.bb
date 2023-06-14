SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
GeneratedSaxParser is the library used to load xml files in the way \
used by COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libGeneratedSaxParser0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "3e8d9c11ad3ecd0d44c1ae4aba508702c4e8d432de1fd25b189c16f8626c338be500552d5ff17c44e13da8e0709a05c664cf92a5bc8884cbd79131e9036bd1e3"

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
