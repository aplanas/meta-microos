SUMMARY = "Haskell fsnotify library documentation"
DESCRIPTION = "This package provides the Haskell fsnotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-doc-0.4.1.0-2.3.noarch.rpm"
RPM_HASH = "3f0eb3144fb2c7158eb3dcf16014b58f6018bb586cb2248fa07b51b4416332f218bd5a29386248bb778194e97e5e6666ba05250908dd779eca3df02686b6ae09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fsnotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
