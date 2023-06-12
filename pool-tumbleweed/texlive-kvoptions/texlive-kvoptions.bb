SUMMARY = "Key value format for package options"
DESCRIPTION = "This package offers support for package authors who want to use \
options in key-value format for their package options."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.15svn63622"

RPM_NAME = "texlive-kvoptions-2023.201.3.15svn63622-55.1.noarch.rpm"
RPM_HASH = "539532bbe5e3dcdd16bfbbdc4027f2676af375d1984d4f49297abf2b9b1704a53818f931a4b90ec2ac621fd3c696b0252f514e6d8dd936f2e84cf053d0afd146"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kvoptions-patch.sty) \
tex(kvoptions.sty) \
texlive-kvoptions"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etexcmds.sty) \
tex(keyval.sty) \
tex(kvsetkeys.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
