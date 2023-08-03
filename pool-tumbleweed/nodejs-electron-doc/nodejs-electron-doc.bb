SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.17"

RPM_NAME = "nodejs-electron-doc-22.3.17-1.1.noarch.rpm"
RPM_HASH = "b34db3ed9958679aacfde916ae2a0b29d574adfd97e7b5016766fd3b00db1d63a7622c351018b4cff91bee8f7a6a6bdae0ff0af776dae06510605361eb94de97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"

RDEPENDS:${PN} += ""

inherit rpm
