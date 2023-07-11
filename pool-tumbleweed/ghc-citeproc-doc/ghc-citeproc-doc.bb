SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-doc-0.8.1-2.7.noarch.rpm"
RPM_HASH = "6a36bef815825ccdd6dc54c918d19686b42129b8fcd621181f085f74aece5d2e393b6d1cc601bf5b3770ba46c60cffd0d0ef3e9551613713e06a76190ed501f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
