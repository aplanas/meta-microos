SUMMARY = "A file system for accessing X server and window manager features"
DESCRIPTION = "This is xwmfs (X window manager file system), a userspace file system based on \
fuse that allows interaction with an EWMH compliant X11 window manager via \
files. \
 \
Some of its features are: \
 \
- newly appearing and disappearing windows in the X server are recognized and \
  the file system is updated in an event based manner \
- new values for properties of window manager and windows will be reflected in \
  the file system in an event based manner \
- properties of windows and window manager can be changed via writing to files \
  in the file system \
- some X operations are accessible via control files in the file system \
- the file system can be used for easily implementing scripts that operate on \
  the window manager and windows (for example identifying specific windows, \
  rename a window, move it around and so on)."
LICENSE = "GPL-2.0-or-later"

PV = "0.91"

RPM_NAME = "xwmfs-0.91-1.7.aarch64.rpm"
RPM_HASH = "b7c7d8de7dbf8e09d0a60c29226895aceab6aeea5b8ac6b3793bc719e7340fd36af434e49aa04df7fd6ea4bfacf500e7294c24e05a6bf25238e04a0d97f795df"

RPROVIDES:${PN} += "xwmfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
