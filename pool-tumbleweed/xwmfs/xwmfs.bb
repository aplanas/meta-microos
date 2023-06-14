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

RPM_NAME = "xwmfs-0.91-1.6.aarch64.rpm"
RPM_HASH = "05ea03fa302cabea4e7803f0e97e5dee660a2edd2ab296b3f2d35ab2420cda10dfa33a056bec8a93e006c98b4fafda5a42c6869dbe784de1a6cd57136cef17fb"

RPROVIDES:${PN} += "xwmfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
