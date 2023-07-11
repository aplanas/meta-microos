SUMMARY = "Clearlooks Theme for GTK+ 2"
DESCRIPTION = "This package provides the Clearlooks GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-clearlooks-2.20.2-19.43.noarch.rpm"
RPM_HASH = "abffc247a0ab868d960f77d180e710ba22f761e64e9bc3e99841e48ec02c5bff8608c9552b7c349909cec6ed768d5934e3e1f83c71bf5a23abd0cb346ade9876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-clearlooks"

RDEPENDS:${PN} += "gtk2-engine-clearlooks"

inherit rpm
