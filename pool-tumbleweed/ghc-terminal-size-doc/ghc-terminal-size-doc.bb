SUMMARY = "Haskell terminal-size library documentation"
DESCRIPTION = "This package provides the Haskell terminal-size library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-doc-0.3.4-1.4.noarch.rpm"
RPM_HASH = "79f0826b343f227ba1535c87d6feffc505fc1144c7d8ffc37a3a3521666ff2ad6b82bf244d2c4a77dde96cff7efbd1865c2eb07753f6d68b8a6c0cff47291065"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminal-size-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
