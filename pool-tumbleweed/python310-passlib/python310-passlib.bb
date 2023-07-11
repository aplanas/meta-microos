SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python310-passlib-1.7.4-5.2.noarch.rpm"
RPM_HASH = "450fc5694bbaf57a8d63e81e6326e64310a131692bc819232596e2585c1985f0af0db00e7f74d415b055e8d3403f8ead1313609f20b589a7e1a09e9ba398f011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-passlib \
python310-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
