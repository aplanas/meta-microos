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

PV = "2.0.2"

RPM_NAME = "qbs-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "ae101fbf30a6fb61c3881eb53306e7f2380629731f07a220c99b1210f9c914fab885448f81551281575280a77035d74cc1aef25ada21d1fdd8d53cb98733bb4f"

RPROVIDES:${PN} += "libclangcompilationdbgenerator.so \
libiarewgenerator.so \
libkeiluvgenerator.so \
libmakefilegenerator.so \
libqbs-cpp-scanner.so \
libqbs-qt-scanner.so \
libqbscore.so.2.0 \
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
