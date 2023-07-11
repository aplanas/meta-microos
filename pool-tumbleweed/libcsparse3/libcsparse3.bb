SUMMARY = "Instructional Sparse Matrix Package"
DESCRIPTION = "CSparse is a small yet feature-rich sparse matrix package written \
specifically for a book. The purpose of the package is to demonstrate \
a wide range of sparse matrix algorithms in as concise a code as \
possible. CSparse is about 2,200 lines long (excluding its MATLAB \
interface, demo codes, and test codes), yet it contains algorithms \
(either asympotical optimal or fast in practice) for all of the \
following functions described below. A MATLAB interface is included. \
 \
Note that the LU and Cholesky factorization algorithms are not as \
fast as UMFPACK or CHOLMOD. Other functions have comparable \
performance as their MATLAB equivalents (some are faster). \
 \
Documentation is very terse in the code; it is fully documented in \
the book. Some indication of how to call the C functions in CSparse \
is given by the CSparse/MATLAB/*.m help files. \
 \
CSparse is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.0"

RPM_NAME = "libcsparse3-3.2.0-49.2.aarch64.rpm"
RPM_HASH = "dc6e30fef5fba464fecafa4087626e943133f769158727a96705d8afa28afef097cfb147baeeb8280d0c9e7c4cf1673cbaf04568aab0438b9c2bf46948d6a676"

RPROVIDES:${PN} += "libcsparse-3-2-0 \
libcsparse.so.3 \
libcsparse3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
