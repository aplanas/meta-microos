SUMMARY = "Haskell directory library development files"
DESCRIPTION = "This package provides the Haskell directory library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-devel-1.3.7.1-3.1.aarch64.rpm"
RPM_HASH = "5461094e803607ba42380a7623f286d45ddeeb5a5feb4ef1339989af54e542c88acd7ebf510d49dd5cb2bbb3168f6a7180bbe6362fb2381b13ac9d04522d44bc"

RPROVIDES:${PN} += "ghc-devel-directory-1.3.7.1 \
ghc-directory-devel \
ghc-directory-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-directory"

inherit rpm
