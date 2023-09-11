SUMMARY = "Haskell feed library documentation"
DESCRIPTION = "This package provides the Haskell feed library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-feed-doc-1.3.2.1-4.4.noarch.rpm"
RPM_HASH = "c15e837ed95e675c3cc73a32ec61b343402a1b3a2231b5ca04d857d6e36c705ce6bd04bd0b9e1760ae00b81e0044ab00e261b5913c18fbe3d31be1078727da64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-feed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
