SUMMARY = "Documentation for texlive-gobble"
DESCRIPTION = "This package includes the documentation for texlive-gobble"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-gobble-doc-2023.201.0.0.2svn64967-53.2.noarch.rpm"
RPM_HASH = "b676974d2fef442078aa1d447dd0ebb455fc87e3649d04c6a6e1602c315c3c2b29d19b68f460a345f457e2a302ba8cf5deeac4eb2fe8fa78ea0716b88512c38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gobble-doc"

RDEPENDS:${PN} += ""

inherit rpm
