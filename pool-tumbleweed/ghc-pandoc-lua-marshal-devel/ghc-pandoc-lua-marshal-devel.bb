SUMMARY = "Haskell pandoc-lua-marshal library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library development \
files."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-devel-0.2.2-1.7.aarch64.rpm"
RPM_HASH = "7f1267acc64de2a5b9cefd5aadd999b0e3216e6370cfa7b3102bc8f9d1f69ce17682ce37d0de114e19895848ab7b9b9d35171724171b7aba971be6b68182156c"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-marshal-0.2.2-sn2ZVEcWlgDOuaBIv7GGF \
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
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-marshal"

inherit rpm
