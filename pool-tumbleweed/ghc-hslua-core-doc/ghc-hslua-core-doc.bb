SUMMARY = "Haskell hslua-core library documentation"
DESCRIPTION = "This package provides the Haskell hslua-core library documentation."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-doc-2.3.1-1.6.noarch.rpm"
RPM_HASH = "2a9dba9b40ef5b9da93013bd7e6a8f72ceb824d5f3ad1c27dd6b24c35cee8ce11af9260efe41eb046a97361b1ddc6936fca1337175b4f9652cf24be743d7d270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
