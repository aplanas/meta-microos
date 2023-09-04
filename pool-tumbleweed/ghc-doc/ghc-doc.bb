SUMMARY = "Haskell library documentation meta package"
DESCRIPTION = "Installing this package causes ghc-*-doc packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-doc-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "5ef0b6988f89e78ccd183dcc19f78a0cdb76fcebdb54a14e79ea5bcdf1776ac42b62c0b950760cb50fc2ef198c01c566c0225206f5bbe14ba9c8c284ef18dd7b"

RPROVIDES:${PN} += "ghc-doc"

RDEPENDS:${PN} += ""

inherit rpm
