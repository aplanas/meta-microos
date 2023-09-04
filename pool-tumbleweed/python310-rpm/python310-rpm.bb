SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python310-rpm-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "f3cdbcadc6c3b1d8cf229d0abaa45ba2c007d5ef2aab19c1cc1d23ce9e8a12600fa7ed4bba20e5e50a0752444fef115e570038702350270f3a61e48283fcb137"

RPROVIDES:${PN} += "python3.10dist-rpm \
python310-rpm \
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
