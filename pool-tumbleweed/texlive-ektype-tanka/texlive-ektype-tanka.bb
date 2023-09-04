SUMMARY = "Devanagari fonts by EkType"
DESCRIPTION = "ek-ttaaiip sNsthecyaa kaahii utkRsstt devnaagrii ttNkaaNcaa \
sNgrh. ek-ttaaip sNsthaa ke kii utkRsstt devnaagrii ttNkoN kaa \
sNgrh / . This package provides a collection of some excellent \
Devanagari fonts by EkType: Mukta, Baloo, Modak, and Jaini."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-2023.209.0.0.2svn63255-54.2.noarch.rpm"
RPM_HASH = "8f7724f70325c0f44484b73e66b5c6f6e83530bbac7973975c8eaec6611b86f3c5b0dbb6cbbe5f0d47c6c484bc5feabcc37606dc6340d403de1efe22a5966db4"
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
