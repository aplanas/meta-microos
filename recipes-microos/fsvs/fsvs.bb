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

RPM_NAME = "fsvs-1.2.9-1.15.aarch64.rpm"
RPM_HASH = "13069743853350d22786defd2e6e862c611feef8dab1ca6ea17e76cdc1b462b49504193c835377e6b15112fc7bfddc88d10211ffccb96587c6ec4616a9905d58"

RPROVIDES:${PN} += "fsvs fsvs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-1.so.0()(64bit) libaprutil-1.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdbm.so.6()(64bit) libpcre.so.1()(64bit) libsvn_delta-1.so.0()(64bit) libsvn_ra-1.so.0()(64bit) libsvn_subr-1.so.0()(64bit)"

inherit rpm
