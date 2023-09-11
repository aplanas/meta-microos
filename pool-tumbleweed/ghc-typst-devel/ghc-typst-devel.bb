SUMMARY = "Haskell typst library development files"
DESCRIPTION = "This package provides the Haskell typst library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-typst-devel-0.1.0.0-1.11.aarch64.rpm"
RPM_HASH = "abddb2a27da7ee5a1abfbadf3bdb12da873eacfbf12e585a07f44c590d26f740dea690183e3ceadc7dc28b34071df985d012648b85b11e040b083c4b5e9f727a"

RPROVIDES:${PN} += "ghc-devel-typst-0.1.0.0-Fmp2IG7sNnSDScnnN1f3Kg \
ghc-typst-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-devel-containers-0.6.7 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-ordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-regex-tdfa-1.3.2.2-EFtJwrhEkMb99DdZ6mBzLM \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq \
ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-typst"

inherit rpm
