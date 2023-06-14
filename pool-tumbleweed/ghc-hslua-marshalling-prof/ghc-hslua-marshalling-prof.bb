SUMMARY = "Haskell hslua-marshalling profiling library"
DESCRIPTION = "This package provides the Haskell hslua-marshalling profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-prof-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "d968a91bcbc3c1fb7386d36f2f5c1703f12261d68bdeac28c4435b6225a8acee617041dfe54c8792e642303dd014c98b4a0261073d28be1689c1d3b69668bc4f"

RPROVIDES:${PN} += "ghc-hslua-marshalling-prof \
ghc-prof-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq"

RDEPENDS:${PN} += "ghc-hslua-marshalling-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
