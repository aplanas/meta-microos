SUMMARY = "Haskell old-locale library documentation"
DESCRIPTION = "This package provides the Haskell old-locale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-doc-1.0.0.7-13.2.noarch.rpm"
RPM_HASH = "6f940258f64e5d4d8741bf7fc30626a9fcf99908732091b6d9fb735c5978f52b01c642be4667c7c110df3bd0e038539d0a152a80c11e3d8ff231368dac618ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-locale-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
