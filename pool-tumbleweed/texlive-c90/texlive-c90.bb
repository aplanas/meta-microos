SUMMARY = "C90 font encoding for Thai"
DESCRIPTION = "part of the CJK package, ctan.org/pkg/cjk"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn60830"

RPM_NAME = "texlive-c90-2023.209.svn60830-53.1.noarch.rpm"
RPM_HASH = "3a3a7ec2e046a3c93ccc5a08c4770d51f306fc502e5808613c2169ef8ef8e0af6c040b0f0c822c4748a998c2fb2a596e73d2e7e2b274a96e15478a7cd3c9b872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-c90.enc \
texlive-c90"

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
