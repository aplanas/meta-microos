SUMMARY = "Haskell alsa-core library documentation"
DESCRIPTION = "This package provides the Haskell alsa-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-doc-0.5.0.1-4.2.noarch.rpm"
RPM_HASH = "c60458a95397676280d01035e7789a1544a8355c059778ead5defd19977f9dcaab8c2fca49acf5016a802c0717f448379fc26bd55d6579f56428b49f650f925e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
