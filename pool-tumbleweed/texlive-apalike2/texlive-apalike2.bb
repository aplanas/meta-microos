SUMMARY = "Bibliography style that approaches APA requirements"
DESCRIPTION = "Described as a 'local adaptation' of apalike (which is part of \
the base BibTeX distribution)."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-apalike2-2023.209.svn54080-55.1.noarch.rpm"
RPM_HASH = "b3903704d28f58f54801c1ad7d161ec99768b8386382ecf67bbf63f05c0e302a606c76ad400b9729be28eb3b19373465f63d28549249b73f09612eaf69b74ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike2"

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
