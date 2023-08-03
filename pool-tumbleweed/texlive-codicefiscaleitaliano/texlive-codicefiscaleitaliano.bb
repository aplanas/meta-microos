SUMMARY = "Test the consistency of the Italian personal Fiscal Code"
DESCRIPTION = "The alphanumeric string that forms the Italian personal Fiscal \
Code is prone to be misspelled thus rendering a legal document \
invalid. The package quickly verifies the consistency of the \
fiscal code string, and can therefore be useful for lawyers and \
accountants that use fiscal codes very frequently."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-2023.209.1.2svn29803-54.1.noarch.rpm"
RPM_HASH = "69bc624258628654ef948634ef6dbf0a14e41856400f71f7f05b8938179538d49353d7154b3a6ed0fb8ebbd2dc2ba5d481b13184b40461beefb87f3a0b29b35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codicefiscaleitaliano.sty \
texlive-codicefiscaleitaliano"

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
