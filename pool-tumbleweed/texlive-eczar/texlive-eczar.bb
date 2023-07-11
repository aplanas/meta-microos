SUMMARY = "A font family supporting Devanagari and Latin script"
DESCRIPTION = "rojhettaa sNsthecaa egjhaar haa yunikodd aadhaarit mukt ttNk \
aahe. hyaa ttNkaat 45+3 bhaassaa leNttin v devnaagrii lipiit \
purskRt kelyaa jaataat. vaibhv siNh hyaaNnii hyaa ttNkaacaa \
abhiklp kelaa aahe v aajnyaavlii tsec nirmitii ddevhidd \
brejhiinaa hyaaNnii kelii aahe. egzaar yh rozettaa dvaaraa \
prkaashit yunikodd aadhaarit mukt ttNk hai / is ttNk dvaaraa \
45+3 bhaassaaeN laittin tthaa devnaagrii lipi meN purskRt kii \
jaatii hai / vaibhv siNh ne is kaa abhiklp kiyaa hai aur \
aajnyaavli tthaa nirmiti ddevidd breziinaa dvaaraa kii gyii hai \
/ Eczar is an open-source type family published by Rosetta. The \
fonts support over 45+3 languages in Latin and Devanagari \
scripts in 5 weights. These fonts were designed by Vaibhav \
Singh, code and production are by David Brezina."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.1svn57716"

RPM_NAME = "texlive-eczar-2023.201.0.0.1svn57716-53.2.noarch.rpm"
RPM_HASH = "43730bb8be657f0d61b57eaee3c52ee7e84e9ddde52c52e0b4d83735e808b19dcb8a052d56f8b2fa67c5fbbc038e3b0ba1b897ca76b4cc64adf920a3db7e999d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-eczar-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
