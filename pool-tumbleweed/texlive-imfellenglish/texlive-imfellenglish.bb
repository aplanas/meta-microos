SUMMARY = "IM Fell English fonts with LaTeX support"
DESCRIPTION = "Igino Marini has implemented digital revivals of fonts \
bequeathed to Oxford University by Dr. John Fell, Bishop of \
Oxford and Dean of Christ Church in 1686. This package provides \
the English family, consisting of Roman, Italic and Small-Cap \
fonts."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64568"

RPM_NAME = "texlive-imfellenglish-2023.201.svn64568-52.1.noarch.rpm"
RPM_HASH = "6687b05d1c3d14434525e1d7dcae9324ca6c739523b6d627dd0e5654268d322c57fddef596f5f8fbba3faf743f067f30b9bd6eba87228b0f0f015de78ceaf90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IM-FELL-English-Italic-tlf-ly1--base.tfm \
tex-IM-FELL-English-Italic-tlf-ly1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-ly1.tfm \
tex-IM-FELL-English-Italic-tlf-ly1.vf \
tex-IM-FELL-English-Italic-tlf-ot1--base.tfm \
tex-IM-FELL-English-Italic-tlf-ot1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-ot1.tfm \
tex-IM-FELL-English-Italic-tlf-ot1.vf \
tex-IM-FELL-English-Italic-tlf-swash-ly1--base.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ly1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ly1.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ly1.vf \
tex-IM-FELL-English-Italic-tlf-swash-ot1--base.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ot1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ot1.tfm \
tex-IM-FELL-English-Italic-tlf-swash-ot1.vf \
tex-IM-FELL-English-Italic-tlf-swash-t1--base.tfm \
tex-IM-FELL-English-Italic-tlf-swash-t1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-swash-t1.tfm \
tex-IM-FELL-English-Italic-tlf-swash-t1.vf \
tex-IM-FELL-English-Italic-tlf-t1--base.tfm \
tex-IM-FELL-English-Italic-tlf-t1--lcdfj.tfm \
tex-IM-FELL-English-Italic-tlf-t1.tfm \
tex-IM-FELL-English-Italic-tlf-t1.vf \
tex-IM-FELL-English-Italic-tlf-ts1--base.tfm \
tex-IM-FELL-English-Italic-tlf-ts1.tfm \
tex-IM-FELL-English-Italic-tlf-ts1.vf \
tex-IM-FELL-English-Roman-tlf-ly1--base.tfm \
tex-IM-FELL-English-Roman-tlf-ly1--lcdfj.tfm \
tex-IM-FELL-English-Roman-tlf-ly1.tfm \
tex-IM-FELL-English-Roman-tlf-ly1.vf \
tex-IM-FELL-English-Roman-tlf-ot1--base.tfm \
tex-IM-FELL-English-Roman-tlf-ot1--lcdfj.tfm \
tex-IM-FELL-English-Roman-tlf-ot1.tfm \
tex-IM-FELL-English-Roman-tlf-ot1.vf \
tex-IM-FELL-English-Roman-tlf-t1--base.tfm \
tex-IM-FELL-English-Roman-tlf-t1--lcdfj.tfm \
tex-IM-FELL-English-Roman-tlf-t1.tfm \
tex-IM-FELL-English-Roman-tlf-t1.vf \
tex-IM-FELL-English-Roman-tlf-ts1--base.tfm \
tex-IM-FELL-English-Roman-tlf-ts1.tfm \
tex-IM-FELL-English-Roman-tlf-ts1.vf \
tex-IM-FELL-English-SC-tlf-sc-ly1--base.tfm \
tex-IM-FELL-English-SC-tlf-sc-ly1.tfm \
tex-IM-FELL-English-SC-tlf-sc-ly1.vf \
tex-IM-FELL-English-SC-tlf-sc-ot1--base.tfm \
tex-IM-FELL-English-SC-tlf-sc-ot1.tfm \
tex-IM-FELL-English-SC-tlf-sc-ot1.vf \
tex-IM-FELL-English-SC-tlf-sc-t1--base.tfm \
tex-IM-FELL-English-SC-tlf-sc-t1.tfm \
tex-IM-FELL-English-SC-tlf-sc-t1.vf \
tex-LY1IMFELLEnglish-TLF.fd \
tex-OT1IMFELLEnglish-TLF.fd \
tex-T1IMFELLEnglish-TLF.fd \
tex-TS1IMFELLEnglish-TLF.fd \
tex-imfe-5cupvv.enc \
tex-imfe-5k4rzj.enc \
tex-imfe-5vh7x2.enc \
tex-imfe-6clpkg.enc \
tex-imfe-f45kxn.enc \
tex-imfe-mwjp4u.enc \
tex-imfe-o7go57.enc \
tex-imfe-q75qgb.enc \
tex-imfe-qauovj.enc \
tex-imfe-smj6bz.enc \
tex-imfe-srzjep.enc \
tex-imfellEnglish.map \
tex-imfellEnglish.sty \
texlive-imfellenglish"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-imfellenglish-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
