SUMMARY = "Haskell network-multicast library documentation"
DESCRIPTION = "This package provides the Haskell network-multicast library documentation."
LICENSE = "CC0-1.0"

PV = "0.3.2"

RPM_NAME = "ghc-network-multicast-doc-0.3.2-4.3.noarch.rpm"
RPM_HASH = "859ab750310fe46e08b172443d75c5605100e63efe678f7b7e43a97b703fb1fb9ce2d6790c343fd160c7c122fda5093c26d5b9e60568cff064b610b55d1aadea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-multicast-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
