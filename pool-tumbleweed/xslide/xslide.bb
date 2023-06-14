SUMMARY = "XSL Integrated Development Environment"
DESCRIPTION = "An Emacs mode to edit XSL files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.2"

RPM_NAME = "xslide-0.2.2-264.10.noarch.rpm"
RPM_HASH = "3d23b0aeeba89982cd2087ac29be9960e56caa7229fb3a60fc611c997319d39c2cbb68ea3ede82624e181a6cdf7b39c7cb9f924dec20094169c71fe1d4a4473d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xslide"

RDEPENDS:${PN} += "emacs-program \
psgml"

inherit rpm
