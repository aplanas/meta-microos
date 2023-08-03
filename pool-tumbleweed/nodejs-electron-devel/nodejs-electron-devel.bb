SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.17"

RPM_NAME = "nodejs-electron-devel-22.3.17-1.1.aarch64.rpm"
RPM_HASH = "8fa363972f62c6bb24b26878bc9d962e7a3a2c84da9a72068b1674e9be90d988e3c9c257a2e76d234bde9c4fe189eb0f28b70d9f23a3d494169e6666a35d8082"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-req"

RDEPENDS:${PN} += "nodejs-electron \
pkgconfig-zlib"

inherit rpm
