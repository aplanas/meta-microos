SUMMARY = "Haskell X11 profiling library"
DESCRIPTION = "This package provides the Haskell X11 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-prof-1.10.3-2.6.aarch64.rpm"
RPM_HASH = "51a4ea4f19ed0730789a20fad56d9171c21d945ee65ebc06adb0f7c933b5806bd6b437d45ec2a46512de7240c875daba92bb5062d9bad4d90b010a28e0526cfe"

RPROVIDES:${PN} += "ghc-X11-prof \
ghc-prof-X11-1.10.3-5dCbs7YG84pBbMQ87MYXiX"

RDEPENDS:${PN} += "ghc-X11-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ"

inherit rpm
