SUMMARY = "Library to allow communication between libnfsidmap and SSSD"
DESCRIPTION = "A utility library to allow communication between libnfsidmap and SSSD."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libnfsidmap-sss-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "ae93bfeff77fb681edd6b5228c01f650a6eabf9a951546d8875a687f643819c9fd0a10de0bb445b656ef7a3efccace127b62e3146d6225ed51b4f872d5226bc2"

RPROVIDES:${PN} += "libnfsidmap-sss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfsidmap.so.1"

inherit rpm
