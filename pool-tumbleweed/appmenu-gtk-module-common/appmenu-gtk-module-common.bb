SUMMARY = "Common files for appmenu-gtk{2,3}-module"
DESCRIPTION = "This package contains common data-files for appmenu-gtk{2,3}-module."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "appmenu-gtk-module-common-0.7.6-2.1.noarch.rpm"
RPM_HASH = "9964886296f3c0ea8ea3f1fd0b62c88647e978bb8c76639970f6b3d467ff1b4f3b1b0722c614138cfc00509357703933b660b7835749f260cd2259fbd4bfba2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appmenu-gtk-module-common"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
