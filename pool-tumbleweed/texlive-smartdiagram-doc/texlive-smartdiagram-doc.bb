SUMMARY = "Documentation for texlive-smartdiagram"
DESCRIPTION = "This package includes the documentation for texlive-smartdiagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn42781"

RPM_NAME = "texlive-smartdiagram-doc-2023.209.0.0.3bsvn42781-58.1.noarch.rpm"
RPM_HASH = "b0f67e06a990096b22fdeb6fd266108e43a45ba7ad9538d07d6ef1b2823cbbe524ca48e7625d24cb3b4eee615e8d521242581b4c4e60c3e19c69931b3af50c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartdiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
