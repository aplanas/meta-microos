SUMMARY = "Advanced wallpaper tool for X"
DESCRIPTION = "hsetroot is a tool which allows you to compose wallpapers ('root pixmaps') for \
X. It has a lot of options like rendering gradients, solids, images but it also \
allows you to perform manipulations on those things, or chain them together. \
You could use one standard background image for isntance, and using tint to \
make it fit your current theme. And yes, of course it is compatible with \
semi-translucent applications like aterm and xchat :) \
 \
At this time, hsetroot can render: gradients (multi-color with variable \
distance), solids (rectangles) and images (centered, tiled, fullscreen, or \
maximum aspect). It supports the following manipulations: tinting (overlaying a \
color mask), blurring, sharpening, flipping (horizontally, diagonally, \
vertically) it also allows you to adjust brightness, contrast and gamma-level. \
hsetroot also supports alpha-channels when rendering things."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "hsetroot-1.0.5-2.10.aarch64.rpm"
RPM_HASH = "edf1e4f47653c1bacdf4df8bcc39d695a4254191c3e3cdbffec75aad001688d03f46e5488bc9d89edaddb654eadce84b5cb66f148b4a96a723892277a56a48d4"

RPROVIDES:${PN} += "hsetroot"

RDEPENDS:${PN} += "imlib2-filters \
imlib2-loaders \
libImlib2.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libc.so.6"

inherit rpm
