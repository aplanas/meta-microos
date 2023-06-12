SUMMARY = "Haskell network-uri library documentation"
DESCRIPTION = "This package provides the Haskell network-uri library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-doc-2.6.4.2-2.3.noarch.rpm"
RPM_HASH = "6af0fe272d2a89d83541fccbb16234c9502698ae4d30e46e845f65ee78b782c08581ee284ba8f37b8760f18ce599aa02bf966d1181b4acf547ad7559c3705df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-uri-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
