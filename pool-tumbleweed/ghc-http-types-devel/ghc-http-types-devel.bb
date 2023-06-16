SUMMARY = "Haskell http-types library development files"
DESCRIPTION = "This package provides the Haskell http-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "ghc-http-types-devel-0.12.3-6.3.aarch64.rpm"
RPM_HASH = "e520a5ebc75ecfbd70b09658b3396271cee78f34840fe1e45255498e0af50a6fa6b7e29d0f2b6dc4c49e4d91c0e3f48c482295d1d08489d61adc012cd3b4d7fa"

RPROVIDES:${PN} += "ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-http-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-text-2.0.2 \
ghc-http-types"

inherit rpm
