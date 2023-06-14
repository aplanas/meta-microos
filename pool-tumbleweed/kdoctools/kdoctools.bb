SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.106.0"

RPM_NAME = "kdoctools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fc3fb022e10da57e791059a70b5ec07b49a24f25c5c702e4b53f19fab518edabb70ae6308c53a67b192f9ce560807d3950bcf6b8e8904727b7c63f8603c4ffb8"

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
