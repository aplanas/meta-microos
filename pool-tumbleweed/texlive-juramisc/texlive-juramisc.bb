SUMMARY = "Typesetting German juridical documents"
DESCRIPTION = "A collection of classes for typesetting court sentences, legal \
opinions, books and dissertations for German lawyers. A \
jurabook class is also provided, which may not yet be complete."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-2023.209.0.0.91svn15878-56.1.noarch.rpm"
RPM_HASH = "b5c221cabfb4f54ba727b54a26ffaebe939a84b4efaf40065b377f629c70dacc771559bb146dd58f617ddba46d4a0fd2a24f45e9daa4783460a518158a62a75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jbgoe.clo \
tex-jbstgallen.clo \
tex-jbtrier.clo \
tex-jurabase.sty \
tex-jurabook.cls \
tex-juraovw.cls \
tex-juraurtl.cls \
texlive-juramisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-book.cls \
tex-calc.sty \
tex-color.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-remreset.sty \
tex-scrartcl.cls \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
