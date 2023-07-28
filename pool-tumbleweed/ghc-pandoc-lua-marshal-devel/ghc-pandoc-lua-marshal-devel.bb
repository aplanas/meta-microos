SUMMARY = "Haskell pandoc-lua-marshal library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library development \
files."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-devel-0.2.2-1.8.aarch64.rpm"
RPM_HASH = "e1bafd74aded085145abb613af18679d9db12b9e8b7c52bba0595a653acb738d1a87bc2d0ff9f8ceabaf768e8a6b59be6fbeb403e2cdaf1c939e52eb2f80f58e"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-marshal-0.2.2-FczgTsDU3sCHicuhmGSmSB \
ghc-pandoc-lua-marshal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-devel-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-marshal"

inherit rpm
