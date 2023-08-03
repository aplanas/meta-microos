SUMMARY = "Polyglossia support for Occitan"
DESCRIPTION = "Occitan language description file for polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-2023.209.0.0.1svn52593-54.1.noarch.rpm"
RPM_HASH = "cf932ceb45f223c8980449c6afd670b4569e9ed07001cfd3cfaedb44d6b58ee7fe93b64df3b4a435d9b1670b4a92347f0a91b6bbba2472a9e9fdcf3a519e6917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan"

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
