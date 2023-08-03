SUMMARY = "Compile differently based on the filename"
DESCRIPTION = "This package allows to compile a document differently depending \
on the portion of the document's file name (internally, the \
\\jobname) that comes after the first '-' character. This allows \
one to have one source file and multiple links to this source \
file that each compile differently."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64797"

RPM_NAME = "texlive-jobname-suffix-2023.209.1.0svn64797-56.1.noarch.rpm"
RPM_HASH = "87703e0c47939bd9aefa53a78eca00ebe934c0734ce34e2f8447c5130559c0c9f9c2cbceb5912e8a604db3ced6296cafeacac5034b99d7fbbaba2bf185b154e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jobname-suffix.sty \
texlive-jobname-suffix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
