SUMMARY = "Engine-level feature synchronizing output and source"
DESCRIPTION = "SyncTeX allows navigating between the TeX source and (usually \
PDF) output, in both directions, given a SyncTeX-aware front \
end. It is compiled into most engines and can be enabled with \
the --synctex=1 option. It is developed as part of TeX Live."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-synctex-2023.201.svn66203-57.1.noarch.rpm"
RPM_HASH = "46a4884a134271b85e57099704c696a402a22762f1afa28b04e216f57464a306533b8585a16775ec28e51606feed993da8c843b78822fb13d5193955561c54b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-synctex.1 \
man-synctex.5 \
texlive-synctex"

RDEPENDS:${PN} += "/bin/sh \
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
