SUMMARY = "OpenCASCADE application framework libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE application framework module: \
  TKCDF TKLCAF TKCAF TKBinL TKXmlL TKBin TKXml TKStdL \
  TKStd TKTObj TKBinTObj TKXmlTObj"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-applicationframework7_7-7.7.0-1.4.aarch64.rpm"
RPM_HASH = "6f936728dd1266e2e97f5054b1f3dd4b0183f882d4490c81c7037ac42d23e63553d3fa2d19eeb1ef91b79f22bf15472d7d5cb1d8293fdb0bb54b3683a07f9cbd"

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
libstdc++.so.6"

inherit rpm
