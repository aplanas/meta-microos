SUMMARY = "German adaptation of bibleref"
DESCRIPTION = "The package provides translations and various formats for the \
use of bibleref in German documents. The German naming of the \
bible books complies with the 'Loccumer Richtlinien' (Locum \
guidelines). In addition, the Vulgate (Latin bible) is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-2023.209.1.0asvn21923-54.1.noarch.rpm"
RPM_HASH = "3fffc82e70e041817223ff78f0ae84e9db115aa5f9724bbd1eba389ec29fec4635122927f0b841e4849ed4dfa3a99e9f8617292eb5e105a77f356f1cd6f75adb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-german.sty \
texlive-bibleref-german"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
