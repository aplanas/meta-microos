SUMMARY = "Haskell lifted-base library documentation"
DESCRIPTION = "This package provides the Haskell lifted-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-doc-0.2.3.12-8.8.noarch.rpm"
RPM_HASH = "d6e6c8237b9bdce30203a1aa8c3adea18051af72e5c8761c54b2095dfa26f8df71008b750cd71af2ec19c7f9aedf9dfd350cb39e0fc702c0f315dd82a5e9eef7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lifted-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
