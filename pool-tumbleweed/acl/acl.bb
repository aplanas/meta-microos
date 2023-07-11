SUMMARY = "Commands for Manipulating POSIX Access Control Lists"
DESCRIPTION = "getfacl and setfacl commands for retrieving and setting POSIX access \
control lists."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "acl-2.3.1-2.13.aarch64.rpm"
RPM_HASH = "092a31d86341113ba17d5478af5d66b0ffbee65398eb348af9470e94b88e105e64f63f87460391b3a4343ecb4f4fb64da60603adb35ee0755acf4e7cd2702f53"

RPROVIDES:${PN} += "acl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6"

inherit rpm
