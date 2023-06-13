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

PV = "2023.201.0.0.07svn60387"

RPM_NAME = "texlive-pst-geo-2023.201.0.0.07svn60387-52.1.noarch.rpm"
RPM_HASH = "5b1bf44317a7bec87701efb34f46c37ea66dd8ccb557e27c40a6b0eb31b19b41525aabad2b0b5b8d6a9ae70a0274105af5e951b6fcde5d4a879569d7892ff292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Staedte3dJG.tex) \
tex(africa-bdy_II.dat) \
tex(africa-cil_II.dat) \
tex(africa-riv_II.dat) \
tex(asia-bdy_II.dat) \
tex(asia-cil_II.dat) \
tex(asia-isl_II.dat) \
tex(asia-riv_II.dat) \
tex(aus.dat) \
tex(c-cap.dat) \
tex(c-sub.dat) \
tex(canada.dat) \
tex(capitals.dat) \
tex(capitals.tex) \
tex(capitals3d.tex) \
tex(cities.tex) \
tex(citycapitals.dat) \
tex(citysub.dat) \
tex(corse.dat) \
tex(europe-bdy_II.dat) \
tex(europe-cil_II.dat) \
tex(europe-riv_II.dat) \
tex(france.dat) \
tex(germany.dat) \
tex(mexico.dat) \
tex(northamerica-bdy_II.dat) \
tex(northamerica-cil_II.dat) \
tex(northamerica-pby_II.dat) \
tex(northamerica-riv_II.dat) \
tex(pborder.dat) \
tex(pcoast.dat) \
tex(pisland.dat) \
tex(plake.dat) \
tex(pst-geo.sty) \
tex(pst-geo.tex) \
tex(rhone.dat) \
tex(ridge.dat) \
tex(river.dat) \
tex(seine.dat) \
tex(southamerica-arc_II.dat) \
tex(southamerica-bdy_II.dat) \
tex(southamerica-cil_II.dat) \
tex(southamerica-riv_II.dat) \
tex(transfrm.dat) \
tex(trench.dat) \
tex(usa.dat) \
tex(villesFrance.tex) \
tex(villesFrance3d.tex) \
tex(villesItalia.tex) \
tex(villesItalia3d.tex) \
tex(wfraczon.dat) \
tex(wmaglin.dat) \
texlive-pst-geo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
