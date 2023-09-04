SUMMARY = "Haskell xss-sanitize library documentation"
DESCRIPTION = "This package provides the Haskell xss-sanitize library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.7.2"

RPM_NAME = "ghc-xss-sanitize-doc-0.3.7.2-1.9.noarch.rpm"
RPM_HASH = "6adea157ccaa991cd6e77e301f01b510f889cb4b906e6c8b70294722563416479faaf628bdde86b3310ced21748c72ae8a845a1d98133bb54cfdef6a5531f1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xss-sanitize-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
