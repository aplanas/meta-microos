SUMMARY = "SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux1-3.5-2.1.aarch64.rpm"
RPM_HASH = "e5d0667248d78c25d11c19b593dd0e73dcd08cef7b624187f728cbfe05e670c6d94ac6d64d35fb4e463890bcc6e51e50863b5b6ec370ac02de7f473e6d960fa2"

RPROVIDES:${PN} += "libselinux.so.1 \
libselinux1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
