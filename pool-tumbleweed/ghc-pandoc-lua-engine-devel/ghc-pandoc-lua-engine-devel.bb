SUMMARY = "Haskell pandoc-lua-engine library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-devel-0.2.0.1-1.16.aarch64.rpm"
RPM_HASH = "a8cfeb3fc6e0c1c0dda7cea13b9d9f48441fb311cba8dc97c65510e5c297e4def4f49705aeeee2fa68031dc0724a9ea95989efb4863cab8d353d02f67ce4fb2d"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-engine-0.2.0.1-2wuTqykuGYIB5sAAY67reH \
ghc-pandoc-lua-engine-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-citeproc-0.8.1-2pX9OkWyX7lDXHT1UDpuWJ \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-devel-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-devel-hslua-module-doclayout-1.1.0-7JiUl1Tpojd4AzUWHDI8Pj \
ghc-devel-hslua-module-path-1.1.0-3XIGPd4cIDuFY6K1e1WFz9 \
ghc-devel-hslua-module-system-1.1.0.1-7cwTC3xiKRBJkCLVU1z04u \
ghc-devel-hslua-module-text-1.1.0.1-3IzHe65h4nzA5y3IIyP0nc \
ghc-devel-hslua-module-version-1.1.0-C6IULHIw2X5B1pQoolTNUq \
ghc-devel-hslua-module-zip-1.1.0-Fw4HFTouxng8yMIzubiVJd \
ghc-devel-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC \
ghc-devel-lpeg-1.0.4-DiPCMqCZ1gDFL4TQ30W98B \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-3.1.3-vrz2YBr4KqIJ1o9bFBvzp \
ghc-devel-pandoc-lua-marshal-0.2.2-D6YUzx6tqXTDbJ9vWDLs3T \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-engine"

inherit rpm
