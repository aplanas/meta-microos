SUMMARY = "Haskell haskeline library development files"
DESCRIPTION = "This package provides the Haskell haskeline library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "ghc-haskeline-devel-0.8.2-3.1.aarch64.rpm"
RPM_HASH = "d91b9d166dff5681a633839a85c963e3ad814b233a24662acd65d18b8b12bed06f4973abe3c635cbfefb1f2d17af4eaf048b07b76951083da6044023957aeefc"

RPROVIDES:${PN} += "ghc-devel(haskeline-0.8.2) \
ghc-haskeline-devel \
ghc-haskeline-devel(aarch-64) \
ghc-haskeline-static \
ghc-haskeline-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(exceptions-0.10.5) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(process-1.6.16.0) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(terminfo-0.4.1.5) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3) \
ghc-haskeline(aarch-64)"

inherit rpm
