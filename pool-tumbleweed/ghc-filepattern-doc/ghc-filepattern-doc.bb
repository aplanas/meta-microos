SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.9.noarch.rpm"
RPM_HASH = "2604087c3524becd0de687cbe57ba517b513f228ab6cd47df563604182dd0242a687f8d4b333e2464c6abe446023862c2193a2fb489d64ff463ec7937f8991d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
