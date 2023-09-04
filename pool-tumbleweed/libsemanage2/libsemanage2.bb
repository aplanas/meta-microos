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

RPM_NAME = "libsemanage2-3.5-2.1.aarch64.rpm"
RPM_HASH = "306493205909a645c4033d415e6357fd6590054a4297fecc97c6aaa6385520196d19c15ae457488f5737c360cd96cc9df43c062ef0ed97705a4acbf13f0d03e0"

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
