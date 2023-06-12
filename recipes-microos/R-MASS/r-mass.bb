SUMMARY = "Package provides recommended R-MASS"
DESCRIPTION = "This packages provides R-MASS, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.58"

RPM_NAME = "R-MASS-7.3.58-45.2.aarch64.rpm"
RPM_HASH = "19d144d243f1831083e94939402abc777805543628228bb0728bc9d67a2000b2a6f33ecb52423edb0a2fa77a569dc04e392a05cb32b60531eb91036dd56a8f5b"

RPROVIDES:${PN} += "R-MASS R-MASS(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
