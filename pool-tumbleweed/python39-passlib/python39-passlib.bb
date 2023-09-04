SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python39-passlib-1.7.4-6.1.noarch.rpm"
RPM_HASH = "23a602e48de64c9fb26f16e2459daba1f85abfe14a0d78db30fb7267e56e1ed0c6d05cec1324abc86603f262b1f853cafc339084f5c099bdb98b5bc389ac2a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-passlib \
python39-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
