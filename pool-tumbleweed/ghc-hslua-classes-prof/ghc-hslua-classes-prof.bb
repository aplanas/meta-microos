SUMMARY = "Haskell hslua-classes profiling library"
DESCRIPTION = "This package provides the Haskell hslua-classes profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-prof-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "213eee870cbb5a9dbeb579c16d260c192c99139bebf61577b187e77afa68ac3a313e09efb3e157850bf71dff78023367c766853ea317d557edaf1e91ad3d7223"

RPROVIDES:${PN} += "ghc-hslua-classes-prof \
ghc-prof-hslua-classes-2.3.0-B1L4OZUPrf8GQ47NXlejyp"

RDEPENDS:${PN} += "ghc-hslua-classes-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-text-2.0.2"

inherit rpm
