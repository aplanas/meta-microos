SUMMARY = "On-screen Keyboard for GNOME -- Development Files"
DESCRIPTION = "Caribou is a text entry and UI navigation application being developed \
as an alternative to the Gnome On-screen Keyboard. The overarching goal \
for Caribou is to create a usable solution for people whose primary way \
of accessing a computer is a switch device."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.21"

RPM_NAME = "caribou-devel-0.4.21-8.8.aarch64.rpm"
RPM_HASH = "66f9b3d42ed3abe031f0beb17929b7c356ca1812d076e2bb604d0628314087e747fb86dd83be8fb86bfa9d5a04f23700dab29c545227dfc3a6c63d58e3321102"

RPROVIDES:${PN} += "caribou-devel \
pkgconfig-caribou-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcaribou0 \
pkgconfig-gdk-x11-3.0 \
pkgconfig-gee-0.8 \
pkgconfig-libxklavier \
pkgconfig-libxml-2.0 \
pkgconfig-xtst \
typelib-1-0-Caribou-1-0"

inherit rpm
