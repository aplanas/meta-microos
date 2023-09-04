SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python311-passlib-1.7.4-6.1.noarch.rpm"
RPM_HASH = "578aca1d5de0829867a97f41184fb400649d541cf481410a6cc54af2ca9abfc12c6c0d8dbf45c4fbf99f4ccf1d4f53799d7bcd944996ad5c27ab733473f64c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passlib \
python3.11dist-passlib \
python311-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
