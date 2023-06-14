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
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-opencascade.so \
OpenSceneGraphPlugin-ext-iges \
OpenSceneGraphPlugin-ext-step"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTKBRep.so.7.7 \
libTKIGES.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKShHealing.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libgcc-s.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgUtil.so.161 \
libstdc++.so.6"

inherit rpm
