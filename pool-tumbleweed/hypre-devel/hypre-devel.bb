SUMMARY = "Headers and library links for libHYPRE2_20_0"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the serial version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "55bd2e34799ad326e60cefff3c7237d9e97b9894ae252064518fcd0b24cc7f448bf123e7b52447d1a751f68ef2e9a6ff4930056fd1f9028f010b0dfd350fbae8"

RPROVIDES:${PN} += "cmake-HYPRE \
hypre-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0 \
superlu-devel"

inherit rpm
