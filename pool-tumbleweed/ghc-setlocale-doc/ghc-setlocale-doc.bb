SUMMARY = "Haskell setlocale library documentation"
DESCRIPTION = "This package provides the Haskell setlocale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-doc-1.0.0.10-4.3.noarch.rpm"
RPM_HASH = "0c27f158433c0220157d4fe6eea4bd05dbe75bddfa7e7e4833f5ea0355781479a00f0920a5dc49b0e24f7a90d297da9513b5e50880a3471344aaf024c9b7a14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setlocale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
