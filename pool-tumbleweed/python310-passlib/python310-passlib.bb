SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python310-passlib-1.7.4-6.1.noarch.rpm"
RPM_HASH = "6afc04f48eed0a772fcbd9c78d295974fedd299eea09acab357a691f909cadd9209a4fed584b9a6df6f50a8ed112561e04e7dd470f32b66bfacaff161c518eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-passlib \
python310-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
