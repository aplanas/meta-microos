SUMMARY = "A double-struck serifed font for mathematical use"
DESCRIPTION = "DSSerif is a mathematical font package with double struck \
serifed digits, upper and lower case letters, in regular and \
bold weights. The design was inspired by the STIX double struck \
fonts, which are sans serif, but starting from a Courier-like \
base."
LICENSE = "OFL-1.1"

PV = "2023.201.1.031svn60898"

RPM_NAME = "texlive-dsserif-2023.201.1.031svn60898-52.1.noarch.rpm"
RPM_HASH = "edfc9d3957acd601820cb84af55bdaf4d8d4634e0dbd33cc05a01e8fed07738d9115d169343f23034485efe467a142d77f00310dee02ff3e59fee79dd23a90b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(DSSerif-Bold.tfm) \
tex(DSSerif.map) \
tex(DSSerif.tfm) \
tex(DSSerifUni-Bold.tfm) \
tex(DSSerifUni.tfm) \
tex(dsserif.sty) \
tex(udsserif.fd) \
texlive-dsserif"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-dsserif-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
