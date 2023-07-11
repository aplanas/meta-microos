SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.107.0"

RPM_NAME = "kdoctools-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "21d57b33a23b36c08aa393b78e262b44907b2a553e809f9f5b43d1e0b46f1f6ec3e0015756830e4e19dbe090dc42703e6d284c722b7ccfe0836df865c1a177c7"

RPROVIDES:${PN} += "kdoctools"

RDEPENDS:${PN} += "docbook-xsl-stylesheets \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libexslt.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
