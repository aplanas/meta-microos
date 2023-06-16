SUMMARY = "Common files for appmenu-gtk{2,3}-module"
DESCRIPTION = "This package contains common data-files for appmenu-gtk{2,3}-module."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk-module-common-0.7.6-1.6.noarch.rpm"
RPM_HASH = "f1b25da63d3aa5b0a8216e3e39755eb3e19cd910378e135a6c43db58083d780f3c95a0c7f5132951a849946e7261fbbe734f3237763adc796b59a73a8fcab9d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appmenu-gtk-module-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
