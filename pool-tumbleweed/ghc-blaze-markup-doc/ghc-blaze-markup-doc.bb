SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-doc-0.8.2.8-5.3.noarch.rpm"
RPM_HASH = "79d72453849d3fc0f19c4f3e861cb79487b287500cf2ecc9706162f645d0ffcfd859ff01cd75404fdb21d99f5a7ea2b8a97d400af3c0b043b4e282547ecdb101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
