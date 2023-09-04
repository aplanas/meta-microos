SUMMARY = "Haskell pandoc-lua-marshal profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal profiling library."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-prof-0.2.2-1.12.aarch64.rpm"
RPM_HASH = "24d61bcd414c14e3d094c9adbb3175c5626e403f8c75b30dddebf107df578345562931194f2c59623092f14235b72c52cfad101389359ce3589fe87856326cca"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-prof \
ghc-prof-pandoc-lua-marshal-0.2.2-D6YUzx6tqXTDbJ9vWDLs3T"

RDEPENDS:${PN} += "ghc-pandoc-lua-marshal-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-prof-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-text-2.0.2"

inherit rpm
