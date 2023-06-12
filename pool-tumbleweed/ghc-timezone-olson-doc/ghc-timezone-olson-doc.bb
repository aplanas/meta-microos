SUMMARY = "Haskell timezone-olson library documentation"
DESCRIPTION = "This package provides the Haskell timezone-olson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-doc-0.2.1-2.3.noarch.rpm"
RPM_HASH = "83ce75cb76896c1ef3857683c82bd63db93ac6b7387aae9eee56c28fd01ae1f922bc7111c4aa30e950e7f7c13f3439b49cd73f6bd1a783fc837228813b5158d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-olson-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
