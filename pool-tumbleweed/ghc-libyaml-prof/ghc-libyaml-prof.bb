SUMMARY = "Haskell libyaml profiling library"
DESCRIPTION = "This package provides the Haskell libyaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-prof-0.1.2-6.11.aarch64.rpm"
RPM_HASH = "11fc7e5c80666427b4869958d391c320647a68fdf8579a37a73b43b8ad59fcfa0f915faf3c7647116c7abe2df1b7d215c04f4b2d2c7f1293994add7c3cebe17b"

RPROVIDES:${PN} += "ghc-libyaml-prof \
ghc-prof-libyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1"

RDEPENDS:${PN} += "ghc-libyaml-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP"

inherit rpm
