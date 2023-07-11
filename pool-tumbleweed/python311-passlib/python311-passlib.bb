SUMMARY = "Password hashing framework supporting over 20 schemes"
DESCRIPTION = "Passlib is a password hashing library for Python 2 & 3. It provides \
implementations of over 20 password hashing algorithms, as well as a \
framework for managing existing password hashes. It can verify hashes \
found in /etc/shadow, and provide password hashing for \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.7.4"

RPM_NAME = "python311-passlib-1.7.4-5.2.noarch.rpm"
RPM_HASH = "1a012f8ef4f38aac3f0b0c2ec7bdb2ec34871496b6e222824f29b21c68052c4140ef2146ab7e4b790a550732907c995b2a5ee9a8f973b62d4c401416b01fba41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-passlib \
python3.11dist-passlib \
python311-passlib \
python3dist-passlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
