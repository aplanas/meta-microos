SUMMARY = "Haskell bytestring library documentation"
DESCRIPTION = "This package provides the Haskell bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-doc-0.11.4.0-3.1.noarch.rpm"
RPM_HASH = "e9d8f4e1df29c168eba8180c94e8c909f45742e07beaa62fae808a3d4e61f24c822f1603b44d55fc650ab584749459acda5ce7b55a36befaccf1eb3a8b0a422d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bytestring-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
