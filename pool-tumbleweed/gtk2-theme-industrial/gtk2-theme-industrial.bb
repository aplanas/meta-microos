SUMMARY = "Industrial Theme for GTK+ 2"
DESCRIPTION = "This package provides the Industrial GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-industrial-2.20.2-19.43.noarch.rpm"
RPM_HASH = "a80c92fb1fb9671f2a402b5054f932494a33363f03a004b19f366a93cc2be3b8f65785a0385bc041caead35dc77143f38fae5b9067ccb9bb7286f6e2f558e32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-industrial"

RDEPENDS:${PN} += "gtk2-engine-industrial"

inherit rpm
