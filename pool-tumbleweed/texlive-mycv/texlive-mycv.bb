SUMMARY = "A list-driven CV class, allowing TikZ decorations"
DESCRIPTION = "The class provides a set of functionality for writing \
'curriculum vitae' with different layouts. The idea is that a \
user can write some custom configuration directives, by means \
of which is possible both to produce different c.v. layouts and \
quickly switch among them. In order to process such directives, \
the class uses a set of lists, provided by the package \
etextools. Basic support for using TikZ decorations is also \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.6svn26807"

RPM_NAME = "texlive-mycv-2023.201.1.5.6svn26807-54.1.noarch.rpm"
RPM_HASH = "a81bfb19ac8348d20115efe1ce7b0ba90722754b5ac7ee21e853fb64b7c0e90e17b58aa54b2e5ce7bdef4c4e3f1478ac3c942ef8c37953b0ae171bc44358506c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mycv.cls) \
tex(mycv_base.def) \
tex(mycv_dec.sty) \
tex(mycv_misc.def) \
tex(mycv_style.sty) \
tex(mycv_version.def) \
texlive-mycv"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
coreutils \
ed \
findutils \
grep \
perl(Cwd) \
perl(File::Path) \
perl(Getopt::Long) \
perl(strict) \
perl(warnings) \
sed \
tex(amssymb.sty) \
tex(article.cls) \
tex(babel.sty) \
tex(calligra.sty) \
tex(etextools.sty) \
tex(fancyhdr.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(kvoptions.sty) \
tex(marvosym.sty) \
tex(pifont.sty) \
tex(svn-prov.sty) \
tex(tikz.sty) \
tex(times.sty) \
tex(titlesec.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
