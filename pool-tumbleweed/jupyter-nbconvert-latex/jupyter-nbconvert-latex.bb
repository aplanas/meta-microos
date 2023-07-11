SUMMARY = "LaTeX support for nbconvert"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package pulls in the LaTeX dependencies for nbconvert."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.6.0"

RPM_NAME = "jupyter-nbconvert-latex-7.6.0-1.2.noarch.rpm"
RPM_HASH = "ac1d05fd247890db96d3b59e826812b2ea86d8e8984d6ce7b07cd0568ff8b2c3b469111e7b1aeabebccfa5483974bb89f5fee1271d7fb93aab5f8c4e11bbb870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert-latex"

RDEPENDS:${PN} += "jupyter-nbconvert \
tex-adjustbox.sty \
tex-eurosym.sty \
tex-ulem.sty \
texlive-bibtex \
texlive-makeindex"

inherit rpm
