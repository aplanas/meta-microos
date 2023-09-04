SUMMARY = "Haskell hslua-aeson library development files"
DESCRIPTION = "This package provides the Haskell hslua-aeson library development files."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-devel-2.3.0.1-1.6.aarch64.rpm"
RPM_HASH = "0018d233c62e0433fe734fb4db6990e39c23de842a5bca2562fc5b80675b31773e14fcaf75f8c70e5e9946d96cca50e60bf43c5739c7f43ab32c79fab9157ec1"

RPROVIDES:${PN} += "ghc-devel-hslua-aeson-2.3.0.1-GTKyJZd9E8T7sbi3aSnblh \
ghc-hslua-aeson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-mtl-2.2.2 \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-hslua-aeson"

inherit rpm
