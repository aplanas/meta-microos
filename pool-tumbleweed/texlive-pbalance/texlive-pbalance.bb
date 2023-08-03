SUMMARY = "Balance last page in two-column mode"
DESCRIPTION = "This package balances the columns on the last page of a \
two-column document. If the page is 'simple' (no footnotes, \
floats, or marginpars), is uses the balance package; otherwise, \
it uses \\enlargethispage to make the left column shorter, \
balancing the columns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn64002"

RPM_NAME = "texlive-pbalance-2023.209.1.4.0svn64002-52.1.noarch.rpm"
RPM_HASH = "ae5eca497e459d426d798e5019d52fdb1c1d17e5c753fcd1f82c18d224315100b47d6f0aebf219003c611a882460e522ecfad4a0e017a2c63a7696ec2696814c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbalance.sty \
texlive-pbalance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-balance.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
