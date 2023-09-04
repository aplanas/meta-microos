SUMMARY = "Haskell split library development files"
DESCRIPTION = "This package provides the Haskell split library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.5"

RPM_NAME = "ghc-split-devel-0.2.3.5-2.3.aarch64.rpm"
RPM_HASH = "55344b92d2bbff475666f37033c75b011dddf75aef66f6fcc56e20aa2e16e019de179bc2bdca16a4bc2072fcc77adf5884add494eafc044600957d079c442c15"

RPROVIDES:${PN} += "ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-split-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-split"

inherit rpm
