SUMMARY = "Declare robust command, with \\newcommand checks"
DESCRIPTION = "The package merely provides a variation of \
\\DeclareRobustCommand, which checks for the existence of a \
command before declaring it robust."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-2023.201.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "ba22ca186aee96fccd733c8cfe0963c4d748a144b5d3faafae46945ca5b9bee89c212330fa98048b4102f99c3da079323e50528c34d237d3a818a48597b8816f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(robustcommand.sty) \
texlive-robustcommand"
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
