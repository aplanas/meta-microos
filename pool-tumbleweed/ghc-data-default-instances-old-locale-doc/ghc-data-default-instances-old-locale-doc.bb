SUMMARY = "Haskell data-default-instances-old-locale library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-doc-0.0.1-11.3.noarch.rpm"
RPM_HASH = "aa5659827e02201a787bfcf7ed5f553b4f54f531ce1c4a829508fd8278440e7f7adbed48c5fe416fefde2824516d7806cd828a49414a6f28c9eb1b7216c66f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
