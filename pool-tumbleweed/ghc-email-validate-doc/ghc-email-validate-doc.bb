SUMMARY = "Haskell email-validate library documentation"
DESCRIPTION = "This package provides the Haskell email-validate library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.19"

RPM_NAME = "ghc-email-validate-doc-2.3.2.19-1.3.noarch.rpm"
RPM_HASH = "ba6aab4764194cc45e8cd37b0fef559d43d7463f91a2c438cf397a01c68e66813cb4d3937de5389317ca535cb93f98667f215b5fdad4eea4d354f204fef93880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-email-validate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
