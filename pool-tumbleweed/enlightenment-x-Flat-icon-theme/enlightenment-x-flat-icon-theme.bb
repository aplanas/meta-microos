SUMMARY = "A freedesktop.org compatible icon theme"
DESCRIPTION = "Setting this icon theme as your application icon theme in enlightenment will \
make all your applications use the same icon set as the enlightenment \
Flat (upstream) theme. \
 \
Icon themes to match the openSUSE Enlightenment themes are also available."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "enlightenment-x-Flat-icon-theme-0.21.0-30.8.aarch64.rpm"
RPM_HASH = "82905b798db1eb103934cb6e396d7cccec9355fc8666b4a1d880d86e69763f8c38d770ee140434edecdbec24621ffea854bacc324fb4894ac9f0092e4d62c381"

RPROVIDES:${PN} += "enlightenment-x-Flat-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
