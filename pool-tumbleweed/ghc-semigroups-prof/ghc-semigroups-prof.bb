SUMMARY = "Haskell semigroups profiling library"
DESCRIPTION = "This package provides the Haskell semigroups profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-prof-0.20-2.3.aarch64.rpm"
RPM_HASH = "e09a2ee6d346b35044c104dadb840abe9e1a908ac512dbde0bcb95340649b6704b8f24d4634144b95ced006cdb83ebaa3df055e5f6d1d5f436318d1ace908970"

RPROVIDES:${PN} += "ghc-prof-semigroups-0.20-6lktLD0mxwZ1Pjuc7q3dSl \
ghc-semigroups-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-semigroups-devel"

inherit rpm
