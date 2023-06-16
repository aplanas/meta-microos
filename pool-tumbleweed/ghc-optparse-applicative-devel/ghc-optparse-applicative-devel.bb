SUMMARY = "Haskell optparse-applicative library development files"
DESCRIPTION = "This package provides the Haskell optparse-applicative library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.17.0.0"

RPM_NAME = "ghc-optparse-applicative-devel-0.17.0.0-2.3.aarch64.rpm"
RPM_HASH = "7f0cdd69c33864e4c30b029e3a23674ab8debd0b1db85696a3615124663012e52932d425761dd874cf29cb78f8745917f151351627ad987162d70caa7d36310e"

RPROVIDES:${PN} += "ghc-devel-optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB \
ghc-optparse-applicative-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI \
ghc-devel-base-4.17.1.0 \
ghc-devel-process-1.6.16.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-optparse-applicative"

inherit rpm
