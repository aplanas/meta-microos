SUMMARY = "Macros for typesetting Korean under Plain TeX"
DESCRIPTION = "The package provides macros for typesetting Hangul, the native \
alphabet of the Korean language, using plain *TeX. Input Korean \
text should be encoded in UTF-8. The package belongs to the \
ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.0svn63689"

RPM_NAME = "texlive-kotex-plain-2023.209.3.0.0svn63689-56.1.noarch.rpm"
RPM_HASH = "43871768a2672f0080b994a2374eb642b47296ddde3cfd0b0000be261c870062e129ff37ee3558ecc6045625276322e3266ce9ebde4666347a20d5328ad87ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hangulcweb.tex \
tex-kotexplain.tex \
tex-kotexutf-core.tex \
tex-kotexutf.tex \
texlive-kotex-plain"

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
