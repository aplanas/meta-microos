SUMMARY = "Haskell microlens-platform library documentation"
DESCRIPTION = "This package provides the Haskell microlens-platform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-doc-0.4.3.3-2.3.noarch.rpm"
RPM_HASH = "c86cae20809ddc2cf7faeebab34c7e0cc536b23bf16ceb79c4fe4528d957df3f33bf2cf6d627017df810e3c72ba8950ad54dd7f572e7617fa2debbec997cd73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-platform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
