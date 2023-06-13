SUMMARY = "Advanced Intrusion Detection Environment"
DESCRIPTION = "AIDE is an intrusion detection system that checks file integrity."
LICENSE = "GPL-2.0-or-later"

PV = "0.18.1"

RPM_NAME = "aide-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "1ce10e9af15e0ac4bcadeeecb12e3ac239c6292f1187828f93d5595e7697f24f457d7b641e497cc8a4dac36329f430c14330562ed5273d2a8f1eec6746a39819"

RPROVIDES:${PN} += "aide \
aide(aarch-64) \
config(aide)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpcre2-8.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
