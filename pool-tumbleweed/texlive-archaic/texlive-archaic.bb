SUMMARY = "A collection of archaic fonts"
DESCRIPTION = "The collection contains fonts to represent Aramaic, Cypriot, \
Etruscan, Greek of the 6th and 4th centuries BCE, Egyptian \
hieroglyphics, Linear A, Linear B, Nabatean old Persian, the \
Phaistos disc, Phoenician, proto-Semitic, runic, South Arabian \
Ugaritic and Viking scripts. The bundle also includes a small \
font for use in phonetic transcription of the archaic writings. \
The bundle's own directory includes a font installation map \
file for the whole collection."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38005"

RPM_NAME = "texlive-archaic-2023.201.svn38005-54.1.noarch.rpm"
RPM_HASH = "d08211877e2daf87072ea4b1ab1a241519a16bb50cbbcc7561662eae6be1a619ef439832b672ea8ac12b149d7fb3c3b789b07888e1870f91a8410106ed5dcf16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aram10.tfm \
tex-aramaic.map \
tex-aramaic.sty \
tex-archaicprw.map \
tex-copsn10.tfm \
tex-cugar10.tfm \
tex-cypr10.tfm \
tex-cypriot.map \
tex-cypriot.sty \
tex-etr10.tfm \
tex-etruscan.map \
tex-etruscan.sty \
tex-fut10.map \
tex-fut10.tfm \
tex-givbc10.tfm \
tex-greek4cbc.map \
tex-greek4cbc.sty \
tex-greek6cbc.map \
tex-greek6cbc.sty \
tex-gvibc10.tfm \
tex-hieroglf.map \
tex-hieroglf.sty \
tex-linb10.tfm \
tex-linearb.map \
tex-linearb.sty \
tex-nab10.tfm \
tex-nabatean.map \
tex-nabatean.sty \
tex-oands.map \
tex-oands.sty \
tex-oandsi10.tfm \
tex-oandsu10.tfm \
tex-oldprsn.map \
tex-oldprsn.sty \
tex-ot1aram.fd \
tex-ot1copsn.fd \
tex-ot1cugar.fd \
tex-ot1cypr.fd \
tex-ot1etr.fd \
tex-ot1fut.fd \
tex-ot1givbc.fd \
tex-ot1gvibc.fd \
tex-ot1nab.fd \
tex-ot1oands.fd \
tex-ot1phnc.fd \
tex-ot1pmhg.fd \
tex-ot1proto.fd \
tex-ot1sarab.fd \
tex-ot1vik.fd \
tex-phnc10.tfm \
tex-phoenician.map \
tex-phoenician.sty \
tex-pmhg.tfm \
tex-proto10.tfm \
tex-protosem.map \
tex-protosem.sty \
tex-runic.sty \
tex-sarab10.tfm \
tex-sarabian.map \
tex-sarabian.sty \
tex-t1aram.fd \
tex-t1copsn.fd \
tex-t1cugar.fd \
tex-t1cypr.fd \
tex-t1etr.fd \
tex-t1fut.fd \
tex-t1givbc.fd \
tex-t1gvibc.fd \
tex-t1linb.fd \
tex-t1nab.fd \
tex-t1oands.fd \
tex-t1phnc.fd \
tex-t1pmhg.fd \
tex-t1proto.fd \
tex-t1sarab.fd \
tex-t1vik.fd \
tex-ugarite.map \
tex-ugarite.sty \
tex-vik10.tfm \
tex-viking.sty \
texlive-archaic"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-archaic-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
