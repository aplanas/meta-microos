SUMMARY = "XDG Menus for WindowMaker and other Window Managers"
DESCRIPTION = "This package contains a Perl script which converts XDG menus to formats \
used by WindowMaker and other window managers."
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "xdg-menu-0.2-218.1.noarch.rpm"
RPM_HASH = "f95ba73c58bc62a572d4759ded95d2e0e6a1f60d3f0c22c925df193877e5675e1ca36cdb4c1591c1d7e5d4c43ce53d07a39de59b1feba46cd2efeb06052e2556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-menu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
desktop-data \
perl-Locale--gettext \
perl-XML-Parser \
xterm-bin"

inherit rpm
