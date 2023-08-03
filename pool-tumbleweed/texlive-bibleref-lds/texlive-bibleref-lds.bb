SUMMARY = "Bible references, including those to the scriptures of the Church of Jesus Christ of Latter Day Saints"
DESCRIPTION = "The package extends the bibleref-mouth package to support \
references to the scriptures of The Church of Jesus Christ of \
Latter-day Saints (LDS). The package requires bibleref-mouth to \
run, and its reference syntax is the same as that of the parent \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-2023.209.1.0svn25526-54.1.noarch.rpm"
RPM_HASH = "c8600fc670e95efff13c0417abb83814e2d04b5a6dea1dd159028f32aea065c771d86bcc9e8f1d9393754c972b2bf661e8450a523768f01d68ea002334c6efe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-lds.sty \
texlive-bibleref-lds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref-mouth.sty \
tex-hyperref.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
