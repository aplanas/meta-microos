SUMMARY = "Haskell unix-time library documentation"
DESCRIPTION = "This package provides the Haskell unix-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-doc-0.4.9-1.6.noarch.rpm"
RPM_HASH = "7dd83a6d98482ce7e09f7f643d3221b576e0d2da51de77d3dad0328e15cef0ab728b37768f4b53d5618f6e70166d94dbba5ee4799662cfc0ef14b279bb1bf9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
