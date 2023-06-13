SUMMARY = "Leaper theme for LXQt"
DESCRIPTION = "openSUSE-leaper for LXQt lightweight Qt desktop environment"
LICENSE = "CC-BY-SA-4.0"

PV = "0.1"

RPM_NAME = "lxqt-theme-openSUSE-leaper-0.1-2.14.noarch.rpm"
RPM_HASH = "b80603e749103e2d706ee48f3680b1b862df1ffaf5299f86b9382caefe62299d2f96505919e16c2b09770404867715687c87cbc4db584e4f078e371986fc8519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-theme-openSUSE-leaper"

RDEPENDS:${PN} += "lxqt-themes"

inherit rpm
