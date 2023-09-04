SUMMARY = "Extensible exceptions"
DESCRIPTION = "This package provides extensible exceptions for both new and old versions of \
GHC (i.e., < 6.10)."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-0.1.1.4-7.3.aarch64.rpm"
RPM_HASH = "4bf4d78ded6abfd67aa9140d29691e3d5cc3bbe87e504e2034e7c78583f5ed1f4d8679837773cf06d5a1b9e727d1dea4e6515f4c5808c2f0392876acfda79e53"

RPROVIDES:${PN} += "ghc-extensible-exceptions \
libHSextensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
