SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python39-rpm-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "8e2560a9ca6db94f3d68aa37c6ecc4ef631304b79c532e924332eb2ccb7ebdca298d456b886e19a5d672321a7b305c81f2f9a2b54067b05db209614f1c812c32"

RPROVIDES:${PN} += "python3.9dist(rpm) \
python39-rpm \
python39-rpm(aarch-64) \
python3dist(rpm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
librpm.so.9()(64bit) \
librpmbuild.so.9()(64bit) \
librpmio.so.9()(64bit) \
librpmsign.so.9()(64bit) \
python(abi) \
rpm"

inherit rpm
