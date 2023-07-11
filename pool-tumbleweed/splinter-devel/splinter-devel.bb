SUMMARY = "Development files for splinter, a multivariate function approximation library"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the header files and sources required for \
developing applications with splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "splinter-devel-3.0-2.23.aarch64.rpm"
RPM_HASH = "5f8b2cdaedac0e97025d76fc7ae0558447d61b4ef87e2d451077729acbfbb88a37945460fefa6d9ac664df3ae7a97db1875e3d529e1a664a820dd959c7888471"

RPROVIDES:${PN} += "splinter-devel"

RDEPENDS:${PN} += "libsplinter-3-0"

inherit rpm
