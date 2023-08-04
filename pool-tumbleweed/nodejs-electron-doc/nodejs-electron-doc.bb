SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.17"

RPM_NAME = "nodejs-electron-doc-22.3.17-2.1.noarch.rpm"
RPM_HASH = "e1d1980a6373d857c6c7f9ed6dd68d87e8aa210cfc60d6195e0f6b5fead48a9aca17426eb2ca60d972a52d58d530a60fdc6e8794ebf44d76c7b78905aa06e5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"

RDEPENDS:${PN} += ""

inherit rpm
