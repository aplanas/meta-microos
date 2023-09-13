SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.23"

RPM_NAME = "nodejs-electron-devel-22.3.23-1.2.aarch64.rpm"
RPM_HASH = "f14649963c81ec3d62f198ff91af5d467b2fa139f731b318b8748c45b5f647e3787cb5d5b069247766f8ccedf52ae403f38386e1e4351146f9f7dd3bd23425ad"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-req"

RDEPENDS:${PN} += "nodejs-electron \
pkgconfig-zlib"

inherit rpm
