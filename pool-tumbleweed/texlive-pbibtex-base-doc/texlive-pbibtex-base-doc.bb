SUMMARY = "Documentation for texlive-pbibtex-base"
DESCRIPTION = "This package includes the documentation for texlive-pbibtex-base"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66085"

RPM_NAME = "texlive-pbibtex-base-doc-2023.201.svn66085-51.1.noarch.rpm"
RPM_HASH = "f791cdfdbb60a991f95d0f6ee1061d8ff5227cc87af6ed41520a3feb7fe4e20d334ec99494fe332bb3f057301d4fbf815a098bbb61ead698d673a307f8d63372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
