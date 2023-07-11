SUMMARY = "Haskell entropy library documentation"
DESCRIPTION = "This package provides the Haskell entropy library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-doc-0.4.1.10-3.3.noarch.rpm"
RPM_HASH = "077a1d3b647e2669ea70838e6fd8b6c24200c495397ceb1a50dac3eba7f686e2aec7b0f2dfb3a4147563d0f2163e0cfc5395f8a57f0e3650fea99233203ac1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-entropy-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
