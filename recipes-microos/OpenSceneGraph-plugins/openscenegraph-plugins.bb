SUMMARY = "Plugins for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains some plugins for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-WITH-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugins-3.6.5-8.6.aarch64.rpm"
RPM_HASH = "27e5de8efa3b62b4829a7fb835cff5bd4ecc2db9b85d0698f810bd28a1d72443bab0fb29b3d802fba3c114ba88c1262915fa28be3938419b46309d7e3c53ede8"

RPROVIDES:${PN} += "OpenSceneGraph-plugins OpenSceneGraph-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libOpenThreads.so.21()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcurl.so.4()(64bit) libdcmdata.so.17()(64bit) libdcmimage.so.17()(64bit) libdcmimgle.so.17()(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgif.so.7()(64bit) libgobject-2.0.so.0()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libofstd.so.17()(64bit) libosg.so.161()(64bit) libosgAnimation.so.161()(64bit) libosgDB.so.161()(64bit) libosgFX.so.161()(64bit) libosgGA.so.161()(64bit) libosgManipulator.so.161()(64bit) libosgParticle.so.161()(64bit) libosgPresentation.so.161()(64bit) libosgShadow.so.161()(64bit) libosgSim.so.161()(64bit) libosgTerrain.so.161()(64bit) libosgText.so.161()(64bit) libosgUI.so.161()(64bit) libosgUtil.so.161()(64bit) libosgViewer.so.161()(64bit) libosgVolume.so.161()(64bit) libosgWidget.so.161()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) librsvg-2.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libvncclient.so.1()(64bit) libz.so.1()(64bit)"

inherit rpm
