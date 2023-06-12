SUMMARY = "Manpages for LAPACK and BLAS"
DESCRIPTION = "The lapack-man package contains documentation for LAPACK \
(Linear Algebra PACKage) and BLAS (Basic Linear Algebra \
Subprograms) routines, in the form of man pages."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "lapack-man-3.9.0-9.1.noarch.rpm"
RPM_HASH = "4b4513ef1e2dc52cd7c7e914a61243edcda2d88abff0021bc0ee2fa299acf790d88749fc3c641d2a3dc98034d33bb5be92adb769a83326309718c76dc96b849f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "blas-man \
lapack-man"
RDEPENDS:${PN} += ""

inherit rpm
