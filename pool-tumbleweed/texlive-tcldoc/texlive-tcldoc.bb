SUMMARY = "Doc/docstrip for tcl"
DESCRIPTION = "The tclldoc package and class simplify the application of the \
doc/docstrip style of literate programming with Dr. John \
Ousterhout's Tool Command Language (Tcl, pronounced 'tickle', \
a.k.a. The Cool Language). The tclldoc package is a bit like \
the doc package is for LaTeX, whereas the tclldoc class more \
parallels the ltxdoc class."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.40svn22018"

RPM_NAME = "texlive-tcldoc-2023.209.2.40svn22018-55.1.noarch.rpm"
RPM_HASH = "0e61301cb09ef596b77370da5a09a35d28840682312335d1bd6ecbb66b18ad6b06f979cf5292c8b30368d0487c24d11f8a252961248f274312d5fb23f9d48041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tcldoc.cls \
tex-tcldoc.sty \
tex-tclldoc.cls \
tex-tclldoc.sty \
texlive-tcldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-docidx2e.sty \
tex-rtkinenc.sty \
tex-xdoc2.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
