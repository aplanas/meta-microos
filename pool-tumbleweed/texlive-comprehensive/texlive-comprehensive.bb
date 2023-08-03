SUMMARY = "Symbols accessible from LaTeX"
DESCRIPTION = "Over 18000 symbols are listed as a set of tables. The tables of \
symbols are ordered in a logical way (the document begins with \
a 'frequently requested symbols' list), the aim being to make \
the document a convenient way of looking up symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.14.0svn59099"

RPM_NAME = "texlive-comprehensive-2023.209.14.0svn59099-54.1.noarch.rpm"
RPM_HASH = "9e32c2fe3e67ec2c47a4a9f131e1017e9ef789afca2978df7b48cb49d5f7915537e3aad3f34ddbe4287d33ff38f5f4103eb1c190ce7da4fc5ce04f4004d16190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comprehensive"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
