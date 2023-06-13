SUMMARY = "OpenCASCADE application framework libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE application framework module: \
  TKCDF TKLCAF TKCAF TKBinL TKXmlL TKBin TKXml TKStdL \
  TKStd TKTObj TKBinTObj TKXmlTObj"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-applicationframework7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "b5d671626f7e5ab720a5e66b375e9fe8f055487bb120766171817ff4d4144292f4c99e79f0728347a03539c93fbce3ec8cb100b74c492791d2013bbbc82e12f3"

RPROVIDES:${PN} += "libTKBin.so.7.7()(64bit) \
libTKBinL.so.7.7()(64bit) \
libTKBinTObj.so.7.7()(64bit) \
libTKCAF.so.7.7()(64bit) \
libTKCDF.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKStd.so.7.7()(64bit) \
libTKStdL.so.7.7()(64bit) \
libTKTObj.so.7.7()(64bit) \
libTKVCAF.so.7.7()(64bit) \
libTKXml.so.7.7()(64bit) \
libTKXmlL.so.7.7()(64bit) \
libTKXmlTObj.so.7.7()(64bit) \
libopencascade-applicationframework7_7 \
libopencascade-applicationframework7_7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libTKBO.so.7.7()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKService.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKV3d.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
