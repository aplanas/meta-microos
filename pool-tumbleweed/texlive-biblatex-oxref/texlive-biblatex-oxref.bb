SUMMARY = "BibLaTeX styles inspired by the Oxford Guide to Style"
DESCRIPTION = "This bundle provides four BibLaTeX styles that implement (many \
of) the stipulations and examples provided by the 2014 New \
Hart's Rules and the 2002 Oxford Guide to Style: 'oxnotes' is a \
style similar to the standard 'verbose', intended for use with \
footnotes; 'oxnum' is a style similar to the standard \
'numeric', intended for use with numeric in-text citations; \
'oxalph' is a style similar to the standard 'alphabetic', \
intended for use with alphabetic in-text citations; 'oxyear' is \
a style similar to the standard 'author-year', intended for use \
with parenthetical in-text citations. The bundle provides \
support for a wide variety of content types, including \
manuscripts, audiovisual resources, social media and legal \
references."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn65707"

RPM_NAME = "texlive-biblatex-oxref-2023.209.3.0svn65707-54.1.noarch.rpm"
RPM_HASH = "9edfc66980348cb234f9961da6076eaa94b726c89503977bc6daea46797e61015d2d45296a30f128dcb212a6780b4ec67b6a3c2e00a5c61758917d1b881860a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-oxref.lbx \
tex-british-oxref.lbx \
tex-english-oxref.lbx \
tex-oxalph.bbx \
tex-oxalph.cbx \
tex-oxnotes-ibid.bbx \
tex-oxnotes-ibid.cbx \
tex-oxnotes-inote.bbx \
tex-oxnotes-inote.cbx \
tex-oxnotes-note.bbx \
tex-oxnotes-note.cbx \
tex-oxnotes-trad1.bbx \
tex-oxnotes-trad1.cbx \
tex-oxnotes-trad2.bbx \
tex-oxnotes-trad2.cbx \
tex-oxnotes-trad3.bbx \
tex-oxnotes-trad3.cbx \
tex-oxnotes.bbx \
tex-oxnotes.cbx \
tex-oxnum.bbx \
tex-oxnum.cbx \
tex-oxref.bbx \
tex-oxyear.bbx \
tex-oxyear.cbx \
texlive-biblatex-oxref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-authoryear-comp.cbx \
tex-english.lbx \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-numeric-comp.cbx \
tex-standard.bbx \
tex-verbose-ibid.cbx \
tex-verbose-inote.cbx \
tex-verbose-note.cbx \
tex-verbose-trad1.cbx \
tex-verbose-trad2.cbx \
tex-verbose-trad3.cbx \
tex-verbose.cbx \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
