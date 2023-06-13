SUMMARY = "Haskell ShellCheck library documentation"
DESCRIPTION = "This package provides the Haskell ShellCheck library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-doc-0.9.0-2.3.noarch.rpm"
RPM_HASH = "944ac6d341f2d6e807368718d5a7ac7b56249c6cf0e42fc06f37c9e081f4d9e0afe966781d6d5f69102aa901cb1d5ded5545b46db07b889a0239bae5fe1b5a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ShellCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
