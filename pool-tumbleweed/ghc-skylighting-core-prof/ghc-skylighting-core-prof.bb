SUMMARY = "Haskell skylighting-core profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-skylighting-core-prof-0.13.4-1.1.aarch64.rpm"
RPM_HASH = "29194638594201507e3c17b79858dd6e822e4cc5cd8df5ed7fca1635b6daad46fc015e99d2e1bab9918c740de2cdd3cec7303dc4e3915e3ef38e1c62e8e1272b"

RPROVIDES:${PN} += "ghc-prof-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-skylighting-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-skylighting-core-devel"

inherit rpm
