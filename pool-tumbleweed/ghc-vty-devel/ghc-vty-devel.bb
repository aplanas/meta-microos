SUMMARY = "Haskell vty library development files"
DESCRIPTION = "This package provides the Haskell vty library development files."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-devel-5.38-2.11.aarch64.rpm"
RPM_HASH = "f21ccca65ac1eccc5785eb2a95552d6a914827e45dad1442d62435e97ef9188f8573f54bbfb3ef700c94b66114566f59f9e8c46d3e32d7437266979f7c84c8b7"

RPROVIDES:${PN} += "ghc-devel-vty-5.38-LhnNmnv8DxxD0eeAip9uJs \
ghc-vty-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
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
