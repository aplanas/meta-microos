SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.109.0"

RPM_NAME = "kdoctools-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "86e84c4375c603a0f9aff144bce7340240fa713f8d265b6c66a08dd3c196537cac37426341c5b99312ce8f6e1c1ec85698ff48c02a9bc50c422732fe49e5ea36"

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
