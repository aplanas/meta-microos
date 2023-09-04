SUMMARY = "Haskell vty profiling library"
DESCRIPTION = "This package provides the Haskell vty profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.38"

RPM_NAME = "ghc-vty-prof-5.38-2.10.aarch64.rpm"
RPM_HASH = "fa80af745c5818285ec0db8bb3af6aa4f9f22bbf3c112e49690e99bbd30805f153e11b49f968b4286d37ab3fb000246a2046306b764b5813a212717294a64fcd"

RPROVIDES:${PN} += "ghc-prof-vty-5.38-4i0JVKKiWtkG17OOXaPYIk \
ghc-vty-prof"

RDEPENDS:${PN} += "ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
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
