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

RPM_NAME = "libOpenCOLLADASaxFrameworkLoader0_3-1.6.68-1.13.aarch64.rpm"
RPM_HASH = "bfdf17ed4e0a0e8bbae364bc93971ae7b3775242541265ef446c6ddc68a5d93b252c0832ebf9cb6795a2a679d1d0fb3f4b09f2af56d9754309f67e8185a4a4d2"

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
