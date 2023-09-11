SUMMARY = "Haskell texmath library development files"
DESCRIPTION = "This package provides the Haskell texmath library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8.1"

RPM_NAME = "ghc-texmath-devel-0.12.8.1-1.1.aarch64.rpm"
RPM_HASH = "a4c6855d9f4c995e7401cde55c03fa792a622c39c63cf728bac766db264644cc0132fc612b8585183fc9d4d1e847d441e05910a51049962ebaeec23ac2f2590f"

RPROVIDES:${PN} += "ghc-devel-texmath-0.12.8.1-3LxXxmLvAtyApeIh6UJCwI \
ghc-texmath-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-devel-text-2.0.2 \
ghc-devel-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-devel-xml-1.3.14-JgZFWdUND2BGObIBmJlnFJ \
ghc-texmath"

inherit rpm
