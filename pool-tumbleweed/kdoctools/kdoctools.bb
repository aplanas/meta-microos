SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.108.0"

RPM_NAME = "kdoctools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "01f5865a2503405aed3b11487361ac578e4b4b494ffe3be4df85807e6d86128facf5b7c2e2a006f1cca78717738c1dc97bd968c9192d291b3d7469f234308e47"

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
