SUMMARY = "Haskell bimap library development files"
DESCRIPTION = "This package provides the Haskell bimap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-devel-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "78253b0d60faccc3e8d2bdd7f0651653eb48247f8409db10b3dbdd152e467418be1d3f4644e874d71c6cf1f8c5e97e19892cb374201a5df519b4f1ebf1366522"

RPROVIDES:${PN} += "ghc-bimap-devel \
ghc-devel-bimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bimap \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5"

inherit rpm
