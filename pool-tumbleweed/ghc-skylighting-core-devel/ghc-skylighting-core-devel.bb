SUMMARY = "Haskell skylighting-core library development files"
DESCRIPTION = "This package provides the Haskell skylighting-core library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-skylighting-core-devel-0.13.3-1.2.aarch64.rpm"
RPM_HASH = "4d303ed181d41c5be7cbeb5de1d73245c6ecff615c32edf2b9f96153d1e759f47b7fd421f1a0db60e865f9c77d6f13b36248aa7cb00fce12913810ef51b06e87"

RPROVIDES:${PN} += "ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-skylighting-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-devel-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-skylighting-core"

inherit rpm
