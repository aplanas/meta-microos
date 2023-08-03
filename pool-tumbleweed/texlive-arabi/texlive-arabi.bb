SUMMARY = "(La)TeX support for Arabic and Farsi, compliant with Babel"
DESCRIPTION = "The package provides an Arabic and Farsi script support for TeX \
without the need of any external pre-processor, and in a way \
that is compatible with babel. The bi-directional capability \
supposes that the user has a TeX engine that knows the four \
primitives \\beginR, \\endR, \\beginL and \\endL. That is the case \
in both the TeX--XeT and e-TeX engines. Arabi will accept input \
in several 8-bit encodings, including UTF-8. Arabi can make use \
of a wide variety of Arabic and Farsi fonts, and provides one \
of its own. PDF files generated using Arabi may be searched, \
and text may be copied from them and pasted elsewhere."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44662"

RPM_NAME = "texlive-arabi-2023.209.1.1svn44662-55.1.noarch.rpm"
RPM_HASH = "363ff23052a74e33f693792bee1fe93302c4f0306b1f54dc5863ca47952fa07c102392ff2a5a80e7a4a215faca015b5795721ac2713f7bba8f1fe98f25d37b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8859-6.def \
tex-PPRarabic.sty \
tex-ae-almohanad-xxbold.tfm \
tex-ae-alyermook.tfm \
tex-ae-arab.tfm \
tex-ae-tholoth.tfm \
tex-aealbattar.tfm \
tex-aealmateen.tfm \
tex-aealmohanadb.tfm \
tex-aealmohanadbolditalic.tfm \
tex-aealmothnna.tfm \
tex-aealyermook.tfm \
tex-aearab.tfm \
tex-aecortoba.tfm \
tex-aedimnah.tfm \
tex-aefurat.tfm \
tex-aegranada.tfm \
tex-aegraph.tfm \
tex-aehani.tfm \
tex-aehor.tfm \
tex-aekayrawan.tfm \
tex-aekhalid.tfm \
tex-aemashq.tfm \
tex-aemetal.tfm \
tex-aenada.tfm \
tex-aenagham.tfm \
tex-aenice.tfm \
tex-aeostorah.tfm \
tex-aeouhod.tfm \
tex-aepetra.tfm \
tex-aerehan.tfm \
tex-aesalem.tfm \
tex-aeshado.tfm \
tex-aesharjah.tfm \
tex-aesindibad.tfm \
tex-aetarablus.tfm \
tex-aetholoth.tfm \
tex-arabi.map \
tex-arabi4ht.cfg \
tex-arabic.cfg \
tex-arabic.ldf \
tex-arabicfnt.sty \
tex-arabicore.sty \
tex-arabiftoday.sty \
tex-arabipoetry.sty \
tex-arabnovowel.sty \
tex-ararabeyes.enc \
tex-ardtpnaskh.enc \
tex-ardtpthuluth.enc \
tex-arfonts.sty \
tex-armonotype.enc \
tex-aromega.enc \
tex-arsimplified.enc \
tex-arunicode.enc \
tex-calendrierfpar.sty \
tex-calendrierfpmodified.sty \
tex-cp1256.def \
tex-farsi.ldf \
tex-farsifnt.sty \
tex-farsitex.enc \
tex-farsiwebencoding.enc \
tex-fmultico.sty \
tex-fnum.sty \
tex-frfonts.sty \
tex-frmonotype.enc \
tex-frsimple.enc \
tex-frsimplified.enc \
tex-frunicode.enc \
tex-haparabica.sty \
tex-homa.tfm \
tex-laeaealbattar.fd \
tex-laeaealmateen.fd \
tex-laeaealmohanadb.fd \
tex-laeaealmothnna.fd \
tex-laeaealyermook.fd \
tex-laeaearab.fd \
tex-laeaecortoba.fd \
tex-laeaedimnah.fd \
tex-laeaefurat.fd \
tex-laeaegranada.fd \
tex-laeaegraph.fd \
tex-laeaehani.fd \
tex-laeaehor.fd \
tex-laeaekayrawan.fd \
tex-laeaekhalid.fd \
tex-laeaemashq.fd \
tex-laeaemetal.fd \
tex-laeaenada.fd \
tex-laeaenagham.fd \
tex-laeaenice.fd \
tex-laeaeostorah.fd \
tex-laeaeouhod.fd \
tex-laeaepetra.fd \
tex-laeaerehan.fd \
tex-laeaesalem.fd \
tex-laeaeshado.fd \
tex-laeaesharjah.fd \
tex-laeaesindibad.fd \
tex-laeaetarablus.fd \
tex-laeaetholoth.fd \
tex-laeandlso.fd \
tex-laeararial.fd \
tex-laearcour.fd \
tex-laearomega.fd \
tex-laearsimpo.fd \
tex-laeartimes.fd \
tex-laeasv.fd \
tex-laecmr.fd \
tex-laecmss.fd \
tex-laecmtt.fd \
tex-laedthuluth.fd \
tex-laedtpn.fd \
tex-laedtpnsp.fd \
tex-laeenc.def \
tex-laekacstbook.fd \
tex-laemaghribi.fd \
tex-laenaskhi.fd \
tex-laereqaa.fd \
tex-laetraditionalarabic.fd \
tex-lagally.sty \
tex-lfecmr.fd \
tex-lfecmss.fd \
tex-lfecmtt.fd \
tex-lfeelham.fd \
tex-lfeenc.def \
tex-lfefandlso.fd \
tex-lfefarsismpl.fd \
tex-lfefrarial.fd \
tex-lfefrtimes.fd \
tex-lfeftraditionalarabic.fd \
tex-lfehoma.fd \
tex-lfekoodak.fd \
tex-lfenazli.fd \
tex-lfenazliout.fd \
tex-lferoya.fd \
tex-lfesmplarabic.fd \
tex-lfeterafik.fd \
tex-lfetitr.fd \
tex-lfetitrout.fd \
tex-mosq.def \
tex-nazli.tfm \
tex-nazlib.tfm \
tex-nazlibout.tfm \
tex-nazliout.tfm \
tex-puenc-ar.def \
tex-titr.tfm \
tex-titrout.tfm \
tex-transcmr.fd \
tex-translit.sty \
texlive-arabi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-babel.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-pifont.sty \
tex-pst-3d.sty \
tex-pst-grad.sty \
tex-pst-key.sty \
tex-pstricks.sty \
tex-updmap.cfg \
texlive \
texlive-arabi-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
