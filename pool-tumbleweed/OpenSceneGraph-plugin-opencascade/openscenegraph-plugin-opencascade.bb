SUMMARY = "OpenCASCADE plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the OpenCASCADE plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-opencascade-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "30e8f49bf2892f3fb0382090f36e4013e6d33365b829f92322cb07b335fe75f2424da89967cf5ff4c92d5cebba2836cc474d6fedc65b9a7232339c6364b11cdc"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-opencascade \
OpenSceneGraph-plugin-opencascade(aarch-64) \
OpenSceneGraph-plugins:/usr/lib64/osgPlugins-3.6.5/osgdb_opencascade.so \
OpenSceneGraphPlugin(ext:iges) \
OpenSceneGraphPlugin(ext:step)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKIGES.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKShHealing.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDEIGES.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKXSBase.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libosg.so.161()(64bit) \
libosgDB.so.161()(64bit) \
libosgUtil.so.161()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
