SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.107.0"

RPM_NAME = "kdoctools-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "1e577414732a19458785c677639c3dd23d08b3134aea9316f2baca06abc24d97a8a34dee2f3e9debc3dafde35323955553e8d904d098c05ade726e36c59dc2e1"

RPROVIDES:${PN} += "cmake-KF5DocTools \
kdoctools-devel \
kdoctools-devel-static"

RDEPENDS:${PN} += "cmake-Qt5Core \
docbook-xsl-stylesheets \
extra-cmake-modules \
kdoctools \
libKF5DocTools5 \
libxslt-devel"

inherit rpm
