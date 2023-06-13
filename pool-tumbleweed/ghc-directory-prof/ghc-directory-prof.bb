SUMMARY = "Haskell directory profiling library"
DESCRIPTION = "This package provides the Haskell directory profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-prof-1.3.7.1-3.1.aarch64.rpm"
RPM_HASH = "589fc3f82b887438f8b01ae56a6cf01ed9d7a848bb877c20843170b80d74b3db37bebeb5e8b1f5d1c57f267f1f4e1d5d70bb5df80f20705281e3d29193901f6e"

RPROVIDES:${PN} += "ghc-directory-prof \
ghc-directory-prof(aarch-64) \
ghc-prof(directory-1.3.7.1)"

RDEPENDS:${PN} += "ghc-directory-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(time-1.12.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
