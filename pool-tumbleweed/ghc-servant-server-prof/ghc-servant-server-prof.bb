SUMMARY = "Haskell servant-server profiling library"
DESCRIPTION = "This package provides the Haskell servant-server profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-prof-0.19.2-2.7.aarch64.rpm"
RPM_HASH = "ba81efc3daa031f2fa9be6cdd51274ce155dd1ae6dca392671240fc12ad0177849dd15d862be338c06e711802259928e132ee3297326d4232dcaff65169615cc"

RPROVIDES:${PN} += "ghc-prof-servant-server-0.19.2-4FIb8LV7jij3EgayMId9y \
ghc-servant-server-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-constraints-0.13.4-8c0InBhz3htJzug27IqVE7 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-api-data-0.5-V3iAwM0FHG5XKNP6QkA7J \
ghc-prof-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-servant-0.19.1-6G8iD3Z75czL6ryOAXMC67 \
ghc-prof-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-prof-string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-app-static-3.1.7.4-DlFhTXkOZ8ZEEfx67nS2tW \
ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-servant-server-devel"

inherit rpm
