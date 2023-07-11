SUMMARY = "The reference C implementation of Argon2"
DESCRIPTION = "Reference C implementation of Argon2, the password-hashing function \
that won the Password Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "libargon2-1-20190702-2.7.aarch64.rpm"
RPM_HASH = "5d9bf77c05cfa224bae3e939c85dde4196915e871b3b7fbbabf442c33e2474d83418ace9cbce219efc2d53b9b68fd7f2d2dbf6aa1faa988eb11e664feed1208f"

RPROVIDES:${PN} += "libargon2-1 \
libargon2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
