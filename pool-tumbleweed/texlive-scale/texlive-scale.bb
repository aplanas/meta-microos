SUMMARY = "Scale document by sqrt(2) or magstep(2)"
DESCRIPTION = "A package to scale a document by sqrt(2) (or by \\magstep{2}). \
This is useful if you are preparing a document on, for example, \
A5 paper and want to print on A4 paper to achieve a better \
resolution."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.2svn15878"

RPM_NAME = "texlive-scale-2023.201.1.1.2svn15878-53.1.noarch.rpm"
RPM_HASH = "4288005e55f3c12b97079acf1f5c0303dd84688723748f062c51adb78711740cd070177e3912e7d7bca5d7a468f44a84aa6a6b33d18d2063330899f5c7966164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scale.sty \
texlive-scale"

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
