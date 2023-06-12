SUMMARY = "Configuration for pagure to default to the upstream web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running as shipped by upstream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-default-upstream-5.13.3-1.4.noarch.rpm"
RPM_HASH = "68ac2c0029c85073c5e944a2a4f0ebf92a7c9f4e6962d06a45f5b33c942acd9263067f0035031dee5934c544ece7fe75d7e56281a53aa678f6a5792008f57aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-upstream"
RDEPENDS:${PN} += "pagure-theme-upstream"

inherit rpm
