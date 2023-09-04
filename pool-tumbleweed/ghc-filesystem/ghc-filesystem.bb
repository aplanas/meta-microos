SUMMARY = "Shared directories for Haskell documentation"
DESCRIPTION = "This package provides some common directories used for \
Haskell libraries documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-filesystem-9.4.6-1.1.noarch.rpm"
RPM_HASH = "606decc4ec42516cd3033261c24eb9adeeccd2a62f6c9649bc7bfde1f5e32c4483985dccbf7c90198eea5d5cb0efb3e931987eaf8ab216b91466fccd3d62c52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filesystem"

RDEPENDS:${PN} += ""

inherit rpm
