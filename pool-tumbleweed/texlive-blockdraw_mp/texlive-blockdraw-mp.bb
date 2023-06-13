SUMMARY = "Block diagrams and bond graphs, with MetaPost"
DESCRIPTION = "A set of simple MetaPost macros for the task. While the task is \
not itself difficult to program, it is felt that many users \
will be happy to have a library for the job.."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-blockdraw_mp-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "fc2da715522f5c7827bedb9fc3ab1b9cb9ac8d071992a0ba8379eb9d7695181059c13e407372ae361ed7933580a06410443ef5736bda6d28685b3a1ecd6f8d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw_mp"

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
