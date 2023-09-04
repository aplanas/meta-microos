SUMMARY = "Haskell pandoc-lua-marshal library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library development \
files."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-devel-0.2.2-1.12.aarch64.rpm"
RPM_HASH = "1c1549eceae5e2755cfd1f1cb474351a9b044394c861ef9967675c03a532d7decc9e8235554e1876b0da72f59577c5a3fa4df2af02d90078543294fc33a5c4cd"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-marshal-0.2.2-D6YUzx6tqXTDbJ9vWDLs3T \
ghc-pandoc-lua-marshal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-devel-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-marshal"

inherit rpm
