SUMMARY = "Documentation for texlive-decimal"
DESCRIPTION = "This package includes the documentation for texlive-decimal"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23374"

RPM_NAME = "texlive-decimal-doc-2023.209.svn23374-53.1.noarch.rpm"
RPM_HASH = "402c83fa081f53cfeeb8798b30f656c0f306b586e942851b39080cc4bb0c91c202a10dc13c69aa83377c96e1cd8439352b010fbcf89602eb6bfc3bc5dd2732c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-decimal-doc"

RDEPENDS:${PN} += ""

inherit rpm
