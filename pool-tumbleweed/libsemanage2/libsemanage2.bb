SUMMARY = "SELinux policy management library"
DESCRIPTION = "libsemanage is the policy management library. Using libsepol and \
libselinux to interact with the SELinux system, it also calls helper \
programs for loading policy and for checking whether the \
file_contexts configuration is valid. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage2-3.5-1.4.aarch64.rpm"
RPM_HASH = "8fb0c6a20d4009f6d393f111844b4409e8fb43f291c2304b5c06934d45d7e9ebd7dfd9d2b01b06dba7159d64bcc55c7cc35570bc71f90a66259c16373cddd1a4"

RPROVIDES:${PN} += "libsemanage.so.2()(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) \
libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) \
libsemanage2 \
libsemanage2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudit.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsemanage-conf \
libsepol.so.2()(64bit) \
libsepol.so.2(LIBSEPOL_1.0)(64bit) \
libsepol.so.2(LIBSEPOL_1.1)(64bit) \
libsepol.so.2(LIBSEPOL_3.0)(64bit)"

inherit rpm