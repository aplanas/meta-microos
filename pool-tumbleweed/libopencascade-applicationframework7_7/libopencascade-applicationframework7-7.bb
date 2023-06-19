SUMMARY = "OpenCASCADE application framework libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE application framework module: \
  TKCDF TKLCAF TKCAF TKBinL TKXmlL TKBin TKXml TKStdL \
  TKStd TKTObj TKBinTObj TKXmlTObj"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-applicationframework7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "b5d671626f7e5ab720a5e66b375e9fe8f055487bb120766171817ff4d4144292f4c99e79f0728347a03539c93fbce3ec8cb100b74c492791d2013bbbc82e12f3"

RPROVIDES:${PN} += "libTKBin.so.7.7 \
libTKBinL.so.7.7 \
libTKBinTObj.so.7.7 \
libTKCAF.so.7.7 \
libTKCDF.so.7.7 \
libTKLCAF.so.7.7 \
libTKStd.so.7.7 \
libTKStdL.so.7.7 \
libTKTObj.so.7.7 \
libTKVCAF.so.7.7 \
libTKXml.so.7.7 \
libTKXmlL.so.7.7 \
libTKXmlTObj.so.7.7 \
libopencascade-applicationframework7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomBase.so.7.7 \
libTKMath.so.7.7 \
libTKService.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKV3d.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
