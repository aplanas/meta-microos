SUMMARY = "Haskell base-compat-batteries library development files"
DESCRIPTION = "This package provides the Haskell base-compat-batteries library development \
files."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-batteries-devel-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "eaee703be7626a96476b9439e616257142902e1bab342eb71af40cf8c000b0c8e8f7873c3a7514919922c47c524d935352cf57de376f54f4de9a135aa78cba0e"

RPROVIDES:${PN} += "ghc-base-compat-batteries-devel \
ghc-devel-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat-batteries \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
