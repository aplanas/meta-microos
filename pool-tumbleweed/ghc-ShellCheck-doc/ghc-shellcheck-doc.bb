SUMMARY = "Haskell ShellCheck library documentation"
DESCRIPTION = "This package provides the Haskell ShellCheck library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-doc-0.9.0-2.11.noarch.rpm"
RPM_HASH = "4e55c72dd1b86420f20d9e3da40d3b293e137b67941063306984f1db73e502a678b7f36b878a7d6938727b913bf7e2ec44363f8abd57577def1ff3b9f18e06ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ShellCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
