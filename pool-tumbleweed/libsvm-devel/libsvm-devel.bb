SUMMARY = "C headers for developing programs with libsvm"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications with libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm-devel-3.30-1.6.aarch64.rpm"
RPM_HASH = "866bac910118379e090da04bd801132b9a4d21ecc6cb31dac087433cfeb471bfa22f28d61eabf5869e3469a81b2be985532ad2b7833c2b572df5f7389ed0cd3e"

RPROVIDES:${PN} += "libsvm-devel"

RDEPENDS:${PN} += "libsvm3"

inherit rpm
