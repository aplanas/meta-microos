SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python311-passlib-1.7.4-5.1.noarch.rpm"
RPM_HASH = "825f0c9ab01f2f154f54f8ccc6db6023eb1c99455214bed6c97672b2556ec7e3b20f27ee70ec3ae3a7ae344d467f32a780d00b74cf46676ab65af6b5626b6909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(passlib) \
python311-passlib \
python3dist(passlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
