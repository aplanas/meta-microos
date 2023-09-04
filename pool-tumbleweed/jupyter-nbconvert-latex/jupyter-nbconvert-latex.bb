SUMMARY = "LaTeX support for nbconvert"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package pulls in the LaTeX dependencies for nbconvert."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.7.3"

RPM_NAME = "jupyter-nbconvert-latex-7.7.3-2.1.noarch.rpm"
RPM_HASH = "d39e5b1776529776e27ae79be4df1e8195bbfe2b7d5ce74241156fe16a9bf996e2ac14e73fb6f0f2c40e3f9254087026ff1499a9916f500dbf2e26f75f666692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert-latex"

RDEPENDS:${PN} += "jupyter-nbconvert \
tex-adjustbox.sty \
tex-eurosym.sty \
tex-ulem.sty \
texlive-bibtex \
texlive-makeindex"

inherit rpm
