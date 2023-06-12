SUMMARY = "Haskell data-default-class library development files"
DESCRIPTION = "This package provides the Haskell data-default-class library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-data-default-class-devel-0.1.2.0-10.2.aarch64.rpm"
RPM_HASH = "ab50827a8b48aafcf6946f2288e12c57db5d62e180f9216d13f03ac19b749e7066235b3b4001945ae62558775f187a254eefe4c010509cdf50752233164bfc18"

RPROVIDES:${PN} += "ghc-data-default-class-devel \
ghc-data-default-class-devel(aarch-64) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-data-default-class \
ghc-devel(base-4.17.1.0)"

inherit rpm
