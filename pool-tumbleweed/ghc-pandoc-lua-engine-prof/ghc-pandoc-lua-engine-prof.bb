SUMMARY = "Haskell pandoc-lua-engine profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-prof-0.2.0.1-1.16.aarch64.rpm"
RPM_HASH = "fe55f2e751b5fd0dd0d054001a269cb6bf2782059df4920916b0a1724a087cd6fe795123ee85162298e591d6a08b2b63c2c47353f29dcce6f39b47df8542a6d0"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-prof \
ghc-prof-pandoc-lua-engine-0.2.0.1-2wuTqykuGYIB5sAAY67reH"

RDEPENDS:${PN} += "ghc-pandoc-lua-engine-devel \
ghc-prof-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-citeproc-0.8.1-2pX9OkWyX7lDXHT1UDpuWJ \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-prof-doctemplates-0.11-5YDqCtEHp1aBKjLF8JwQH7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-prof-hslua-module-doclayout-1.1.0-7JiUl1Tpojd4AzUWHDI8Pj \
ghc-prof-hslua-module-path-1.1.0-3XIGPd4cIDuFY6K1e1WFz9 \
ghc-prof-hslua-module-system-1.1.0.1-7cwTC3xiKRBJkCLVU1z04u \
ghc-prof-hslua-module-text-1.1.0.1-3IzHe65h4nzA5y3IIyP0nc \
ghc-prof-hslua-module-version-1.1.0-C6IULHIw2X5B1pQoolTNUq \
ghc-prof-hslua-module-zip-1.1.0-Fw4HFTouxng8yMIzubiVJd \
ghc-prof-hslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC \
ghc-prof-lpeg-1.0.4-DiPCMqCZ1gDFL4TQ30W98B \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-3.1.3-vrz2YBr4KqIJ1o9bFBvzp \
ghc-prof-pandoc-lua-marshal-0.2.2-D6YUzx6tqXTDbJ9vWDLs3T \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
