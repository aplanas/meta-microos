SUMMARY = "Haskell Diff library development files"
DESCRIPTION = "This package provides the Haskell Diff library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-devel-0.4.1-2.3.aarch64.rpm"
RPM_HASH = "6e721a3f7a0521c489249533eb865959a61de788f84df0710e96df55ff44313f6eaafe39ea6df8322cf219c8afb3ebb4278a3a996eb731572d91d477c2acc1e4"

RPROVIDES:${PN} += "ghc-Diff-devel \
ghc-Diff-devel(aarch-64) \
ghc-devel(Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP)"

RDEPENDS:${PN} += "/bin/sh \
ghc-Diff \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(pretty-1.1.3.6)"

inherit rpm
