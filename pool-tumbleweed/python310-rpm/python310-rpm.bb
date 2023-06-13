SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python310-rpm-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "06d64128f74439b4cbc7132c65dac706906928bc9fc4a741039a27ebdde996d2cdd5a35b7a4f78295b392fb5e041d966fcfd0b711d344db98eaba8bc4b7d36cf"

RPROVIDES:${PN} += "python3-rpm \
python3.10dist(rpm) \
python310-rpm \
python310-rpm(aarch-64) \
python3dist(rpm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
librpm.so.9()(64bit) \
librpmbuild.so.9()(64bit) \
librpmio.so.9()(64bit) \
librpmsign.so.9()(64bit) \
python(abi) \
rpm"

inherit rpm
