SUMMARY = "Devanagari fonts by EkType"
DESCRIPTION = "ek-ttaaiip sNsthecyaa kaahii utkRsstt devnaagrii ttNkaaNcaa \
sNgrh. ek-ttaaip sNsthaa ke kii utkRsstt devnaagrii ttNkoN kaa \
sNgrh / . This package provides a collection of some excellent \
Devanagari fonts by EkType: Mukta, Baloo, Modak, and Jaini."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-2023.209.0.0.2svn63255-54.1.noarch.rpm"
RPM_HASH = "502ec03807326b59c85c8c6c1c49f1766e8c8450a4adab88b91996f6155098472d883ede05ac0e9e92d85367a731fc328faaa5d1b3a7c04b74f7239b36b83cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ektype-tanka"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ektype-tanka-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
