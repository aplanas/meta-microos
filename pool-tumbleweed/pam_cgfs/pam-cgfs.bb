SUMMARY = "PAM module to provide unprivileged cgroupfs"
DESCRIPTION = "When a user logs in, this PAM module will create cgroups which the user may \
administer, either for all controllers or for any controllers listed on the \
command line."
LICENSE = "LGPL-2.1-only"

PV = "5.0.2"

RPM_NAME = "pam_cgfs-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "5b7e53ebdddcff1bb46536dbaf2ee8a5b962c74b214f11c2659775741488a68358044b1d8b84766f6b79cfabd162a6544c8bfc543d0f9a80e9055f58f85fb292"

RPROVIDES:${PN} += "pam_cgfs \
pam_cgfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libpam.so.0()(64bit) \
libseccomp.so.2()(64bit) \
libselinux.so.1()(64bit)"

inherit rpm
