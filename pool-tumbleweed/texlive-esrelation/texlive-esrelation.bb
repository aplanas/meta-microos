SUMMARY = "Provides a symbol set for describing relations between ordered pairs"
DESCRIPTION = "Around 2008, researcher Byron Cook and several colleagues began \
developing a new set of interrelated algorithms capable of \
automatically reasoning about the behavior of computer programs \
and other systems (such as biological systems, circuit designs, \
etc). At the center of these algorithms were new ideas about \
the relationships between structures expressable as \
mathematical sets and relations. Using the language of \
mathematics and logic, the researchers communicated these new \
results to others in their community via published papers, \
research talks, etc. Unfortunately, they found the symbols \
already available for reasoning about relations lacking (in \
contrast to sets, which have a long-ago developed and robust \
symbol vocabulary). Early presentations were unnecessarily \
cluttered. To more elegantly express these ideas around \
relations, Cook recruited artist Tauba Auerbach to help develop \
a set of symbols. This package provides an math symbol font for \
describing relations between ordered pairs by using Metafont."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37236"

RPM_NAME = "texlive-esrelation-2023.201.svn37236-52.1.noarch.rpm"
RPM_HASH = "3713394ca6b2a7869d59f50c8a27cfd3f7b33b57c7ee886281080066365caf9eaff4e1b7afca5ecd647eb3b5c57c8bd70e4deff7040071e1427c77b287d194c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esrelation.map \
tex-esrelation.sty \
tex-esrelation10.tfm \
tex-uesrelation.fd \
texlive-esrelation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esrelation-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
