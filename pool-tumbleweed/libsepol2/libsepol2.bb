SUMMARY = "SELinux binary policy manipulation library"
DESCRIPTION = "libsepol provides an API for the manipulation of SELinux binary \
policies. It is used by checkpolicy (the policy compiler) and similar \
tools, as well as by programs like load_policy that need to perform \
specific transformations on binary policies such as customizing \
policy boolean settings. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol2-3.5-1.5.aarch64.rpm"
RPM_HASH = "9059852476d49963f59e2fadc060caa3040319e532eba86a9cfa568444fae49c60ef0a396a66f2eaaadbbdc36bb95ea0a46070958126f192fbc085bef3add53c"

RPROVIDES:${PN} += "libsepol.so.2 \
libsepol2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
