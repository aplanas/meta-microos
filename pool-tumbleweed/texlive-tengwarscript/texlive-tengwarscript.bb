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

PV = "2023.209.1.3.1svn34594"

RPM_NAME = "texlive-tengwarscript-2023.209.1.3.1svn34594-55.1.noarch.rpm"
RPM_HASH = "5a854f7ae6d500c3eb022e58c3803176a7863d20815a1e0d9a28b90df1106fa12dbe2b5edee31b1c25d482406b0e49d259334fec85fdc9a8c6f478882a9e07e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Elfica32.tfm \
tex-Parmaite-alt.tfm \
tex-Parmaite-full.tfm \
tex-Parmaite-full.vf \
tex-Parmaite.tfm \
tex-TengwarFormal-full.tfm \
tex-TengwarFormal-full.vf \
tex-TengwarFormal12.tfm \
tex-TengwarFormalA12.tfm \
tex-TengwarGothika050.tfm \
tex-TengwarNoldor-full.tfm \
tex-TengwarNoldor-full.vf \
tex-TengwarNoldor.tfm \
tex-TengwarNoldorAlt.tfm \
tex-TengwarNoldorCapitals1.tfm \
tex-TengwarNoldorCapitals2.tfm \
tex-TengwarQuenya-full.tfm \
tex-TengwarQuenya-full.vf \
tex-TengwarQuenya.tfm \
tex-TengwarQuenyaAlt.tfm \
tex-TengwarQuenyaCapitals1.tfm \
tex-TengwarQuenyaCapitals2.tfm \
tex-TengwarSindarin-full.tfm \
tex-TengwarSindarin-full.vf \
tex-TengwarSindarin.tfm \
tex-TengwarSindarinAlt.tfm \
tex-TengwarSindarinCapitals1.tfm \
tex-TengwarSindarinCapitals2.tfm \
tex-TengwarTelerin.tfm \
tex-UnicodeParmaite.tfm \
tex-annatar.cfg \
tex-annatarbold.cfg \
tex-annatarbolditalic.cfg \
tex-annataritalic.cfg \
tex-elfica.cfg \
tex-formal.cfg \
tex-gothika.cfg \
tex-noldor.cfg \
tex-noldorcapI.cfg \
tex-noldorcapII.cfg \
tex-parmaite.cfg \
tex-quenya.cfg \
tex-quenyacapI.cfg \
tex-quenyacapII.cfg \
tex-sindarin.cfg \
tex-sindarincapI.cfg \
tex-sindarincapII.cfg \
tex-teleri.cfg \
tex-tengwaralt.enc \
tex-tengwarcap.enc \
tex-tengwarscript.enc \
tex-tengwarscript.map \
tex-tengwarscript.sty \
tex-tngan-full.tfm \
tex-tngan-full.vf \
tex-tngan.tfm \
tex-tngana.tfm \
tex-tnganab.tfm \
tex-tnganabi.tfm \
tex-tnganai.tfm \
tex-tnganb-full.tfm \
tex-tnganb-full.vf \
tex-tnganb.tfm \
tex-tnganbi-full.tfm \
tex-tnganbi-full.vf \
tex-tnganbi.tfm \
tex-tngani-full.tfm \
tex-tngani-full.vf \
tex-tngani.tfm \
tex-unicodeparmaite.cfg \
texlive-tengwarscript"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp-basic.sty \
tex-fp-snap.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
