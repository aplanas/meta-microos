SUMMARY = "A class for types with a default value"
DESCRIPTION = "A class for types with a default value."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-0.1.2.0-10.2.aarch64.rpm"
RPM_HASH = "024f89ac9850c602c57ba9c9d80a5374616b5bb39a03333d82ac4a58e78b78663d7140e9b7f66ba4b6a555cf3fbc53893b6644648e4ed602d34ff9d5a309db34"

RPROVIDES:${PN} += "ghc-data-default-class ghc-data-default-class(aarch-64) libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
