SUMMARY = "Industrial Theme for GTK+ 2"
DESCRIPTION = "This package provides the Industrial GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-industrial-2.20.2-19.42.noarch.rpm"
RPM_HASH = "f94244108709676e14775b8141d00227feb92b095ad35e2014c33dcf77e6a766e75a0cae7a68123d18bd99f309650376841672829af96d1b0b02aa6938706bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-industrial"

RDEPENDS:${PN} += "gtk2-engine-industrial"

inherit rpm
