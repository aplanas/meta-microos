SUMMARY = "Babel support for typesetting Slovak"
DESCRIPTION = "The package provides the language definition file for support \
of Slovak in babel, including Slovak variants of LaTeX \
built-in-names. Shortcuts are also defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1asvn30292"

RPM_NAME = "texlive-babel-slovak-2023.209.3.1asvn30292-54.1.noarch.rpm"
RPM_HASH = "c60764b80a5579916541bc83268a3ea03a88a0d22f05f4b1c1966d2dcadcc32248b20dedb5e671db57d9bee7dd8e3f6e5f819d1a189fea5812f544bbae629c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-slovak.ldf \
texlive-babel-slovak"

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
