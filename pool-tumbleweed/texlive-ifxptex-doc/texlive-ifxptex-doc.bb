SUMMARY = "Documentation for texlive-ifxptex"
DESCRIPTION = "This package includes the documentation for texlive-ifxptex"
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-doc-2023.209.0.0.2svn46153-54.1.noarch.rpm"
RPM_HASH = "8e40289f56e2b084d30012bbadc57c2705bb2fa2e735cb362ebca7087594ad5468d4b9453975c0a13cdcb58f2f1b75fe33147d2596abe6b94780a77eba0d4005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifxptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
