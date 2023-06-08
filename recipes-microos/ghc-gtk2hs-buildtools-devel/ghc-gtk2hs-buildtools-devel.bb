SUMMARY = "Haskell gtk2hs-buildtools library development files"
DESCRIPTION = "This package provides the Haskell gtk2hs-buildtools library development files."
LICENSE = "GPL-2.0-only"

PV = "0.13.8.3"

RPM_NAME = "ghc-gtk2hs-buildtools-devel-0.13.8.3-2.3.aarch64.rpm"
RPM_HASH = "8200514512c172c9a7a3341816c29eb52d76447ce6198f3fecd20e8a70eb79ad87186574539f951e02ccd084fa165b4610f26b6031d30ab481b26b7e0776051b"

RPROVIDES:${PN} += "ghc-devel(gtk2hs-buildtools-0.13.8.3-1HEgD6xsgMLLqS6Eg0gkhE) ghc-gtk2hs-buildtools-devel ghc-gtk2hs-buildtools-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(Cabal-3.8.1.0) ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p) ghc-devel(pretty-1.1.3.6) ghc-devel(process-1.6.16.0) ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-gtk2hs-buildtools gtk2hs-buildtools"

inherit rpm
