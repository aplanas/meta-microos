SUMMARY = "GHC manual"
DESCRIPTION = "This package provides the User Guide and Haddock manual."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-manual-9.4.5-3.2.noarch.rpm"
RPM_HASH = "1ce26a266f49b5993b6be417646e842df64f4baf8123155bb7b6e5ba1d18a47110db5d1bb082f410763aa16808498d757611a53f647dcfee2f42fd3e89e10dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-manual"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
