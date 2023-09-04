SUMMARY = "Haskell vty library development files"
DESCRIPTION = "This package provides the Haskell vty library development files."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-devel-5.38-2.10.aarch64.rpm"
RPM_HASH = "bf174fe9ebb99757cd422519cb5c8cb6ef18a0f9f1cae40b846ce27a356a1a511799830295876e3d8a188822da2b4fc48d7107e423e5574682a2e61594dd9afa"

RPROVIDES:${PN} += "ghc-devel-vty-5.38-4i0JVKKiWtkG17OOXaPYIk \
ghc-vty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vty"

inherit rpm
