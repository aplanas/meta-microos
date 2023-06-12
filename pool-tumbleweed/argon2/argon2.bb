SUMMARY = "The reference C implementation of Argon2"
DESCRIPTION = "This is the reference C implementation of Argon2, the password-hashing function \
that won the Password Hashing Competition (PHC) in 2015. \
 \
Argon2 is a password hashing function that is parametrized by a time cost, a \
memory cost and a parallelism degree, used to guard against side-channel \
attacks, attacks where lots of memory is available, or attacks where a lot of \
processing is available."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-20190702-2.6.aarch64.rpm"
RPM_HASH = "c738871520a89bc507d6d09371773ab5eda5474dfb6bff8143b3b165bc3d755bf31c3067359c870a6de5aa1d5a3e15182b2b61086bba7f467bf0c50b6d911bd9"

RPROVIDES:${PN} += "argon2 \
argon2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
