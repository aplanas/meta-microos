SUMMARY = "Simple performant time related library"
DESCRIPTION = "Simple time library focusing on simple but powerful and performant API \
 \
The backbone of the library are the Timeable and Time type classes. \
 \
Each Timeable instances can be converted to type that has a Time instances, and \
thus are different representations of current time."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-0.2.12-7.3.aarch64.rpm"
RPM_HASH = "3f1cf20d8bcc2a2958b6fb71166ad2cc2366fb69af2567c6b34fd9786997685c6df9b26f5f0a925eb2f153875c224f8ca0485f8c7bd31ea6d153c915e6d5fffa"

RPROVIDES:${PN} += "ghc-hourglass ghc-hourglass(aarch-64) libHShourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
