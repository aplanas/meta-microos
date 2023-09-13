SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.23"

RPM_NAME = "nodejs-electron-doc-22.3.23-1.2.noarch.rpm"
RPM_HASH = "01f9824741bb82cb685f62462d097a5c9a4662b489b6ac0a6c09e69fc622000d284dca8c9ae2115f1734d2cb751b4e877b222cc7907f0f5586142cd3351f5e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"

RDEPENDS:${PN} += ""

inherit rpm
