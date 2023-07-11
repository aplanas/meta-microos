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

RPM_NAME = "libselinux1-3.5-3.2.aarch64.rpm"
RPM_HASH = "13981f0e90fa1996e28c0d686061b05d3c383e61594bfa7c6df1eb5aeb7cea70b208679d88491261e8eeb51ed46ecda633cf591e21d337968293930e2e51b9bf"

RPROVIDES:${PN} += "libselinux.so.1 \
libselinux1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
