SUMMARY = "Macros for mail merging"
DESCRIPTION = "This package is for use when sending a large number of letters, \
all with the same body text. The package's \\addressfile command \
is used to specify who the letter is to be sent to; the body of \
the \\mailingtext command specifies the text of the letters, \
possibly using macros defined in the \\addressfile."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mailing-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "f9a50850676739e3dcc1c4f399dd866eaf30175b70b282d1c737c6e41d80f9af9210709dab9e9c7e235a72fe81032f1d7305a6f854d254dd6a1e19d7840d8164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mailing.sty) \
texlive-mailing"

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
