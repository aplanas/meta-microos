SUMMARY = "Block diagrams and bond graphs, with MetaPost"
DESCRIPTION = "A set of simple MetaPost macros for the task. While the task is \
not itself difficult to program, it is felt that many users \
will be happy to have a library for the job.."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-blockdraw_mp-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "9802f3ae52bf942846c883bca8839b7bce238d214d7ced2265d567a42bac8d9d30842c31a1a1f0b8024a75e005fd667ca7b8730c81ca4253f845c073688351d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blockdraw-mp"

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
