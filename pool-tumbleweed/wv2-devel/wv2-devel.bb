SUMMARY = "Library for Importing Microsoft Word(tm) Documents - development files"
DESCRIPTION = "The wv2 library is used to import Microsoft Word documents in koffice \
for example."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.2"

RPM_NAME = "wv2-devel-0.4.2-25.6.aarch64.rpm"
RPM_HASH = "813e5ed9a34afa293a75bbd017c0a1632aedf8fefb1d52d998e026871887c59d4a8710befc359697af7c69a61acf5155f6160e046698cf7e5f98e5c9c0c01db1"

RPROVIDES:${PN} += "wv2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libgsf-devel \
libstdc++-devel \
libwv2-4"

inherit rpm
