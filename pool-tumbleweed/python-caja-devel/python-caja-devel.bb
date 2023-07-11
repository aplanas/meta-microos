SUMMARY = "Python bindings for Caja - Development Files"
DESCRIPTION = "Development files needed for writing Caja Python extensions. \
 \
This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-devel-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "e9f680f79f0b4f9d8ec5b6244ae7f81d3ba614623002fc2b8b8edaaf7031d79ad28198de882cb9ff2eefca0cef2b4bbd69b741fc2cca4b0f22923a8a35aed09b"

RPROVIDES:${PN} += "pkgconfig-caja-python \
python-caja-devel \
python-mate-file-manager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python-caja"

inherit rpm
