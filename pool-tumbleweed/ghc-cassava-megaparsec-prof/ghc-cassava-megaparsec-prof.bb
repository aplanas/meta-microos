SUMMARY = "Haskell cassava-megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell cassava-megaparsec profiling library."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "ghc-cassava-megaparsec-prof-2.0.4-3.5.aarch64.rpm"
RPM_HASH = "162a9fd57f1ccbf85d298a8549746c613531e45ff168773d5adfb0a10db8a4451c19c402a9e8eaba7f7c77c8ab3c89e19a143beebabff88d0f1f9d3706fc5496"

RPROVIDES:${PN} += "ghc-cassava-megaparsec-prof \
ghc-prof-cassava-megaparsec-2.0.4-C7KekE0MHcyFXF3lsApNgX"

RDEPENDS:${PN} += "ghc-cassava-megaparsec-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cassava-0.5.3.0-3BxMB2hl3TbBsSJkTsXVLP \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
