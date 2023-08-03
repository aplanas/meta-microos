SUMMARY = "Execute LISP code in a LaTeX document"
DESCRIPTION = "The package provides a LISP interpreter written using TeX \
macros; it is provided as a LaTeX package. The interpreter \
static scoping, dynamic typing, and eager evaluation."
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.0svn38722"

RPM_NAME = "texlive-lisp-on-tex-2023.209.2.0svn38722-55.1.noarch.rpm"
RPM_HASH = "6ae1935624404a5666a514549b13acb6e5fabeaccd3788f9c44e65905a3857e8299828164f10c475f61cdfd5684fccfb6959684d7d69b16f97cc87108bd91d2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lisp-arith.sty \
tex-lisp-gc.sty \
tex-lisp-latexutil.sty \
tex-lisp-mod-fpnum.sty \
tex-lisp-mod-l3regex.sty \
tex-lisp-on-tex.sty \
tex-lisp-prim.sty \
tex-lisp-read.sty \
tex-lisp-simple-alloc.sty \
tex-lisp-string.sty \
tex-lisp-util.sty \
texlive-lisp-on-tex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
