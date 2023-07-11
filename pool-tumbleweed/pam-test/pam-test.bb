SUMMARY = "Test of a PAM stack for authentication and password change"
DESCRIPTION = "This application can be used to test a PAM stack for authentication and \
password change."
LICENSE = "GPL-2.0-only"

PV = "0.0+git.20191111"

RPM_NAME = "pam-test-0.0+git.20191111-1.1.aarch64.rpm"
RPM_HASH = "b72f5cdb566d839e4fe33295629affdeba2d9cf70c707acc05cc73cdfd9ab4799140dd58c5848774c37dd98ad8013694584c881b80b7aa6080e71953d102c508"

RPROVIDES:${PN} += "pam-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0"

inherit rpm
