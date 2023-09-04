SUMMARY = "Haskell libyaml library development files"
DESCRIPTION = "This package provides the Haskell libyaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-devel-0.1.2-6.11.aarch64.rpm"
RPM_HASH = "7919e8bed03d432e3189f58530a2bf6bdf02d3c44bf2d1defce38ad7305bb855d999fcd6465460ed94b392115fb8ad0af24248e31e3d388a4721b50de534c721"

RPROVIDES:${PN} += "ghc-devel-libyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1 \
ghc-libyaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-libyaml \
libyaml-devel"

inherit rpm
