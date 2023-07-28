SUMMARY = "Haskell servant library development files"
DESCRIPTION = "This package provides the Haskell servant library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.1"

RPM_NAME = "ghc-servant-devel-0.19.1-3.1.aarch64.rpm"
RPM_HASH = "2b4710afae06dd6d3e8cf00c3d9cd6a51f4add8e1e454695d5e2c73f6df8085da1626f23f156666095883eebe4c74b621456d5a883d112f0631d77b2fe193ddd"

RPROVIDES:${PN} += "ghc-devel-servant-0.19.1-6G8iD3Z75czL6ryOAXMC67 \
ghc-servant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-QuickCheck-2.14.3-6dq2izV8oSq1BobaDA598X \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-constraints-0.13.4-8c0InBhz3htJzug27IqVE7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-http-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J \
ghc-devel-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-singleton-bool-0.1.6-9MbEj8pBx4EB1jZ66FdPc4 \
ghc-devel-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-devel-string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-servant"

inherit rpm
