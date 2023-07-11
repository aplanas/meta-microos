SUMMARY = "Pagure web interface theme based on openSUSE's chameleon theme"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as openSUSE Infrastructure."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-chameleon-5.13.3-1.5.noarch.rpm"
RPM_HASH = "968b84dc43a44ba7b57ae1c50620453ca3169a5b77047c86c4857633e62a63a675648b44b104ccac0fd670e61e67c7037be6e133545a9453fc53e52ec280658c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-chameleon"

RDEPENDS:${PN} += "pagure"

inherit rpm
