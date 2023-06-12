SUMMARY = "Haskell witherable library documentation"
DESCRIPTION = "This package provides the Haskell witherable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-doc-0.4.2-4.2.noarch.rpm"
RPM_HASH = "769996040e7944dd78b42d8b0daf25bee6aeccb4d2393d450fc7ffd175821f2b83aa24f0aea7a65213ba977deb18b3e82acfd40117c09e7b5c59657f9a294624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-witherable-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
