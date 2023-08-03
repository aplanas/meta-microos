SUMMARY = "Convenient and uniform references to legal provisions"
DESCRIPTION = "The package is aimed at continental lawyers (especially those \
in Switzerland and Germany), allowing the user to make \
references to legal provisions conveniently and uniformly. The \
package also allows the user to add cited Acts to a \
nomenclature list (automatically), and to build specific \
indexes for each cited Act. The package is still under \
development, and should be treated as an 'alpha'-release."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn36026"

RPM_NAME = "texlive-lexref-2023.209.1.1asvn36026-55.1.noarch.rpm"
RPM_HASH = "ed40b2f0ffd96465ad245c21f256bd9a723716ef0408a36ea984b67a727f26be0bf0162638783bb63aded77e265b8f030fb23f02b17767ceb06015f6bf731d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lexref.sty \
texlive-lexref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-nomencl.sty \
tex-splitidx.sty \
tex-stringstrings.sty \
tex-xargs.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
