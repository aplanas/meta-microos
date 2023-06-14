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

RPM_NAME = "xmonad-0.17.2-1.3.aarch64.rpm"
RPM_HASH = "351868412735d887e36ec79ebed58bd46fc6098483307818842a34d0c843868d6ce262db67e172b056fdc1d63b81703b6feab9fdf8facfe04b35b3cdd2c63f17"

RPROVIDES:${PN} += "windowmanager \
xmonad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
