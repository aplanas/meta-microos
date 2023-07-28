SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.9.aarch64.rpm"
RPM_HASH = "29d4373db0196cefcfff348fc9eead3c33dee6ce52445670d9ae0a341e44e7d73c5d4563ed507deea9e501467e1833c9b71280dd18bbcd4f59aedddeec186b7d"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-prof-filepattern-0.1.3-3YAZmlhLkyq9JKYM4OPVoZ"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc \
ghc-prof-filepath-1.4.2.2"

inherit rpm
