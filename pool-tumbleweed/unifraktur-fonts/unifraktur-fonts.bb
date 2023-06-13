SUMMARY = "Fonts from the UniFraktur project"
DESCRIPTION = "Unifraktur provides a number of Fraktur blackletter font faces that \
are optimized for @font-face embedding with CSS. \
 \
UnifrakturMaguntia is a weight-400 font baſed on Peter Wiegel’s font \
'Berthold Mainzer Fraktur'. \
 \
UnifrakturCook is a weight-700 font baſed on Peter Wiegel’s 'Koch \
Fette Deutſche Schrift'. UnifrakturCook uſes the wideſt poſſible \
range of modern ſmart font technologies for diſplaying the font’s \
ligatures, OpenType, Apple Advanced Typography (AAT) and SIL \
Graphite."
LICENSE = "OFL-1.1"

PV = "0.20170319"

RPM_NAME = "unifraktur-fonts-0.20170319-1.10.noarch.rpm"
RPM_HASH = "deec35399257ac777efe7a4f4583c473eef1d368df67d7afd4964884360b92bb1055395e7421248b7aebe5c043bd1df6a365283fda20eebcd864f7d0b22b94b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unifraktur-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
