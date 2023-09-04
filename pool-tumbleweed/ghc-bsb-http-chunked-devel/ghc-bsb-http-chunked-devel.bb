SUMMARY = "Haskell bsb-http-chunked library development files"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-devel-0.0.0.4-6.3.aarch64.rpm"
RPM_HASH = "9eef4918f72edfd0221f390b741182bb491d017c279bfbfb8b0937cacdec9b8c88afb8fbcbffa1795b95ab5b8952674c2b00575eaf569bca1e8e527910537fd2"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-devel \
ghc-devel-bsb-http-chunked-0.0.0.4-6Uz6ZfX3tBC2nOluTU0Lnf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bsb-http-chunked \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
