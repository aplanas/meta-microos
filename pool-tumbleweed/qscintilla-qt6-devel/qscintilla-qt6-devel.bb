SUMMARY = "C++ Editor Class Library Development Files"
DESCRIPTION = "QScintilla is a Qt port of Neil Hodgson's Scintilla C++ editor class. \
 \
This is a Qt port from the original Scintilla class \
(http://www.scintilla.org/). \
 \
This package contains the development files for qscintilla-qt6."
LICENSE = "GPL-3.0-only"

PV = "2.13.4"

RPM_NAME = "qscintilla-qt6-devel-2.13.4-1.6.aarch64.rpm"
RPM_HASH = "7e32c042c706fed53eb51d7394a0eab3a199e3ef0269f7307732e867c78da852884cd7fa5bfb27ffbccf69adca88898ddfdd671e1c4498a414b1d14dbd287f3b"

RPROVIDES:${PN} += "libqscintilla-qt6-devel \
libqscintilla2-qt6-devel \
qscintilla-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6PrintSupport \
cmake-Qt6Widgets \
libqscintilla2-qt6-15"

inherit rpm
