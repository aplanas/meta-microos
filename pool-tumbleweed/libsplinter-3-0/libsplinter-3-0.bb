SUMMARY = "A library for multivariate function approximation implemented in C++"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. Currently, \
the library contains the following implementations: \
 \
1. tensor product B-splines, \
2. radial basis functions, including the thin plate spline, and \
3. polynomial regression. \
 \
The coefficients in these models are computed using ordinary least \
squares (OLS). The name of the library, SPLINTER, originates from the \
tensor product B-spline implementation, which was the first of the \
methods to be implemented."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "libsplinter-3-0-3.0-2.23.aarch64.rpm"
RPM_HASH = "3775ab4a637a9e48303a4650048f7911b9bcde7412dcfedb885c62e174e4caa5b0ff0bc96a0ec17b67b3931ca0a300a8559d6e1f5044231add6495a4b596f909"

RPROVIDES:${PN} += "libsplinter-3-0 \
libsplinter-3-0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
