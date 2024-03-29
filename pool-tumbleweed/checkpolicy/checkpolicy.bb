SUMMARY = "SELinux policy compiler"
DESCRIPTION = "checkpolicy is the SELinux policy compiler. It uses libsepol to \
generate the binary policy. \
 \
(Security-enhanced Linux is a feature of the kernel and some \
utilities that implement mandatory access control policies, such as \
Type Enforcement, Role-based Access Control and Multi-Level \
Security.)"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "checkpolicy-3.5-1.4.aarch64.rpm"
RPM_HASH = "c151fce1152dcfb34897a36e52a37fe62866891c43338381a6614efd75bf91b6d08f590798db6b81f023735f74300395694ab149a8d7f786febb62dfbc29099c"

RPROVIDES:${PN} += "checkpolicy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
