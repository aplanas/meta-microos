SUMMARY = "German adaptation of bibleref"
DESCRIPTION = "The package provides translations and various formats for the \
use of bibleref in German documents. The German naming of the \
bible books complies with the 'Loccumer Richtlinien' (Locum \
guidelines). In addition, the Vulgate (Latin bible) is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-2023.201.1.0asvn21923-53.1.noarch.rpm"
RPM_HASH = "c0e91f03f8755c2e73f13bc60ce28d1a1bfc1efa010866612a5010c87b7b9589756ba36a67978cf670856430dea8a9b0846ac80cfe9cae6d72fbbc40f02e3a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibleref-german.sty) \
texlive-bibleref-german"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bibleref.sty) \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
