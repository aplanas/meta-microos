SUMMARY = "OpenCASCADE plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the OpenCASCADE plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-opencascade-3.6.5-8.7.aarch64.rpm"
RPM_HASH = "da79680dbd457c290189643ad6b716cd611cabed731487fa95b055c2de12d5625e11c9fae29951e09c9132dc157a7ed0c4a206aa7550fd1d3199a1d9bb371c8e"

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
