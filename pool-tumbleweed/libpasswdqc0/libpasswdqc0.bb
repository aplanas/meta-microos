SUMMARY = "A Simple Password Strength Checking Library"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libpasswdqc0-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "41d8b286dd2e01957841a01ed40e818601a71016077a5cb5fbcf668d2df52dc9c28d8b39fcaa9209e51adabf33f247dce2bfc104e0d47027a140b05c7acd543d"

RPROVIDES:${PN} += "libpasswdqc.so.0()(64bit) \
libpasswdqc0 \
libpasswdqc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
