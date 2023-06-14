SUMMARY = "Haskell void library development files"
DESCRIPTION = "This package provides the Haskell void library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-devel-0.7.3-6.2.aarch64.rpm"
RPM_HASH = "708c53a8a80713e9a4e72391eb1befaee136dbae9280001fdf5f7a06b84d5cbd4f6a20b87db064c0ea82e9b0899c29f345b80334527a6413a6729f83e075eebe"

RPROVIDES:${PN} += "ghc-devel-void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz \
ghc-void-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-void"

inherit rpm
