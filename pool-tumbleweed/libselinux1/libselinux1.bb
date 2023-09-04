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

RPM_NAME = "libselinux1-3.5-4.1.aarch64.rpm"
RPM_HASH = "df8ca897392d0283193a134f1e3ef435b251746ebeed6aa8fbe7df560b29f655f9e8fe8c4dcb3b8d9f4931250d3bb7076db13b167e81d2c62eae0cc7ab4503da"

RPROVIDES:${PN} += "libselinux.so.1 \
libselinux1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcre2-8.so.0"

inherit rpm
