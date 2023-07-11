SUMMARY = "Support for users in Telecommunications Engineering"
DESCRIPTION = "The package provides a wide range of abbreviations for terms \
used in Telecommunications Engineering."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn28571"

RPM_NAME = "texlive-engtlc-2023.201.3.2svn28571-53.2.noarch.rpm"
RPM_HASH = "deaccfb1740ff029aac042c1cb6c8e7e4d4957ff82cebb72fff96a7b7877a1d01274c9abafd4b9f9d25c5adabebf250179d5a76e259507c3ec641bc34650fc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-engtlc.sty \
texlive-engtlc"

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
