SUMMARY = "Python Bindings for Manipulating RPM Packages"
DESCRIPTION = "This package contains a module that permits applications written in \
the Python programming language to use the interface supplied by \
RPM Package Manager libraries. \
 \
This package should be installed if you want to develop Python programs \
that will manipulate RPM packages and databases."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "python310-rpm-4.18.0-5.2.aarch64.rpm"
RPM_HASH = "8e19edd48f736c73ce2dfca379843e6d13435d287de445577cae62b8601056a039fb572094cb0b63205580bc6e7ef07b9811c121e5afdbf9754fd0a44a960929"

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
