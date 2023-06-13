SUMMARY = "Haskell ansi-wl-pprint library documentation"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-doc-0.6.9-10.2.noarch.rpm"
RPM_HASH = "d2cbba4475e1d2aad78ecfc947258a6e176b328486cae7aa3d274996066d712fee727bc28ebd93ac0a17ecadcd5874b1845bb046b83fff2ceead71f77b070c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
