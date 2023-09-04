SUMMARY = "POSIX overlay filesystem"
DESCRIPTION = "A FUSE filesystem that provides POSIX functionality - UNIX-style permissions, \
ownership, special files - for filesystems that do not have such, e.g. vfat. It \
can be seen as a contemporary equivalent of the UMSDOS fs."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "posixovl-1.4-1.1.aarch64.rpm"
RPM_HASH = "a79bc742e585a83ef5a80c5358a868ec77f395bcca6d2b4b19de45f47044c498980a12a104fb7f747ab612d25b90c8870469e2d5f05b680b61390e037e68d09c"

RPROVIDES:${PN} += "posixovl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm
