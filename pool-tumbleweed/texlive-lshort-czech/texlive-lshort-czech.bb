SUMMARY = "Czech translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "This is the Czech translation of 'A Short Introduction to \
LaTeX2e'."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.27svn55643"

RPM_NAME = "texlive-lshort-czech-2023.201.4.27svn55643-54.1.noarch.rpm"
RPM_HASH = "1ad55ccf0d1eaec142d53806180b520b33e64b0fd3084c4680b9db3fed5fd2c8fca4ab5b4c1cb318e1868e537cb50ab43a914fb867b125442a4ac02608e616bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-czech"

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
