SUMMARY = "A tool to build desktop menu for LXDE"
DESCRIPTION = "LXSession is the default X11 session manager of LXDE. \
(LXDE: Lightweight X11 Desktop Environment) \
http://lxde.sourceforge.net/ \
 \
This package provides files required to build freedesktop.org \
menu spec-compliant desktop menus for LXDE."
LICENSE = "GPL-2.0"

PV = "0.1.5"

RPM_NAME = "lxmenu-data-0.1.5-1.18.noarch.rpm"
RPM_HASH = "510c7c6e8ddff301b8a6990d5fe9507f92b210c4dfc456934ce451eb8d6fcd3dd15acd377d3bfce78cf1a29f0ef9541b98e5243b3372f093c6c2b3a95afa1608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxmenu-data \
lxmenu-data"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils"

inherit rpm
