SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python39-rpm-4.18.0-5.2.aarch64.rpm"
RPM_HASH = "81aa9ec1912c1f417b32b4667259d4a1ffcce6d845e6cac79ae9845dcbbc03a8b93a018352e93bbb86478c8fe29cdc0573ca98f5af22d314ab9a689d9230f092"

RPROVIDES:${PN} += "python3.9dist-rpm \
python39-rpm \
python3dist-rpm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.9 \
librpmbuild.so.9 \
librpmio.so.9 \
librpmsign.so.9 \
python-abi \
rpm"

inherit rpm
