SUMMARY = "Test of a PAM stack for authentication and password change"
DESCRIPTION = "This application can be used to test a PAM stack for authentication and \
password change."
LICENSE = "GPL-2.0-only"

PV = "0.0+git.20161214"

RPM_NAME = "pam-test-0.0+git.20161214-1.12.aarch64.rpm"
RPM_HASH = "679fde6ec67dd9553028d3a74df0ea1fc382762310aeb567523674d5981e11afc721492b094332dc199885d7e3de7998334a0226a51c01199a008884ebbb9845"

RPROVIDES:${PN} += "pam-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0"

inherit rpm
