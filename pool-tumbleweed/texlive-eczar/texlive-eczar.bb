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

RPM_NAME = "texlive-eczar-2023.201.0.0.1svn57716-53.1.noarch.rpm"
RPM_HASH = "4812577b71523f240e03509347f8ad64341a5211fb299ed4f8ff97c4c6e3052f89d9ff70f8d3c577eda6d76b0f52cd3b4a8a3486990145f822d7f6c1ada7e908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar"

RDEPENDS:${PN} += "/bin/sh \
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
