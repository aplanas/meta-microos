SUMMARY = "Haskell bytestring library documentation"
DESCRIPTION = "This package provides the Haskell bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-doc-0.11.4.0-3.2.noarch.rpm"
RPM_HASH = "7f4b73c31b677ed99121820c3b1856cc2ef215ebce221c9224a8c97a57b1a264a0b0acf4837ba35fe081d3d9ad52482de12570fcf1258f66cadc9d4ba6c4fa48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
