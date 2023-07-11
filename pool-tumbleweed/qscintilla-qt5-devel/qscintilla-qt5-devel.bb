SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt5-qt5."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt5-devel-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "928aac9865868558cddfdb641e209cfd44391d137db06dcdb0d4087658f4e56ab7e958aa162c429653ef8aafa58fca45c3ca9517f647492e0a03916b66a4305b"

RPROVIDES:${PN} += "libqscintilla-qt5-devel \
libqscintilla2-qt5-devel \
qscintilla-qt5-devel"

RDEPENDS:${PN} += "libqscintilla2-qt5-15 \
pkgconfig-Qt5Core \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Widgets"

inherit rpm
