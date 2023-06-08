SUMMARY = "Haskell QuickCheck library development files"
DESCRIPTION = "This package provides the Haskell QuickCheck library development files."
LICENSE = "BSD-3-Clause"

PV = "2.14.2"

RPM_NAME = "ghc-QuickCheck-devel-2.14.2-3.3.aarch64.rpm"
RPM_HASH = "a7ca517ee83f8e2866515144b6ab82d7bc677de854fd82faa973387b5035f8a2d1daaae55e0c82e10e28f60e45ab46140cce5f951d82f3f1b0dee232ffa7b6ff"

RPROVIDES:${PN} += "ghc-QuickCheck-devel ghc-QuickCheck-devel(aarch-64) ghc-devel(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6)"
RDEPENDS:${PN} += "/bin/sh ghc-QuickCheck ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) ghc-devel(splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe) ghc-devel(template-haskell-2.19.0.0) ghc-devel(transformers-0.5.6.2)"

inherit rpm
