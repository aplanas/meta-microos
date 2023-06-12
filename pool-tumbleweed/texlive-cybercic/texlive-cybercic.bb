SUMMARY = "'Controls in Contents' for the cyber package"
DESCRIPTION = "This package is used in concert with the cyber package to make \
documents with annotations of compliance with cybersecurity \
requirements. 'cic' stands for 'Controls in Contents', and when \
you include this package, some notations of compliance are \
added to section names as seen in the table of contents of the \
final document. It also makes your document more brittle in \
unexpected ways: for example, when you use cybercic in the same \
document as hyperref, you cannot use any formatting in your \
section titles. So don't use cybercic unless you need to."
LICENSE = "LPPL-1.0"

PV = "2023.204.2.1svn37659"

RPM_NAME = "texlive-cybercic-2023.204.2.1svn37659-54.1.noarch.rpm"
RPM_HASH = "ae14d74a3815c8bdb65d85beb856d2d33f67a532f56acb0a604f60b284addab3e05d0212381b50c9d5db713c25523e98112c403de1e019d9319abb5a58cc7b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cybercic.sty) \
texlive-cybercic"
RDEPENDS:${PN} += "/bin/sh \
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
