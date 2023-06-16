SUMMARY = "Devanagari fonts by EkType"
DESCRIPTION = "ek-ttaaiip sNsthecyaa kaahii utkRsstt devnaagrii ttNkaaNcaa \
sNgrh. ek-ttaaip sNsthaa ke kii utkRsstt devnaagrii ttNkoN kaa \
sNgrh / . This package provides a collection of some excellent \
Devanagari fonts by EkType: Mukta, Baloo, Modak, and Jaini."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-2023.201.0.0.2svn63255-53.1.noarch.rpm"
RPM_HASH = "755164df8f8a413ca8854fee260565877195fcfe1f30490cbcda713e86485c420aa7260365c9042575bd00d3da16ca252772b0ee272ee24e03f1846e9ba07ae6"
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
