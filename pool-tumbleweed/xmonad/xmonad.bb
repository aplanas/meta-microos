SUMMARY = "A tiling window manager"
DESCRIPTION = "Xmonad is a tiling window manager for X. Windows are arranged automatically to \
tile the screen without gaps or overlap, maximising screen use. All features of \
the window manager are accessible from the keyboard: a mouse is strictly \
optional. xmonad is written and extensible in Haskell. Custom layout \
algorithms, and other extensions, may be written by the user in config files. \
Layouts are applied dynamically, and different layouts may be used on each \
workspace. Xinerama is fully supported, allowing windows to be tiled on several \
screens."
LICENSE = "BSD-3-Clause"

PV = "0.17.2"

RPM_NAME = "xmonad-0.17.2-1.6.aarch64.rpm"
RPM_HASH = "611de3a5087eb27ae9a2d7c106b2d11553d4d743181e0116c1ddc640cdcb7ce35781177c7634d9ca8e9456525b78d1725f977980c9d2277abef9069f8386482d"

RPROVIDES:${PN} += "windowmanager \
xmonad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
