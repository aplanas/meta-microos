SUMMARY = "Serif family, part of the Alegreya “super family”"
DESCRIPTION = "Alegreya is a typeface originally intended for literature. Among its crowning \
characteristics, it conveys a dynamic and varied rhythm which facilitates the \
reading of long texts. Also, it provides freshness to the page while referring \
to the calligraphic letter, not as a literal interpretation, but rather in a \
contemporary typographic language. \
 \
The italic has just as much care and attention to detail in the design as the \
roman. The bold weights are strong, and the Black weights are really \
experimental for the genre. There is also a Small Caps sister family. \
 \
Not only does Alegreya provide great performance, but also achieves a strong \
and harmonious text by means of elements designed in an atmosphere of \
diversity. \
 \
The Alegreya type system is a “super family”, originally intended for \
literature, and includes serif and sans serif sister families. \
 \
It supports expert latin, greek and cyrillic character sets and provides \
advanced typography OpenType features such as small caps, dynamic ligatures and \
fractions, four set of figures, super and subscript characters, ordinals, \
localized accent forms for spanish, catalan, guaraní, dutch, turkish, romanian, \
serbian among others. \
 \
Alegreya was chosen at the ATypI Letter2 competition in September 2011, and one \
of the top 14 text type systems. It was also selected in the 2nd Bienal \
Iberoamericana de Diseño, competition held in Madrid in 2010 and Tipos Latinos. \
 \
Designed by Juan Pablo del Peral for Huerta Tipográfica."
LICENSE = "OFL-1.1"

PV = "2.008"

RPM_NAME = "google-alegreya-fonts-2.008-1.6.noarch.rpm"
RPM_HASH = "21d87b8f84fdec2b057fa567dd9bd5318eb510959ea9d410550f4b23909657870b98b634c26cec3d59e98670303f50bbff837ed997386d90e352f801a4053c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-alegreya-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
