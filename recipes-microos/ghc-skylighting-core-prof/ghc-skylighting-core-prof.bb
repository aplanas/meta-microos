SUMMARY = "Haskell skylighting-core profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.1"

RPM_NAME = "ghc-skylighting-core-prof-0.13.2.1-1.4.aarch64.rpm"
RPM_HASH = "bde509c1421d2dc5d6373978858e7fb07e054b3c79f054a676debcac15b9abb048f93d4241cf6528b8cf774cfaf4c797d59c9b9b1e1f0d3ac6ce3b480c5e1d54"

RPROVIDES:${PN} += "ghc-prof(skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63) \
ghc-skylighting-core-prof \
ghc-skylighting-core-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-prof(colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln) \
ghc-prof(containers-0.6.7) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(mtl-2.2.2) \
ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-skylighting-core-devel"

inherit rpm
