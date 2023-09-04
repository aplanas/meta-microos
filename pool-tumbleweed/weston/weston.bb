SUMMARY = "Wayland Reference Compositor"
DESCRIPTION = "Weston is the reference implementation of a Wayland compositor, and a \
useful compositor in its own right. Weston has various backends that \
lets it run on Linux kernel modesetting and evdev input as well as \
under X11. Weston ships with a few example clients, from simple \
clients that demonstrate certain aspects of the protocol to more \
complete clients and a simplistic toolkit. There is also a quite \
capable terminal emulator (weston-terminal) and an toy/example \
desktop shell. Finally, weston also provides integration with the \
Xorg server and can pull X clients into the Wayland desktop and act \
as a X window manager."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.2"

RPM_NAME = "weston-12.0.2-1.1.aarch64.rpm"
RPM_HASH = "2d49eab9b20456db455d34e6da6705a35021bbf0761b1a8e59707d0619e35881d01a38f267eda07eb902ef29d9f3ddd86fe4b7c1130775917d3671d935abcbf4"

RPROVIDES:${PN} += "libexec-weston.so.0 \
weston"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libinput.so.10 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-server.so.0 \
libwebp.so.7 \
libweston-12.so.0 \
libxkbcommon.so.0 \
vpx-tools \
xkeyboard-config"

inherit rpm
