SUMMARY = "Haskell kan-extensions library documentation"
DESCRIPTION = "This package provides the Haskell kan-extensions library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.2.5"

RPM_NAME = "ghc-kan-extensions-doc-5.2.5-2.3.noarch.rpm"
RPM_HASH = "d9ea41c2f8587f7d932215cee3936949e75abc71118dee6bb79e1605ec4edf0487ce9471aaa701aaec3497c05b8bb8feab21a80eca84a11084daa5d99b007375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-kan-extensions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
