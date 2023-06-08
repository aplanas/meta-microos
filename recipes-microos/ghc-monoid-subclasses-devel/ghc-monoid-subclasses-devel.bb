SUMMARY = "Haskell monoid-subclasses library development files"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-devel-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "c34e11d77ce27b8371d87b2fdce36ce8ce58baf62d2859552d47889b8f28116268a1d04026c43829999c169706e24a6aee46c744c21f2e1c4b6c618f4cce52a0"

RPROVIDES:${PN} += "ghc-devel(monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR) ghc-monoid-subclasses-devel ghc-monoid-subclasses-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais) ghc-devel(containers-0.6.7) ghc-devel(primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg) ghc-devel(text-2.0.2) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-monoid-subclasses"

inherit rpm
