SUMMARY = "Haskell typed-process library documentation"
DESCRIPTION = "This package provides the Haskell typed-process library documentation."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-doc-0.2.11.0-1.9.noarch.rpm"
RPM_HASH = "a40ac6aa054380f8a6898fb2e0969b10692fe3f1aaa998adc6d7a48009e3267758b5dfffd1eb4ce1cf7f64dd59d3b1a34010c37b29e0d8a7e8ea9fd7916d09ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typed-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
