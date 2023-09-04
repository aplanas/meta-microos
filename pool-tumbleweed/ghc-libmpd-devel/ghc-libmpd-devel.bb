SUMMARY = "Haskell libmpd library development files"
DESCRIPTION = "This package provides the Haskell libmpd library development files."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-devel-0.10.0.0-2.11.aarch64.rpm"
RPM_HASH = "9863f39377604be0160f567b0c2f5e896e2f7b00b02d707f937fdbd818203c346b4488a37d4fef8a8c936ed18545a2362327091cd08639e8e88895aaca61dea2"

RPROVIDES:${PN} += "ghc-devel-libmpd-0.10.0.0-9S81DJckoXS7PbMAbxHjm1 \
ghc-libmpd-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-safe-exceptions-0.1.7.4-AmShSL4jn3220svzMELB6r \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-libmpd"

inherit rpm
