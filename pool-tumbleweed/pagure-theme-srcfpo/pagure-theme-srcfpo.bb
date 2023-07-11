SUMMARY = "Pagure web interface theme used on src.fedoraproject.org"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as src.fedoraproject.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-srcfpo-5.13.3-1.5.noarch.rpm"
RPM_HASH = "fbcb58efe54ef82e2420da6c88f1a83355a909ecf731bb0cd839ecaa1e89f4af71a8e62d39da57d12a078d2c33b9a5d31cc4a6baad47baad035b4e33dc11f871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-srcfpo"

RDEPENDS:${PN} += "pagure"

inherit rpm
