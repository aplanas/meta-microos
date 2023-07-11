SUMMARY = "SELinux policy core utilities"
DESCRIPTION = "policycoreutils contains the policy core utilities that are required \
for basic operation of a SELinux system.  These utilities include \
load_policy to load policies, setfiles to label filesystems, newrole \
to switch roles, and run_init to run /etc/init.d scripts in the proper \
context. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "policycoreutils-3.5-4.1.aarch64.rpm"
RPM_HASH = "e6f35f30ffa576eafd2884eb09272bd3ac374689f87c023a1028f80ad04c962a0abf718614bb93e60bb90b668d3ce7f12ef526990ded50a0105f3ff295855f9c"

RPROVIDES:${PN} += "config-policycoreutils \
policycoreutils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gawk \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
libsemanage.so.2 \
libsepol.so.2 \
libsepol2 \
rpm \
selinux-tools \
util-linux"

inherit rpm
