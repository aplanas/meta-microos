SUMMARY = "A Pluggable Authentication Module for Kerberos 5"
DESCRIPTION = "This PAM module supports authentication against a Kerberos KDC. It also \
supports updating your Kerberos password."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "2.4.13"

RPM_NAME = "pam_krb5-2.4.13-2.8.aarch64.rpm"
RPM_HASH = "96e6ef9221ccef3d9916045f2675c4348a6fb841eeb8ebfb75b230d8f01e2c8591c3781a62b59f0fdbc99ca1583b9dc671b400b2f2cefd70bd656b8c2d64967c"

RPROVIDES:${PN} += "pam_krb \
pam_krb5 \
pam_krb5(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
