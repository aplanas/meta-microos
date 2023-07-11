SUMMARY = "Haskell code-page library development files"
DESCRIPTION = "This package provides the Haskell code-page library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-devel-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "0521dc77b6f1aa6dae5ca179dea422385f6ab52d1dcae7cb36c8fbb1918911935b1468c3885e253858e58747ff3d8aec2dab34c55bebd1e2f8f1192f923bfb65"

RPROVIDES:${PN} += "ghc-code-page-devel \
ghc-devel-code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-code-page \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
