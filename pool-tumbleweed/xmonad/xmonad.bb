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

RPM_NAME = "xmonad-0.17.2-1.8.aarch64.rpm"
RPM_HASH = "d640847b521025c55f33b28989275f80a48072f13e6b3f66f75334f6997929c0dec96121b4813e52486234fd1998e3de094d36c8a4fb00720d635745aab4f268"

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
