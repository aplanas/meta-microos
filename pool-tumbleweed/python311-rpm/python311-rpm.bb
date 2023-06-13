SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python311-rpm-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "9027548b1ca1e4d9a78e59d2c32d569af2a45d77aaa0d0710a73bce640b0daeda30b0fd484bdccc6dac80e3a55b8e01e499ae25efcd451cb4f7ae8ad3d363ce6"

RPROVIDES:${PN} += "python3.11dist(rpm) \
python311-rpm \
python311-rpm(aarch-64) \
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
