SUMMARY = "Devanagari fonts by EkType"
DESCRIPTION = "ek-ttaaiip sNsthecyaa kaahii utkRsstt devnaagrii ttNkaaNcaa \
sNgrh. ek-ttaaip sNsthaa ke kii utkRsstt devnaagrii ttNkoN kaa \
sNgrh / . This package provides a collection of some excellent \
Devanagari fonts by EkType: Mukta, Baloo, Modak, and Jaini."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-2023.201.0.0.2svn63255-53.2.noarch.rpm"
RPM_HASH = "ca0adacc3e89eed26809cabd28282cf6c85b4cf7601e499a02ea6647bcff2c1d417a157647021d6d6718e6d1e6596f436421d98d8d2322daabd2af36c335e971"
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
