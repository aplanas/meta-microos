SUMMARY = "Haskell network library development files"
DESCRIPTION = "This package provides the Haskell network library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-devel-3.1.4.0-2.1.aarch64.rpm"
RPM_HASH = "f302c0203676d3739a57f0794da64dfe2b379cba0a709e4350da7b831592fbfa60d708665aeb905f42a6e0b04b3072118f6bf16b55f2d61a0cf01c54b9c35525"

RPROVIDES:${PN} += "ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-network-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-network"

inherit rpm
