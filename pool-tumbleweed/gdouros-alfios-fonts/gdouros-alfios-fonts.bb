SUMMARY = "Fonts Based on the Work of Firmin Didot and Richard Porson"
DESCRIPTION = "Lowercase upright Greek were designed in 1805 by Firmin Didot (1764 – 1836) and cut by Walfard and Vibert. The typeface, together with a complete printing house, was donated in 1821 to the new Greek state by Didot’s son, Ambroise Firmin Didot (1790 – 1876). Lowercase italic Greek were designed in 1802 by Richard Porson (1757 – 1808) and cut by Richard Austin. They were first used by Cambridge University Press in 1810. Capitals, Latin and Cyrillic, as well as the complete bold weights, have been designed in an attempt to create a well-balanced font. The font covers the Windows Glyph List, Greek Extended, various typographic extras and some Open Type features (Numerators, Denominators, Fractions, Old Style Figures, Historical Forms, Stylistic Alternates, Ligatures); it is available in regular, italic, bold and bold italic."
LICENSE = "SUSE-Permissive"

PV = "1.01"

RPM_NAME = "gdouros-alfios-fonts-1.01-3.19.noarch.rpm"
RPM_HASH = "c63eca4a45aadc04cd2f78495872e1d3c28af3b327cfa44544c79c9cfbfc4011ac416ef9241ca781cbdefc143c10691e5c8e0165a09eb72b7e399f14950a7336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alfios-fonts \
gdouros-alfios-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
