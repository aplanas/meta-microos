SUMMARY = "Configuration for pagure to default to the openSUSE web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running on openSUSE."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-default-openSUSE-5.13.3-1.4.noarch.rpm"
RPM_HASH = "5f718a8b494d111be64280466b1b3a3914e3e1fc59bf218465c7de486cc56e02b8dcffcde232431429b6c55d65cc6a732ad4ff944648532df1516b27076a582f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-openSUSE"

RDEPENDS:${PN} += "pagure-theme-chameleon"

inherit rpm
