SUMMARY = "Haskell syb library development files"
DESCRIPTION = "This package provides the Haskell syb library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.4"

RPM_NAME = "ghc-syb-devel-0.7.2.4-1.3.aarch64.rpm"
RPM_HASH = "e60f9733fed526941f970295ccfd1835875d4f4767401091998e0d8fdfdb9818d130b1cc1e905597970f878744fb451643b79670c672ad00368c202920fd14de"

RPROVIDES:${PN} += "ghc-devel-syb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE \
ghc-syb-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-syb"

inherit rpm
