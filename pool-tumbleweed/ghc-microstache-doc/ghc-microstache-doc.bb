SUMMARY = "Haskell microstache library documentation"
DESCRIPTION = "This package provides the Haskell microstache library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-doc-1.0.2.3-3.2.noarch.rpm"
RPM_HASH = "b714c42a2b0cadddb2b915c06c3bd7592ec4d2c46313be0c23dadffa24c972034260b5094cd8c625343ed981a70c351d4fe998da304f76730a152cea3f36012b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microstache-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
