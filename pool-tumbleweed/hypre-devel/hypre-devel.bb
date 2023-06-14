SUMMARY = "Headers and library links for libHYPRE2_20_0"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the serial version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "d789159ce6c84e99a29bf3748c0642b43aecf8c86689ab0a02973e8ecd9c42e9297368bf7dd48fd1a572addfdb9c1792b4f8fcf8b42ebf607bf3189eaf4fdd6d"

RPROVIDES:${PN} += "cmake-HYPRE \
hypre-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0 \
superlu-devel"

inherit rpm
