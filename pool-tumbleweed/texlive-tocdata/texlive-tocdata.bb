SUMMARY = "Adds names to chapters, sections, figures in the TOC and LOF"
DESCRIPTION = "The tocdata package may be used to add a small amount of data \
to an entry in the table of contents or list of figures, \
between the section or caption name and the page number. The \
typical use would be to add the name of an author or artist of \
a chapter or section, such as in an anthology or a collection \
of papers. Additionally, user-level macros are provided which \
add the author's name to a chapter or section, along with an \
optional prefix and/or suffix, and add to a figure the artist's \
name, prefix, and suffix, plus optional additional text. Author \
and artist names are also added to the index. Additional \
user-level macros control formatting. tocdata works with the \
TOC/LOF formatting of the default LaTeX classes, memoir, \
koma-script, and with titletoc, tocloft, tocbasic, and \
tocstyle."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.05svn65451"

RPM_NAME = "texlive-tocdata-2023.209.2.05svn65451-53.1.noarch.rpm"
RPM_HASH = "de028806425ad988f459d77a243ab657455c22ca271c6bfc750dd489857e7bd0aa15c485fb61f9516bd5ae81dec1f911b9bc014488e432e60137b0057e578394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocdata.sty \
texlive-tocdata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-titletoc.sty \
tex-tocloft.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
