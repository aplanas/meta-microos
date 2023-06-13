SUMMARY = "Secure Replacements for Problematic C Functions"
DESCRIPTION = "The 'Secure Programming Library' provides several functions that should \
serve as a replacement for problematic C functions from glibc. Besides \
the replacement functions, there are some helper functions, such as \
safe_reopen() or sigprotection(), that can be used for developing \
exposed applications."
LICENSE = "GPL-2.0+"

PV = "0.8"

RPM_NAME = "libsecprog0-0.8-165.25.aarch64.rpm"
RPM_HASH = "07e96ad56f072ba7c8566e0926786d455a565aeafce88360e1dab3b910876ae74f08d61ea296ab8429f5ca7974e6c7a199c4d92feeb74583c5582c02eed60d54"

RPROVIDES:${PN} += "libsecprog \
libsecprog.so.0()(64bit) \
libsecprog0 \
libsecprog0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
