SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.17"

RPM_NAME = "nodejs-electron-devel-22.3.17-2.1.aarch64.rpm"
RPM_HASH = "0088c0d1c8a71d3a79e12db0913848cb785dea6155a1d78dd5e54548160da3b2399d1b04e37498185cb2ffa878bf41ad50dbebe96ea015ae5b1ea137719c456c"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-req"

RDEPENDS:${PN} += "nodejs-electron \
pkgconfig-zlib"

inherit rpm
