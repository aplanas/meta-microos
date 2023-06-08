SUMMARY = "Development files and tools for CGAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using CGAL."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.5.2"

RPM_NAME = "cgal-devel-5.5.2-2.1.aarch64.rpm"
RPM_HASH = "b55434b3e89a50c953c88c26def9550dc00c1f2a167825bf003dc65fe1abcb3042e52b0b0abdbfed5ecf62c8b05656d5bfcf1c808335c03bcd18dbed6ccd2bf6"

RPROVIDES:${PN} += "cgal-devel cgal-devel(aarch-64) cmake(CGAL) libcgal-devel"
RDEPENDS:${PN} += "/bin/bash blas cmake gmp-devel lapack libboost_atomic-devel libboost_system-devel libboost_thread-devel mpfr-devel zlib-devel"

inherit rpm
