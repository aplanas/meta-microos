SUMMARY = "Haskell primes library documentation"
DESCRIPTION = "This package provides the Haskell primes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-doc-0.2.1.0-1.3.noarch.rpm"
RPM_HASH = "daa54f2246d196419b962bf78583547cda5609c5b4441c9e634ee4cb156d91e1c98cfa1c12edf99346b523c142d61c6c40ba2bf5e99c391eea33d61e9b539ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
