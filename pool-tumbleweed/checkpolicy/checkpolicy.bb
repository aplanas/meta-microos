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

RPM_NAME = "checkpolicy-3.5-1.3.aarch64.rpm"
RPM_HASH = "924be521507f6ba1019d280f818c2146eeb0c6aea2b17ff4db115559f8943f86f8b576507504dd6105c0524db843e8adc7e9361f1a624e31ac9f456d80604d2c"

RPROVIDES:${PN} += "checkpolicy \
checkpolicy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
