SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python311-rpm-4.18.0-5.2.aarch64.rpm"
RPM_HASH = "449c4a0875b8e745681f47b0296a1b237bd60aa6b8cef6cfd8f9b9c19cac7315f6422a48e079b9cebd600de034554e49ca2a52028d864be8124590cbfc13df36"

RPROVIDES:${PN} += "python3-rpm \
python3.11dist-rpm \
python311-rpm \
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
