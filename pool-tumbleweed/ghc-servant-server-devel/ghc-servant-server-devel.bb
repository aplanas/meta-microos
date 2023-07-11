SUMMARY = "Haskell servant-server library development files"
DESCRIPTION = "This package provides the Haskell servant-server library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-devel-0.19.2-2.7.aarch64.rpm"
RPM_HASH = "ded355342df0ac2de1345754652b7777c022a053be4a39a482fbe9e1d7c4af2e5c9d1c0c359a8febe4587682594ed162b58ce7f1217ba2950de2098e4ecb4a1f"

RPROVIDES:${PN} += "ghc-devel-servant-server-0.19.2-4FIb8LV7jij3EgayMId9y \
ghc-servant-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-constraints-0.13.4-8c0InBhz3htJzug27IqVE7 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-http-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J \
ghc-devel-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-servant-0.19.1-6G8iD3Z75czL6ryOAXMC67 \
ghc-devel-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-devel-string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-app-static-3.1.7.4-DlFhTXkOZ8ZEEfx67nS2tW \
ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-servant-server"

inherit rpm
