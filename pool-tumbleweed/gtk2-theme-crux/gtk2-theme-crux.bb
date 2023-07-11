SUMMARY = "Crux Theme for GTK+ 2"
DESCRIPTION = "This package provides the Crux GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-crux-2.20.2-19.43.noarch.rpm"
RPM_HASH = "5ca3a430dde30e4867cf03838e0adbaf048ec21b059c69288a4f11662ffa50908381940e06f53509a5b3d8bc69b06cc88c53f4729343bbad4f472b03f71cbe90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-crux"

RDEPENDS:${PN} += "gtk2-engine-crux"

inherit rpm
