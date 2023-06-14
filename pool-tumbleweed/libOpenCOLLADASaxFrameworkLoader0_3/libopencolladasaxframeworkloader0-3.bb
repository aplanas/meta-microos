SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADASaxFrameworkLoader is a library that loads COLLADA files in a \
SAX-like manner into the data framework model and is used by \
COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADASaxFrameworkLoader0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "9eb7344998b4373521806b1975760366fa6139d46bf939641c96ad5bdbb39acbb5b457c9afb7c8fd109ba1f91e43ab00b84dc27180bb158d7ddd0163150c08cf"

RPROVIDES:${PN} += "libOpenCOLLADASaxFrameworkLoader.so.0.3 \
libOpenCOLLADASaxFrameworkLoader0-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGeneratedSaxParser.so.0.3 \
libMathMLSolver.so.0.3 \
libOpenCOLLADABaseUtils.so.0.3 \
libOpenCOLLADAFramework.so.0.3 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
