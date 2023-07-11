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

RPM_NAME = "libsemanage2-3.5-1.9.aarch64.rpm"
RPM_HASH = "1e1b6e30ed3c7bfb39cddd58d6dc061796d63549dfb6cb8ac81dcfb8ae23ba3ee4f5c2d12366669315067f8117cf9b24b82d776b2dc4fcebd4783838a3e51bd1"

RPROVIDES:${PN} += "libsemanage.so.2 \
libsemanage2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libbz2.so.1 \
libc.so.6 \
libselinux.so.1 \
libsemanage-conf \
libsepol.so.2"

inherit rpm
