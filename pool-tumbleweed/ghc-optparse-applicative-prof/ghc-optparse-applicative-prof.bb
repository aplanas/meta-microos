SUMMARY = "Haskell optparse-applicative profiling library"
DESCRIPTION = "This package provides the Haskell optparse-applicative profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.17.0.0"

RPM_NAME = "ghc-optparse-applicative-prof-0.17.0.0-2.3.aarch64.rpm"
RPM_HASH = "e4545ea53eec06ca09b4d6f605e338b9ec89ffd04299ef49b51f919d3bb867e544f28db2834a94115e18a58ad9a4b16ec3e02121d8d8f714fc0474a9dd57c0fd"

RPROVIDES:${PN} += "ghc-optparse-applicative-prof \
ghc-optparse-applicative-prof(aarch-64) \
ghc-prof(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB)"
RDEPENDS:${PN} += "ghc-optparse-applicative-devel \
ghc-prof(ansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI) \
ghc-prof(base-4.17.1.0) \
ghc-prof(process-1.6.16.0) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
