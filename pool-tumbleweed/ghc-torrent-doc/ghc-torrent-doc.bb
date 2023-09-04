SUMMARY = "Haskell torrent library documentation"
DESCRIPTION = "This package provides the Haskell torrent library documentation."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-doc-10000.1.3-1.9.noarch.rpm"
RPM_HASH = "03320775073285086fd3deabc7af79bde6d3c13cfe45280b14edb450ca55c96aad311662aa0a10793ec72a8294c6acb2d087f33d9e0a15d62f06cd77cf6ae74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-torrent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
