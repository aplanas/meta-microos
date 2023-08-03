SUMMARY = "Enhanced theorem environment"
DESCRIPTION = "The package offers enhancements for theorem-like environments: \
easier control of layout; proper placement of endmarks even \
when the environment ends with \\end{enumerate} or \
\\end{displaymath} (including support for amsmath \
displayed-equation environments); and support for making a list \
of theorems, analagous to \\listoffigures."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.33svn27609"

RPM_NAME = "texlive-ntheorem-2023.209.1.33svn27609-55.1.noarch.rpm"
RPM_HASH = "e22dd4034488b6f9d06c136b585b50bbd5835be8816d90589133112e71483dbde7943b8c440d1d505650b7f49b6db3fad72ce807cdcc9707972687ac166be621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ntheorem.sty \
texlive-ntheorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
