SUMMARY = "XDG Menus for WindowMaker and other Window Managers"
DESCRIPTION = "This package contains a Perl script which converts XDG menus to formats \
used by WindowMaker and other window managers."
LICENSE = "GPL-2.0+"

PV = "0.2"

RPM_NAME = "xdg-menu-0.2-217.16.noarch.rpm"
RPM_HASH = "c7bc1eacc8696c2791cf1bd76ff2d8510018d51c497287636588385b52cd1203b146e4c5597c4b94341bce79252a8cac0ec0d75dce174f06235eaf5d8d9f70e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-menu"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
desktop-data \
perl(Locale::gettext) \
perl-XML-Parser \
xterm-bin"

inherit rpm
