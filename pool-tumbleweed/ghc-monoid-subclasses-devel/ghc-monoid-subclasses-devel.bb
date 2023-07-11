SUMMARY = "Haskell monoid-subclasses library development files"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-devel-1.2.3-1.7.aarch64.rpm"
RPM_HASH = "70288ec3c3f4ca5f196611141d32bdb3ffa1a19d19c6c0b011e67a6ee47f47b6e6f95583d03cd2304370f0a8c89f4e7714bb4c9869a1be5b584850294f9e22d2"

RPROVIDES:${PN} += "ghc-devel-monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR \
ghc-monoid-subclasses-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-commutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais \
ghc-devel-containers-0.6.7 \
ghc-devel-primes-0.2.1.0-EDehUtw1pOPPL7EktYCRg \
ghc-devel-text-2.0.2 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-monoid-subclasses"

inherit rpm
