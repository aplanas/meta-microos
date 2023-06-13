SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python310-passlib-1.7.4-5.1.noarch.rpm"
RPM_HASH = "bd59b27ec1a0cb25eaff0c40a0b57d04535036a68ca0069435d93e98de39f07103d4a76a2b3cc3b34964ab7a6089a14870ce41dd72ab0232664e8d54feb65a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passlib \
python3.10dist(passlib) \
python310-passlib \
python3dist(passlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
