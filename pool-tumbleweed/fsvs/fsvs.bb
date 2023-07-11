SUMMARY = "Backup/Restore/Versioning of large Data Sets with Meta-Data"
DESCRIPTION = "FSVS is the abbreviation for “Fast System VerSioning”, and is pronounced \
[fisvis]. \
 \
It is a complete backup/restore/versioning tool for all files in a directory \
tree or whole filesystems, with a subversionTM repository as the backend. \
 \
You may think of it as some kind of tar or rsync with versioned storage."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.9"

RPM_NAME = "fsvs-1.2.9-1.16.aarch64.rpm"
RPM_HASH = "c4737f67cf628c43781373013821b0897768fb1b0be5d82c036a3f7e831905a2a052542c9d7fd0cf65d69c65aa443c77abcd6d9fc371e56eda8b7b328acc5ccb"

RPROVIDES:${PN} += "fsvs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgdbm.so.6 \
libpcre.so.1 \
libsvn-delta-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-subr-1.so.0"

inherit rpm
