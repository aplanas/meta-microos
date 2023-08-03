SUMMARY = "Documentation for texlive-pst-gantt"
DESCRIPTION = "This package includes the documentation for texlive-pst-gantt"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22asvn35832"

RPM_NAME = "texlive-pst-gantt-doc-2023.209.0.0.22asvn35832-53.1.noarch.rpm"
RPM_HASH = "19b96438bd1af2699c8c36dd50d1c71b0916071a7aba5ab5de3593d3e8787bcaa3b9305eb00835095d8d13f7697a779b802056cd2a03100f30c367f3550301fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gantt-doc"

RDEPENDS:${PN} += ""

inherit rpm
