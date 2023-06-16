SUMMARY = "GoSans and GoMono fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the GoSans and GoMono families of fonts designed by \
the Bigelow & Holmes foundry for the Go project. GoSans is \
available in three weights: Regular, Medium, and Bold (with \
corresponding italics). GoMono is available in regular and \
bold, with italics. Notes on the design may be found at \
https://blog.golang.org/go-fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64358"

RPM_NAME = "texlive-gofonts-2023.201.svn64358-53.1.noarch.rpm"
RPM_HASH = "26048b05ac2d7ae9914155805ca5891b4cad632337af0dcf2caef1b4673811826f53b0548c63d9175b608af09a808b595005327af4e2abd13d051bb5d01d3881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Go-Bold-Italic-tlf-lgr--base.tfm \
tex-Go-Bold-Italic-tlf-lgr.tfm \
tex-Go-Bold-Italic-tlf-lgr.vf \
tex-Go-Bold-Italic-tlf-ly1--base.tfm \
tex-Go-Bold-Italic-tlf-ly1.tfm \
tex-Go-Bold-Italic-tlf-ly1.vf \
tex-Go-Bold-Italic-tlf-ot1.tfm \
tex-Go-Bold-Italic-tlf-t1--base.tfm \
tex-Go-Bold-Italic-tlf-t1.tfm \
tex-Go-Bold-Italic-tlf-t1.vf \
tex-Go-Bold-Italic-tlf-ts1--base.tfm \
tex-Go-Bold-Italic-tlf-ts1.tfm \
tex-Go-Bold-Italic-tlf-ts1.vf \
tex-Go-Bold-tlf-lgr--base.tfm \
tex-Go-Bold-tlf-lgr.tfm \
tex-Go-Bold-tlf-lgr.vf \
tex-Go-Bold-tlf-ly1--base.tfm \
tex-Go-Bold-tlf-ly1.tfm \
tex-Go-Bold-tlf-ly1.vf \
tex-Go-Bold-tlf-ot1.tfm \
tex-Go-Bold-tlf-t1--base.tfm \
tex-Go-Bold-tlf-t1.tfm \
tex-Go-Bold-tlf-t1.vf \
tex-Go-Bold-tlf-ts1--base.tfm \
tex-Go-Bold-tlf-ts1.tfm \
tex-Go-Bold-tlf-ts1.vf \
tex-Go-Medium-Italic-tlf-lgr--base.tfm \
tex-Go-Medium-Italic-tlf-lgr.tfm \
tex-Go-Medium-Italic-tlf-lgr.vf \
tex-Go-Medium-Italic-tlf-ly1--base.tfm \
tex-Go-Medium-Italic-tlf-ly1.tfm \
tex-Go-Medium-Italic-tlf-ly1.vf \
tex-Go-Medium-Italic-tlf-ot1.tfm \
tex-Go-Medium-Italic-tlf-t1--base.tfm \
tex-Go-Medium-Italic-tlf-t1.tfm \
tex-Go-Medium-Italic-tlf-t1.vf \
tex-Go-Medium-Italic-tlf-ts1--base.tfm \
tex-Go-Medium-Italic-tlf-ts1.tfm \
tex-Go-Medium-Italic-tlf-ts1.vf \
tex-Go-Medium-tlf-lgr--base.tfm \
tex-Go-Medium-tlf-lgr.tfm \
tex-Go-Medium-tlf-lgr.vf \
tex-Go-Medium-tlf-ly1--base.tfm \
tex-Go-Medium-tlf-ly1.tfm \
tex-Go-Medium-tlf-ly1.vf \
tex-Go-Medium-tlf-ot1.tfm \
tex-Go-Medium-tlf-t1--base.tfm \
tex-Go-Medium-tlf-t1.tfm \
tex-Go-Medium-tlf-t1.vf \
tex-Go-Medium-tlf-ts1--base.tfm \
tex-Go-Medium-tlf-ts1.tfm \
tex-Go-Medium-tlf-ts1.vf \
tex-Go-Regular-Italic-tlf-lgr--base.tfm \
tex-Go-Regular-Italic-tlf-lgr.tfm \
tex-Go-Regular-Italic-tlf-lgr.vf \
tex-Go-Regular-Italic-tlf-ly1--base.tfm \
tex-Go-Regular-Italic-tlf-ly1.tfm \
tex-Go-Regular-Italic-tlf-ly1.vf \
tex-Go-Regular-Italic-tlf-ot1.tfm \
tex-Go-Regular-Italic-tlf-t1--base.tfm \
tex-Go-Regular-Italic-tlf-t1.tfm \
tex-Go-Regular-Italic-tlf-t1.vf \
tex-Go-Regular-Italic-tlf-ts1--base.tfm \
tex-Go-Regular-Italic-tlf-ts1.tfm \
tex-Go-Regular-Italic-tlf-ts1.vf \
tex-Go-Regular-tlf-lgr--base.tfm \
tex-Go-Regular-tlf-lgr.tfm \
tex-Go-Regular-tlf-lgr.vf \
tex-Go-Regular-tlf-ly1--base.tfm \
tex-Go-Regular-tlf-ly1.tfm \
tex-Go-Regular-tlf-ly1.vf \
tex-Go-Regular-tlf-ot1.tfm \
tex-Go-Regular-tlf-t1--base.tfm \
tex-Go-Regular-tlf-t1.tfm \
tex-Go-Regular-tlf-t1.vf \
tex-Go-Regular-tlf-ts1--base.tfm \
tex-Go-Regular-tlf-ts1.tfm \
tex-Go-Regular-tlf-ts1.vf \
tex-GoMono-Bold-tlf-lgr--base.tfm \
tex-GoMono-Bold-tlf-lgr.tfm \
tex-GoMono-Bold-tlf-lgr.vf \
tex-GoMono-Bold-tlf-ly1--base.tfm \
tex-GoMono-Bold-tlf-ly1.tfm \
tex-GoMono-Bold-tlf-ly1.vf \
tex-GoMono-Bold-tlf-ot1.tfm \
tex-GoMono-Bold-tlf-t1--base.tfm \
tex-GoMono-Bold-tlf-t1.tfm \
tex-GoMono-Bold-tlf-t1.vf \
tex-GoMono-Bold-tlf-ts1--base.tfm \
tex-GoMono-Bold-tlf-ts1.tfm \
tex-GoMono-Bold-tlf-ts1.vf \
tex-GoMono-BoldItalic-tlf-lgr--base.tfm \
tex-GoMono-BoldItalic-tlf-lgr.tfm \
tex-GoMono-BoldItalic-tlf-lgr.vf \
tex-GoMono-BoldItalic-tlf-ly1--base.tfm \
tex-GoMono-BoldItalic-tlf-ly1.tfm \
tex-GoMono-BoldItalic-tlf-ly1.vf \
tex-GoMono-BoldItalic-tlf-ot1.tfm \
tex-GoMono-BoldItalic-tlf-t1--base.tfm \
tex-GoMono-BoldItalic-tlf-t1.tfm \
tex-GoMono-BoldItalic-tlf-t1.vf \
tex-GoMono-BoldItalic-tlf-ts1--base.tfm \
tex-GoMono-BoldItalic-tlf-ts1.tfm \
tex-GoMono-BoldItalic-tlf-ts1.vf \
tex-GoMono-Italic-tlf-lgr--base.tfm \
tex-GoMono-Italic-tlf-lgr.tfm \
tex-GoMono-Italic-tlf-lgr.vf \
tex-GoMono-Italic-tlf-ly1--base.tfm \
tex-GoMono-Italic-tlf-ly1.tfm \
tex-GoMono-Italic-tlf-ly1.vf \
tex-GoMono-Italic-tlf-ot1.tfm \
tex-GoMono-Italic-tlf-t1--base.tfm \
tex-GoMono-Italic-tlf-t1.tfm \
tex-GoMono-Italic-tlf-t1.vf \
tex-GoMono-Italic-tlf-ts1--base.tfm \
tex-GoMono-Italic-tlf-ts1.tfm \
tex-GoMono-Italic-tlf-ts1.vf \
tex-GoMono-tlf-lgr--base.tfm \
tex-GoMono-tlf-lgr.tfm \
tex-GoMono-tlf-lgr.vf \
tex-GoMono-tlf-ly1--base.tfm \
tex-GoMono-tlf-ly1.tfm \
tex-GoMono-tlf-ly1.vf \
tex-GoMono-tlf-ot1.tfm \
tex-GoMono-tlf-t1--base.tfm \
tex-GoMono-tlf-t1.tfm \
tex-GoMono-tlf-t1.vf \
tex-GoMono-tlf-ts1--base.tfm \
tex-GoMono-tlf-ts1.tfm \
tex-GoMono-tlf-ts1.vf \
tex-GoMono.sty \
tex-GoSans.sty \
tex-GoSmallcaps-Italic-tlf-sc-lgr--base.tfm \
tex-GoSmallcaps-Italic-tlf-sc-lgr.tfm \
tex-GoSmallcaps-Italic-tlf-sc-lgr.vf \
tex-GoSmallcaps-Italic-tlf-sc-ly1--base.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ly1.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ly1.vf \
tex-GoSmallcaps-Italic-tlf-sc-ot1--base.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ot1.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ot1.vf \
tex-GoSmallcaps-Italic-tlf-sc-t1--base.tfm \
tex-GoSmallcaps-Italic-tlf-sc-t1.tfm \
tex-GoSmallcaps-Italic-tlf-sc-t1.vf \
tex-GoSmallcaps-Italic-tlf-sc-ts1--base.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ts1.tfm \
tex-GoSmallcaps-Italic-tlf-sc-ts1.vf \
tex-GoSmallcaps-tlf-sc-lgr--base.tfm \
tex-GoSmallcaps-tlf-sc-lgr.tfm \
tex-GoSmallcaps-tlf-sc-lgr.vf \
tex-GoSmallcaps-tlf-sc-ly1--base.tfm \
tex-GoSmallcaps-tlf-sc-ly1.tfm \
tex-GoSmallcaps-tlf-sc-ly1.vf \
tex-GoSmallcaps-tlf-sc-ot1--base.tfm \
tex-GoSmallcaps-tlf-sc-ot1.tfm \
tex-GoSmallcaps-tlf-sc-ot1.vf \
tex-GoSmallcaps-tlf-sc-t1--base.tfm \
tex-GoSmallcaps-tlf-sc-t1.tfm \
tex-GoSmallcaps-tlf-sc-t1.vf \
tex-GoSmallcaps-tlf-sc-ts1--base.tfm \
tex-GoSmallcaps-tlf-sc-ts1.tfm \
tex-GoSmallcaps-tlf-sc-ts1.vf \
tex-LGRGo-TLF.fd \
tex-LGRGoMono-TLF.fd \
tex-LY1Go-TLF.fd \
tex-LY1GoMono-TLF.fd \
tex-OT1Go-TLF.fd \
tex-OT1GoMono-TLF.fd \
tex-T1Go-TLF.fd \
tex-T1GoMono-TLF.fd \
tex-TS1Go-TLF.fd \
tex-TS1GoMono-TLF.fd \
tex-go-2qimm2.enc \
tex-go-4whde3.enc \
tex-go-73mlya.enc \
tex-go-c3licl.enc \
tex-go-dhlxve.enc \
tex-go-icpxvt.enc \
tex-go-iypgt7.enc \
tex-go-zwiz3b.enc \
tex-go.map \
texlive-gofonts"

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
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-gofonts-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
