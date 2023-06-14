SUMMARY = "Library with NFS-safe locking functions"
DESCRIPTION = "This library implements a number of functions found in -lmail on SysV \
systems. These functions are designed to lock the standard mailboxes in \
/var/mail (or wherever the system puts them). \
 \
In addition, this library offers a number of functions to create, \
manage and remove generic lockfiles."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.17"

RPM_NAME = "liblockfile1-1.17-1.2.aarch64.rpm"
RPM_HASH = "7f99bda83142c1cabd248977a43e924044b0e22408a857a234489a0db97be65cdfcabde0d9e01c4afb0b311bdb67a25c095a83f87175caa7feffbb91852a9b7e"

RPROVIDES:${PN} += "liblockfile.so.1 \
liblockfile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
