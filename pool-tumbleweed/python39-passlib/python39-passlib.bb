SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python39-passlib-1.7.4-5.2.noarch.rpm"
RPM_HASH = "2652a245350f4509ef77660e216281d40bf33f755908c9dd117601cfb4e9ce8529203cc9bfa3be094839256f4faf55f7e71c24780656031ca97c82b0315c6db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-passlib \
python39-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
