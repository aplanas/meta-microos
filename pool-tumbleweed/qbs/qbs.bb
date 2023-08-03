SUMMARY = "Build tool for software projects"
DESCRIPTION = "Qbs is a tool that helps simplify the build process for developing projects \
across multiple platforms. Qbs can be used for any software project, whether \
it is written with Qt or not. \
 \
Qbs is an all-in one tool that generates a build graph from a high-level \
project description (like qmake or CMake) and additionally undertakes the tasks \
of executing the commands in the low-level build graph (like make). \
 \
This package contains the command line interface. The Qt Creator IDE does \
directly support working qbs projects."
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "qbs-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "447af2922f4f9adadf461013e1561192281599053da7284884b35ca8dbf1afb3a4b3b7b7c5874895778e18834317b82635b8a0813f2fa5473fb61c087f8fa518"

RPROVIDES:${PN} += "libclangcompilationdbgenerator.so \
libiarewgenerator.so \
libkeiluvgenerator.so \
libmakefilegenerator.so \
libqbs-cpp-scanner.so \
libqbs-qt-scanner.so \
libqbscore.so.2.1 \
libvisualstudiogenerator.so \
qbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
