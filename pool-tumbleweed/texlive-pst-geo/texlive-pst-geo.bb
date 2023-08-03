SUMMARY = "Geographical Projections"
DESCRIPTION = "The package offers a set of PSTricks related packages for \
various cartographic projections of the terrestrial sphere. The \
package pst-map2d provides conventional projections such as \
Mercator, Lambert, cylindrical, etc. The package pst-map3d \
treats representation in three dimensions of the terrestrial \
sphere. Packages pst-map2dII and pst-map3dII allow use of the \
CIA World DataBank II. Various parameters of the packages allow \
for choice of the level of the detail and the layouts possible \
(cities, borders, rivers etc). Substantial data files are \
provided, in an (internally) compressed format. Decompression \
happens on-the-fly as a document using the data is displayed, \
printed or converted to PDF format. A Perl script is provided \
for the user to do the decompression, if the need should arise."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn60387"

RPM_NAME = "texlive-pst-geo-2023.209.0.0.07svn60387-53.1.noarch.rpm"
RPM_HASH = "a2ba4dc442d8bc7f40c28dd808d6088a38a974cdf07d917882c7d315ce09c7d7d1b39d0591ff04bce60f7ed973f837d40b4e38acb9146dd9975447c43552b31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Staedte3dJG.tex \
tex-africa-bdy-II.dat \
tex-africa-cil-II.dat \
tex-africa-riv-II.dat \
tex-asia-bdy-II.dat \
tex-asia-cil-II.dat \
tex-asia-isl-II.dat \
tex-asia-riv-II.dat \
tex-aus.dat \
tex-c-cap.dat \
tex-c-sub.dat \
tex-canada.dat \
tex-capitals.dat \
tex-capitals.tex \
tex-capitals3d.tex \
tex-cities.tex \
tex-citycapitals.dat \
tex-citysub.dat \
tex-corse.dat \
tex-europe-bdy-II.dat \
tex-europe-cil-II.dat \
tex-europe-riv-II.dat \
tex-france.dat \
tex-germany.dat \
tex-mexico.dat \
tex-northamerica-bdy-II.dat \
tex-northamerica-cil-II.dat \
tex-northamerica-pby-II.dat \
tex-northamerica-riv-II.dat \
tex-pborder.dat \
tex-pcoast.dat \
tex-pisland.dat \
tex-plake.dat \
tex-pst-geo.sty \
tex-pst-geo.tex \
tex-rhone.dat \
tex-ridge.dat \
tex-river.dat \
tex-seine.dat \
tex-southamerica-arc-II.dat \
tex-southamerica-bdy-II.dat \
tex-southamerica-cil-II.dat \
tex-southamerica-riv-II.dat \
tex-transfrm.dat \
tex-trench.dat \
tex-usa.dat \
tex-villesFrance.tex \
tex-villesFrance3d.tex \
tex-villesItalia.tex \
tex-villesItalia3d.tex \
tex-wfraczon.dat \
tex-wmaglin.dat \
texlive-pst-geo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
