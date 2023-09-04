SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.21"

RPM_NAME = "nodejs-electron-devel-22.3.21-1.1.aarch64.rpm"
RPM_HASH = "4a49f15b4cf4ab7ea4abff7f4302fa39cf958ac357d605aaf409b3b3ff058f1b5e74b6b9b5fdd1befd1fe3eaacd82d5a39c40d762d864e759c243768d3c62889"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-req"

RDEPENDS:${PN} += "nodejs-electron \
pkgconfig-zlib"

inherit rpm
