SUMMARY = "Haskell unordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell unordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-doc-0.2.19.1-3.6.noarch.rpm"
RPM_HASH = "a308b6a334c6ddd76cb00067ef863da46f6bb2709f67e05e86c3fcfeb319c737642ad76823d0151414009982acb1b91bdb487f20d92ae569129ea1f00f7293a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
