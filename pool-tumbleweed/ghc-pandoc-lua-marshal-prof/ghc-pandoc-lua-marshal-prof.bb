SUMMARY = "Haskell pandoc-lua-marshal profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal profiling library."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-prof-0.2.2-1.8.aarch64.rpm"
RPM_HASH = "a9ac70b3590a6ca1d60962458a7ba7f79d6231ba13857bd1af6aa1222be5d4a8ef3825ed7096355b51c3cefb95e7eaf77fe3b30748926559f2e56c41c535efff"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-prof \
ghc-prof-pandoc-lua-marshal-0.2.2-FczgTsDU3sCHicuhmGSmSB"

RDEPENDS:${PN} += "ghc-pandoc-lua-marshal-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-prof-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-prof-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-prof-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-text-2.0.2"

inherit rpm
