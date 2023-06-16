SUMMARY = "Experimental hyphenation patterns for the German language"
DESCRIPTION = "The package provides experimental hyphenation patterns for the \
German language, covering both traditional and reformed \
orthography. The patterns can be used with packages Babel and \
hyphsubst from the Oberdiek bundle. Dieses Paket enthalt \
experimentelle Trennmuster fur die deutsche Sprache. Die \
Trennmuster decken das in Deutschland, Osterreich und der \
Schweiz gebrauchliche Standarddeutsch in der traditionellen und \
reformierten Rechtschreibung ab und konnen mit den Paketen \
Babel und hyphsubst aus dem Oberdiek-Bundel verwendet werden."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn66390"

RPM_NAME = "texlive-dehyph-exptl-2023.201.0.0.9svn66390-52.1.noarch.rpm"
RPM_HASH = "631b9f513d66bfd5014a96a3528cc564e18d1857377dbe0725abaadeb8138c93f640f75674c8e1d1d815260db1b93de6305550d13b4504c2c1d8ddb25683b5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dehyphn-x-2023-03-06.tex \
tex-dehypht-x-2023-03-06.tex \
tex-dehyphts-x-2023-03-06.tex \
texlive-dehyph-exptl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
