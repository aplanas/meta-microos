SUMMARY = "Haskell setenv library development files"
DESCRIPTION = "This package provides the Haskell setenv library development files."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-devel-0.1.1.3-12.2.aarch64.rpm"
RPM_HASH = "6d934246d7e5f8cc19052a576d28b984039fdd0912baddb16080bca95308a81057af30f7bb7dbb3b9466272115e5ae8c93dfedf47303a2ab4c51d067a422b303"

RPROVIDES:${PN} += "ghc-devel(setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x) \
ghc-setenv-devel \
ghc-setenv-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(unix-2.7.3) \
ghc-setenv"

inherit rpm
