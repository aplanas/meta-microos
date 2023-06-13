SUMMARY = "Manage lightweight VMs created from OCI images"
DESCRIPTION = "Manage lightweight VMs created from OCI images"
LICENSE = "Apache-2.0"

PV = "0.2.3+git12dac81"

RPM_NAME = "krunvm-0.2.3+git12dac81-1.3.aarch64.rpm"
RPM_HASH = "dabb0679ead5e3267400272b9fb5734399b4fe98fc295ff4819344016de7bd3c2183cacd2d5745aed25b1cf5b16c32416ef2dfdf59a4776b1e1db49d1d090c76"

RPROVIDES:${PN} += "krunvm \
krunvm(aarch-64)"

RDEPENDS:${PN} += "buildah \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libkrun.so.1()(64bit) \
libkrun1 \
libm.so.6()(64bit)"

inherit rpm
