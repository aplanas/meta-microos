SUMMARY = "Binary files of light-latex-make"
DESCRIPTION = "Binary files of light-latex-make"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56352"

RPM_NAME = "texlive-light-latex-make-bin-2023.20230311.svn56352-93.1.aarch64.rpm"
RPM_HASH = "9db8bf9d1f6fba8675f7d408c5fc407d52059c14880d3fd06d70caf5a401e5a2fe03f14cf26b890c3ff398d621487068a9ed9a7eafea66f1e3fd9ed553d265bb"

RPROVIDES:${PN} += "texlive-light-latex-make-bin"

RDEPENDS:${PN} += "texlive-light-latex-make"

inherit rpm
