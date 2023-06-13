SUMMARY = "Haskell terminfo library development files"
DESCRIPTION = "This package provides the Haskell terminfo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-devel-0.4.1.5-3.1.aarch64.rpm"
RPM_HASH = "f91bbc95de69cdb009dde6869392807d656eefa83fb3f19e5e30c519fa5fd1cf943c6165ed53bbe48121120ad9485b12acbb6239577c5d74d817bba5f2f62d8d"

RPROVIDES:${PN} += "ghc-devel(terminfo-0.4.1.5) \
ghc-terminfo-devel \
ghc-terminfo-devel(aarch-64) \
ghc-terminfo-static \
ghc-terminfo-static(aarch-64)"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-terminfo(aarch-64) \
ncurses-devel"

inherit rpm
