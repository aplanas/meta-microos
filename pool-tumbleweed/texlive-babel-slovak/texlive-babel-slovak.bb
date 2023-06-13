SUMMARY = "Babel support for typesetting Slovak"
DESCRIPTION = "The package provides the language definition file for support \
of Slovak in babel, including Slovak variants of LaTeX \
built-in-names. Shortcuts are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-2023.201.3.1asvn30292-53.1.noarch.rpm"
RPM_HASH = "b641a7001cf67fdefa0f86c8cc12316b3264d2d4303f4934c2080e6c067f31380eb84a6432c56efd93d48f81e76d54c8dd552f226f0098b002b1a08c7d475a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(slovak.ldf) \
texlive-babel-slovak"

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
texlive-scripts-bin"

inherit rpm
