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

PV = "2023.209.1.5.6svn26807"

RPM_NAME = "texlive-mycv-2023.209.1.5.6svn26807-55.1.noarch.rpm"
RPM_HASH = "aa03b9ef5da14ce6a788bf49a0a4f5a3b0b7dbaabc6af1f24f53f17efcd98fb95fcf9e9a8472e0259401f2b51d77712f02a32be8f63899bd9b245d3321804b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mycv-base.def \
tex-mycv-dec.sty \
tex-mycv-misc.def \
tex-mycv-style.sty \
tex-mycv-version.def \
tex-mycv.cls \
texlive-mycv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Path \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
tex-amssymb.sty \
tex-article.cls \
tex-babel.sty \
tex-calligra.sty \
tex-etextools.sty \
tex-fancyhdr.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-marvosym.sty \
tex-pifont.sty \
tex-svn-prov.sty \
tex-tikz.sty \
tex-times.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
