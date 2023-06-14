SUMMARY = "Haskell splitmix library development files"
DESCRIPTION = "This package provides the Haskell splitmix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-devel-0.1.0.4-4.3.aarch64.rpm"
RPM_HASH = "e5fb3a9ccd84e82040094a69505f11074b03ceaf331de437038a8382e927ce4948f4dcdbeefdd93967e065bd7f7ab6db98fbd383bfbe08ddc9280526a993ea4b"

RPROVIDES:${PN} += "ghc-devel-splitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe \
ghc-splitmix-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-splitmix"

inherit rpm
