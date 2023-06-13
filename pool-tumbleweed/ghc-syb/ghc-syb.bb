SUMMARY = "Scrap Your Boilerplate"
DESCRIPTION = "This package contains the generics system described in the /Scrap Your \
Boilerplate/ papers (see <http://www.cs.uu.nl/wiki/GenericProgramming/SYB>). \
It defines the 'Data' class of types permitting folding and unfolding of \
constructor applications, instances of this class for primitive types, and a \
variety of traversals."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.3"

RPM_NAME = "ghc-syb-0.7.2.3-1.2.aarch64.rpm"
RPM_HASH = "a634a765696fbd04e795a05af6c39d8e6ce705bdd494f0fb23fe6e9e9a5c531d48af4bf6d87c2637c592960719fb0454fc22c73f451250dcdf0fd131f64c32e8"

RPROVIDES:${PN} += "ghc-syb \
ghc-syb(aarch-64) \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
