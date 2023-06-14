SUMMARY = "Two dingbat symbol fonts"
DESCRIPTION = "The fonts (ark10 and dingbat) are specified in Metafont; \
support macros are provided for use in LaTeX. An Adobe Type 1 \
version of the fonts is available in the niceframe fonts \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27918"

RPM_NAME = "texlive-dingbat-2023.201.1.0svn27918-52.1.noarch.rpm"
RPM_HASH = "7f9a3ae591e36a2f7f519fec05eb056ec8796db787fc16313caf3749c84995a65f723b59e163f0474f2d7f2e9b93596da7cfebaad7e6084c5f0be7602acd10a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ark10.tfm \
tex-dingbat.sty \
tex-dingbat.tfm \
tex-uark.fd \
tex-udingbat.fd \
texlive-dingbat"

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
