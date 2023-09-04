SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python39-rpm-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "7a0f322cc054a05c9d53889ed25dad3447520ad0f914c1844f6a906037383fddf1938bce5fa43666d70a582601015693ef8ccb149ef5d81c600069ec6a68674b"

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
