SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-ssh-askpass-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "b3e889fe4639abe69006eb34f05ab6d423e1b439ebabb7b0950e2f619989ae5945dca262fdf0a8427386b512a198cc2066a6fd05f20ddf2d13ad458ce3535921"

RPROVIDES:${PN} += "gcr3-ssh-askpass \
gcr3-ssh-askpass(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
