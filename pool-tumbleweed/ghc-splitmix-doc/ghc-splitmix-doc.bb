SUMMARY = "Haskell splitmix library documentation"
DESCRIPTION = "This package provides the Haskell splitmix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-doc-0.1.0.4-4.8.noarch.rpm"
RPM_HASH = "80905de34ba6d961074f0af041b2735512a00499193cd4bfe719c0509dacc233f45b491db3d005200fbe715ac73810a473385be4e9c08e4525bd105790271b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-splitmix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
