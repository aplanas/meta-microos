SUMMARY = "Haskell primitive library development files"
DESCRIPTION = "This package provides the Haskell primitive library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-devel-0.7.4.0-1.6.aarch64.rpm"
RPM_HASH = "0bc5999c50359941a1a9d28a29d56e08353529a8b5f1a99538e84d06a042126139f44e56807fa5ae20b9aa62e0cae6bef1d7f6875328bde8ab53c285a4cab56b"

RPROVIDES:${PN} += "ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-primitive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-primitive"

inherit rpm
