SUMMARY = "Support for putting documents under a license"
DESCRIPTION = "This package allows you to put your document under a license \
and include a link to read about the license or include an icon \
or image of the license. Currently, only Creative Commons is \
supported, but this package is designed to handle all kinds of \
licenses."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn63340"

RPM_NAME = "texlive-doclicense-2023.209.3.2.0svn63340-53.1.noarch.rpm"
RPM_HASH = "beb4f34718cf0fab8e5f9f713f724a6f9006bdab26d89cf7a855471f67edd371b828f051d5a065bc28cecae1acc066a6e6036a6f0bd68a5e88e4078366f0337e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doclicense-CC-by-3.0-latex.tex \
tex-doclicense-CC-by-3.0-plaintext.tex \
tex-doclicense-CC-by-4.0-latex.tex \
tex-doclicense-CC-by-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-3.0-latex.tex \
tex-doclicense-CC-by-nc-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-4.0-latex.tex \
tex-doclicense-CC-by-nc-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-nd-3.0-latex.tex \
tex-doclicense-CC-by-nc-nd-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-nd-4.0-latex.tex \
tex-doclicense-CC-by-nc-nd-4.0-plaintext.tex \
tex-doclicense-CC-by-nc-sa-3.0-latex.tex \
tex-doclicense-CC-by-nc-sa-3.0-plaintext.tex \
tex-doclicense-CC-by-nc-sa-4.0-latex.tex \
tex-doclicense-CC-by-nc-sa-4.0-plaintext.tex \
tex-doclicense-CC-by-nd-3.0-latex.tex \
tex-doclicense-CC-by-nd-3.0-plaintext.tex \
tex-doclicense-CC-by-nd-4.0-latex.tex \
tex-doclicense-CC-by-nd-4.0-plaintext.tex \
tex-doclicense-CC-by-sa-3.0-latex.tex \
tex-doclicense-CC-by-sa-3.0-plaintext.tex \
tex-doclicense-CC-by-sa-4.0-latex.tex \
tex-doclicense-CC-by-sa-4.0-plaintext.tex \
tex-doclicense-CC-zero-1.0-latex.tex \
tex-doclicense-CC-zero-1.0-plaintext.tex \
tex-doclicense-UKenglish.ldf \
tex-doclicense-USenglish.ldf \
tex-doclicense-acadian.ldf \
tex-doclicense-american.ldf \
tex-doclicense-australian.ldf \
tex-doclicense-brazilian.ldf \
tex-doclicense-british.ldf \
tex-doclicense-bulgarian.ldf \
tex-doclicense-canadian.ldf \
tex-doclicense-canadien.ldf \
tex-doclicense-catalan.ldf \
tex-doclicense-chinese-gbk.ldf \
tex-doclicense-chinese-tw.ldf \
tex-doclicense-chinese-utf8.ldf \
tex-doclicense-croatian.ldf \
tex-doclicense-english.ldf \
tex-doclicense-esperanto.ldf \
tex-doclicense-french.ldf \
tex-doclicense-galician.ldf \
tex-doclicense-german.ldf \
tex-doclicense-italian.ldf \
tex-doclicense-japanese.ldf \
tex-doclicense-marathi.ldf \
tex-doclicense-newzealand.ldf \
tex-doclicense-ngerman.ldf \
tex-doclicense-polish.ldf \
tex-doclicense-portuguese.ldf \
tex-doclicense-russian.ldf \
tex-doclicense-spanish.ldf \
tex-doclicense-swedish.ldf \
tex-doclicense-ukrainian.ldf \
tex-doclicense.sty \
texlive-doclicense"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ccicons.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-kvoptions.sty \
tex-ragged2e.sty \
tex-verbatim.sty \
tex-xifthen.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
