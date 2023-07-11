SUMMARY = "Simple performant time related library"
DESCRIPTION = "Simple time library focusing on simple but powerful and performant API \
 \
The backbone of the library are the Timeable and Time type classes. \
 \
Each Timeable instances can be converted to type that has a Time instances, and \
thus are different representations of current time."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-0.2.12-7.6.aarch64.rpm"
RPM_HASH = "24264b4a4a76d313539fde569f2db7419bb4a0b82862774c7178ab8fbe0bac9f569e4ecc7c38a5af00d30d1408aa3d405c8f7d999f6a75f059a95330e4333fdf"

RPROVIDES:${PN} += "ghc-hourglass \
libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
