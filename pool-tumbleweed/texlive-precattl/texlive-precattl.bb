SUMMARY = "Prepare special catcodes from token list"
DESCRIPTION = "Allow users to write code that contains tokens with unusual \
catcodes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63967"

RPM_NAME = "texlive-precattl-2023.209.0.0.0.0svn63967-53.1.noarch.rpm"
RPM_HASH = "9af34fbe1f7ffe57581fa95497542ad6b524f0ab08a763e9a8562939aa0152bcd73620b079c101c20f3bcb3b02e6fee512035d2e94e3dcd3a9e9a6d33d205937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-precattl.sty \
texlive-precattl"

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
