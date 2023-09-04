SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.21"

RPM_NAME = "nodejs-electron-doc-22.3.21-1.1.noarch.rpm"
RPM_HASH = "d3fa3d51a23889ea88cc6607386bf7133397441196ba304dfc5db873ac10da6be346e1ba3f0120fce29ee3921ecc21ccc7bde79bc524a2f1aef50cf410a820e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"

RDEPENDS:${PN} += ""

inherit rpm
