SUMMARY = "Haskell exceptions library documentation"
DESCRIPTION = "This package provides the Haskell exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-doc-0.10.5-1.1.noarch.rpm"
RPM_HASH = "e39f183ddb5c8249a72d67c2bea827998db7f08463b2c294f0f4d6f4b824fcbffc17bb184fee0a2297bb9b275cf28c922f6bba3d3fcf5a15af90ca7b5dc0f00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
