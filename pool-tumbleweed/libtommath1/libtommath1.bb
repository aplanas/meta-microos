SUMMARY = "Routines For a Integer Based Number Theoretic Applications"
DESCRIPTION = "LibTomMath provides highly optimized and portable routines for a vast \
majority of integer based number theoretic applications (including public \
key cryptography). LibTomMath is not a cryptographic toolkit itself but it \
can be used to write one [Used in LibTomCrypt for RSA, DH and ECC public key \
routines]."
LICENSE = "Unlicense"

PV = "1.2.0"

RPM_NAME = "libtommath1-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "bb66d4cc5fcba56ef12aa9a99061be10431611881d946f0d79e6b6cda3d0ece61f0dbcb963b465498cfa7717556d924ffd47e98b35cd7fa2f33fe273c81a827b"

RPROVIDES:${PN} += "libtommath.so.1()(64bit) \
libtommath1 \
libtommath1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
