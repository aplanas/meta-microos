SUMMARY = "Efficient hashing-based container types"
DESCRIPTION = "Efficient hashing-based container types. The containers have been optimized for \
performance critical use, both in terms of large data quantities and high \
speed. \
 \
The declared cost of each operation is either worst-case or amortized, but \
remains valid even if structures are shared. \
 \
/Security/ \
 \
This package currently provides no defenses against hash collision attacks such \
as HashDoS. Users who need to store input from untrusted sources are advised to \
use 'Data.Map' or 'Data.Set' from the 'containers' package instead."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-0.2.19.1-3.9.aarch64.rpm"
RPM_HASH = "f4e073327d599e15017e241a2e226de2e2035a6d63b409dcd2ed0245d47b4a73b7e6405e477d20006e5fd6caaef30dd16cb9bff03902659e7fc7f42939f33dd4"

RPROVIDES:${PN} += "ghc-unordered-containers \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
