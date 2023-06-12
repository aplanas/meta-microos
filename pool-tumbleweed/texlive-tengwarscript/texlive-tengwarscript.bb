SUMMARY = "LaTeX support for using Tengwar fonts"
DESCRIPTION = "The package provides 'mid-level' access to tengwar fonts, \
providing good quality output. Each tengwar sign is represented \
by a command, which will place the sign nicely in relation to \
previous signs. A transcription package is available from the \
package's home page: writing all those tengwar commands would \
quickly become untenable. The package supports the use of a \
wide variety of tengwar fonts that are available from the net; \
metric and map files are provided for all the supported fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1svn34594"

RPM_NAME = "texlive-tengwarscript-2023.201.1.3.1svn34594-54.1.noarch.rpm"
RPM_HASH = "b100d9a1395393b862aa179d151054e43efe91bacb564f687651ab37d01f85065dd1f8fddefeb647fd323ea27c5db0bf8d580b7348409209ccbaaa3f11e0ff93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Elfica32.tfm) \
tex(Parmaite.tfm) \
tex(Parmaite_alt.tfm) \
tex(Parmaite_full.tfm) \
tex(Parmaite_full.vf) \
tex(TengwarFormal12.tfm) \
tex(TengwarFormalA12.tfm) \
tex(TengwarFormal_full.tfm) \
tex(TengwarFormal_full.vf) \
tex(TengwarGothika050.tfm) \
tex(TengwarNoldor.tfm) \
tex(TengwarNoldorAlt.tfm) \
tex(TengwarNoldorCapitals1.tfm) \
tex(TengwarNoldorCapitals2.tfm) \
tex(TengwarNoldor_full.tfm) \
tex(TengwarNoldor_full.vf) \
tex(TengwarQuenya.tfm) \
tex(TengwarQuenyaAlt.tfm) \
tex(TengwarQuenyaCapitals1.tfm) \
tex(TengwarQuenyaCapitals2.tfm) \
tex(TengwarQuenya_full.tfm) \
tex(TengwarQuenya_full.vf) \
tex(TengwarSindarin.tfm) \
tex(TengwarSindarinAlt.tfm) \
tex(TengwarSindarinCapitals1.tfm) \
tex(TengwarSindarinCapitals2.tfm) \
tex(TengwarSindarin_full.tfm) \
tex(TengwarSindarin_full.vf) \
tex(TengwarTelerin.tfm) \
tex(UnicodeParmaite.tfm) \
tex(annatar.cfg) \
tex(annatarbold.cfg) \
tex(annatarbolditalic.cfg) \
tex(annataritalic.cfg) \
tex(elfica.cfg) \
tex(formal.cfg) \
tex(gothika.cfg) \
tex(noldor.cfg) \
tex(noldorcapI.cfg) \
tex(noldorcapII.cfg) \
tex(parmaite.cfg) \
tex(quenya.cfg) \
tex(quenyacapI.cfg) \
tex(quenyacapII.cfg) \
tex(sindarin.cfg) \
tex(sindarincapI.cfg) \
tex(sindarincapII.cfg) \
tex(teleri.cfg) \
tex(tengwaralt.enc) \
tex(tengwarcap.enc) \
tex(tengwarscript.enc) \
tex(tengwarscript.map) \
tex(tengwarscript.sty) \
tex(tngan.tfm) \
tex(tngan_full.tfm) \
tex(tngan_full.vf) \
tex(tngana.tfm) \
tex(tnganab.tfm) \
tex(tnganabi.tfm) \
tex(tnganai.tfm) \
tex(tnganb.tfm) \
tex(tnganb_full.tfm) \
tex(tnganb_full.vf) \
tex(tnganbi.tfm) \
tex(tnganbi_full.tfm) \
tex(tnganbi_full.vf) \
tex(tngani.tfm) \
tex(tngani_full.tfm) \
tex(tngani_full.vf) \
tex(unicodeparmaite.cfg) \
texlive-tengwarscript"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fp-basic.sty) \
tex(fp-snap.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
