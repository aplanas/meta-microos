SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.11"

RPM_NAME = "nodejs-electron-doc-22.3.11-1.3.noarch.rpm"
RPM_HASH = "67f6e6ad948eac813394119b2e5b38d70511e68c63bbdc64942b663f9f2e38cf18e050962344b16a01521e31482aeceb6965ab21328983872949bb4af4045e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"
RDEPENDS:${PN} += ""

inherit rpm
