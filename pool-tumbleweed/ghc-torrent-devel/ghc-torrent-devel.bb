SUMMARY = "Haskell torrent library development files"
DESCRIPTION = "This package provides the Haskell torrent library development files."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-devel-10000.1.3-1.9.aarch64.rpm"
RPM_HASH = "e084f8d5cd12d8675a04749ebbeb6071a7305be2e8ae812f37efbf91058b31cc56a84878f311a0a6e2d1b42e794ad94f861f35ec6b63e65bde3f2b7d1b297b18"

RPROVIDES:${PN} += "ghc-devel-torrent-10000.1.3-G2wBML2oDMy6AdmYQo4Dlc \
ghc-torrent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bencode-0.6.1.1-26x5GmL2BHOEu40VootDht \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-torrent"

inherit rpm
