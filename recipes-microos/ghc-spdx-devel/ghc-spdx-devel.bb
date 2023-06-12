SUMMARY = "Haskell spdx library development files"
DESCRIPTION = "This package provides the Haskell spdx library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-devel-1.0.0.3-1.2.aarch64.rpm"
RPM_HASH = "83ad0f7e8f21332c3f90e796075d7fe37ac4c65ae983cb94dc9f61f89579bb91351fbbe5501f88ca1abb668bd2b397fd80110bfe4462ba725d5059df64de05aa"

RPROVIDES:${PN} += "ghc-devel(spdx-1.0.0.3-JwdNfzEpnM57Bwmw6OiiTp) \
ghc-spdx-devel \
ghc-spdx-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(Cabal-3.8.1.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(transformers-0.5.6.2) \
ghc-spdx"

inherit rpm
