SUMMARY = "Haskell math-functions library documentation"
DESCRIPTION = "This package provides the Haskell math-functions library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.4.2"

RPM_NAME = "ghc-math-functions-doc-0.3.4.2-2.8.noarch.rpm"
RPM_HASH = "358eb855d0b5c2890554cb584846e5b1a14ff28ca9977f8b649884c57999305ecd7ae4a3655b2f76b04ff8e3d94cd212f699b9017f47145df21bf1cd6a5c5f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-math-functions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
