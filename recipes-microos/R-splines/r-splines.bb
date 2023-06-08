SUMMARY = "Package providing R-splines"
DESCRIPTION = "This package provides R-splines, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-splines-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "99547a5ddbe21e7339fc46ae5edc781907a31086636db0e240d8bed80cbf51c8e58d04f747bd4b144728bd4d90267f44d73f66a475b0f0d4d64a48f18e6c6ef7"

RPROVIDES:${PN} += "R-splines R-splines(aarch-64)"
RDEPENDS:${PN} += "R-base libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
