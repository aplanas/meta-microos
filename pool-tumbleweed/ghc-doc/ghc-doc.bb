SUMMARY = "Haskell library documentation meta package"
DESCRIPTION = "Installing this package causes ghc-*-doc packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "531b7420df866fe9adfd54e7d3a802b6af20329222374fd13236fa9686dd7a122ace713ae2cb5e43128681bcb9a3ab3273f53291989f074af28c82ff78ff27e8"

RPROVIDES:${PN} += "ghc-doc \
ghc-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
