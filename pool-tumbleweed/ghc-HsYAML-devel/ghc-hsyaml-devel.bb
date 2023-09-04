SUMMARY = "Haskell HsYAML library development files"
DESCRIPTION = "This package provides the Haskell HsYAML library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.1"

RPM_NAME = "ghc-HsYAML-devel-0.2.1.1-5.3.aarch64.rpm"
RPM_HASH = "80140202dde15d58038a4509fba02c4c1a23e1197b9bb10fd1cc5ea8cff81e030440ddc0738d9a51d3cfe83b3137509649785ef08a285bbab67a40475b174118"

RPROVIDES:${PN} += "ghc-HsYAML-devel \
ghc-devel-HsYAML-0.2.1.1-LCJxHEstqYgA5FP8nPmMDQ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HsYAML \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
