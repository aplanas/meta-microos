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

RPROVIDES:${PN} += "xwmfs \
xwmfs(aarch-64)"
RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
