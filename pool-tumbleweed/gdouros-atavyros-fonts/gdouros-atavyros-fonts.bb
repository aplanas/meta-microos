SUMMARY = "Parangonne Greque Typeface"
DESCRIPTION = "Robert Granjon (1513 – 1589) produced his Parangonne Greque typeface (Garmond size) at the instigation of Plantin as a counterpart to Garamond’s Grec du roi, in Antwerp Holland, between 1560 - 1565. A version of the font was used (a century later!) for the 1692 edition of Diogenes Laertius by Aegidius Menagius (Gilles Ménage of Angers, 1613 – 92), published by Henric Wetstenium in Amsterdam. A second variant, at Kolonel size, was cut by Nikolaas Kis for the Greek-Dutch edition of the New Testament in 1698, again by Henric Wetstenium. A digital revival, was prepared by Ralph P. Hancock, in his Vusillus font. Latin and Cyrillic are based on a Goudy typeface. The font covers the Windows Glyph List, Greek Extended, various typographic extras and some Open Type features (Numerators, Denominators, Fractions, Old Style Figures, Historical Forms, Stylistic Alternates, Ligatures)."
LICENSE = "SUSE-Permissive"

PV = "1.01"

RPM_NAME = "gdouros-atavyros-fonts-1.01-3.21.noarch.rpm"
RPM_HASH = "23aaf9bae875ccdb3d66f68b80a8c2606066f3099523cfe2b7825cba3172f682bbb8cfb2e1d3cfd108b4ffc1dd29b9f52bde91d0ba6fef6431df2dfc1b355ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atavyros-fonts \
gdouros-atavyros-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
