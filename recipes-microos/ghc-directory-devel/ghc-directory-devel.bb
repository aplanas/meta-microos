SUMMARY = "Haskell directory library development files"
DESCRIPTION = "This package provides the Haskell directory library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-devel-1.3.7.1-1.1.aarch64.rpm"
RPM_HASH = "ac00b1d732f4df119ceb97bfc60c7947fa554b5e93e6863c5a5884b2018a87d560672802d1632af8e7e94ec26059818efcd31dd033b5dd1227ca01622dee8b85"

RPROVIDES:${PN} += "ghc-devel(directory-1.3.7.1) ghc-directory-devel ghc-directory-devel(aarch-64) ghc-directory-static ghc-directory-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(filepath-1.4.2.2) ghc-devel(time-1.12.2) ghc-devel(unix-2.7.3) ghc-directory(aarch-64)"

inherit rpm
