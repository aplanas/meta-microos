SUMMARY = "Haskell tar library documentation"
DESCRIPTION = "This package provides the Haskell tar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-doc-0.5.1.1-11.8.noarch.rpm"
RPM_HASH = "ef15536d39e072556ed3878abf756da9ae20423da552bcd3a91ab4a681adaf8aeb658b63045ac10a9bfe9f0795d2cdb88d0b017a5bd22da01a8912c3e4362b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
