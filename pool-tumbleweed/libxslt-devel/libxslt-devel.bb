SUMMARY = "Development files for libxslt"
DESCRIPTION = "libxslt allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the XSLT libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.38"

RPM_NAME = "libxslt-devel-1.1.38-1.1.aarch64.rpm"
RPM_HASH = "76a5557b582d070e95a8ed848025861d1103f816bfc430a94ab1fb3ac7c3f7ae2cec5309a962183aae6c8f4c9bae16bc15f60cf83d1c34a52bcf8f3be0436ccf"

RPROVIDES:${PN} += "libxslt-devel \
libxslt-devel(aarch-64) \
pkgconfig(libexslt) \
pkgconfig(libxslt)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libexslt0 \
libgcrypt-devel \
libxslt-tools \
libxslt1 \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt)"

inherit rpm
