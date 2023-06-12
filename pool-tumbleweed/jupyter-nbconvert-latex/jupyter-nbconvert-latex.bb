SUMMARY = "LaTeX support for nbconvert"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package pulls in the LaTeX dependencies for nbconvert."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.3.1"

RPM_NAME = "jupyter-nbconvert-latex-7.3.1-2.1.noarch.rpm"
RPM_HASH = "d414779e2c3f59199973b57551fa144677de987e57dce7709592f55dc08a658a94e0e17291a69831fbf4ed5f126a344410250f4647019478a3504746ac9aba55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert-latex \
python310-jupyter_nbconvert-latex \
python310-nbconvert-latex \
python311-jupyter_nbconvert-latex \
python311-nbconvert-latex \
python39-jupyter_nbconvert-latex \
python39-nbconvert-latex"
RDEPENDS:${PN} += "jupyter-nbconvert \
tex(adjustbox.sty) \
tex(eurosym.sty) \
tex(ulem.sty) \
texlive-bibtex \
texlive-makeindex"

inherit rpm
