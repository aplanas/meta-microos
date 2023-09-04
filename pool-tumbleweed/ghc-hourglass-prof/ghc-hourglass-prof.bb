SUMMARY = "Haskell hourglass profiling library"
DESCRIPTION = "This package provides the Haskell hourglass profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-prof-0.2.12-7.8.aarch64.rpm"
RPM_HASH = "c6316e26038a6dc9ef69e5694a080439c08d55394b2b8c45f99e96b311ddfef3ff048f1fa85cd05a3b3f2093a0237a5de461561b43499312bef92d3a9a81ab3b"

RPROVIDES:${PN} += "ghc-hourglass-prof \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho"

RDEPENDS:${PN} += "ghc-hourglass-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
