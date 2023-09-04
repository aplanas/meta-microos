SUMMARY = "Build environment for kdoctools"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files. \
Development files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.109.0"

RPM_NAME = "kdoctools-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "abf8eb4176248a944aa10401bef81c3058cfc58a200b58818d7ed52ed82a58238101d4795dbcfb5006c64a26cb054aa6665d6398e5e128f83e6b70cf4fb11ac3"

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
