SUMMARY = "Haskell code-page library development files"
DESCRIPTION = "This package provides the Haskell code-page library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-devel-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "e4702a7e187e7b7701fd282c0a40343887a8d0e833fecd3b9e83535defe8dbb53c55f6f1567099a30c86a58cd1218365ad0ee494127588e19642409dac675b6f"

RPROVIDES:${PN} += "ghc-code-page-devel \
ghc-code-page-devel(aarch-64) \
ghc-devel(code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D)"

RDEPENDS:${PN} += "/bin/sh \
ghc-code-page \
ghc-compiler \
ghc-devel(base-4.17.1.0)"

inherit rpm
