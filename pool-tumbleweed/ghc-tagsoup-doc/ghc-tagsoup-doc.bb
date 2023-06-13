SUMMARY = "Haskell tagsoup library documentation"
DESCRIPTION = "This package provides the Haskell tagsoup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-doc-0.14.8-6.3.noarch.rpm"
RPM_HASH = "aea97cb5c31deb42f479f304d4bcb697acc29d4c3b0189521c667ecc16aeeb8f07a94dcfd2921e8a5e2076cd009ddd6aec9f4a7023237b6716ba7ff8c99d7c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagsoup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
