SUMMARY = "An easy to use virtual keyboard toolkit"
DESCRIPTION = "eekboard is a virtual keyboard software package, including a set of \
tools to implement desktop virtual keyboards."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-1.0.8-10.10.aarch64.rpm"
RPM_HASH = "16911a6798f6f01fc099890b2156ef36e208c41bf0c283b1c3b846acd1d3e155a58a386768dbccc52ae13e85360561dc0d4fbfbed473c9c896ec5ac77a8877c8"

RPROVIDES:${PN} += "config-eekboard \
eekboard \
libeek-gtk.so.0 \
libeek-xkl.so.0 \
libeek.so.0 \
libeekboard.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libcroco-0.6.so.3 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16"

inherit rpm
