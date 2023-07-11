SUMMARY = "Development files for argon2"
DESCRIPTION = "Headers for argon2, the reference C implementation of Argon2, the \
password hashing function that won the Password Hashing Competition \
(PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-devel-20190702-2.7.aarch64.rpm"
RPM_HASH = "e0ff3c4fd99aea56aaedc603c19e319318ee189dea4683e993035b59dc1886827f5e4cb570dd379e18c5adfbec76473add2937db5c959bcf8d924fd5498cd04f"

RPROVIDES:${PN} += "argon2-devel \
pkgconfig-libargon2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libargon2-1"

inherit rpm
