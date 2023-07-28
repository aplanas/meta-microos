SUMMARY = "Haskell citeproc library development files"
DESCRIPTION = "This package provides the Haskell citeproc library development files."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-devel-0.8.1-2.8.aarch64.rpm"
RPM_HASH = "7c961cf578c8c5e72aa8346084619eec0b36084f01df64cd9b1ab3e863177d7ca2da0313b3caff9f30ca16968e145c20e9d7cd97f76174e975cac64610718b57"

RPROVIDES:${PN} += "ghc-citeproc-devel \
ghc-devel-citeproc-0.8.1-IdWRS5bkx4mHz8SxZquXUQ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-citeproc \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon"

inherit rpm
