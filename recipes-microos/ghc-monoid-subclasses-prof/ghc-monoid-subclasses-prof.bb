SUMMARY = "Haskell monoid-subclasses profiling library"
DESCRIPTION = "This package provides the Haskell monoid-subclasses profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-prof-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "b8787dea03b8ca51ff429c1ac3467c2da466126f7918319924127a35ac7540b54d47ef0188150a84c011098956d6827792c6749924e573a297c21cf1314c7e7b"

RPROVIDES:${PN} += "ghc-monoid-subclasses-prof ghc-monoid-subclasses-prof(aarch-64) ghc-prof(monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR)"
RDEPENDS:${PN} += "ghc-monoid-subclasses-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais) ghc-prof(containers-0.6.7) ghc-prof(primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg) ghc-prof(text-2.0.2) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
