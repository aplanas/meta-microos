SUMMARY = "Development package for libksieve"
DESCRIPTION = "This package contains development headers of libksieve."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libksieve-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ae48e5d97677a72e7e7c04ba2aa9039971ab722c0a2e5802809d55f1b453abfc1dd134b112ffee5197db5bd92df375b4782acc0f34047b9c8cd2e3c96bf355ed"

RPROVIDES:${PN} += "cmake-KPim5LibKSieve \
libksieve-devel"

RDEPENDS:${PN} += "libksieve5"

inherit rpm
