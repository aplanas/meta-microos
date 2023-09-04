SUMMARY = "Haskell hslua-aeson profiling library"
DESCRIPTION = "This package provides the Haskell hslua-aeson profiling library."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-prof-2.3.0.1-1.6.aarch64.rpm"
RPM_HASH = "7ab14d1effe1bf15a0a4d6ad5d4696f02d70b87b5ab8ab1022ecf2f8edf16c56509108d07efa3d6ae9ec29a2a0c3813076768e9435906d0a84afc33e8182c885"

RPROVIDES:${PN} += "ghc-hslua-aeson-prof \
ghc-prof-hslua-aeson-2.3.0.1-GTKyJZd9E8T7sbi3aSnblh"

RDEPENDS:${PN} += "ghc-hslua-aeson-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-mtl-2.2.2 \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
