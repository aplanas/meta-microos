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

PV = "2023.209.0.0.1svn57716"

RPM_NAME = "texlive-eczar-2023.209.0.0.1svn57716-54.2.noarch.rpm"
RPM_HASH = "b64d89468ac2c8614baa6d6835f9b9771a898a659253d8767f7601466f08b73de9fdb9a2501552254c19f96f57011d126ddc2758f67df9a4a2dcba4c8ba1eece"
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
