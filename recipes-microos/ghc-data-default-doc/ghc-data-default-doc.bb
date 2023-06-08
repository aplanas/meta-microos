SUMMARY = "Haskell data-default library documentation"
DESCRIPTION = "This package provides the Haskell data-default library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-doc-0.7.1.1-10.2.noarch.rpm"
RPM_HASH = "cc6efe073b48d49519ee086a82d5bfa105935bdaedaa98d473e4b80831c1942c3ca416f06567403aafd6de9667eae9f2fac17b2084d62c561e541a0f60dae8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
