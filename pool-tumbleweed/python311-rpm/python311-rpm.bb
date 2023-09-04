SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python311-rpm-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "8729ae0cdaa61424ab364b1f6f5436805c01c20d2e08cc0fdb3587cf86a60e1053d161d6dabdc702ebf7516e1b56237c0e3c7b169b9eaeb0af53911aba94dca8"

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
