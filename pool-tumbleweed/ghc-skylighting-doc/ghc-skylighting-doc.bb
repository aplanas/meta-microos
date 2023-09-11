SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-doc-0.13.4.1-1.6.noarch.rpm"
RPM_HASH = "95ea38be700e5fc2d7fef8f97b994e0a189730bebd7adc440578224195723ac235620731d3a4772bea319e596ccc98c7c8011216a3dfcc70cdfc55b5332efa1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
