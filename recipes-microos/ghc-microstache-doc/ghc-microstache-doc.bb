SUMMARY = "Haskell microstache library documentation"
DESCRIPTION = "This package provides the Haskell microstache library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-doc-1.0.2.3-2.3.noarch.rpm"
RPM_HASH = "25e20f40184f247a0ee9b993204ead98209c960caf6f8705a842413ef0a4897e7a8f10fafbeb273bbb787b0a0c49eadea31882af731ec5fd34ce1d6498f8faf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microstache-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
