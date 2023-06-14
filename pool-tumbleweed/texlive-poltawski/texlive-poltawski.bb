SUMMARY = "Antykwa Poltawskiego Family of Fonts"
DESCRIPTION = "The package contains the Antykwa Poltawskiego family of fonts \
in the PostScript Type 1 and OpenType formats. The original \
font was designed in the twenties of the XX century by the \
Polish typographer Adam Poltawski(1881-1952). Following the \
route set out by the Latin Modern and TeX Gyre projects \
(http://www.gust.org.pl/projects/e-foundry), the Antykwa \
Poltawskiego digitisation project aims at providing a rich \
collection of diacritical characters in the attempt to cover as \
many Latin-based scripts as possible. To our knowledge, the \
repertoire of characters covers all European languages as well \
as some other Latin-based alphabets such as Vietnamese and \
Navajo; at the request of users, recent extensions (following \
the enhancement of the Latin Modern collection) provide glyphs \
sufficient for typesetting of romanized transliterations of \
Arabic and Sanskrit scripts. The Antykwa Poltawskiego family \
consists of 4 weights (light, normal, medium, bold), each \
having upright and italic forms and one of 5 design sizes: 6, \
8, 10, 12 and 17pt. Altogether, the collection comprises 40 \
font files, containing the same repertoire of 1126 characters. \
The preliminary version of Antykwa Poltawskiego (antp package) \
released in 2000 is rendered obsolete by this package."
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.101svn20075"

RPM_NAME = "texlive-poltawski-2023.201.1.101svn20075-52.1.noarch.rpm"
RPM_HASH = "9b9e7f30edfc306954c478a4ff6cbca1dec9d78416528619ad0f312e7aee4df2e0a5dcc96abb7c1587d3af2e6ebfb2c01ec8e86d200450e87f2e2d73b4c36ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antpolt.sty \
tex-ap-cs-sc.enc \
tex-ap-cs.enc \
tex-ap-cs.map \
tex-ap-ec-sc.enc \
tex-ap-ec.enc \
tex-ap-ec.map \
tex-ap-l7x-sc.enc \
tex-ap-l7x.enc \
tex-ap-l7x.map \
tex-ap-qx-sc.enc \
tex-ap-qx.enc \
tex-ap-qx.map \
tex-ap-rm-sc.enc \
tex-ap-rm.enc \
tex-ap-rm.map \
tex-ap-t5-sc.enc \
tex-ap-t5.enc \
tex-ap-t5.map \
tex-ap-texnansi-sc.enc \
tex-ap-texnansi.enc \
tex-ap-texnansi.map \
tex-ap-ts1.enc \
tex-ap-ts1.map \
tex-ap.map \
tex-cs-antpb10-sc.tfm \
tex-cs-antpb10.tfm \
tex-cs-antpb12-sc.tfm \
tex-cs-antpb12.tfm \
tex-cs-antpb17-sc.tfm \
tex-cs-antpb17.tfm \
tex-cs-antpb6-sc.tfm \
tex-cs-antpb6.tfm \
tex-cs-antpb8-sc.tfm \
tex-cs-antpb8.tfm \
tex-cs-antpbi10-sc.tfm \
tex-cs-antpbi10.tfm \
tex-cs-antpbi12-sc.tfm \
tex-cs-antpbi12.tfm \
tex-cs-antpbi17-sc.tfm \
tex-cs-antpbi17.tfm \
tex-cs-antpbi6-sc.tfm \
tex-cs-antpbi6.tfm \
tex-cs-antpbi8-sc.tfm \
tex-cs-antpbi8.tfm \
tex-cs-antpl10-sc.tfm \
tex-cs-antpl10.tfm \
tex-cs-antpl12-sc.tfm \
tex-cs-antpl12.tfm \
tex-cs-antpl17-sc.tfm \
tex-cs-antpl17.tfm \
tex-cs-antpl6-sc.tfm \
tex-cs-antpl6.tfm \
tex-cs-antpl8-sc.tfm \
tex-cs-antpl8.tfm \
tex-cs-antpli10-sc.tfm \
tex-cs-antpli10.tfm \
tex-cs-antpli12-sc.tfm \
tex-cs-antpli12.tfm \
tex-cs-antpli17-sc.tfm \
tex-cs-antpli17.tfm \
tex-cs-antpli6-sc.tfm \
tex-cs-antpli6.tfm \
tex-cs-antpli8-sc.tfm \
tex-cs-antpli8.tfm \
tex-cs-antpm10-sc.tfm \
tex-cs-antpm10.tfm \
tex-cs-antpm12-sc.tfm \
tex-cs-antpm12.tfm \
tex-cs-antpm17-sc.tfm \
tex-cs-antpm17.tfm \
tex-cs-antpm6-sc.tfm \
tex-cs-antpm6.tfm \
tex-cs-antpm8-sc.tfm \
tex-cs-antpm8.tfm \
tex-cs-antpmi10-sc.tfm \
tex-cs-antpmi10.tfm \
tex-cs-antpmi12-sc.tfm \
tex-cs-antpmi12.tfm \
tex-cs-antpmi17-sc.tfm \
tex-cs-antpmi17.tfm \
tex-cs-antpmi6-sc.tfm \
tex-cs-antpmi6.tfm \
tex-cs-antpmi8-sc.tfm \
tex-cs-antpmi8.tfm \
tex-cs-antpr10-sc.tfm \
tex-cs-antpr10.tfm \
tex-cs-antpr12-sc.tfm \
tex-cs-antpr12.tfm \
tex-cs-antpr17-sc.tfm \
tex-cs-antpr17.tfm \
tex-cs-antpr6-sc.tfm \
tex-cs-antpr6.tfm \
tex-cs-antpr8-sc.tfm \
tex-cs-antpr8.tfm \
tex-cs-antpri10-sc.tfm \
tex-cs-antpri10.tfm \
tex-cs-antpri12-sc.tfm \
tex-cs-antpri12.tfm \
tex-cs-antpri17-sc.tfm \
tex-cs-antpri17.tfm \
tex-cs-antpri6-sc.tfm \
tex-cs-antpri6.tfm \
tex-cs-antpri8-sc.tfm \
tex-cs-antpri8.tfm \
tex-ec-antpb10-sc.tfm \
tex-ec-antpb10.tfm \
tex-ec-antpb12-sc.tfm \
tex-ec-antpb12.tfm \
tex-ec-antpb17-sc.tfm \
tex-ec-antpb17.tfm \
tex-ec-antpb6-sc.tfm \
tex-ec-antpb6.tfm \
tex-ec-antpb8-sc.tfm \
tex-ec-antpb8.tfm \
tex-ec-antpbi10-sc.tfm \
tex-ec-antpbi10.tfm \
tex-ec-antpbi12-sc.tfm \
tex-ec-antpbi12.tfm \
tex-ec-antpbi17-sc.tfm \
tex-ec-antpbi17.tfm \
tex-ec-antpbi6-sc.tfm \
tex-ec-antpbi6.tfm \
tex-ec-antpbi8-sc.tfm \
tex-ec-antpbi8.tfm \
tex-ec-antpl10-sc.tfm \
tex-ec-antpl10.tfm \
tex-ec-antpl12-sc.tfm \
tex-ec-antpl12.tfm \
tex-ec-antpl17-sc.tfm \
tex-ec-antpl17.tfm \
tex-ec-antpl6-sc.tfm \
tex-ec-antpl6.tfm \
tex-ec-antpl8-sc.tfm \
tex-ec-antpl8.tfm \
tex-ec-antpli10-sc.tfm \
tex-ec-antpli10.tfm \
tex-ec-antpli12-sc.tfm \
tex-ec-antpli12.tfm \
tex-ec-antpli17-sc.tfm \
tex-ec-antpli17.tfm \
tex-ec-antpli6-sc.tfm \
tex-ec-antpli6.tfm \
tex-ec-antpli8-sc.tfm \
tex-ec-antpli8.tfm \
tex-ec-antpm10-sc.tfm \
tex-ec-antpm10.tfm \
tex-ec-antpm12-sc.tfm \
tex-ec-antpm12.tfm \
tex-ec-antpm17-sc.tfm \
tex-ec-antpm17.tfm \
tex-ec-antpm6-sc.tfm \
tex-ec-antpm6.tfm \
tex-ec-antpm8-sc.tfm \
tex-ec-antpm8.tfm \
tex-ec-antpmi10-sc.tfm \
tex-ec-antpmi10.tfm \
tex-ec-antpmi12-sc.tfm \
tex-ec-antpmi12.tfm \
tex-ec-antpmi17-sc.tfm \
tex-ec-antpmi17.tfm \
tex-ec-antpmi6-sc.tfm \
tex-ec-antpmi6.tfm \
tex-ec-antpmi8-sc.tfm \
tex-ec-antpmi8.tfm \
tex-ec-antpr10-sc.tfm \
tex-ec-antpr10.tfm \
tex-ec-antpr12-sc.tfm \
tex-ec-antpr12.tfm \
tex-ec-antpr17-sc.tfm \
tex-ec-antpr17.tfm \
tex-ec-antpr6-sc.tfm \
tex-ec-antpr6.tfm \
tex-ec-antpr8-sc.tfm \
tex-ec-antpr8.tfm \
tex-ec-antpri10-sc.tfm \
tex-ec-antpri10.tfm \
tex-ec-antpri12-sc.tfm \
tex-ec-antpri12.tfm \
tex-ec-antpri17-sc.tfm \
tex-ec-antpri17.tfm \
tex-ec-antpri6-sc.tfm \
tex-ec-antpri6.tfm \
tex-ec-antpri8-sc.tfm \
tex-ec-antpri8.tfm \
tex-il2antp.fd \
tex-il2antpl.fd \
tex-l7x-antpb10-sc.tfm \
tex-l7x-antpb10.tfm \
tex-l7x-antpb12-sc.tfm \
tex-l7x-antpb12.tfm \
tex-l7x-antpb17-sc.tfm \
tex-l7x-antpb17.tfm \
tex-l7x-antpb6-sc.tfm \
tex-l7x-antpb6.tfm \
tex-l7x-antpb8-sc.tfm \
tex-l7x-antpb8.tfm \
tex-l7x-antpbi10-sc.tfm \
tex-l7x-antpbi10.tfm \
tex-l7x-antpbi12-sc.tfm \
tex-l7x-antpbi12.tfm \
tex-l7x-antpbi17-sc.tfm \
tex-l7x-antpbi17.tfm \
tex-l7x-antpbi6-sc.tfm \
tex-l7x-antpbi6.tfm \
tex-l7x-antpbi8-sc.tfm \
tex-l7x-antpbi8.tfm \
tex-l7x-antpl10-sc.tfm \
tex-l7x-antpl10.tfm \
tex-l7x-antpl12-sc.tfm \
tex-l7x-antpl12.tfm \
tex-l7x-antpl17-sc.tfm \
tex-l7x-antpl17.tfm \
tex-l7x-antpl6-sc.tfm \
tex-l7x-antpl6.tfm \
tex-l7x-antpl8-sc.tfm \
tex-l7x-antpl8.tfm \
tex-l7x-antpli10-sc.tfm \
tex-l7x-antpli10.tfm \
tex-l7x-antpli12-sc.tfm \
tex-l7x-antpli12.tfm \
tex-l7x-antpli17-sc.tfm \
tex-l7x-antpli17.tfm \
tex-l7x-antpli6-sc.tfm \
tex-l7x-antpli6.tfm \
tex-l7x-antpli8-sc.tfm \
tex-l7x-antpli8.tfm \
tex-l7x-antpm10-sc.tfm \
tex-l7x-antpm10.tfm \
tex-l7x-antpm12-sc.tfm \
tex-l7x-antpm12.tfm \
tex-l7x-antpm17-sc.tfm \
tex-l7x-antpm17.tfm \
tex-l7x-antpm6-sc.tfm \
tex-l7x-antpm6.tfm \
tex-l7x-antpm8-sc.tfm \
tex-l7x-antpm8.tfm \
tex-l7x-antpmi10-sc.tfm \
tex-l7x-antpmi10.tfm \
tex-l7x-antpmi12-sc.tfm \
tex-l7x-antpmi12.tfm \
tex-l7x-antpmi17-sc.tfm \
tex-l7x-antpmi17.tfm \
tex-l7x-antpmi6-sc.tfm \
tex-l7x-antpmi6.tfm \
tex-l7x-antpmi8-sc.tfm \
tex-l7x-antpmi8.tfm \
tex-l7x-antpr10-sc.tfm \
tex-l7x-antpr10.tfm \
tex-l7x-antpr12-sc.tfm \
tex-l7x-antpr12.tfm \
tex-l7x-antpr17-sc.tfm \
tex-l7x-antpr17.tfm \
tex-l7x-antpr6-sc.tfm \
tex-l7x-antpr6.tfm \
tex-l7x-antpr8-sc.tfm \
tex-l7x-antpr8.tfm \
tex-l7x-antpri10-sc.tfm \
tex-l7x-antpri10.tfm \
tex-l7x-antpri12-sc.tfm \
tex-l7x-antpri12.tfm \
tex-l7x-antpri17-sc.tfm \
tex-l7x-antpri17.tfm \
tex-l7x-antpri6-sc.tfm \
tex-l7x-antpri6.tfm \
tex-l7x-antpri8-sc.tfm \
tex-l7x-antpri8.tfm \
tex-l7xantp.fd \
tex-l7xantpl.fd \
tex-ly1antp.fd \
tex-ly1antpl.fd \
tex-ot1antp.fd \
tex-ot1antpl.fd \
tex-ot4antp.fd \
tex-ot4antpl.fd \
tex-qx-antpb10-sc.tfm \
tex-qx-antpb10.tfm \
tex-qx-antpb12-sc.tfm \
tex-qx-antpb12.tfm \
tex-qx-antpb17-sc.tfm \
tex-qx-antpb17.tfm \
tex-qx-antpb6-sc.tfm \
tex-qx-antpb6.tfm \
tex-qx-antpb8-sc.tfm \
tex-qx-antpb8.tfm \
tex-qx-antpbi10-sc.tfm \
tex-qx-antpbi10.tfm \
tex-qx-antpbi12-sc.tfm \
tex-qx-antpbi12.tfm \
tex-qx-antpbi17-sc.tfm \
tex-qx-antpbi17.tfm \
tex-qx-antpbi6-sc.tfm \
tex-qx-antpbi6.tfm \
tex-qx-antpbi8-sc.tfm \
tex-qx-antpbi8.tfm \
tex-qx-antpl10-sc.tfm \
tex-qx-antpl10.tfm \
tex-qx-antpl12-sc.tfm \
tex-qx-antpl12.tfm \
tex-qx-antpl17-sc.tfm \
tex-qx-antpl17.tfm \
tex-qx-antpl6-sc.tfm \
tex-qx-antpl6.tfm \
tex-qx-antpl8-sc.tfm \
tex-qx-antpl8.tfm \
tex-qx-antpli10-sc.tfm \
tex-qx-antpli10.tfm \
tex-qx-antpli12-sc.tfm \
tex-qx-antpli12.tfm \
tex-qx-antpli17-sc.tfm \
tex-qx-antpli17.tfm \
tex-qx-antpli6-sc.tfm \
tex-qx-antpli6.tfm \
tex-qx-antpli8-sc.tfm \
tex-qx-antpli8.tfm \
tex-qx-antpm10-sc.tfm \
tex-qx-antpm10.tfm \
tex-qx-antpm12-sc.tfm \
tex-qx-antpm12.tfm \
tex-qx-antpm17-sc.tfm \
tex-qx-antpm17.tfm \
tex-qx-antpm6-sc.tfm \
tex-qx-antpm6.tfm \
tex-qx-antpm8-sc.tfm \
tex-qx-antpm8.tfm \
tex-qx-antpmi10-sc.tfm \
tex-qx-antpmi10.tfm \
tex-qx-antpmi12-sc.tfm \
tex-qx-antpmi12.tfm \
tex-qx-antpmi17-sc.tfm \
tex-qx-antpmi17.tfm \
tex-qx-antpmi6-sc.tfm \
tex-qx-antpmi6.tfm \
tex-qx-antpmi8-sc.tfm \
tex-qx-antpmi8.tfm \
tex-qx-antpr10-sc.tfm \
tex-qx-antpr10.tfm \
tex-qx-antpr12-sc.tfm \
tex-qx-antpr12.tfm \
tex-qx-antpr17-sc.tfm \
tex-qx-antpr17.tfm \
tex-qx-antpr6-sc.tfm \
tex-qx-antpr6.tfm \
tex-qx-antpr8-sc.tfm \
tex-qx-antpr8.tfm \
tex-qx-antpri10-sc.tfm \
tex-qx-antpri10.tfm \
tex-qx-antpri12-sc.tfm \
tex-qx-antpri12.tfm \
tex-qx-antpri17-sc.tfm \
tex-qx-antpri17.tfm \
tex-qx-antpri6-sc.tfm \
tex-qx-antpri6.tfm \
tex-qx-antpri8-sc.tfm \
tex-qx-antpri8.tfm \
tex-qxantp.fd \
tex-qxantpl.fd \
tex-rm-antpb10-sc.tfm \
tex-rm-antpb10.tfm \
tex-rm-antpb12-sc.tfm \
tex-rm-antpb12.tfm \
tex-rm-antpb17-sc.tfm \
tex-rm-antpb17.tfm \
tex-rm-antpb6-sc.tfm \
tex-rm-antpb6.tfm \
tex-rm-antpb8-sc.tfm \
tex-rm-antpb8.tfm \
tex-rm-antpbi10-sc.tfm \
tex-rm-antpbi10.tfm \
tex-rm-antpbi12-sc.tfm \
tex-rm-antpbi12.tfm \
tex-rm-antpbi17-sc.tfm \
tex-rm-antpbi17.tfm \
tex-rm-antpbi6-sc.tfm \
tex-rm-antpbi6.tfm \
tex-rm-antpbi8-sc.tfm \
tex-rm-antpbi8.tfm \
tex-rm-antpl10-sc.tfm \
tex-rm-antpl10.tfm \
tex-rm-antpl12-sc.tfm \
tex-rm-antpl12.tfm \
tex-rm-antpl17-sc.tfm \
tex-rm-antpl17.tfm \
tex-rm-antpl6-sc.tfm \
tex-rm-antpl6.tfm \
tex-rm-antpl8-sc.tfm \
tex-rm-antpl8.tfm \
tex-rm-antpli10-sc.tfm \
tex-rm-antpli10.tfm \
tex-rm-antpli12-sc.tfm \
tex-rm-antpli12.tfm \
tex-rm-antpli17-sc.tfm \
tex-rm-antpli17.tfm \
tex-rm-antpli6-sc.tfm \
tex-rm-antpli6.tfm \
tex-rm-antpli8-sc.tfm \
tex-rm-antpli8.tfm \
tex-rm-antpm10-sc.tfm \
tex-rm-antpm10.tfm \
tex-rm-antpm12-sc.tfm \
tex-rm-antpm12.tfm \
tex-rm-antpm17-sc.tfm \
tex-rm-antpm17.tfm \
tex-rm-antpm6-sc.tfm \
tex-rm-antpm6.tfm \
tex-rm-antpm8-sc.tfm \
tex-rm-antpm8.tfm \
tex-rm-antpmi10-sc.tfm \
tex-rm-antpmi10.tfm \
tex-rm-antpmi12-sc.tfm \
tex-rm-antpmi12.tfm \
tex-rm-antpmi17-sc.tfm \
tex-rm-antpmi17.tfm \
tex-rm-antpmi6-sc.tfm \
tex-rm-antpmi6.tfm \
tex-rm-antpmi8-sc.tfm \
tex-rm-antpmi8.tfm \
tex-rm-antpr10-sc.tfm \
tex-rm-antpr10.tfm \
tex-rm-antpr12-sc.tfm \
tex-rm-antpr12.tfm \
tex-rm-antpr17-sc.tfm \
tex-rm-antpr17.tfm \
tex-rm-antpr6-sc.tfm \
tex-rm-antpr6.tfm \
tex-rm-antpr8-sc.tfm \
tex-rm-antpr8.tfm \
tex-rm-antpri10-sc.tfm \
tex-rm-antpri10.tfm \
tex-rm-antpri12-sc.tfm \
tex-rm-antpri12.tfm \
tex-rm-antpri17-sc.tfm \
tex-rm-antpri17.tfm \
tex-rm-antpri6-sc.tfm \
tex-rm-antpri6.tfm \
tex-rm-antpri8-sc.tfm \
tex-rm-antpri8.tfm \
tex-t1antp.fd \
tex-t1antpl.fd \
tex-t5-antpb10-sc.tfm \
tex-t5-antpb10.tfm \
tex-t5-antpb12-sc.tfm \
tex-t5-antpb12.tfm \
tex-t5-antpb17-sc.tfm \
tex-t5-antpb17.tfm \
tex-t5-antpb6-sc.tfm \
tex-t5-antpb6.tfm \
tex-t5-antpb8-sc.tfm \
tex-t5-antpb8.tfm \
tex-t5-antpbi10-sc.tfm \
tex-t5-antpbi10.tfm \
tex-t5-antpbi12-sc.tfm \
tex-t5-antpbi12.tfm \
tex-t5-antpbi17-sc.tfm \
tex-t5-antpbi17.tfm \
tex-t5-antpbi6-sc.tfm \
tex-t5-antpbi6.tfm \
tex-t5-antpbi8-sc.tfm \
tex-t5-antpbi8.tfm \
tex-t5-antpl10-sc.tfm \
tex-t5-antpl10.tfm \
tex-t5-antpl12-sc.tfm \
tex-t5-antpl12.tfm \
tex-t5-antpl17-sc.tfm \
tex-t5-antpl17.tfm \
tex-t5-antpl6-sc.tfm \
tex-t5-antpl6.tfm \
tex-t5-antpl8-sc.tfm \
tex-t5-antpl8.tfm \
tex-t5-antpli10-sc.tfm \
tex-t5-antpli10.tfm \
tex-t5-antpli12-sc.tfm \
tex-t5-antpli12.tfm \
tex-t5-antpli17-sc.tfm \
tex-t5-antpli17.tfm \
tex-t5-antpli6-sc.tfm \
tex-t5-antpli6.tfm \
tex-t5-antpli8-sc.tfm \
tex-t5-antpli8.tfm \
tex-t5-antpm10-sc.tfm \
tex-t5-antpm10.tfm \
tex-t5-antpm12-sc.tfm \
tex-t5-antpm12.tfm \
tex-t5-antpm17-sc.tfm \
tex-t5-antpm17.tfm \
tex-t5-antpm6-sc.tfm \
tex-t5-antpm6.tfm \
tex-t5-antpm8-sc.tfm \
tex-t5-antpm8.tfm \
tex-t5-antpmi10-sc.tfm \
tex-t5-antpmi10.tfm \
tex-t5-antpmi12-sc.tfm \
tex-t5-antpmi12.tfm \
tex-t5-antpmi17-sc.tfm \
tex-t5-antpmi17.tfm \
tex-t5-antpmi6-sc.tfm \
tex-t5-antpmi6.tfm \
tex-t5-antpmi8-sc.tfm \
tex-t5-antpmi8.tfm \
tex-t5-antpr10-sc.tfm \
tex-t5-antpr10.tfm \
tex-t5-antpr12-sc.tfm \
tex-t5-antpr12.tfm \
tex-t5-antpr17-sc.tfm \
tex-t5-antpr17.tfm \
tex-t5-antpr6-sc.tfm \
tex-t5-antpr6.tfm \
tex-t5-antpr8-sc.tfm \
tex-t5-antpr8.tfm \
tex-t5-antpri10-sc.tfm \
tex-t5-antpri10.tfm \
tex-t5-antpri12-sc.tfm \
tex-t5-antpri12.tfm \
tex-t5-antpri17-sc.tfm \
tex-t5-antpri17.tfm \
tex-t5-antpri6-sc.tfm \
tex-t5-antpri6.tfm \
tex-t5-antpri8-sc.tfm \
tex-t5-antpri8.tfm \
tex-t5antp.fd \
tex-t5antpl.fd \
tex-texnansi-antpb10-sc.tfm \
tex-texnansi-antpb10.tfm \
tex-texnansi-antpb12-sc.tfm \
tex-texnansi-antpb12.tfm \
tex-texnansi-antpb17-sc.tfm \
tex-texnansi-antpb17.tfm \
tex-texnansi-antpb6-sc.tfm \
tex-texnansi-antpb6.tfm \
tex-texnansi-antpb8-sc.tfm \
tex-texnansi-antpb8.tfm \
tex-texnansi-antpbi10-sc.tfm \
tex-texnansi-antpbi10.tfm \
tex-texnansi-antpbi12-sc.tfm \
tex-texnansi-antpbi12.tfm \
tex-texnansi-antpbi17-sc.tfm \
tex-texnansi-antpbi17.tfm \
tex-texnansi-antpbi6-sc.tfm \
tex-texnansi-antpbi6.tfm \
tex-texnansi-antpbi8-sc.tfm \
tex-texnansi-antpbi8.tfm \
tex-texnansi-antpl10-sc.tfm \
tex-texnansi-antpl10.tfm \
tex-texnansi-antpl12-sc.tfm \
tex-texnansi-antpl12.tfm \
tex-texnansi-antpl17-sc.tfm \
tex-texnansi-antpl17.tfm \
tex-texnansi-antpl6-sc.tfm \
tex-texnansi-antpl6.tfm \
tex-texnansi-antpl8-sc.tfm \
tex-texnansi-antpl8.tfm \
tex-texnansi-antpli10-sc.tfm \
tex-texnansi-antpli10.tfm \
tex-texnansi-antpli12-sc.tfm \
tex-texnansi-antpli12.tfm \
tex-texnansi-antpli17-sc.tfm \
tex-texnansi-antpli17.tfm \
tex-texnansi-antpli6-sc.tfm \
tex-texnansi-antpli6.tfm \
tex-texnansi-antpli8-sc.tfm \
tex-texnansi-antpli8.tfm \
tex-texnansi-antpm10-sc.tfm \
tex-texnansi-antpm10.tfm \
tex-texnansi-antpm12-sc.tfm \
tex-texnansi-antpm12.tfm \
tex-texnansi-antpm17-sc.tfm \
tex-texnansi-antpm17.tfm \
tex-texnansi-antpm6-sc.tfm \
tex-texnansi-antpm6.tfm \
tex-texnansi-antpm8-sc.tfm \
tex-texnansi-antpm8.tfm \
tex-texnansi-antpmi10-sc.tfm \
tex-texnansi-antpmi10.tfm \
tex-texnansi-antpmi12-sc.tfm \
tex-texnansi-antpmi12.tfm \
tex-texnansi-antpmi17-sc.tfm \
tex-texnansi-antpmi17.tfm \
tex-texnansi-antpmi6-sc.tfm \
tex-texnansi-antpmi6.tfm \
tex-texnansi-antpmi8-sc.tfm \
tex-texnansi-antpmi8.tfm \
tex-texnansi-antpr10-sc.tfm \
tex-texnansi-antpr10.tfm \
tex-texnansi-antpr12-sc.tfm \
tex-texnansi-antpr12.tfm \
tex-texnansi-antpr17-sc.tfm \
tex-texnansi-antpr17.tfm \
tex-texnansi-antpr6-sc.tfm \
tex-texnansi-antpr6.tfm \
tex-texnansi-antpr8-sc.tfm \
tex-texnansi-antpr8.tfm \
tex-texnansi-antpri10-sc.tfm \
tex-texnansi-antpri10.tfm \
tex-texnansi-antpri12-sc.tfm \
tex-texnansi-antpri12.tfm \
tex-texnansi-antpri17-sc.tfm \
tex-texnansi-antpri17.tfm \
tex-texnansi-antpri6-sc.tfm \
tex-texnansi-antpri6.tfm \
tex-texnansi-antpri8-sc.tfm \
tex-texnansi-antpri8.tfm \
tex-ts1-antpb10.tfm \
tex-ts1-antpb12.tfm \
tex-ts1-antpb17.tfm \
tex-ts1-antpb6.tfm \
tex-ts1-antpb8.tfm \
tex-ts1-antpbi10.tfm \
tex-ts1-antpbi12.tfm \
tex-ts1-antpbi17.tfm \
tex-ts1-antpbi6.tfm \
tex-ts1-antpbi8.tfm \
tex-ts1-antpl10.tfm \
tex-ts1-antpl12.tfm \
tex-ts1-antpl17.tfm \
tex-ts1-antpl6.tfm \
tex-ts1-antpl8.tfm \
tex-ts1-antpli10.tfm \
tex-ts1-antpli12.tfm \
tex-ts1-antpli17.tfm \
tex-ts1-antpli6.tfm \
tex-ts1-antpli8.tfm \
tex-ts1-antpm10.tfm \
tex-ts1-antpm12.tfm \
tex-ts1-antpm17.tfm \
tex-ts1-antpm6.tfm \
tex-ts1-antpm8.tfm \
tex-ts1-antpmi10.tfm \
tex-ts1-antpmi12.tfm \
tex-ts1-antpmi17.tfm \
tex-ts1-antpmi6.tfm \
tex-ts1-antpmi8.tfm \
tex-ts1-antpr10.tfm \
tex-ts1-antpr12.tfm \
tex-ts1-antpr17.tfm \
tex-ts1-antpr6.tfm \
tex-ts1-antpr8.tfm \
tex-ts1-antpri10.tfm \
tex-ts1-antpri12.tfm \
tex-ts1-antpri17.tfm \
tex-ts1-antpri6.tfm \
tex-ts1-antpri8.tfm \
tex-ts1antp.fd \
tex-ts1antpl.fd \
texlive-poltawski"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-poltawski-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
