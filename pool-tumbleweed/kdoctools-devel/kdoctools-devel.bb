SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.108.0"

RPM_NAME = "kdoctools-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e61d076f00d604467ad4f0239fe6891a03a9bda3cfa93481ea3e369c0f40bc3cbeb3a7b2e30b49f6945203b9f57926650cf2f5439e62eba3c19b3cc578eb95c6"

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
