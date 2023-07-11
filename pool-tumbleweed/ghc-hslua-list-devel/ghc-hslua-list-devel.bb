SUMMARY = "Haskell hslua-list library development files"
DESCRIPTION = "This package provides the Haskell hslua-list library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-devel-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "930912b6017fe75fff328fd4a90e6ec362b98dc6aebab6156248affbe3fd43d0f778881b33caf9c2313e7060f568c9601a78f6e8d51e8dffd5fffed80bfda7db"

RPROVIDES:${PN} += "ghc-devel-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A \
ghc-hslua-list-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-hslua-list"

inherit rpm
