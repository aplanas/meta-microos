SUMMARY = "Subversion variants of \\Provides... macros"
DESCRIPTION = "The package introduces Subversion variants of the standard \
LaTeX macros \\ProvidesPackage, \\ProvidesClass and \\ProvidesFile \
where the file name and date is extracted from Subversion Id \
keywords. The file name may also be given explicitly as an \
optional argument."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1862svn64967"

RPM_NAME = "texlive-svn-prov-2023.209.3.1862svn64967-58.1.noarch.rpm"
RPM_HASH = "6d99efe9890611a9c6ec2945dedd67ea2ec64d7edadd5ed0669d1538577f8f9801b6ab11e3106418fd6838710d0165220509d0070bfafc5ecef117796dde14fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn-prov.sty \
texlive-svn-prov"

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
