SUMMARY = "Add ~ after non-syllabic preposition, for Czech/Slovak"
DESCRIPTION = "Preprocessor for TeX source implementing the Czech/Slovak \
typographical rule forbidding a non-syllabic preposition alone \
at the end of a line."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-vlna-2023.209.svn66186-54.1.noarch.rpm"
RPM_HASH = "2cf5590b4a0fee4d4fa7f530cc3caa17370847b5fcb7d0da957396f0dfdfc40279b645cb70a59a8638afaa709c2f2be5925d82dc20c7b82d74f577ae905c0290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-vlna.1 \
texlive-vlna"

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
texlive-vlna-bin"

inherit rpm
