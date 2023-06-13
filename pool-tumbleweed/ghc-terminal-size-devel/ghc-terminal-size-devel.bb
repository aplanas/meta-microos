SUMMARY = "Haskell terminal-size library development files"
DESCRIPTION = "This package provides the Haskell terminal-size library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-devel-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "3b754fc728336159a5793bb5752879e3f77968cef203d28fc6290e3383dd09ac53adea0955fa9b696df8cd03a7351c383e338eb85efa9f4bc9b0e30bc2053693"

RPROVIDES:${PN} += "ghc-devel(terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd) \
ghc-terminal-size-devel \
ghc-terminal-size-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-terminal-size"

inherit rpm
