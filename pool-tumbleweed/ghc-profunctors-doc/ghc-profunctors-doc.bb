SUMMARY = "Haskell profunctors library documentation"
DESCRIPTION = "This package provides the Haskell profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.6.2"

RPM_NAME = "ghc-profunctors-doc-5.6.2-4.9.noarch.rpm"
RPM_HASH = "ab55d3e82383bdfc5b5382d4ba87f6c8fd1fbdc431658fdecffc089ef65c27eeadd9358128c4c72ff435e8043091d6f24add6a5fe5a5852f3f190186fd6fa1aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
