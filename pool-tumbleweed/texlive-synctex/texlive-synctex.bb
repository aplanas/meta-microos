SUMMARY = "Engine-level feature synchronizing output and source"
DESCRIPTION = "SyncTeX allows navigating between the TeX source and (usually \
PDF) output, in both directions, given a SyncTeX-aware front \
end. It is compiled into most engines and can be enabled with \
the --synctex=1 option. It is developed as part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-synctex-2023.209.svn66203-58.1.noarch.rpm"
RPM_HASH = "d5a5090658444b4b699d7473a5415b14495ea79007e2f196216d08a40fa2522e47c5c594cde9acb02e064f8ba1bbb0df443ad6e947fdaf2f62454ae4fb52aef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-synctex.1 \
man-synctex.5 \
texlive-synctex"

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
texlive-scripts-bin \
texlive-synctex-bin"

inherit rpm
