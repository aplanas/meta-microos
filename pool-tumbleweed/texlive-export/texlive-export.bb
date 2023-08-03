SUMMARY = "Import and export values of LaTeX registers"
DESCRIPTION = "The package allows the user to export/import the values of \
LaTeX registers (counters, rigid and rubber lengths only). It \
is not for faint-hearted users. The package may be used, for \
example, to communicate between documents for the purposes of \
dvipaste."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn27206"

RPM_NAME = "texlive-export-2023.209.1.8svn27206-53.1.noarch.rpm"
RPM_HASH = "628f4c5df4a39ae4bf502a3a16300fa1236353adb1aac61ccd1dc5e7f4ecf77a8be5204dd4241e7fa30675e0f7416d58378055e18ac2dcf8ad107088efde036f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvipaste.sty \
tex-export.sty \
texlive-export"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
