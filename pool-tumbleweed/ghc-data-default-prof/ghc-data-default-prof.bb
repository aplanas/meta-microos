SUMMARY = "Haskell data-default profiling library"
DESCRIPTION = "This package provides the Haskell data-default profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-prof-0.7.1.1-10.2.aarch64.rpm"
RPM_HASH = "ef78b40240e439897728b5080114d5ae510206d17b7aa1ce88d1d05ad026dda80ae114ee1a83d58b3729171e3033c54ec045041d17eddabab49da99bd04c0e7f"

RPROVIDES:${PN} += "ghc-data-default-prof \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy"

RDEPENDS:${PN} += "ghc-data-default-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-data-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz \
ghc-prof-data-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf \
ghc-prof-data-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo"

inherit rpm
