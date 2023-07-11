SUMMARY = "Electron development headers"
DESCRIPTION = "Development headers for Electron projects."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.14"

RPM_NAME = "nodejs-electron-devel-22.3.14-1.1.aarch64.rpm"
RPM_HASH = "4b3579cef9e3686d8d7b1bf042c1357949c466d43b8db5e1f330de16ee0645d64c701959abdab99be51d6c0255732ce21d752deb5ce4db3c88f6304bcc096c90"

RPROVIDES:${PN} += "nodejs-electron-devel \
rpm-macro-electron-req"

RDEPENDS:${PN} += "nodejs-electron \
pkgconfig-zlib"

inherit rpm
