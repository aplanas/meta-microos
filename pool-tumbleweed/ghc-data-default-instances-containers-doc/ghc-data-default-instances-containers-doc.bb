SUMMARY = "Haskell data-default-instances-containers library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-doc-0.0.1-11.3.noarch.rpm"
RPM_HASH = "a462368482c5ce2742ffaa37bf301491ec214d128073a7e7a003a2420ba04d743276e688f45b32bf6da532f3ca32516204eeb2f94a85ffbab1b99341dcbb22fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
