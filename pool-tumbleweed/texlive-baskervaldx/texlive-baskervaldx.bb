SUMMARY = "Extension and modification of BaskervaldADF with LaTeX support"
DESCRIPTION = "Extends and modifies the BaskervaldADF font (a Baskerville \
substitute) with more accented glyphs, with small caps and \
oldstyle figures in all shapes. Includes OpenType and \
PostScript fonts, as well as LaTeX support files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.076svn57080"

RPM_NAME = "texlive-baskervaldx-2023.209.1.076svn57080-54.1.noarch.rpm"
RPM_HASH = "299cfaaac40c057813f43729baa41d6fbc6e20b89dd4357a8f1c455502423cb4d7017b1606fe61dd1fec1d5c80eb389e1e5bd5a31760a05a4bb1f639c1cf074f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Baskervaldx-Bol-lf-ly1--base.tfm \
tex-Baskervaldx-Bol-lf-ly1.tfm \
tex-Baskervaldx-Bol-lf-ly1.vf \
tex-Baskervaldx-Bol-lf-ot1.tfm \
tex-Baskervaldx-Bol-lf-sc-ly1--base.tfm \
tex-Baskervaldx-Bol-lf-sc-ly1.tfm \
tex-Baskervaldx-Bol-lf-sc-ly1.vf \
tex-Baskervaldx-Bol-lf-sc-ot1--base.tfm \
tex-Baskervaldx-Bol-lf-sc-ot1.tfm \
tex-Baskervaldx-Bol-lf-sc-ot1.vf \
tex-Baskervaldx-Bol-lf-sc-t1--base.tfm \
tex-Baskervaldx-Bol-lf-sc-t1.tfm \
tex-Baskervaldx-Bol-lf-sc-t1.vf \
tex-Baskervaldx-Bol-lf-swash-ly1--base.tfm \
tex-Baskervaldx-Bol-lf-swash-ly1.tfm \
tex-Baskervaldx-Bol-lf-swash-ly1.vf \
tex-Baskervaldx-Bol-lf-swash-t1--base.tfm \
tex-Baskervaldx-Bol-lf-swash-t1.tfm \
tex-Baskervaldx-Bol-lf-swash-t1.vf \
tex-Baskervaldx-Bol-lf-t1--base.tfm \
tex-Baskervaldx-Bol-lf-t1.tfm \
tex-Baskervaldx-Bol-lf-t1.vf \
tex-Baskervaldx-Bol-lf-ts1--base.tfm \
tex-Baskervaldx-Bol-lf-ts1.tfm \
tex-Baskervaldx-Bol-lf-ts1.vf \
tex-Baskervaldx-Bol-osf-ly1--base.tfm \
tex-Baskervaldx-Bol-osf-ly1.tfm \
tex-Baskervaldx-Bol-osf-ly1.vf \
tex-Baskervaldx-Bol-osf-ot1.tfm \
tex-Baskervaldx-Bol-osf-sc-ly1--base.tfm \
tex-Baskervaldx-Bol-osf-sc-ly1.tfm \
tex-Baskervaldx-Bol-osf-sc-ly1.vf \
tex-Baskervaldx-Bol-osf-sc-ot1--base.tfm \
tex-Baskervaldx-Bol-osf-sc-ot1.tfm \
tex-Baskervaldx-Bol-osf-sc-ot1.vf \
tex-Baskervaldx-Bol-osf-sc-t1--base.tfm \
tex-Baskervaldx-Bol-osf-sc-t1.tfm \
tex-Baskervaldx-Bol-osf-sc-t1.vf \
tex-Baskervaldx-Bol-osf-swash-ly1--base.tfm \
tex-Baskervaldx-Bol-osf-swash-ly1.tfm \
tex-Baskervaldx-Bol-osf-swash-ly1.vf \
tex-Baskervaldx-Bol-osf-swash-t1--base.tfm \
tex-Baskervaldx-Bol-osf-swash-t1.tfm \
tex-Baskervaldx-Bol-osf-swash-t1.vf \
tex-Baskervaldx-Bol-osf-t1--base.tfm \
tex-Baskervaldx-Bol-osf-t1.tfm \
tex-Baskervaldx-Bol-osf-t1.vf \
tex-Baskervaldx-Bol-osf-ts1--base.tfm \
tex-Baskervaldx-Bol-osf-ts1.tfm \
tex-Baskervaldx-Bol-osf-ts1.vf \
tex-Baskervaldx-Bol-osf.tfm \
tex-Baskervaldx-Bol-sup-ly1--base.tfm \
tex-Baskervaldx-Bol-sup-ly1.tfm \
tex-Baskervaldx-Bol-sup-ly1.vf \
tex-Baskervaldx-Bol-sup-ot1.tfm \
tex-Baskervaldx-Bol-sup-t1--base.tfm \
tex-Baskervaldx-Bol-sup-t1.tfm \
tex-Baskervaldx-Bol-sup-t1.vf \
tex-Baskervaldx-Bol-tlf-ly1--base.tfm \
tex-Baskervaldx-Bol-tlf-ly1.tfm \
tex-Baskervaldx-Bol-tlf-ly1.vf \
tex-Baskervaldx-Bol-tlf-ot1.tfm \
tex-Baskervaldx-Bol-tlf-sc-ly1--base.tfm \
tex-Baskervaldx-Bol-tlf-sc-ly1.tfm \
tex-Baskervaldx-Bol-tlf-sc-ly1.vf \
tex-Baskervaldx-Bol-tlf-sc-ot1--base.tfm \
tex-Baskervaldx-Bol-tlf-sc-ot1.tfm \
tex-Baskervaldx-Bol-tlf-sc-ot1.vf \
tex-Baskervaldx-Bol-tlf-sc-t1--base.tfm \
tex-Baskervaldx-Bol-tlf-sc-t1.tfm \
tex-Baskervaldx-Bol-tlf-sc-t1.vf \
tex-Baskervaldx-Bol-tlf-swash-ly1--base.tfm \
tex-Baskervaldx-Bol-tlf-swash-ly1.tfm \
tex-Baskervaldx-Bol-tlf-swash-ly1.vf \
tex-Baskervaldx-Bol-tlf-swash-t1--base.tfm \
tex-Baskervaldx-Bol-tlf-swash-t1.tfm \
tex-Baskervaldx-Bol-tlf-swash-t1.vf \
tex-Baskervaldx-Bol-tlf-t1--base.tfm \
tex-Baskervaldx-Bol-tlf-t1.tfm \
tex-Baskervaldx-Bol-tlf-t1.vf \
tex-Baskervaldx-Bol-tlf-ts1--base.tfm \
tex-Baskervaldx-Bol-tlf-ts1.tfm \
tex-Baskervaldx-Bol-tlf-ts1.vf \
tex-Baskervaldx-Bol-tosf-ly1--base.tfm \
tex-Baskervaldx-Bol-tosf-ly1.tfm \
tex-Baskervaldx-Bol-tosf-ly1.vf \
tex-Baskervaldx-Bol-tosf-ot1.tfm \
tex-Baskervaldx-Bol-tosf-sc-ly1--base.tfm \
tex-Baskervaldx-Bol-tosf-sc-ly1.tfm \
tex-Baskervaldx-Bol-tosf-sc-ly1.vf \
tex-Baskervaldx-Bol-tosf-sc-ot1--base.tfm \
tex-Baskervaldx-Bol-tosf-sc-ot1.tfm \
tex-Baskervaldx-Bol-tosf-sc-ot1.vf \
tex-Baskervaldx-Bol-tosf-sc-t1--base.tfm \
tex-Baskervaldx-Bol-tosf-sc-t1.tfm \
tex-Baskervaldx-Bol-tosf-sc-t1.vf \
tex-Baskervaldx-Bol-tosf-swash-ly1--base.tfm \
tex-Baskervaldx-Bol-tosf-swash-ly1.tfm \
tex-Baskervaldx-Bol-tosf-swash-ly1.vf \
tex-Baskervaldx-Bol-tosf-swash-t1--base.tfm \
tex-Baskervaldx-Bol-tosf-swash-t1.tfm \
tex-Baskervaldx-Bol-tosf-swash-t1.vf \
tex-Baskervaldx-Bol-tosf-t1--base.tfm \
tex-Baskervaldx-Bol-tosf-t1.tfm \
tex-Baskervaldx-Bol-tosf-t1.vf \
tex-Baskervaldx-Bol-tosf-ts1--base.tfm \
tex-Baskervaldx-Bol-tosf-ts1.tfm \
tex-Baskervaldx-Bol-tosf-ts1.vf \
tex-Baskervaldx-BolIta-alph.tfm \
tex-Baskervaldx-BolIta-lf-ly1--base.tfm \
tex-Baskervaldx-BolIta-lf-ly1.tfm \
tex-Baskervaldx-BolIta-lf-ly1.vf \
tex-Baskervaldx-BolIta-lf-ot1.tfm \
tex-Baskervaldx-BolIta-lf-sc-ly1--base.tfm \
tex-Baskervaldx-BolIta-lf-sc-ly1.tfm \
tex-Baskervaldx-BolIta-lf-sc-ly1.vf \
tex-Baskervaldx-BolIta-lf-sc-ot1--base.tfm \
tex-Baskervaldx-BolIta-lf-sc-ot1.tfm \
tex-Baskervaldx-BolIta-lf-sc-ot1.vf \
tex-Baskervaldx-BolIta-lf-sc-t1--base.tfm \
tex-Baskervaldx-BolIta-lf-sc-t1.tfm \
tex-Baskervaldx-BolIta-lf-sc-t1.vf \
tex-Baskervaldx-BolIta-lf-swash-ly1--base.tfm \
tex-Baskervaldx-BolIta-lf-swash-ly1.tfm \
tex-Baskervaldx-BolIta-lf-swash-ly1.vf \
tex-Baskervaldx-BolIta-lf-swash-t1--base.tfm \
tex-Baskervaldx-BolIta-lf-swash-t1.tfm \
tex-Baskervaldx-BolIta-lf-swash-t1.vf \
tex-Baskervaldx-BolIta-lf-t1--base.tfm \
tex-Baskervaldx-BolIta-lf-t1.tfm \
tex-Baskervaldx-BolIta-lf-t1.vf \
tex-Baskervaldx-BolIta-lf-ts1--base.tfm \
tex-Baskervaldx-BolIta-lf-ts1.tfm \
tex-Baskervaldx-BolIta-lf-ts1.vf \
tex-Baskervaldx-BolIta-osf-ly1--base.tfm \
tex-Baskervaldx-BolIta-osf-ly1.tfm \
tex-Baskervaldx-BolIta-osf-ly1.vf \
tex-Baskervaldx-BolIta-osf-ot1.tfm \
tex-Baskervaldx-BolIta-osf-sc-ly1--base.tfm \
tex-Baskervaldx-BolIta-osf-sc-ly1.tfm \
tex-Baskervaldx-BolIta-osf-sc-ly1.vf \
tex-Baskervaldx-BolIta-osf-sc-ot1--base.tfm \
tex-Baskervaldx-BolIta-osf-sc-ot1.tfm \
tex-Baskervaldx-BolIta-osf-sc-ot1.vf \
tex-Baskervaldx-BolIta-osf-sc-t1--base.tfm \
tex-Baskervaldx-BolIta-osf-sc-t1.tfm \
tex-Baskervaldx-BolIta-osf-sc-t1.vf \
tex-Baskervaldx-BolIta-osf-swash-ly1--base.tfm \
tex-Baskervaldx-BolIta-osf-swash-ly1.tfm \
tex-Baskervaldx-BolIta-osf-swash-ly1.vf \
tex-Baskervaldx-BolIta-osf-swash-t1--base.tfm \
tex-Baskervaldx-BolIta-osf-swash-t1.tfm \
tex-Baskervaldx-BolIta-osf-swash-t1.vf \
tex-Baskervaldx-BolIta-osf-t1--base.tfm \
tex-Baskervaldx-BolIta-osf-t1.tfm \
tex-Baskervaldx-BolIta-osf-t1.vf \
tex-Baskervaldx-BolIta-osf-ts1--base.tfm \
tex-Baskervaldx-BolIta-osf-ts1.tfm \
tex-Baskervaldx-BolIta-osf-ts1.vf \
tex-Baskervaldx-BolIta-sup-ly1--base.tfm \
tex-Baskervaldx-BolIta-sup-ly1.tfm \
tex-Baskervaldx-BolIta-sup-ly1.vf \
tex-Baskervaldx-BolIta-sup-ot1.tfm \
tex-Baskervaldx-BolIta-sup-t1--base.tfm \
tex-Baskervaldx-BolIta-sup-t1.tfm \
tex-Baskervaldx-BolIta-sup-t1.vf \
tex-Baskervaldx-BolIta-tlf-ly1--base.tfm \
tex-Baskervaldx-BolIta-tlf-ly1.tfm \
tex-Baskervaldx-BolIta-tlf-ly1.vf \
tex-Baskervaldx-BolIta-tlf-ot1.tfm \
tex-Baskervaldx-BolIta-tlf-sc-ly1--base.tfm \
tex-Baskervaldx-BolIta-tlf-sc-ly1.tfm \
tex-Baskervaldx-BolIta-tlf-sc-ly1.vf \
tex-Baskervaldx-BolIta-tlf-sc-ot1--base.tfm \
tex-Baskervaldx-BolIta-tlf-sc-ot1.tfm \
tex-Baskervaldx-BolIta-tlf-sc-ot1.vf \
tex-Baskervaldx-BolIta-tlf-sc-t1--base.tfm \
tex-Baskervaldx-BolIta-tlf-sc-t1.tfm \
tex-Baskervaldx-BolIta-tlf-sc-t1.vf \
tex-Baskervaldx-BolIta-tlf-swash-ly1--base.tfm \
tex-Baskervaldx-BolIta-tlf-swash-ly1.tfm \
tex-Baskervaldx-BolIta-tlf-swash-ly1.vf \
tex-Baskervaldx-BolIta-tlf-swash-t1--base.tfm \
tex-Baskervaldx-BolIta-tlf-swash-t1.tfm \
tex-Baskervaldx-BolIta-tlf-swash-t1.vf \
tex-Baskervaldx-BolIta-tlf-t1--base.tfm \
tex-Baskervaldx-BolIta-tlf-t1.tfm \
tex-Baskervaldx-BolIta-tlf-t1.vf \
tex-Baskervaldx-BolIta-tlf-ts1--base.tfm \
tex-Baskervaldx-BolIta-tlf-ts1.tfm \
tex-Baskervaldx-BolIta-tlf-ts1.vf \
tex-Baskervaldx-BolIta-tosf-ly1--base.tfm \
tex-Baskervaldx-BolIta-tosf-ly1.tfm \
tex-Baskervaldx-BolIta-tosf-ly1.vf \
tex-Baskervaldx-BolIta-tosf-ot1.tfm \
tex-Baskervaldx-BolIta-tosf-sc-ly1--base.tfm \
tex-Baskervaldx-BolIta-tosf-sc-ly1.tfm \
tex-Baskervaldx-BolIta-tosf-sc-ly1.vf \
tex-Baskervaldx-BolIta-tosf-sc-ot1--base.tfm \
tex-Baskervaldx-BolIta-tosf-sc-ot1.tfm \
tex-Baskervaldx-BolIta-tosf-sc-ot1.vf \
tex-Baskervaldx-BolIta-tosf-sc-t1--base.tfm \
tex-Baskervaldx-BolIta-tosf-sc-t1.tfm \
tex-Baskervaldx-BolIta-tosf-sc-t1.vf \
tex-Baskervaldx-BolIta-tosf-swash-ly1--base.tfm \
tex-Baskervaldx-BolIta-tosf-swash-ly1.tfm \
tex-Baskervaldx-BolIta-tosf-swash-ly1.vf \
tex-Baskervaldx-BolIta-tosf-swash-t1--base.tfm \
tex-Baskervaldx-BolIta-tosf-swash-t1.tfm \
tex-Baskervaldx-BolIta-tosf-swash-t1.vf \
tex-Baskervaldx-BolIta-tosf-t1--base.tfm \
tex-Baskervaldx-BolIta-tosf-t1.tfm \
tex-Baskervaldx-BolIta-tosf-t1.vf \
tex-Baskervaldx-BolIta-tosf-ts1--base.tfm \
tex-Baskervaldx-BolIta-tosf-ts1.tfm \
tex-Baskervaldx-BolIta-tosf-ts1.vf \
tex-Baskervaldx-Ita-alph.tfm \
tex-Baskervaldx-Ita-lf-ly1--base.tfm \
tex-Baskervaldx-Ita-lf-ly1.tfm \
tex-Baskervaldx-Ita-lf-ly1.vf \
tex-Baskervaldx-Ita-lf-ot1.tfm \
tex-Baskervaldx-Ita-lf-sc-ly1--base.tfm \
tex-Baskervaldx-Ita-lf-sc-ly1.tfm \
tex-Baskervaldx-Ita-lf-sc-ly1.vf \
tex-Baskervaldx-Ita-lf-sc-ot1--base.tfm \
tex-Baskervaldx-Ita-lf-sc-ot1.tfm \
tex-Baskervaldx-Ita-lf-sc-ot1.vf \
tex-Baskervaldx-Ita-lf-sc-t1--base.tfm \
tex-Baskervaldx-Ita-lf-sc-t1.tfm \
tex-Baskervaldx-Ita-lf-sc-t1.vf \
tex-Baskervaldx-Ita-lf-swash-ly1--base.tfm \
tex-Baskervaldx-Ita-lf-swash-ly1.tfm \
tex-Baskervaldx-Ita-lf-swash-ly1.vf \
tex-Baskervaldx-Ita-lf-swash-t1--base.tfm \
tex-Baskervaldx-Ita-lf-swash-t1.tfm \
tex-Baskervaldx-Ita-lf-swash-t1.vf \
tex-Baskervaldx-Ita-lf-t1--base.tfm \
tex-Baskervaldx-Ita-lf-t1.tfm \
tex-Baskervaldx-Ita-lf-t1.vf \
tex-Baskervaldx-Ita-lf-ts1--base.tfm \
tex-Baskervaldx-Ita-lf-ts1.tfm \
tex-Baskervaldx-Ita-lf-ts1.vf \
tex-Baskervaldx-Ita-osf-ly1--base.tfm \
tex-Baskervaldx-Ita-osf-ly1.tfm \
tex-Baskervaldx-Ita-osf-ly1.vf \
tex-Baskervaldx-Ita-osf-ot1.tfm \
tex-Baskervaldx-Ita-osf-sc-ly1--base.tfm \
tex-Baskervaldx-Ita-osf-sc-ly1.tfm \
tex-Baskervaldx-Ita-osf-sc-ly1.vf \
tex-Baskervaldx-Ita-osf-sc-ot1--base.tfm \
tex-Baskervaldx-Ita-osf-sc-ot1.tfm \
tex-Baskervaldx-Ita-osf-sc-ot1.vf \
tex-Baskervaldx-Ita-osf-sc-t1--base.tfm \
tex-Baskervaldx-Ita-osf-sc-t1.tfm \
tex-Baskervaldx-Ita-osf-sc-t1.vf \
tex-Baskervaldx-Ita-osf-swash-ly1--base.tfm \
tex-Baskervaldx-Ita-osf-swash-ly1.tfm \
tex-Baskervaldx-Ita-osf-swash-ly1.vf \
tex-Baskervaldx-Ita-osf-swash-t1--base.tfm \
tex-Baskervaldx-Ita-osf-swash-t1.tfm \
tex-Baskervaldx-Ita-osf-swash-t1.vf \
tex-Baskervaldx-Ita-osf-t1--base.tfm \
tex-Baskervaldx-Ita-osf-t1.tfm \
tex-Baskervaldx-Ita-osf-t1.vf \
tex-Baskervaldx-Ita-osf-ts1--base.tfm \
tex-Baskervaldx-Ita-osf-ts1.tfm \
tex-Baskervaldx-Ita-osf-ts1.vf \
tex-Baskervaldx-Ita-sup-ly1--base.tfm \
tex-Baskervaldx-Ita-sup-ly1.tfm \
tex-Baskervaldx-Ita-sup-ly1.vf \
tex-Baskervaldx-Ita-sup-ot1.tfm \
tex-Baskervaldx-Ita-sup-t1--base.tfm \
tex-Baskervaldx-Ita-sup-t1.tfm \
tex-Baskervaldx-Ita-sup-t1.vf \
tex-Baskervaldx-Ita-tlf-ly1--base.tfm \
tex-Baskervaldx-Ita-tlf-ly1.tfm \
tex-Baskervaldx-Ita-tlf-ly1.vf \
tex-Baskervaldx-Ita-tlf-ot1.tfm \
tex-Baskervaldx-Ita-tlf-sc-ly1--base.tfm \
tex-Baskervaldx-Ita-tlf-sc-ly1.tfm \
tex-Baskervaldx-Ita-tlf-sc-ly1.vf \
tex-Baskervaldx-Ita-tlf-sc-ot1--base.tfm \
tex-Baskervaldx-Ita-tlf-sc-ot1.tfm \
tex-Baskervaldx-Ita-tlf-sc-ot1.vf \
tex-Baskervaldx-Ita-tlf-sc-t1--base.tfm \
tex-Baskervaldx-Ita-tlf-sc-t1.tfm \
tex-Baskervaldx-Ita-tlf-sc-t1.vf \
tex-Baskervaldx-Ita-tlf-swash-ly1--base.tfm \
tex-Baskervaldx-Ita-tlf-swash-ly1.tfm \
tex-Baskervaldx-Ita-tlf-swash-ly1.vf \
tex-Baskervaldx-Ita-tlf-swash-t1--base.tfm \
tex-Baskervaldx-Ita-tlf-swash-t1.tfm \
tex-Baskervaldx-Ita-tlf-swash-t1.vf \
tex-Baskervaldx-Ita-tlf-t1--base.tfm \
tex-Baskervaldx-Ita-tlf-t1.tfm \
tex-Baskervaldx-Ita-tlf-t1.vf \
tex-Baskervaldx-Ita-tlf-ts1--base.tfm \
tex-Baskervaldx-Ita-tlf-ts1.tfm \
tex-Baskervaldx-Ita-tlf-ts1.vf \
tex-Baskervaldx-Ita-tosf-ly1--base.tfm \
tex-Baskervaldx-Ita-tosf-ly1.tfm \
tex-Baskervaldx-Ita-tosf-ly1.vf \
tex-Baskervaldx-Ita-tosf-ot1.tfm \
tex-Baskervaldx-Ita-tosf-sc-ly1--base.tfm \
tex-Baskervaldx-Ita-tosf-sc-ly1.tfm \
tex-Baskervaldx-Ita-tosf-sc-ly1.vf \
tex-Baskervaldx-Ita-tosf-sc-ot1--base.tfm \
tex-Baskervaldx-Ita-tosf-sc-ot1.tfm \
tex-Baskervaldx-Ita-tosf-sc-ot1.vf \
tex-Baskervaldx-Ita-tosf-sc-t1--base.tfm \
tex-Baskervaldx-Ita-tosf-sc-t1.tfm \
tex-Baskervaldx-Ita-tosf-sc-t1.vf \
tex-Baskervaldx-Ita-tosf-swash-ly1--base.tfm \
tex-Baskervaldx-Ita-tosf-swash-ly1.tfm \
tex-Baskervaldx-Ita-tosf-swash-ly1.vf \
tex-Baskervaldx-Ita-tosf-swash-t1--base.tfm \
tex-Baskervaldx-Ita-tosf-swash-t1.tfm \
tex-Baskervaldx-Ita-tosf-swash-t1.vf \
tex-Baskervaldx-Ita-tosf-t1--base.tfm \
tex-Baskervaldx-Ita-tosf-t1.tfm \
tex-Baskervaldx-Ita-tosf-t1.vf \
tex-Baskervaldx-Ita-tosf-ts1--base.tfm \
tex-Baskervaldx-Ita-tosf-ts1.tfm \
tex-Baskervaldx-Ita-tosf-ts1.vf \
tex-Baskervaldx-Reg-lf-ly1--base.tfm \
tex-Baskervaldx-Reg-lf-ly1.tfm \
tex-Baskervaldx-Reg-lf-ly1.vf \
tex-Baskervaldx-Reg-lf-ot1.tfm \
tex-Baskervaldx-Reg-lf-sc-ly1--base.tfm \
tex-Baskervaldx-Reg-lf-sc-ly1.tfm \
tex-Baskervaldx-Reg-lf-sc-ly1.vf \
tex-Baskervaldx-Reg-lf-sc-ot1--base.tfm \
tex-Baskervaldx-Reg-lf-sc-ot1.tfm \
tex-Baskervaldx-Reg-lf-sc-ot1.vf \
tex-Baskervaldx-Reg-lf-sc-t1--base.tfm \
tex-Baskervaldx-Reg-lf-sc-t1.tfm \
tex-Baskervaldx-Reg-lf-sc-t1.vf \
tex-Baskervaldx-Reg-lf-swash-ly1--base.tfm \
tex-Baskervaldx-Reg-lf-swash-ly1.tfm \
tex-Baskervaldx-Reg-lf-swash-ly1.vf \
tex-Baskervaldx-Reg-lf-swash-t1--base.tfm \
tex-Baskervaldx-Reg-lf-swash-t1.tfm \
tex-Baskervaldx-Reg-lf-swash-t1.vf \
tex-Baskervaldx-Reg-lf-t1--base.tfm \
tex-Baskervaldx-Reg-lf-t1.tfm \
tex-Baskervaldx-Reg-lf-t1.vf \
tex-Baskervaldx-Reg-lf-ts1--base.tfm \
tex-Baskervaldx-Reg-lf-ts1.tfm \
tex-Baskervaldx-Reg-lf-ts1.vf \
tex-Baskervaldx-Reg-osf-ly1--base.tfm \
tex-Baskervaldx-Reg-osf-ly1.tfm \
tex-Baskervaldx-Reg-osf-ly1.vf \
tex-Baskervaldx-Reg-osf-ot1.tfm \
tex-Baskervaldx-Reg-osf-sc-ly1--base.tfm \
tex-Baskervaldx-Reg-osf-sc-ly1.tfm \
tex-Baskervaldx-Reg-osf-sc-ly1.vf \
tex-Baskervaldx-Reg-osf-sc-ot1--base.tfm \
tex-Baskervaldx-Reg-osf-sc-ot1.tfm \
tex-Baskervaldx-Reg-osf-sc-ot1.vf \
tex-Baskervaldx-Reg-osf-sc-t1--base.tfm \
tex-Baskervaldx-Reg-osf-sc-t1.tfm \
tex-Baskervaldx-Reg-osf-sc-t1.vf \
tex-Baskervaldx-Reg-osf-swash-ly1--base.tfm \
tex-Baskervaldx-Reg-osf-swash-ly1.tfm \
tex-Baskervaldx-Reg-osf-swash-ly1.vf \
tex-Baskervaldx-Reg-osf-swash-t1--base.tfm \
tex-Baskervaldx-Reg-osf-swash-t1.tfm \
tex-Baskervaldx-Reg-osf-swash-t1.vf \
tex-Baskervaldx-Reg-osf-t1--base.tfm \
tex-Baskervaldx-Reg-osf-t1.tfm \
tex-Baskervaldx-Reg-osf-t1.vf \
tex-Baskervaldx-Reg-osf-ts1--base.tfm \
tex-Baskervaldx-Reg-osf-ts1.tfm \
tex-Baskervaldx-Reg-osf-ts1.vf \
tex-Baskervaldx-Reg-sup-ly1--base.tfm \
tex-Baskervaldx-Reg-sup-ly1.tfm \
tex-Baskervaldx-Reg-sup-ly1.vf \
tex-Baskervaldx-Reg-sup-ot1.tfm \
tex-Baskervaldx-Reg-sup-t1--base.tfm \
tex-Baskervaldx-Reg-sup-t1.tfm \
tex-Baskervaldx-Reg-sup-t1.vf \
tex-Baskervaldx-Reg-tlf-ly1--base.tfm \
tex-Baskervaldx-Reg-tlf-ly1.tfm \
tex-Baskervaldx-Reg-tlf-ly1.vf \
tex-Baskervaldx-Reg-tlf-ot1.tfm \
tex-Baskervaldx-Reg-tlf-sc-ly1--base.tfm \
tex-Baskervaldx-Reg-tlf-sc-ly1.tfm \
tex-Baskervaldx-Reg-tlf-sc-ly1.vf \
tex-Baskervaldx-Reg-tlf-sc-ot1--base.tfm \
tex-Baskervaldx-Reg-tlf-sc-ot1.tfm \
tex-Baskervaldx-Reg-tlf-sc-ot1.vf \
tex-Baskervaldx-Reg-tlf-sc-t1--base.tfm \
tex-Baskervaldx-Reg-tlf-sc-t1.tfm \
tex-Baskervaldx-Reg-tlf-sc-t1.vf \
tex-Baskervaldx-Reg-tlf-swash-ly1--base.tfm \
tex-Baskervaldx-Reg-tlf-swash-ly1.tfm \
tex-Baskervaldx-Reg-tlf-swash-ly1.vf \
tex-Baskervaldx-Reg-tlf-swash-t1--base.tfm \
tex-Baskervaldx-Reg-tlf-swash-t1.tfm \
tex-Baskervaldx-Reg-tlf-swash-t1.vf \
tex-Baskervaldx-Reg-tlf-t1--base.tfm \
tex-Baskervaldx-Reg-tlf-t1.tfm \
tex-Baskervaldx-Reg-tlf-t1.vf \
tex-Baskervaldx-Reg-tlf-ts1--base.tfm \
tex-Baskervaldx-Reg-tlf-ts1.tfm \
tex-Baskervaldx-Reg-tlf-ts1.vf \
tex-Baskervaldx-Reg-tosf-ly1--base.tfm \
tex-Baskervaldx-Reg-tosf-ly1.tfm \
tex-Baskervaldx-Reg-tosf-ly1.vf \
tex-Baskervaldx-Reg-tosf-ot1.tfm \
tex-Baskervaldx-Reg-tosf-sc-ly1--base.tfm \
tex-Baskervaldx-Reg-tosf-sc-ly1.tfm \
tex-Baskervaldx-Reg-tosf-sc-ly1.vf \
tex-Baskervaldx-Reg-tosf-sc-ot1--base.tfm \
tex-Baskervaldx-Reg-tosf-sc-ot1.tfm \
tex-Baskervaldx-Reg-tosf-sc-ot1.vf \
tex-Baskervaldx-Reg-tosf-sc-t1--base.tfm \
tex-Baskervaldx-Reg-tosf-sc-t1.tfm \
tex-Baskervaldx-Reg-tosf-sc-t1.vf \
tex-Baskervaldx-Reg-tosf-swash-ly1--base.tfm \
tex-Baskervaldx-Reg-tosf-swash-ly1.tfm \
tex-Baskervaldx-Reg-tosf-swash-ly1.vf \
tex-Baskervaldx-Reg-tosf-swash-t1--base.tfm \
tex-Baskervaldx-Reg-tosf-swash-t1.tfm \
tex-Baskervaldx-Reg-tosf-swash-t1.vf \
tex-Baskervaldx-Reg-tosf-t1--base.tfm \
tex-Baskervaldx-Reg-tosf-t1.tfm \
tex-Baskervaldx-Reg-tosf-t1.vf \
tex-Baskervaldx-Reg-tosf-ts1--base.tfm \
tex-Baskervaldx-Reg-tosf-ts1.tfm \
tex-Baskervaldx-Reg-tosf-ts1.vf \
tex-Baskervaldx-osf.tfm \
tex-Baskervaldx.map \
tex-Baskervaldx.sty \
tex-LY1Baskervaldx-LF.fd \
tex-LY1Baskervaldx-OsF.fd \
tex-LY1Baskervaldx-Sup.fd \
tex-LY1Baskervaldx-TLF.fd \
tex-LY1Baskervaldx-TOsF.fd \
tex-OT1Baskervaldx-LF.fd \
tex-OT1Baskervaldx-OsF.fd \
tex-OT1Baskervaldx-Sup.fd \
tex-OT1Baskervaldx-TLF.fd \
tex-OT1Baskervaldx-TOsF.fd \
tex-T1Baskervaldx-LF.fd \
tex-T1Baskervaldx-OsF.fd \
tex-T1Baskervaldx-Sup.fd \
tex-T1Baskervaldx-TLF.fd \
tex-T1Baskervaldx-TOsF.fd \
tex-TS1Baskervaldx-LF.fd \
tex-TS1Baskervaldx-OsF.fd \
tex-TS1Baskervaldx-TLF.fd \
tex-TS1Baskervaldx-TOsF.fd \
tex-bvalph.enc \
tex-bvtabosf.enc \
tex-zbv-23jm4j.enc \
tex-zbv-2445cl.enc \
tex-zbv-2kku7k.enc \
tex-zbv-2n2qka.enc \
tex-zbv-2xv27p.enc \
tex-zbv-2zeho7.enc \
tex-zbv-34qyyt.enc \
tex-zbv-4f5bev.enc \
tex-zbv-524fcc.enc \
tex-zbv-556rta.enc \
tex-zbv-5p6atn.enc \
tex-zbv-5zt4ml.enc \
tex-zbv-6dnovg.enc \
tex-zbv-6lr3v3.enc \
tex-zbv-6rdtju.enc \
tex-zbv-6xreh4.enc \
tex-zbv-7d54ky.enc \
tex-zbv-7i75ol.enc \
tex-zbv-7nnme4.enc \
tex-zbv-ahc6ab.enc \
tex-zbv-ak7beg.enc \
tex-zbv-aorlch.enc \
tex-zbv-auq4k5.enc \
tex-zbv-awcfcx.enc \
tex-zbv-ax2yo2.enc \
tex-zbv-ax7osu.enc \
tex-zbv-c3asvt.enc \
tex-zbv-ck4t6h.enc \
tex-zbv-cl2iyt.enc \
tex-zbv-clcsgf.enc \
tex-zbv-coqtyh.enc \
tex-zbv-cv7nez.enc \
tex-zbv-d7elqy.enc \
tex-zbv-d7lahw.enc \
tex-zbv-dbb2hd.enc \
tex-zbv-dw7i6y.enc \
tex-zbv-edkp5z.enc \
tex-zbv-ezfzzx.enc \
tex-zbv-feassy.enc \
tex-zbv-g4f2qe.enc \
tex-zbv-g5xsbp.enc \
tex-zbv-gar3zb.enc \
tex-zbv-gjwmpg.enc \
tex-zbv-h4nqsn.enc \
tex-zbv-ik76ei.enc \
tex-zbv-ilkd46.enc \
tex-zbv-itooof.enc \
tex-zbv-jwmruw.enc \
tex-zbv-k3ascw.enc \
tex-zbv-k6hbcl.enc \
tex-zbv-kq7kv3.enc \
tex-zbv-l44ess.enc \
tex-zbv-lewyuf.enc \
tex-zbv-lozoyg.enc \
tex-zbv-lxdjmd.enc \
tex-zbv-m4qttc.enc \
tex-zbv-m5lkgj.enc \
tex-zbv-mu6kzn.enc \
tex-zbv-mvsyl4.enc \
tex-zbv-mys6kl.enc \
tex-zbv-nt5h45.enc \
tex-zbv-nwv7yn.enc \
tex-zbv-ofzzxu.enc \
tex-zbv-pqcihf.enc \
tex-zbv-puztjr.enc \
tex-zbv-riybhr.enc \
tex-zbv-rosua2.enc \
tex-zbv-scthrl.enc \
tex-zbv-sv3nex.enc \
tex-zbv-teykvl.enc \
tex-zbv-tfcpq3.enc \
tex-zbv-tnmdy3.enc \
tex-zbv-tv7w6k.enc \
tex-zbv-uguye6.enc \
tex-zbv-untte3.enc \
tex-zbv-upot5e.enc \
tex-zbv-uy4eps.enc \
tex-zbv-v577lu.enc \
tex-zbv-wg6wcc.enc \
tex-zbv-wvrs5w.enc \
tex-zbv-xbckbj.enc \
tex-zbv-xebzk2.enc \
tex-zbv-xjuza2.enc \
tex-zbv-xotpaa.enc \
tex-zbv-y62qbt.enc \
tex-zbv-y77okd.enc \
tex-zbv-yk4dqp.enc \
tex-zbv-ymibyh.enc \
tex-zbv-zag37q.enc \
tex-zbv-zb3hlf.enc \
tex-zbv-zey2cz.enc \
tex-zbv-zkqdv4.enc \
tex-zbvbmi.tfm \
tex-zbvbmi.vf \
tex-zbvmi.tfm \
tex-zbvmi.vf \
texlive-baskervaldx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-mweights.sty \
tex-ntxbmi.tfm \
tex-ntxmi.tfm \
tex-scalefnt.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-baskervaldx-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
