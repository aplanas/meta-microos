SUMMARY = "Haskell torrent profiling library"
DESCRIPTION = "This package provides the Haskell torrent profiling library."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-prof-10000.1.3-1.9.aarch64.rpm"
RPM_HASH = "5a78ca10b9ef3b92600fe9bd3bdb9fdab93943062c5c42a46f49cf017a0402f485c90611959ea82839126887363ce8dcf81b4d001ec20ebf647c5b84738ea1d0"

RPROVIDES:${PN} += "ghc-prof-torrent-10000.1.3-G2wBML2oDMy6AdmYQo4Dlc \
ghc-torrent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bencode-0.6.1.1-26x5GmL2BHOEu40VootDht \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-torrent-devel"

inherit rpm
