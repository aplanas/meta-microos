SUMMARY = "Haskell DAV library documentation"
DESCRIPTION = "This package provides the Haskell DAV library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-doc-1.3.4-4.4.noarch.rpm"
RPM_HASH = "ac3360523b09d98705b42f0755eee71e8ffca2457570cfcc455fe14e91987424aa9e7381765a32d7f4d0746912b30f46e4aa5caaddef1e624b996f15704a0d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-DAV-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
