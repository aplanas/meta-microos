SUMMARY = "OpenCASCADE data exchange libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE data exchange module: \
  TKVCAF TKXSBase TKSTEPBase TKSTEPAttr TKSTEP209 TKSTEP \
  TKIGES TKXCAF TKXDEIGES TKXDESTEP TKSTL TKVRML TKXmlXCAF \
  TKBinXCAF TKRWMesh"
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-dataexchange7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "a9decd45fc541aa91123822d795753340cadea6f0a8e8ffb9d4350667a0ca94b5c8081d7d0c14b141595bd2967017411f2f7642a311d8435ca5cd7ec5311a38a"

RPROVIDES:${PN} += "libTKBinXCAF.so.7.7 \
libTKExpress.so.7.7 \
libTKIGES.so.7.7 \
libTKRWMesh.so.7.7 \
libTKSTEP.so.7.7 \
libTKSTEP209.so.7.7 \
libTKSTEPAttr.so.7.7 \
libTKSTEPBase.so.7.7 \
libTKSTL.so.7.7 \
libTKVRML.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDE.so.7.7 \
libTKXDECascade.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKXmlXCAF.so.7.7 \
libopencascade-dataexchange7-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libTKBRep.so.7.7 \
libTKBin.so.7.7 \
libTKBinL.so.7.7 \
libTKBinTObj.so.7.7 \
libTKBool.so.7.7 \
libTKCAF.so.7.7 \
libTKCDF.so.7.7 \
libTKG2d.so.7.7 \
libTKG3d.so.7.7 \
libTKGeomAlgo.so.7.7 \
libTKGeomBase.so.7.7 \
libTKHLR.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKPrim.so.7.7 \
libTKService.so.7.7 \
libTKShHealing.so.7.7 \
libTKStd.so.7.7 \
libTKStdL.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKV3d.so.7.7 \
libTKVCAF.so.7.7 \
libTKXml.so.7.7 \
libTKXmlL.so.7.7 \
libTKXmlTObj.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
