SUMMARY = "Haskell doctemplates profiling library"
DESCRIPTION = "This package provides the Haskell doctemplates profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-doctemplates-prof-0.11-1.2.aarch64.rpm"
RPM_HASH = "1d6288cf1da1d45e9e5cef65d5ff12e781f7c1b08fcb0d3948171263756bbcb2b9fbc567e56dafd6e59758245f7602f0123b55b4b2ae8634ce3c496bb889ad26"

RPROVIDES:${PN} += "ghc-doctemplates-prof ghc-doctemplates-prof(aarch-64) ghc-prof(doctemplates-0.11-BPgXv8g09ry9FVnSp2Q4Ny)"
RDEPENDS:${PN} += "ghc-doctemplates-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) ghc-prof(filepath-1.4.2.2) ghc-prof(mtl-2.2.2) ghc-prof(parsec-3.1.16.1) ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) ghc-prof(text-2.0.2) ghc-prof(text-conversions-0.3.1.1-CkkBRqT3R5g4PO0QywmUQS) ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
