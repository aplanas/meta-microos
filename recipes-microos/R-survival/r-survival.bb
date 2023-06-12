SUMMARY = "Package provides recommended R-survival"
DESCRIPTION = "This packages provides R-survival, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.5.5"

RPM_NAME = "R-survival-3.5.5-45.2.aarch64.rpm"
RPM_HASH = "cd782e9d446b780ff48f17d6f57feb69c91ad609d5288cf2d898223039b9bfab5b4b729ec0a3ea1c8b498727f3a8e2008905c0fd5de42fb3f4392188080ebba3"

RPROVIDES:${PN} += "R-survival R-survival(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
