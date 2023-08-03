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

PV = "2023.209.2.1svn37659"

RPM_NAME = "texlive-cybercic-2023.209.2.1svn37659-55.1.noarch.rpm"
RPM_HASH = "143f39c04938cc8efaaa957a8dcbca229fef46e715f751b19b231b59daf64cbe9f60433369a9f8e671565e6efdcdd491f97c5af588466211826d506e808bf0ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cybercic.sty \
texlive-cybercic"

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
