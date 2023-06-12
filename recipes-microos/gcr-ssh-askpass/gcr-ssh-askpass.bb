SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-ssh-askpass-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "8a86bd094c1edd1be178c9d90e31fdb0c4cfde73d054662128f21bd3690fc9ab7d75475dc4711b685346f479e76bae6f83527dd80649267e8452494186e62040"

RPROVIDES:${PN} += "gcr-ssh-askpass \
gcr-ssh-askpass(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
