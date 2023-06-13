SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.11"

RPM_NAME = "nodejs-electron-devel-22.3.11-1.3.aarch64.rpm"
RPM_HASH = "cdcdbc8033276a8d69389190220a50fbbc16e6b576e4b524adc4686cf8b9a949389f87eba26865e8e6c3a47ff9448e9b040f319093a7ebdb217020baf8cfec59"

RPROVIDES:${PN} += "nodejs-electron-devel \
nodejs-electron-devel(aarch-64) \
rpm_macro(electron_req)"

RDEPENDS:${PN} += "nodejs-electron(aarch-64) \
pkgconfig(zlib)"

inherit rpm
