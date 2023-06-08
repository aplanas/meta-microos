SUMMARY = "On-screen Keyboard for GNOME -- Development Files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-devel-0.4.21-8.7.aarch64.rpm"
RPM_HASH = "88ccd066fd64caa2e6d35410b13b24c5ee5289cdc8aab12f36fb2d4960703404485cdd89db1f4a8a30ab7d5d65e43ed132b764bec39eb421025756cf8b7f68d2"

RPROVIDES:${PN} += "caribou-devel caribou-devel(aarch-64) pkgconfig(caribou-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcaribou0 pkgconfig(gdk-x11-3.0) pkgconfig(gee-0.8) pkgconfig(libxklavier) pkgconfig(libxml-2.0) pkgconfig(xtst) typelib-1_0-Caribou-1_0"

inherit rpm
