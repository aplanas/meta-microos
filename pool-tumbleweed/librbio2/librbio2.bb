SUMMARY = "MATLAB Toolbox for Reading/Writing Sparse Matrices"
DESCRIPTION = "RBio is a MATLAB toolbox for reading/writing sparse matrices in the \
Rutherford/Boeing format, and for reading/writing problems in the UF \
Sparse Matrix Collection from/to a set of files in a directory. \
Version 2.0+ is written in C. \
 \
RBio is part of the SuiteSparse sparse matrix suite."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "librbio2-2.2.6-49.2.aarch64.rpm"
RPM_HASH = "1ab5d416bb56f6e0d154d8a85590e4881883fcd4ba9fe906486487ea8434661e561e1f969146874a6806511035ff30bbb35d8784f31bbabc64ee376aadeabe4e"

RPROVIDES:${PN} += "librbio-2-2-6 \
librbio.so.2 \
librbio2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
