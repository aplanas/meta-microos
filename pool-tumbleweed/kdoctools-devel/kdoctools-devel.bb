SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.106.0"

RPM_NAME = "kdoctools-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7c57a86b4198c295e22204e70e41b2e9a6080bbfd0e822d7e36debc3e176f44e921b2394ed1b2f4ea2c79221145a821c4d1bfcd0751c6ecb878abcd3cb72c4ac"

RPROVIDES:${PN} += "cmake(KF5DocTools) \
kdoctools-devel \
kdoctools-devel(aarch-64) \
kdoctools-devel-static"

RDEPENDS:${PN} += "cmake(Qt5Core) \
docbook-xsl-stylesheets \
extra-cmake-modules \
kdoctools \
libKF5DocTools5 \
libxslt-devel"

inherit rpm
