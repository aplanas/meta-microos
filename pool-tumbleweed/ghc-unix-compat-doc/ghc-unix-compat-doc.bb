SUMMARY = "Haskell unix-compat library documentation"
DESCRIPTION = "This package provides the Haskell unix-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-doc-0.6-3.8.noarch.rpm"
RPM_HASH = "d8e63a8f54a6375c6f549f0a7e14c6fef0c3af29f116b5b511e0bb6996849f12f1eb91359fc0c7dd44cffe50ceb6cf67a31a57dad629bb4ff56ed682b47ba9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
