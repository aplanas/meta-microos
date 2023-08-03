SUMMARY = "Llmk: A build tool for LaTeX documents"
DESCRIPTION = "Light LaTeX Make (llmk) is yet another build tool specific for \
LaTeX documents. Its aim is to provide a simple way to specify \
a workflow of processing LaTeX documents and encourage people \
to always explicitly show the right workflow for each document. \
The main features of llmk are all about the above purpose. \
First, you can describe the workflows either in an external \
file llmk.toml or in a LaTeX document source in the form of \
magic comments. Further, multiple magic comment formats can be \
used. Second, it is fully cross-platform. The only requirement \
of the program is the texlua command; llmk provides a uniform \
way to describe the workflows available for nearly all TeX \
environments. Third, it behaves exactly the same in any \
environment. At this point, llmk intentionally does not provide \
any method for user configuration. Therefore one can guarantee \
that for a LaTeX document with an llmk setup, the process of \
typesetting the document will be reproduced in any TeX \
environment with the program."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn66473"

RPM_NAME = "texlive-light-latex-make-2023.209.1.2.0svn66473-55.1.noarch.rpm"
RPM_HASH = "528a2489da8b3e2704efd3c87022ca981051845628018face8791377ce0d3e56b18e0f1c73a6adcfb8ed92a156d19174da82c321fd533f98e6ee713e187c6f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-light-latex-make"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-light-latex-make-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
