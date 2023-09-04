SUMMARY = "Binary files of latexdiff"
DESCRIPTION = "Binary files of latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16420"

RPM_NAME = "texlive-latexdiff-bin-2023.20230311.svn16420-93.2.aarch64.rpm"
RPM_HASH = "ed65f0f39e2be7afea7da4a7cb8b0a26e7b437dfe45f62c78c4423bf0545b69fae040c2bbf005468e16998548ca46a0feb53ec1d51a2793e58314e5d7e364cf6"

RPROVIDES:${PN} += "texlive-latexdiff-bin"

RDEPENDS:${PN} += "texlive-latexdiff"

inherit rpm
