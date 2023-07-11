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

RPM_NAME = "argon2-20190702-2.7.aarch64.rpm"
RPM_HASH = "ff07758ae7a28e19b8e7bcec6ca01c1ed2958b18f5a24859be81ee64e8e4049ee733fd2294f31983c13e0b9f951b469165204d7d4df49afaab2e50eabd9fffc8"

RPROVIDES:${PN} += "argon2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
