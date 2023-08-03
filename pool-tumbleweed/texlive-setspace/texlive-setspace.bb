SUMMARY = "Set space between lines"
DESCRIPTION = "Provides support for setting the spacing between lines in a \
document. Package options include singlespacing, \
onehalfspacing, and doublespacing. Alternatively the spacing \
can be changed as required with the \\singlespacing, \
\\onehalfspacing, and \\doublespacing commands. Other size \
spacings also available."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.7bsvn65206"

RPM_NAME = "texlive-setspace-2023.209.6.7bsvn65206-54.1.noarch.rpm"
RPM_HASH = "7a48b8a4d38be4541c4955728d28d4bb7d25ad93f4296fae1403813ec3abb2b2bffe20208b88ef519d781c50810926183efdad5a0374911b04619c4831faf420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-setspace.sty \
texlive-setspace"

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
