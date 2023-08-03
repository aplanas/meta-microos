SUMMARY = "User documentation for AMS document classes"
DESCRIPTION = "This collection comprises a set of four manuals, or Author \
Handbooks, each documenting the use of a class of publications \
based on one of the AMS document classes amsart, amsbook, \
amsproc and one 'hybrid', as well as a guide to the generation \
of the four manuals from a coordinated set of LaTeX source \
files. The Handbooks comprise the user documentation for the \
pertinent document classes. As the source for the Handbooks \
consists of a large number of files, and the intended output is \
multiple different documents, the principles underlying this \
collection can be used as a model for similar projects. The \
manual 'Compiling the AMS Author Handbooks' provides \
information about the structure of and interaction between the \
various components."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46110"

RPM_NAME = "texlive-amscls-doc-2023.209.svn46110-55.1.noarch.rpm"
RPM_HASH = "3dac320f5111267573b3dd3ab1723c49ef20bc716b50277b725788688aee530e07569a14900dfad3150211f16f025292a3d6699beb2b2a3635e10a6ad8aa9bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amscls-doc"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
