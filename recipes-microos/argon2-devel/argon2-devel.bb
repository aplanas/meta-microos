SUMMARY = "Development files for argon2"
DESCRIPTION = "Headers for argon2, the reference C implementation of Argon2, the \
password hashing function that won the Password Hashing Competition \
(PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-devel-20190702-2.6.aarch64.rpm"
RPM_HASH = "7e5de3b6f5841a975899dcdb3acdf68cf5334d43c8699ab2ad7f6964ba7dba99e3bced72fb5d8aedcb348a5d20cde7f0f15e3f02ff8737cfc3d2be3d1bab8496"

RPROVIDES:${PN} += "argon2-devel \
argon2-devel(aarch-64) \
pkgconfig(libargon2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargon2-1"

inherit rpm
