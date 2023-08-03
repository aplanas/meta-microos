SUMMARY = "PDF collection of typeset C/WEB sources in TeX Live"
DESCRIPTION = "Here you find a large collection of PDF documents for many \
C/WEB programs in TeX Live, both in their original form as \
written by their respective authors, and in the changed form as \
they are actually used in the TeX Live system. Care has been \
taken to keep the section numbering intact, so that you can \
study the sources and their changes in parallel. Also included \
is the collection of 'errata' for Donald Knuth's 'Computers & \
Typesetting series'. Although not all the texts here are \
written or maintained by Donald Knuth, it is more convenient \
for everything to be collected in one place for reading and \
searching. They all stem from the system that Knuth created. \
The central entry point is the 'index' file, with links to the \
individual documents, either in HTML or in PDF format."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0svn62969"

RPM_NAME = "texlive-knuth-pdf-2023.209.2.0svn62969-56.1.noarch.rpm"
RPM_HASH = "6f0f6e7313835d9f8b2950d640aa83e724cd59a29c6d4c44338b7cff38d1f3bd6a858314b70317c305876db5d6e261551b6ffb8ff536c49ade73c0d04fbaa982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-pdf"

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
