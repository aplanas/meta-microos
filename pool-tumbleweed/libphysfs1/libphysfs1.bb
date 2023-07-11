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

RPM_NAME = "libphysfs1-3.2.0-1.4.aarch64.rpm"
RPM_HASH = "874e7bcaae21cc970d4e3e03a3fdf3994f3311cd280a51a73d5aff3b87ecfe88d43f2658d8d4abeb08f0a6ddbcd8408cc672c7ade65c45176cbcf33ab67f6d2d"

RPROVIDES:${PN} += "libphysfs.so.1 \
libphysfs1 \
physfs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
