SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-devel-0.8.2.8-6.4.aarch64.rpm"
RPM_HASH = "914f0a543602e759e18f904be9c96aacce1d3a8a36e03d5b76b4f69b29c42db665fdb02ebb4bdcbdf3e6fe5dfab0f464f723c432cd40c3e6b2906fa4eec23684"

RPROVIDES:${PN} += "ghc-blaze-markup-devel \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-markup \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2"

inherit rpm
