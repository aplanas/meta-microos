SUMMARY = "Binary files of latex-bin-dev"
DESCRIPTION = "Binary files of latex-bin-dev"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn53999"

RPM_NAME = "texlive-latex-bin-dev-bin-2023.20230311.svn53999-93.1.aarch64.rpm"
RPM_HASH = "b8b0f06e38a6bc6ac63efd1c20492194014ee6a4303aaabc815c27f8b0bcf6e53a7b66ec9b10d6c8cf3fb2bffe6769aae14d656c42a2f57dd36035bda0c09fa9"

RPROVIDES:${PN} += "texlive-latex-bin-dev-bin"

RDEPENDS:${PN} += "texlive-latex-bin-dev"

inherit rpm
