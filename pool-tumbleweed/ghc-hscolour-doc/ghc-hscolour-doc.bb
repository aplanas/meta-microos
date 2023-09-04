SUMMARY = "Haskell hscolour library documentation"
DESCRIPTION = "This package provides the Haskell hscolour library documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-doc-1.24.4-4.8.noarch.rpm"
RPM_HASH = "8fd445ce066ac0746e157bb42eba884fd7d3b446f56120bcb266b764b0e8c49f4706f2eab9c5d6fe489b9f953708b776164b23f76c7036d459ef5a9a015c1d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hscolour-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
