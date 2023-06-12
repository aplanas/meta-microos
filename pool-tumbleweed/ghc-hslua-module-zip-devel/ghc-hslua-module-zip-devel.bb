SUMMARY = "Haskell hslua-module-zip library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-devel-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "84ec105215b176f4c072f437668604c43c933e7dc94e01cd91c312c06c8856de80c981fd6f3f3cfa0379959a60be57b9f10310853a0233d97e3b3cbc0f6bd57a"

RPROVIDES:${PN} += "ghc-devel(hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx) \
ghc-hslua-module-zip-devel \
ghc-hslua-module-zip-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-devel(hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A) \
ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-devel(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-devel(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn) \
ghc-hslua-module-zip"

inherit rpm
