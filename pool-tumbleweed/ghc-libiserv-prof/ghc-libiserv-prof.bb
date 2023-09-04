SUMMARY = "Haskell libiserv profiling library"
DESCRIPTION = "This package provides the Haskell libiserv profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-libiserv-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "8ed55502e0ebb2a0f40d3d2f0e0e95b7e108089095744d00b7cc0f7c18cea692e42f28bcf01b6f7ac9c3762f2aa208bedcf9924927209b328e82e1fa9a57f8ea"

RPROVIDES:${PN} += "ghc-libiserv-prof \
ghc-prof-libiserv-9.4.6"

RDEPENDS:${PN} += "ghc-libiserv-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghci-9.4.6 \
ghc-prof-unix-2.7.3"

inherit rpm
