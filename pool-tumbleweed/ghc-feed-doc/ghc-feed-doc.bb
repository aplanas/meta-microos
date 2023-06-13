SUMMARY = "Haskell feed library documentation"
DESCRIPTION = "This package provides the Haskell feed library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-doc-1.3.2.1-2.4.noarch.rpm"
RPM_HASH = "2b99815fd8061b2236635c2121f71a48a410fd5eacd05b83ad3dfdccb81a27bb837418ef5ed742b2e83513390f4181778e6540f2fb7b827a6565031a01909dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-feed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
