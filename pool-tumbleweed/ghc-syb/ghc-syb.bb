SUMMARY = "Scrap Your Boilerplate"
DESCRIPTION = "This package contains the generics system described in the /Scrap Your \
Boilerplate/ papers (see <http://www.cs.uu.nl/wiki/GenericProgramming/SYB>). \
It defines the 'Data' class of types permitting folding and unfolding of \
constructor applications, instances of this class for primitive types, and a \
variety of traversals."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.4"

RPM_NAME = "ghc-syb-0.7.2.4-1.3.aarch64.rpm"
RPM_HASH = "015aeca46beec52586c5555f120c159e5cdf766c088b27cb229f4681ad6469f03d6bae9985d7745f0bfc195d53c2762e02d50e74df5ecdf81796920a540cc6f8"

RPROVIDES:${PN} += "ghc-syb \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
