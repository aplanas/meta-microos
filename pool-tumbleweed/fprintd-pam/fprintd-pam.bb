SUMMARY = "PAM module for fingerprint authentication"
DESCRIPTION = "PAM module that uses the fprintd D-Bus service for fingerprint \
authentication."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-pam-1.94.2-2.4.aarch64.rpm"
RPM_HASH = "91d0773ee7ed1307180507107e868dd22a9ff965ec49da85d428d99684c71c533b043c7e3913ab2c6dfaf38f3521ca4cfb5ca3e5fa4d0f0790ae39353cc33ac6"

RPROVIDES:${PN} += "fprintd-pam \
fprintd-pam(aarch-64) \
pam_fp \
pam_fprint \
pam_thinkfinger"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
fprintd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpam.so.0(LIBPAM_EXTENSION_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
pam \
pam-config"

inherit rpm
