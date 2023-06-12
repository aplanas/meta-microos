SUMMARY = "Courier authentication library"
DESCRIPTION = "The Courier authentication library provides authentication services for \
other Courier applications."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "31aa7ae4c90007b3d270ef7b0e72f4de9bf95f0defd3f3a3b03aac1f712bb36f47abebece64a3362a31893e3fd877a321e284b94d418e94b8da6136de01db99d"

RPROVIDES:${PN} += "config(courier-authlib) \
courier-authlib \
courier-authlib(aarch-64) \
libauthcustom.so.0()(64bit) \
libauthpam.so.0()(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthcommon.so.0()(64bit) \
libcourierauthsasl.so.0()(64bit) \
libcourierauthsaslclient.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/expect \
/usr/bin/perl \
group(mail) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdbm.so.6()(64bit) \
libltdl.so.7()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
systemd"

inherit rpm
