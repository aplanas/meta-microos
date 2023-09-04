SUMMARY = "Conditionals to test which platform is being used"
DESCRIPTION = "This package uses the (La)TeX extension -shell-escape to \
establish whether the document is being processed on a Windows \
or on a Unix-like system (Mac OS X, Linux, etc.), or on Cygwin \
(Unix environment over a windows system). Booleans provided \
are: \\ifwindows, \\iflinux, \\ifmacosx and \\ifcygwin. The package \
also preserves the output of uname on a Unix-like system, which \
may be used to distinguish between various classes of Unix \
systems."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-2023.209.0.0.4asvn45533-54.1.noarch.rpm"
RPM_HASH = "67abeb4507a3fbe9799e906dfc32bf4af41fb10557df41581f3e9996a6fb9987df2159966b8144dcede806d3f54153b77dfc2eb208977d4921083ed75e1a3d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifplatform.sty \
texlive-ifplatform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-ifluatex.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
