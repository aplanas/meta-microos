SUMMARY = "Base theme for the Pagure web interface"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the base upstream look and feel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-upstream-5.13.3-1.5.noarch.rpm"
RPM_HASH = "d007d890fcdb786288784f27c35c587ffd9a695fc549d3ec6e80ac4159f5dfcb5b126a86d55235e8ffee076b2263a9197d5a379339d54d1a60c1d5b1f26f9b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-upstream"

RDEPENDS:${PN} += "pagure"

inherit rpm
