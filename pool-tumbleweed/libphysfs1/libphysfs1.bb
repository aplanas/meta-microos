SUMMARY = "PhysicsFS file abstraction layer for games"
DESCRIPTION = "PhysicsFS is a library to provide abstract access to various archives. \
It is intended for use in video games, and the design was somewhat \
inspired by Quake 3's file subsystem. The programmer defines a 'write \
directory' on the physical filesystem. No file writing done through the \
PhysicsFS API can leave that write directory, for security. For \
example, an embedded scripting language cannot write outside of this \
path if it uses PhysFS for all of its I/O, which means that untrusted \
scripts can run more safely. Symbolic links can be disabled as well, \
for added safety. For file reading, the programmer lists directories \
and archives that form a 'search path'. Once the search path is \
defined, it becomes a single, transparent hierarchical filesystem. This \
makes for easy access to ZIP files in the same way as you access a file \
directly on the disk, and it makes it easy to ship a new archive that \
will override a previous archive on a per-file basis. Finally, \
PhysicsFS gives you platform-abstracted means to determine if CD-ROMs \
are available, the user's home directory, where in the real filesystem \
your program is running, etc."
LICENSE = "(CPL-1.0 | LGPL-2.1-or-later) & Zlib"

PV = "3.2.0"

RPM_NAME = "libphysfs1-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "292eb878772477d419136b38264d12afd429813c68f56a0a6f4ea45d4135d0ad55a86716f502dcfa3a38b3c9634818b491b088fdf3b9440b360253f9a4e51c23"

RPROVIDES:${PN} += "libphysfs.so.1()(64bit) \
libphysfs1 \
libphysfs1(aarch-64) \
physfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
