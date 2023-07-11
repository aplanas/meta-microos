SUMMARY = "Windows guest support in libguestfs"
DESCRIPTION = "Provides the needed pieces for libguestfs to handle Windows guests."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-winsupport-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "b7f31efe94ce21e8a2f1ad5024eb3e25e2db658688eee7934fbf846582f47939f71c7fc398073f8e8c2b4a2b41deae222213af57e7238ba4726e0a936debc1df"

RPROVIDES:${PN} += "guestfs-winsupport \
libguestfs-winsupport"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
