SUMMARY = "Haskell resolv library documentation"
DESCRIPTION = "This package provides the Haskell resolv library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-doc-0.1.2.0-10.3.noarch.rpm"
RPM_HASH = "3b8b8a8a3952974bfc19774dd97c9493990f783548f3cdc9b03324fca5469b2dc6c340232c060b20305744732eb76e74936935bb5505a80a1b0d5bbae836cec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resolv-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
