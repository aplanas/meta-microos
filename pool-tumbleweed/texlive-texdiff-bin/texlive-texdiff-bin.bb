SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15506"

RPM_NAME = "texlive-texdiff-bin-2023.20230311.svn15506-91.1.aarch64.rpm"
RPM_HASH = "324f5b5540dfda4d13f5e164bc5fdc30086904a13e3bb059316801801bd6c7c8307c1b4b42c2b855ea77d9a9a48a7218d6ff8c77f625609089d1e3ca4c7e7d69"

RPROVIDES:${PN} += "texlive-texdiff-bin \
texlive-texdiff-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
