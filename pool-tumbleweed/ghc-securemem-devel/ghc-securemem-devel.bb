SUMMARY = "Haskell securemem library development files"
DESCRIPTION = "This package provides the Haskell securemem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-devel-0.1.10-4.5.aarch64.rpm"
RPM_HASH = "998a51211e5e0e25a8f705108d2f53ddc3601186b90621c6f3c05cf000bf76c6582ee9c5acc48bf68257c3879b14168f2c2aa32b24e1948161abdf6e4369ab74"

RPROVIDES:${PN} += "ghc-devel-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4 \
ghc-securemem-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-securemem"

inherit rpm
