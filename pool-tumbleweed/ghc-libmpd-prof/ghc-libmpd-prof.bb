SUMMARY = "Haskell libmpd profiling library"
DESCRIPTION = "This package provides the Haskell libmpd profiling library."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-prof-0.10.0.0-2.11.aarch64.rpm"
RPM_HASH = "028ea0aa4ca1ecd5ceb2511b2db77eb0c692a48a2a0c4952fc1cb1c1da4071ab5b2cfb6585500a0a5935a143aa4c229804069cb570f1c511a56ad4103a507146"

RPROVIDES:${PN} += "ghc-libmpd-prof \
ghc-prof-libmpd-0.10.0.0-9S81DJckoXS7PbMAbxHjm1"

RDEPENDS:${PN} += "ghc-libmpd-devel \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs"

inherit rpm
