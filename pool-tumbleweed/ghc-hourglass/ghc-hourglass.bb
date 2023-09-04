SUMMARY = "Simple performant time related library"
DESCRIPTION = "Simple time library focusing on simple but powerful and performant API \
 \
The backbone of the library are the Timeable and Time type classes. \
 \
Each Timeable instances can be converted to type that has a Time instances, and \
thus are different representations of current time."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-0.2.12-7.8.aarch64.rpm"
RPM_HASH = "0ae7f5fda12eb2ce2fac08f8cf2497e290f6ef805bc6f1f9541caf629108415efc6027ca3c6d04c98ad83c3dae163886cf84ec738bc71333b7af8f23c96ba1c0"

RPROVIDES:${PN} += "ghc-hourglass \
libHShourglass-0.2.12-DDTIHdRSu369xxYEqSFzho-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
