SUMMARY = "A window manager for X based on Blackbox 0.61.1"
DESCRIPTION = "Fluxbox is a stacking windowmanager for the X Window System which \
started as a fork of Blackbox 0.61.1 in 2001. Its user interface has \
only a taskbar, a pop-up menu accessible by right-clicking on the \
desktop, and minimal support for graphical icons. All basic \
configurations are controlled by text files, including the \
construction of menus and the mapping of key-bindings. Fluxbox \
supports the Extended Window Manager Hints specification."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "fluxbox-1.3.7-1.9.aarch64.rpm"
RPM_HASH = "1b5f230cc654e147ab122be604382eaa58180b2846806150cb675acdba1d868d9cb35e7fb907805f40ff87ba2a3cf9038e66d1a587c52587b893bceca13a9187"

RPROVIDES:${PN} += "fluxbox \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
