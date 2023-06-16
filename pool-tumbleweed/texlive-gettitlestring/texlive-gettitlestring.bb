SUMMARY = "Clean up title references"
DESCRIPTION = "Cleans up the title string (removing \\label commands) for \
packages (such as nameref) that typeset such strings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53170"

RPM_NAME = "texlive-gettitlestring-2023.201.1.6svn53170-52.1.noarch.rpm"
RPM_HASH = "00bd992dd9dbf79d38fa14f077aad9f37607c31a90ef160e3fe22190aa34ecc4558ff284ccc4b3e7da3455bcc383648e11be64cdf71a5135523fc0f78c7b8676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gettitlestring.sty \
texlive-gettitlestring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
