SUMMARY = "Documentation for texlive-overlays"
DESCRIPTION = "This package includes the documentation for texlive-overlays"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn57866"

RPM_NAME = "texlive-overlays-doc-2023.209.2.12svn57866-52.1.noarch.rpm"
RPM_HASH = "56d1f6d0d4d1cc2b3c679fddcba5c252de6567ad22d091d92857951c03a7ee5c2831b0540a1fa2a2a32ceed27598df00bbf196f9712ea81a6c728718b93dbb9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-overlays-doc"

RDEPENDS:${PN} += ""

inherit rpm
