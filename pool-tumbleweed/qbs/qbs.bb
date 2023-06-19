SUMMARY = "Modern build tool for software projects"
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
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & (LGPL-2.1-only | LGPL-3.0-only-with-Qt-LGPL-exception-1.1) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "1.24.0"

RPM_NAME = "qbs-1.24.0-1.3.aarch64.rpm"
RPM_HASH = "76079d266d396061e297d9b7da6f48c511d99dcbf68ffeaf274faf8a0430e98b50f63f67d55938ac97a08a1f5b53fd2bef7a5d63eb3732f8a0e040e7e3cc56f4"

RPROVIDES:${PN} += "libclangcompilationdbgenerator.so \
libiarewgenerator.so \
libkeiluvgenerator.so \
libmakefilegenerator.so \
libqbs-cpp-scanner.so \
libqbs-qt-scanner.so \
libqbscore.so.1.24 \
libvisualstudiogenerator.so \
qbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
