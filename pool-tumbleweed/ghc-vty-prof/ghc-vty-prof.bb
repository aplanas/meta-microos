SUMMARY = "Haskell vty profiling library"
DESCRIPTION = "This package provides the Haskell vty profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-prof-5.38-2.11.aarch64.rpm"
RPM_HASH = "974368a9c10f031052ba5d66b900e0bec74470c098a45759ef4517a633f998efe076f8b3d04831d3617d5502a206f8e1c3abb2d2ef5fa364c99dbd7f12dfd25b"

RPROVIDES:${PN} += "ghc-prof-vty-5.38-LhnNmnv8DxxD0eeAip9uJs \
ghc-vty-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminfo-0.4.1.5 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vty-devel"

inherit rpm
