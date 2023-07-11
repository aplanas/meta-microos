SUMMARY = "Haskell alsa-core library documentation"
DESCRIPTION = "This package provides the Haskell alsa-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-doc-0.5.0.1-4.3.noarch.rpm"
RPM_HASH = "180143e6dc4a28101ee5cf20e522f11ced457c7adee0849267ee0e2ed92699a7701829dfee371decb89b0174debddb34fec4480cd4e32641e20734ccef12607f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
