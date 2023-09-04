SUMMARY = "Haskell assoc library development files"
DESCRIPTION = "This package provides the Haskell assoc library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-devel-1.1-1.6.aarch64.rpm"
RPM_HASH = "8c522aa5671b33412a77360400e76093483aca5fbc584828d0b34206a201e301e07b266f0446c502f69283cf424880cbb20fddcf3cbd6dda4f59b718ef5e0334"

RPROVIDES:${PN} += "ghc-assoc-devel \
ghc-devel-assoc-1.1-J44kuPbAMT5GyespKCFdbT"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-assoc \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax"

inherit rpm
