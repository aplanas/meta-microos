SUMMARY = "Haskell fgl library development files"
DESCRIPTION = "This package provides the Haskell fgl library development files."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-devel-5.8.0.0-2.3.aarch64.rpm"
RPM_HASH = "96002bfbb0d0057fc61523045213af8a2fd771b6ec838062932f3d5e201bcb08d2e8a46244d02be0e4d9c84cc3584522d2de5b4338a4f9acdb286c994471add7"

RPROVIDES:${PN} += "ghc-devel(fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn) \
ghc-fgl-devel \
ghc-fgl-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(transformers-0.5.6.2) \
ghc-fgl"

inherit rpm
