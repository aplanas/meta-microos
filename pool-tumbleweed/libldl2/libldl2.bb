SUMMARY = "A Simple LDL^T Factorization"
DESCRIPTION = "LDL is a set of concise routines for factorizing symmetric positive- \
definite sparse matrices, with some applicability to symmetric \
indefinite matrices. Its primary purpose is to illustrate much of the \
basic theory of sparse matrix algorithms in as concise a code as \
possible, including an elegant new method of sparse symmetric \
factorization that computes the factorization row-by-row but stores \
it column-by-column. The entire symbolic and numeric factorization \
consists of a total of only 49 lines of code. The package is written \
in C, and includes a MATLAB interface. \
 \
LDL is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.6"

RPM_NAME = "libldl2-2.2.6-49.2.aarch64.rpm"
RPM_HASH = "ce88d77ed103eb3166e0261a10b22dcbbce823b01116db03ac9a03b18b4b1bd6b28cee7558604947f686d703a4fc34c30b3469cd48e771a7936b76fdfab46f3e"

RPROVIDES:${PN} += "libldl-2-2-6 \
libldl.so.2 \
libldl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
