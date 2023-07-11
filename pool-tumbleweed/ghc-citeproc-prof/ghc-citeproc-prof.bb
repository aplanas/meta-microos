SUMMARY = "Haskell citeproc profiling library"
DESCRIPTION = "This package provides the Haskell citeproc profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-prof-0.8.1-2.7.aarch64.rpm"
RPM_HASH = "110af7db80a04a48197755a15a693edea9e8f36254780c5b8b388e437b9c129bd6e7633c9798f803b5d14b345afd491f67e6e81663a74301ad27a716e3cab393"

RPROVIDES:${PN} += "ghc-citeproc-prof \
ghc-prof-citeproc-0.8.1-Ex3LMLw4y9Q5nAZv8bt8hk"

RDEPENDS:${PN} += "ghc-citeproc-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-prof-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon"

inherit rpm
