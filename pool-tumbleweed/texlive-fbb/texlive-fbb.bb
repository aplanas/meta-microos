SUMMARY = "A free Bembo-like font"
DESCRIPTION = "The package provides a Bembo-like font package based on Cardo \
but with many modifications, adding Bold Italic, small caps in \
all styles, six figure choices in all styles, updated kerning \
tables, added figure tables and corrected f-ligatures. Both \
OpenType and Adobe Type 1 versions are provided; all necessary \
support files are provided. The font works well with \
newtxmath's libertine option."
LICENSE = "OFL-1.1"

PV = "2023.201.1.16svn55728"

RPM_NAME = "texlive-fbb-2023.201.1.16svn55728-52.1.noarch.rpm"
RPM_HASH = "128b418683077667c60d1d189112b30b3b234f284b52e448a1c843fe3f2dd7328ca91c580f393ea9bb477bc23aa80f3512d740762bf537ba4e00ab70b0f7a32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1fbb-Inf.fd \
tex-LY1fbb-LF.fd \
tex-LY1fbb-OsF.fd \
tex-LY1fbb-Sup.fd \
tex-LY1fbb-TLF.fd \
tex-LY1fbb-TOsF.fd \
tex-OT1fbb-Inf.fd \
tex-OT1fbb-LF.fd \
tex-OT1fbb-OsF.fd \
tex-OT1fbb-Sup.fd \
tex-OT1fbb-TLF.fd \
tex-OT1fbb-TOsF.fd \
tex-T1fbb-Inf.fd \
tex-T1fbb-LF.fd \
tex-T1fbb-OsF.fd \
tex-T1fbb-Sup.fd \
tex-T1fbb-TLF.fd \
tex-T1fbb-TOsF.fd \
tex-TS1fbb-LF.fd \
tex-TS1fbb-OsF.fd \
tex-TS1fbb-TLF.fd \
tex-TS1fbb-TOsF.fd \
tex-fbb-24fmi7.enc \
tex-fbb-24put5.enc \
tex-fbb-2b4mld.enc \
tex-fbb-2igduj.enc \
tex-fbb-2jnzza.enc \
tex-fbb-2op7s3.enc \
tex-fbb-2xprkz.enc \
tex-fbb-3cnzgn.enc \
tex-fbb-3duhfc.enc \
tex-fbb-3gn25k.enc \
tex-fbb-3xwxat.enc \
tex-fbb-3zscfd.enc \
tex-fbb-4ejvjt.enc \
tex-fbb-4mw2rr.enc \
tex-fbb-4qmemg.enc \
tex-fbb-4qxxhr.enc \
tex-fbb-4wcgh5.enc \
tex-fbb-4zjlsx.enc \
tex-fbb-54lzpc.enc \
tex-fbb-62speq.enc \
tex-fbb-6kt7zw.enc \
tex-fbb-6poto5.enc \
tex-fbb-6vkgd4.enc \
tex-fbb-6x3k7a.enc \
tex-fbb-6xtdz5.enc \
tex-fbb-73u7o6.enc \
tex-fbb-7uozom.enc \
tex-fbb-7zfhk4.enc \
tex-fbb-Bold-inf-ly1--base.tfm \
tex-fbb-Bold-inf-ly1.tfm \
tex-fbb-Bold-inf-ly1.vf \
tex-fbb-Bold-inf-ot1.tfm \
tex-fbb-Bold-inf-t1--base.tfm \
tex-fbb-Bold-inf-t1.tfm \
tex-fbb-Bold-inf-t1.vf \
tex-fbb-Bold-lf-ly1--base.tfm \
tex-fbb-Bold-lf-ly1.tfm \
tex-fbb-Bold-lf-ly1.vf \
tex-fbb-Bold-lf-ot1.tfm \
tex-fbb-Bold-lf-sc-ly1--base.tfm \
tex-fbb-Bold-lf-sc-ly1.tfm \
tex-fbb-Bold-lf-sc-ly1.vf \
tex-fbb-Bold-lf-sc-ot1--base.tfm \
tex-fbb-Bold-lf-sc-ot1.tfm \
tex-fbb-Bold-lf-sc-ot1.vf \
tex-fbb-Bold-lf-sc-t1--base.tfm \
tex-fbb-Bold-lf-sc-t1.tfm \
tex-fbb-Bold-lf-sc-t1.vf \
tex-fbb-Bold-lf-swash-ly1--base.tfm \
tex-fbb-Bold-lf-swash-ly1.tfm \
tex-fbb-Bold-lf-swash-ly1.vf \
tex-fbb-Bold-lf-swash-ot1.tfm \
tex-fbb-Bold-lf-swash-t1--base.tfm \
tex-fbb-Bold-lf-swash-t1.tfm \
tex-fbb-Bold-lf-swash-t1.vf \
tex-fbb-Bold-lf-t1--base.tfm \
tex-fbb-Bold-lf-t1.tfm \
tex-fbb-Bold-lf-t1.vf \
tex-fbb-Bold-lf-ts1--base.tfm \
tex-fbb-Bold-lf-ts1.tfm \
tex-fbb-Bold-lf-ts1.vf \
tex-fbb-Bold-osf-ly1--base.tfm \
tex-fbb-Bold-osf-ly1.tfm \
tex-fbb-Bold-osf-ly1.vf \
tex-fbb-Bold-osf-ot1.tfm \
tex-fbb-Bold-osf-sc-ly1--base.tfm \
tex-fbb-Bold-osf-sc-ly1.tfm \
tex-fbb-Bold-osf-sc-ly1.vf \
tex-fbb-Bold-osf-sc-ot1--base.tfm \
tex-fbb-Bold-osf-sc-ot1.tfm \
tex-fbb-Bold-osf-sc-ot1.vf \
tex-fbb-Bold-osf-sc-t1--base.tfm \
tex-fbb-Bold-osf-sc-t1.tfm \
tex-fbb-Bold-osf-sc-t1.vf \
tex-fbb-Bold-osf-swash-ly1--base.tfm \
tex-fbb-Bold-osf-swash-ly1.tfm \
tex-fbb-Bold-osf-swash-ly1.vf \
tex-fbb-Bold-osf-swash-ot1.tfm \
tex-fbb-Bold-osf-swash-t1--base.tfm \
tex-fbb-Bold-osf-swash-t1.tfm \
tex-fbb-Bold-osf-swash-t1.vf \
tex-fbb-Bold-osf-t1--base.tfm \
tex-fbb-Bold-osf-t1.tfm \
tex-fbb-Bold-osf-t1.vf \
tex-fbb-Bold-osf-ts1--base.tfm \
tex-fbb-Bold-osf-ts1.tfm \
tex-fbb-Bold-osf-ts1.vf \
tex-fbb-Bold-sup-ly1--base.tfm \
tex-fbb-Bold-sup-ly1.tfm \
tex-fbb-Bold-sup-ly1.vf \
tex-fbb-Bold-sup-ot1.tfm \
tex-fbb-Bold-sup-t1--base.tfm \
tex-fbb-Bold-sup-t1.tfm \
tex-fbb-Bold-sup-t1.vf \
tex-fbb-Bold-tlf-ly1--base.tfm \
tex-fbb-Bold-tlf-ly1.tfm \
tex-fbb-Bold-tlf-ly1.vf \
tex-fbb-Bold-tlf-ot1.tfm \
tex-fbb-Bold-tlf-sc-ly1--base.tfm \
tex-fbb-Bold-tlf-sc-ly1.tfm \
tex-fbb-Bold-tlf-sc-ly1.vf \
tex-fbb-Bold-tlf-sc-ot1--base.tfm \
tex-fbb-Bold-tlf-sc-ot1.tfm \
tex-fbb-Bold-tlf-sc-ot1.vf \
tex-fbb-Bold-tlf-sc-t1--base.tfm \
tex-fbb-Bold-tlf-sc-t1.tfm \
tex-fbb-Bold-tlf-sc-t1.vf \
tex-fbb-Bold-tlf-swash-ly1--base.tfm \
tex-fbb-Bold-tlf-swash-ly1.tfm \
tex-fbb-Bold-tlf-swash-ly1.vf \
tex-fbb-Bold-tlf-swash-ot1.tfm \
tex-fbb-Bold-tlf-swash-t1--base.tfm \
tex-fbb-Bold-tlf-swash-t1.tfm \
tex-fbb-Bold-tlf-swash-t1.vf \
tex-fbb-Bold-tlf-t1--base.tfm \
tex-fbb-Bold-tlf-t1.tfm \
tex-fbb-Bold-tlf-t1.vf \
tex-fbb-Bold-tlf-ts1--base.tfm \
tex-fbb-Bold-tlf-ts1.tfm \
tex-fbb-Bold-tlf-ts1.vf \
tex-fbb-Bold-tosf-ly1--base.tfm \
tex-fbb-Bold-tosf-ly1.tfm \
tex-fbb-Bold-tosf-ly1.vf \
tex-fbb-Bold-tosf-ot1.tfm \
tex-fbb-Bold-tosf-sc-ly1--base.tfm \
tex-fbb-Bold-tosf-sc-ly1.tfm \
tex-fbb-Bold-tosf-sc-ly1.vf \
tex-fbb-Bold-tosf-sc-ot1--base.tfm \
tex-fbb-Bold-tosf-sc-ot1.tfm \
tex-fbb-Bold-tosf-sc-ot1.vf \
tex-fbb-Bold-tosf-sc-t1--base.tfm \
tex-fbb-Bold-tosf-sc-t1.tfm \
tex-fbb-Bold-tosf-sc-t1.vf \
tex-fbb-Bold-tosf-swash-ly1--base.tfm \
tex-fbb-Bold-tosf-swash-ly1.tfm \
tex-fbb-Bold-tosf-swash-ly1.vf \
tex-fbb-Bold-tosf-swash-ot1.tfm \
tex-fbb-Bold-tosf-swash-t1--base.tfm \
tex-fbb-Bold-tosf-swash-t1.tfm \
tex-fbb-Bold-tosf-swash-t1.vf \
tex-fbb-Bold-tosf-t1--base.tfm \
tex-fbb-Bold-tosf-t1.tfm \
tex-fbb-Bold-tosf-t1.vf \
tex-fbb-Bold-tosf-ts1--base.tfm \
tex-fbb-Bold-tosf-ts1.tfm \
tex-fbb-Bold-tosf-ts1.vf \
tex-fbb-BoldItalic-inf-ly1--base.tfm \
tex-fbb-BoldItalic-inf-ly1.tfm \
tex-fbb-BoldItalic-inf-ly1.vf \
tex-fbb-BoldItalic-inf-ot1.tfm \
tex-fbb-BoldItalic-inf-t1--base.tfm \
tex-fbb-BoldItalic-inf-t1.tfm \
tex-fbb-BoldItalic-inf-t1.vf \
tex-fbb-BoldItalic-lf-ly1--base.tfm \
tex-fbb-BoldItalic-lf-ly1.tfm \
tex-fbb-BoldItalic-lf-ly1.vf \
tex-fbb-BoldItalic-lf-ot1.tfm \
tex-fbb-BoldItalic-lf-sc-ly1--base.tfm \
tex-fbb-BoldItalic-lf-sc-ly1.tfm \
tex-fbb-BoldItalic-lf-sc-ly1.vf \
tex-fbb-BoldItalic-lf-sc-ot1--base.tfm \
tex-fbb-BoldItalic-lf-sc-ot1.tfm \
tex-fbb-BoldItalic-lf-sc-ot1.vf \
tex-fbb-BoldItalic-lf-sc-t1--base.tfm \
tex-fbb-BoldItalic-lf-sc-t1.tfm \
tex-fbb-BoldItalic-lf-sc-t1.vf \
tex-fbb-BoldItalic-lf-swash-ly1--base.tfm \
tex-fbb-BoldItalic-lf-swash-ly1.tfm \
tex-fbb-BoldItalic-lf-swash-ly1.vf \
tex-fbb-BoldItalic-lf-swash-ot1.tfm \
tex-fbb-BoldItalic-lf-swash-t1--base.tfm \
tex-fbb-BoldItalic-lf-swash-t1.tfm \
tex-fbb-BoldItalic-lf-swash-t1.vf \
tex-fbb-BoldItalic-lf-t1--base.tfm \
tex-fbb-BoldItalic-lf-t1.tfm \
tex-fbb-BoldItalic-lf-t1.vf \
tex-fbb-BoldItalic-lf-ts1--base.tfm \
tex-fbb-BoldItalic-lf-ts1.tfm \
tex-fbb-BoldItalic-lf-ts1.vf \
tex-fbb-BoldItalic-osf-ly1--base.tfm \
tex-fbb-BoldItalic-osf-ly1.tfm \
tex-fbb-BoldItalic-osf-ly1.vf \
tex-fbb-BoldItalic-osf-ot1.tfm \
tex-fbb-BoldItalic-osf-sc-ly1--base.tfm \
tex-fbb-BoldItalic-osf-sc-ly1.tfm \
tex-fbb-BoldItalic-osf-sc-ly1.vf \
tex-fbb-BoldItalic-osf-sc-ot1--base.tfm \
tex-fbb-BoldItalic-osf-sc-ot1.tfm \
tex-fbb-BoldItalic-osf-sc-ot1.vf \
tex-fbb-BoldItalic-osf-sc-t1--base.tfm \
tex-fbb-BoldItalic-osf-sc-t1.tfm \
tex-fbb-BoldItalic-osf-sc-t1.vf \
tex-fbb-BoldItalic-osf-swash-ly1--base.tfm \
tex-fbb-BoldItalic-osf-swash-ly1.tfm \
tex-fbb-BoldItalic-osf-swash-ly1.vf \
tex-fbb-BoldItalic-osf-swash-ot1.tfm \
tex-fbb-BoldItalic-osf-swash-t1--base.tfm \
tex-fbb-BoldItalic-osf-swash-t1.tfm \
tex-fbb-BoldItalic-osf-swash-t1.vf \
tex-fbb-BoldItalic-osf-t1--base.tfm \
tex-fbb-BoldItalic-osf-t1.tfm \
tex-fbb-BoldItalic-osf-t1.vf \
tex-fbb-BoldItalic-osf-ts1--base.tfm \
tex-fbb-BoldItalic-osf-ts1.tfm \
tex-fbb-BoldItalic-osf-ts1.vf \
tex-fbb-BoldItalic-sup-ly1--base.tfm \
tex-fbb-BoldItalic-sup-ly1.tfm \
tex-fbb-BoldItalic-sup-ly1.vf \
tex-fbb-BoldItalic-sup-ot1.tfm \
tex-fbb-BoldItalic-sup-t1--base.tfm \
tex-fbb-BoldItalic-sup-t1.tfm \
tex-fbb-BoldItalic-sup-t1.vf \
tex-fbb-BoldItalic-tlf-ly1--base.tfm \
tex-fbb-BoldItalic-tlf-ly1.tfm \
tex-fbb-BoldItalic-tlf-ly1.vf \
tex-fbb-BoldItalic-tlf-ot1.tfm \
tex-fbb-BoldItalic-tlf-sc-ly1--base.tfm \
tex-fbb-BoldItalic-tlf-sc-ly1.tfm \
tex-fbb-BoldItalic-tlf-sc-ly1.vf \
tex-fbb-BoldItalic-tlf-sc-ot1--base.tfm \
tex-fbb-BoldItalic-tlf-sc-ot1.tfm \
tex-fbb-BoldItalic-tlf-sc-ot1.vf \
tex-fbb-BoldItalic-tlf-sc-t1--base.tfm \
tex-fbb-BoldItalic-tlf-sc-t1.tfm \
tex-fbb-BoldItalic-tlf-sc-t1.vf \
tex-fbb-BoldItalic-tlf-swash-ly1--base.tfm \
tex-fbb-BoldItalic-tlf-swash-ly1.tfm \
tex-fbb-BoldItalic-tlf-swash-ly1.vf \
tex-fbb-BoldItalic-tlf-swash-ot1.tfm \
tex-fbb-BoldItalic-tlf-swash-t1--base.tfm \
tex-fbb-BoldItalic-tlf-swash-t1.tfm \
tex-fbb-BoldItalic-tlf-swash-t1.vf \
tex-fbb-BoldItalic-tlf-t1--base.tfm \
tex-fbb-BoldItalic-tlf-t1.tfm \
tex-fbb-BoldItalic-tlf-t1.vf \
tex-fbb-BoldItalic-tlf-ts1--base.tfm \
tex-fbb-BoldItalic-tlf-ts1.tfm \
tex-fbb-BoldItalic-tlf-ts1.vf \
tex-fbb-BoldItalic-tosf-ly1--base.tfm \
tex-fbb-BoldItalic-tosf-ly1.tfm \
tex-fbb-BoldItalic-tosf-ly1.vf \
tex-fbb-BoldItalic-tosf-ot1.tfm \
tex-fbb-BoldItalic-tosf-sc-ly1--base.tfm \
tex-fbb-BoldItalic-tosf-sc-ly1.tfm \
tex-fbb-BoldItalic-tosf-sc-ly1.vf \
tex-fbb-BoldItalic-tosf-sc-ot1--base.tfm \
tex-fbb-BoldItalic-tosf-sc-ot1.tfm \
tex-fbb-BoldItalic-tosf-sc-ot1.vf \
tex-fbb-BoldItalic-tosf-sc-t1--base.tfm \
tex-fbb-BoldItalic-tosf-sc-t1.tfm \
tex-fbb-BoldItalic-tosf-sc-t1.vf \
tex-fbb-BoldItalic-tosf-swash-ly1--base.tfm \
tex-fbb-BoldItalic-tosf-swash-ly1.tfm \
tex-fbb-BoldItalic-tosf-swash-ly1.vf \
tex-fbb-BoldItalic-tosf-swash-ot1.tfm \
tex-fbb-BoldItalic-tosf-swash-t1--base.tfm \
tex-fbb-BoldItalic-tosf-swash-t1.tfm \
tex-fbb-BoldItalic-tosf-swash-t1.vf \
tex-fbb-BoldItalic-tosf-t1--base.tfm \
tex-fbb-BoldItalic-tosf-t1.tfm \
tex-fbb-BoldItalic-tosf-t1.vf \
tex-fbb-BoldItalic-tosf-ts1--base.tfm \
tex-fbb-BoldItalic-tosf-ts1.tfm \
tex-fbb-BoldItalic-tosf-ts1.vf \
tex-fbb-Italic-inf-ly1--base.tfm \
tex-fbb-Italic-inf-ly1.tfm \
tex-fbb-Italic-inf-ly1.vf \
tex-fbb-Italic-inf-ot1.tfm \
tex-fbb-Italic-inf-t1--base.tfm \
tex-fbb-Italic-inf-t1.tfm \
tex-fbb-Italic-inf-t1.vf \
tex-fbb-Italic-lf-ly1--base.tfm \
tex-fbb-Italic-lf-ly1.tfm \
tex-fbb-Italic-lf-ly1.vf \
tex-fbb-Italic-lf-ot1.tfm \
tex-fbb-Italic-lf-sc-ly1--base.tfm \
tex-fbb-Italic-lf-sc-ly1.tfm \
tex-fbb-Italic-lf-sc-ly1.vf \
tex-fbb-Italic-lf-sc-ot1--base.tfm \
tex-fbb-Italic-lf-sc-ot1.tfm \
tex-fbb-Italic-lf-sc-ot1.vf \
tex-fbb-Italic-lf-sc-t1--base.tfm \
tex-fbb-Italic-lf-sc-t1.tfm \
tex-fbb-Italic-lf-sc-t1.vf \
tex-fbb-Italic-lf-swash-ly1--base.tfm \
tex-fbb-Italic-lf-swash-ly1.tfm \
tex-fbb-Italic-lf-swash-ly1.vf \
tex-fbb-Italic-lf-swash-ot1.tfm \
tex-fbb-Italic-lf-swash-t1--base.tfm \
tex-fbb-Italic-lf-swash-t1.tfm \
tex-fbb-Italic-lf-swash-t1.vf \
tex-fbb-Italic-lf-t1--base.tfm \
tex-fbb-Italic-lf-t1.tfm \
tex-fbb-Italic-lf-t1.vf \
tex-fbb-Italic-lf-ts1--base.tfm \
tex-fbb-Italic-lf-ts1.tfm \
tex-fbb-Italic-lf-ts1.vf \
tex-fbb-Italic-osf-ly1--base.tfm \
tex-fbb-Italic-osf-ly1.tfm \
tex-fbb-Italic-osf-ly1.vf \
tex-fbb-Italic-osf-ot1.tfm \
tex-fbb-Italic-osf-sc-ly1--base.tfm \
tex-fbb-Italic-osf-sc-ly1.tfm \
tex-fbb-Italic-osf-sc-ly1.vf \
tex-fbb-Italic-osf-sc-ot1--base.tfm \
tex-fbb-Italic-osf-sc-ot1.tfm \
tex-fbb-Italic-osf-sc-ot1.vf \
tex-fbb-Italic-osf-sc-t1--base.tfm \
tex-fbb-Italic-osf-sc-t1.tfm \
tex-fbb-Italic-osf-sc-t1.vf \
tex-fbb-Italic-osf-swash-ly1--base.tfm \
tex-fbb-Italic-osf-swash-ly1.tfm \
tex-fbb-Italic-osf-swash-ly1.vf \
tex-fbb-Italic-osf-swash-ot1.tfm \
tex-fbb-Italic-osf-swash-t1--base.tfm \
tex-fbb-Italic-osf-swash-t1.tfm \
tex-fbb-Italic-osf-swash-t1.vf \
tex-fbb-Italic-osf-t1--base.tfm \
tex-fbb-Italic-osf-t1.tfm \
tex-fbb-Italic-osf-t1.vf \
tex-fbb-Italic-osf-ts1--base.tfm \
tex-fbb-Italic-osf-ts1.tfm \
tex-fbb-Italic-osf-ts1.vf \
tex-fbb-Italic-sup-ly1--base.tfm \
tex-fbb-Italic-sup-ly1.tfm \
tex-fbb-Italic-sup-ly1.vf \
tex-fbb-Italic-sup-ot1.tfm \
tex-fbb-Italic-sup-t1--base.tfm \
tex-fbb-Italic-sup-t1.tfm \
tex-fbb-Italic-sup-t1.vf \
tex-fbb-Italic-tlf-ly1--base.tfm \
tex-fbb-Italic-tlf-ly1.tfm \
tex-fbb-Italic-tlf-ly1.vf \
tex-fbb-Italic-tlf-ot1.tfm \
tex-fbb-Italic-tlf-sc-ly1--base.tfm \
tex-fbb-Italic-tlf-sc-ly1.tfm \
tex-fbb-Italic-tlf-sc-ly1.vf \
tex-fbb-Italic-tlf-sc-ot1--base.tfm \
tex-fbb-Italic-tlf-sc-ot1.tfm \
tex-fbb-Italic-tlf-sc-ot1.vf \
tex-fbb-Italic-tlf-sc-t1--base.tfm \
tex-fbb-Italic-tlf-sc-t1.tfm \
tex-fbb-Italic-tlf-sc-t1.vf \
tex-fbb-Italic-tlf-swash-ly1--base.tfm \
tex-fbb-Italic-tlf-swash-ly1.tfm \
tex-fbb-Italic-tlf-swash-ly1.vf \
tex-fbb-Italic-tlf-swash-ot1.tfm \
tex-fbb-Italic-tlf-swash-t1--base.tfm \
tex-fbb-Italic-tlf-swash-t1.tfm \
tex-fbb-Italic-tlf-swash-t1.vf \
tex-fbb-Italic-tlf-t1--base.tfm \
tex-fbb-Italic-tlf-t1.tfm \
tex-fbb-Italic-tlf-t1.vf \
tex-fbb-Italic-tlf-ts1--base.tfm \
tex-fbb-Italic-tlf-ts1.tfm \
tex-fbb-Italic-tlf-ts1.vf \
tex-fbb-Italic-tosf-ly1--base.tfm \
tex-fbb-Italic-tosf-ly1.tfm \
tex-fbb-Italic-tosf-ly1.vf \
tex-fbb-Italic-tosf-ot1.tfm \
tex-fbb-Italic-tosf-sc-ly1--base.tfm \
tex-fbb-Italic-tosf-sc-ly1.tfm \
tex-fbb-Italic-tosf-sc-ly1.vf \
tex-fbb-Italic-tosf-sc-ot1--base.tfm \
tex-fbb-Italic-tosf-sc-ot1.tfm \
tex-fbb-Italic-tosf-sc-ot1.vf \
tex-fbb-Italic-tosf-sc-t1--base.tfm \
tex-fbb-Italic-tosf-sc-t1.tfm \
tex-fbb-Italic-tosf-sc-t1.vf \
tex-fbb-Italic-tosf-swash-ly1--base.tfm \
tex-fbb-Italic-tosf-swash-ly1.tfm \
tex-fbb-Italic-tosf-swash-ly1.vf \
tex-fbb-Italic-tosf-swash-ot1.tfm \
tex-fbb-Italic-tosf-swash-t1--base.tfm \
tex-fbb-Italic-tosf-swash-t1.tfm \
tex-fbb-Italic-tosf-swash-t1.vf \
tex-fbb-Italic-tosf-t1--base.tfm \
tex-fbb-Italic-tosf-t1.tfm \
tex-fbb-Italic-tosf-t1.vf \
tex-fbb-Italic-tosf-ts1--base.tfm \
tex-fbb-Italic-tosf-ts1.tfm \
tex-fbb-Italic-tosf-ts1.vf \
tex-fbb-Regular-inf-ly1--base.tfm \
tex-fbb-Regular-inf-ly1.tfm \
tex-fbb-Regular-inf-ly1.vf \
tex-fbb-Regular-inf-ot1.tfm \
tex-fbb-Regular-inf-t1--base.tfm \
tex-fbb-Regular-inf-t1.tfm \
tex-fbb-Regular-inf-t1.vf \
tex-fbb-Regular-lf-ly1--base.tfm \
tex-fbb-Regular-lf-ly1.tfm \
tex-fbb-Regular-lf-ly1.vf \
tex-fbb-Regular-lf-ot1.tfm \
tex-fbb-Regular-lf-sc-ly1--base.tfm \
tex-fbb-Regular-lf-sc-ly1.tfm \
tex-fbb-Regular-lf-sc-ly1.vf \
tex-fbb-Regular-lf-sc-ot1--base.tfm \
tex-fbb-Regular-lf-sc-ot1.tfm \
tex-fbb-Regular-lf-sc-ot1.vf \
tex-fbb-Regular-lf-sc-t1--base.tfm \
tex-fbb-Regular-lf-sc-t1.tfm \
tex-fbb-Regular-lf-sc-t1.vf \
tex-fbb-Regular-lf-swash-ly1--base.tfm \
tex-fbb-Regular-lf-swash-ly1.tfm \
tex-fbb-Regular-lf-swash-ly1.vf \
tex-fbb-Regular-lf-swash-ot1.tfm \
tex-fbb-Regular-lf-swash-t1--base.tfm \
tex-fbb-Regular-lf-swash-t1.tfm \
tex-fbb-Regular-lf-swash-t1.vf \
tex-fbb-Regular-lf-t1--base.tfm \
tex-fbb-Regular-lf-t1.tfm \
tex-fbb-Regular-lf-t1.vf \
tex-fbb-Regular-lf-ts1--base.tfm \
tex-fbb-Regular-lf-ts1.tfm \
tex-fbb-Regular-lf-ts1.vf \
tex-fbb-Regular-osf-ly1--base.tfm \
tex-fbb-Regular-osf-ly1.tfm \
tex-fbb-Regular-osf-ly1.vf \
tex-fbb-Regular-osf-ot1.tfm \
tex-fbb-Regular-osf-sc-ly1--base.tfm \
tex-fbb-Regular-osf-sc-ly1.tfm \
tex-fbb-Regular-osf-sc-ly1.vf \
tex-fbb-Regular-osf-sc-ot1--base.tfm \
tex-fbb-Regular-osf-sc-ot1.tfm \
tex-fbb-Regular-osf-sc-ot1.vf \
tex-fbb-Regular-osf-sc-t1--base.tfm \
tex-fbb-Regular-osf-sc-t1.tfm \
tex-fbb-Regular-osf-sc-t1.vf \
tex-fbb-Regular-osf-swash-ly1--base.tfm \
tex-fbb-Regular-osf-swash-ly1.tfm \
tex-fbb-Regular-osf-swash-ly1.vf \
tex-fbb-Regular-osf-swash-ot1.tfm \
tex-fbb-Regular-osf-swash-t1--base.tfm \
tex-fbb-Regular-osf-swash-t1.tfm \
tex-fbb-Regular-osf-swash-t1.vf \
tex-fbb-Regular-osf-t1--base.tfm \
tex-fbb-Regular-osf-t1.tfm \
tex-fbb-Regular-osf-t1.vf \
tex-fbb-Regular-osf-ts1--base.tfm \
tex-fbb-Regular-osf-ts1.tfm \
tex-fbb-Regular-osf-ts1.vf \
tex-fbb-Regular-sup-ly1--base.tfm \
tex-fbb-Regular-sup-ly1.tfm \
tex-fbb-Regular-sup-ly1.vf \
tex-fbb-Regular-sup-ot1.tfm \
tex-fbb-Regular-sup-t1--base.tfm \
tex-fbb-Regular-sup-t1.tfm \
tex-fbb-Regular-sup-t1.vf \
tex-fbb-Regular-tlf-ly1--base.tfm \
tex-fbb-Regular-tlf-ly1.tfm \
tex-fbb-Regular-tlf-ly1.vf \
tex-fbb-Regular-tlf-ot1.tfm \
tex-fbb-Regular-tlf-sc-ly1--base.tfm \
tex-fbb-Regular-tlf-sc-ly1.tfm \
tex-fbb-Regular-tlf-sc-ly1.vf \
tex-fbb-Regular-tlf-sc-ot1--base.tfm \
tex-fbb-Regular-tlf-sc-ot1.tfm \
tex-fbb-Regular-tlf-sc-ot1.vf \
tex-fbb-Regular-tlf-sc-t1--base.tfm \
tex-fbb-Regular-tlf-sc-t1.tfm \
tex-fbb-Regular-tlf-sc-t1.vf \
tex-fbb-Regular-tlf-swash-ly1--base.tfm \
tex-fbb-Regular-tlf-swash-ly1.tfm \
tex-fbb-Regular-tlf-swash-ly1.vf \
tex-fbb-Regular-tlf-swash-ot1.tfm \
tex-fbb-Regular-tlf-swash-t1--base.tfm \
tex-fbb-Regular-tlf-swash-t1.tfm \
tex-fbb-Regular-tlf-swash-t1.vf \
tex-fbb-Regular-tlf-t1--base.tfm \
tex-fbb-Regular-tlf-t1.tfm \
tex-fbb-Regular-tlf-t1.vf \
tex-fbb-Regular-tlf-ts1--base.tfm \
tex-fbb-Regular-tlf-ts1.tfm \
tex-fbb-Regular-tlf-ts1.vf \
tex-fbb-Regular-tosf-ly1--base.tfm \
tex-fbb-Regular-tosf-ly1.tfm \
tex-fbb-Regular-tosf-ly1.vf \
tex-fbb-Regular-tosf-ot1.tfm \
tex-fbb-Regular-tosf-sc-ly1--base.tfm \
tex-fbb-Regular-tosf-sc-ly1.tfm \
tex-fbb-Regular-tosf-sc-ly1.vf \
tex-fbb-Regular-tosf-sc-ot1--base.tfm \
tex-fbb-Regular-tosf-sc-ot1.tfm \
tex-fbb-Regular-tosf-sc-ot1.vf \
tex-fbb-Regular-tosf-sc-t1--base.tfm \
tex-fbb-Regular-tosf-sc-t1.tfm \
tex-fbb-Regular-tosf-sc-t1.vf \
tex-fbb-Regular-tosf-swash-ly1--base.tfm \
tex-fbb-Regular-tosf-swash-ly1.tfm \
tex-fbb-Regular-tosf-swash-ly1.vf \
tex-fbb-Regular-tosf-swash-ot1.tfm \
tex-fbb-Regular-tosf-swash-t1--base.tfm \
tex-fbb-Regular-tosf-swash-t1.tfm \
tex-fbb-Regular-tosf-swash-t1.vf \
tex-fbb-Regular-tosf-t1--base.tfm \
tex-fbb-Regular-tosf-t1.tfm \
tex-fbb-Regular-tosf-t1.vf \
tex-fbb-Regular-tosf-ts1--base.tfm \
tex-fbb-Regular-tosf-ts1.tfm \
tex-fbb-Regular-tosf-ts1.vf \
tex-fbb-aeezmr.enc \
tex-fbb-alifw3.enc \
tex-fbb-anjsak.enc \
tex-fbb-b4m333.enc \
tex-fbb-ba3tof.enc \
tex-fbb-bjh4if.enc \
tex-fbb-bus4he.enc \
tex-fbb-cocscg.enc \
tex-fbb-dejuay.enc \
tex-fbb-dvpyqt.enc \
tex-fbb-dz2n6o.enc \
tex-fbb-enzkw5.enc \
tex-fbb-f32ejw.enc \
tex-fbb-f7memx.enc \
tex-fbb-fmbb57.enc \
tex-fbb-fq2tsq.enc \
tex-fbb-g53n3i.enc \
tex-fbb-gebqxj.enc \
tex-fbb-go7ogc.enc \
tex-fbb-gspevp.enc \
tex-fbb-hcrfa2.enc \
tex-fbb-i5idwu.enc \
tex-fbb-ihegxb.enc \
tex-fbb-ivhnor.enc \
tex-fbb-iygvdi.enc \
tex-fbb-j5xf4u.enc \
tex-fbb-jc4ywh.enc \
tex-fbb-jssv6r.enc \
tex-fbb-k3h4c5.enc \
tex-fbb-kc7qho.enc \
tex-fbb-l27jix.enc \
tex-fbb-lbjzwe.enc \
tex-fbb-lpkr6b.enc \
tex-fbb-lulz6h.enc \
tex-fbb-m5ynvh.enc \
tex-fbb-m7ioki.enc \
tex-fbb-mbwkti.enc \
tex-fbb-mlvt4q.enc \
tex-fbb-mpf4qq.enc \
tex-fbb-naynxa.enc \
tex-fbb-nc4uw4.enc \
tex-fbb-nc5i6g.enc \
tex-fbb-ned4xv.enc \
tex-fbb-nrlzkf.enc \
tex-fbb-o52cyd.enc \
tex-fbb-oiqgfb.enc \
tex-fbb-orcs6b.enc \
tex-fbb-p5akwa.enc \
tex-fbb-pwpiae.enc \
tex-fbb-qfprdo.enc \
tex-fbb-qznuv4.enc \
tex-fbb-rdlb6f.enc \
tex-fbb-rkdrjp.enc \
tex-fbb-s5g7rn.enc \
tex-fbb-tonehg.enc \
tex-fbb-tu2qnw.enc \
tex-fbb-ub5jdu.enc \
tex-fbb-ulsnvv.enc \
tex-fbb-uscd66.enc \
tex-fbb-v6tazz.enc \
tex-fbb-vk4up5.enc \
tex-fbb-vo3hij.enc \
tex-fbb-wblpum.enc \
tex-fbb-wdb4p7.enc \
tex-fbb-x5klbo.enc \
tex-fbb-xctm5z.enc \
tex-fbb-xp6hp3.enc \
tex-fbb-xyrmbw.enc \
tex-fbb-y2ahej.enc \
tex-fbb-yragzx.enc \
tex-fbb-ywg272.enc \
tex-fbb-ywphh4.enc \
tex-fbb-zbnzwf.enc \
tex-fbb-zjfw7l.enc \
tex-fbb.map \
tex-fbb.sty \
tex-fbbP-24put5.enc \
tex-fbbP-2igduj.enc \
tex-fbbP-2jnzza.enc \
tex-fbbP-3duhfc.enc \
tex-fbbP-3zscfd.enc \
tex-fbbP-4mw2rr.enc \
tex-fbbP-4wcgh5.enc \
tex-fbbP-4zjlsx.enc \
tex-fbbP-62speq.enc \
tex-fbbP-6kt7zw.enc \
tex-fbbP-6poto5.enc \
tex-fbbP-6vkgd4.enc \
tex-fbbP-6x3k7a.enc \
tex-fbbP-73u7o6.enc \
tex-fbbP-7uozom.enc \
tex-fbbP-7zfhk4.enc \
tex-fbbP-Bold-lf-ly1--base.tfm \
tex-fbbP-Bold-lf-ly1.tfm \
tex-fbbP-Bold-lf-ly1.vf \
tex-fbbP-Bold-lf-ot1.tfm \
tex-fbbP-Bold-lf-ot1.vf \
tex-fbbP-Bold-lf-sc-ly1--base.tfm \
tex-fbbP-Bold-lf-sc-ly1.tfm \
tex-fbbP-Bold-lf-sc-ly1.vf \
tex-fbbP-Bold-lf-sc-ot1--base.tfm \
tex-fbbP-Bold-lf-sc-ot1.tfm \
tex-fbbP-Bold-lf-sc-ot1.vf \
tex-fbbP-Bold-lf-sc-t1--base.tfm \
tex-fbbP-Bold-lf-sc-t1.tfm \
tex-fbbP-Bold-lf-sc-t1.vf \
tex-fbbP-Bold-lf-swash-ly1--base.tfm \
tex-fbbP-Bold-lf-swash-ly1.tfm \
tex-fbbP-Bold-lf-swash-ly1.vf \
tex-fbbP-Bold-lf-swash-ot1.tfm \
tex-fbbP-Bold-lf-swash-ot1.vf \
tex-fbbP-Bold-lf-swash-t1--base.tfm \
tex-fbbP-Bold-lf-swash-t1.tfm \
tex-fbbP-Bold-lf-swash-t1.vf \
tex-fbbP-Bold-lf-t1--base.tfm \
tex-fbbP-Bold-lf-t1.tfm \
tex-fbbP-Bold-lf-t1.vf \
tex-fbbP-Bold-osf-ly1--base.tfm \
tex-fbbP-Bold-osf-ly1.tfm \
tex-fbbP-Bold-osf-ly1.vf \
tex-fbbP-Bold-osf-ot1.tfm \
tex-fbbP-Bold-osf-ot1.vf \
tex-fbbP-Bold-osf-sc-ly1--base.tfm \
tex-fbbP-Bold-osf-sc-ly1.tfm \
tex-fbbP-Bold-osf-sc-ly1.vf \
tex-fbbP-Bold-osf-sc-ot1--base.tfm \
tex-fbbP-Bold-osf-sc-ot1.tfm \
tex-fbbP-Bold-osf-sc-ot1.vf \
tex-fbbP-Bold-osf-sc-t1--base.tfm \
tex-fbbP-Bold-osf-sc-t1.tfm \
tex-fbbP-Bold-osf-sc-t1.vf \
tex-fbbP-Bold-osf-swash-ly1--base.tfm \
tex-fbbP-Bold-osf-swash-ly1.tfm \
tex-fbbP-Bold-osf-swash-ly1.vf \
tex-fbbP-Bold-osf-swash-ot1.tfm \
tex-fbbP-Bold-osf-swash-ot1.vf \
tex-fbbP-Bold-osf-swash-t1--base.tfm \
tex-fbbP-Bold-osf-swash-t1.tfm \
tex-fbbP-Bold-osf-swash-t1.vf \
tex-fbbP-Bold-osf-t1--base.tfm \
tex-fbbP-Bold-osf-t1.tfm \
tex-fbbP-Bold-osf-t1.vf \
tex-fbbP-Bold-tlf-ly1--base.tfm \
tex-fbbP-Bold-tlf-ly1.tfm \
tex-fbbP-Bold-tlf-ly1.vf \
tex-fbbP-Bold-tlf-ot1.tfm \
tex-fbbP-Bold-tlf-ot1.vf \
tex-fbbP-Bold-tlf-sc-ly1--base.tfm \
tex-fbbP-Bold-tlf-sc-ly1.tfm \
tex-fbbP-Bold-tlf-sc-ly1.vf \
tex-fbbP-Bold-tlf-sc-ot1--base.tfm \
tex-fbbP-Bold-tlf-sc-ot1.tfm \
tex-fbbP-Bold-tlf-sc-ot1.vf \
tex-fbbP-Bold-tlf-sc-t1--base.tfm \
tex-fbbP-Bold-tlf-sc-t1.tfm \
tex-fbbP-Bold-tlf-sc-t1.vf \
tex-fbbP-Bold-tlf-swash-ly1--base.tfm \
tex-fbbP-Bold-tlf-swash-ly1.tfm \
tex-fbbP-Bold-tlf-swash-ly1.vf \
tex-fbbP-Bold-tlf-swash-ot1.tfm \
tex-fbbP-Bold-tlf-swash-ot1.vf \
tex-fbbP-Bold-tlf-swash-t1--base.tfm \
tex-fbbP-Bold-tlf-swash-t1.tfm \
tex-fbbP-Bold-tlf-swash-t1.vf \
tex-fbbP-Bold-tlf-t1--base.tfm \
tex-fbbP-Bold-tlf-t1.tfm \
tex-fbbP-Bold-tlf-t1.vf \
tex-fbbP-Bold-tosf-ly1--base.tfm \
tex-fbbP-Bold-tosf-ly1.tfm \
tex-fbbP-Bold-tosf-ly1.vf \
tex-fbbP-Bold-tosf-ot1.tfm \
tex-fbbP-Bold-tosf-ot1.vf \
tex-fbbP-Bold-tosf-sc-ly1--base.tfm \
tex-fbbP-Bold-tosf-sc-ly1.tfm \
tex-fbbP-Bold-tosf-sc-ly1.vf \
tex-fbbP-Bold-tosf-sc-ot1--base.tfm \
tex-fbbP-Bold-tosf-sc-ot1.tfm \
tex-fbbP-Bold-tosf-sc-ot1.vf \
tex-fbbP-Bold-tosf-sc-t1--base.tfm \
tex-fbbP-Bold-tosf-sc-t1.tfm \
tex-fbbP-Bold-tosf-sc-t1.vf \
tex-fbbP-Bold-tosf-swash-ly1--base.tfm \
tex-fbbP-Bold-tosf-swash-ly1.tfm \
tex-fbbP-Bold-tosf-swash-ly1.vf \
tex-fbbP-Bold-tosf-swash-ot1.tfm \
tex-fbbP-Bold-tosf-swash-ot1.vf \
tex-fbbP-Bold-tosf-swash-t1--base.tfm \
tex-fbbP-Bold-tosf-swash-t1.tfm \
tex-fbbP-Bold-tosf-swash-t1.vf \
tex-fbbP-Bold-tosf-t1--base.tfm \
tex-fbbP-Bold-tosf-t1.tfm \
tex-fbbP-Bold-tosf-t1.vf \
tex-fbbP-Regular-lf-ly1--base.tfm \
tex-fbbP-Regular-lf-ly1.tfm \
tex-fbbP-Regular-lf-ly1.vf \
tex-fbbP-Regular-lf-ot1.tfm \
tex-fbbP-Regular-lf-ot1.vf \
tex-fbbP-Regular-lf-sc-ly1--base.tfm \
tex-fbbP-Regular-lf-sc-ly1.tfm \
tex-fbbP-Regular-lf-sc-ly1.vf \
tex-fbbP-Regular-lf-sc-ot1--base.tfm \
tex-fbbP-Regular-lf-sc-ot1.tfm \
tex-fbbP-Regular-lf-sc-ot1.vf \
tex-fbbP-Regular-lf-sc-t1--base.tfm \
tex-fbbP-Regular-lf-sc-t1.tfm \
tex-fbbP-Regular-lf-sc-t1.vf \
tex-fbbP-Regular-lf-swash-ly1--base.tfm \
tex-fbbP-Regular-lf-swash-ly1.tfm \
tex-fbbP-Regular-lf-swash-ly1.vf \
tex-fbbP-Regular-lf-swash-ot1.tfm \
tex-fbbP-Regular-lf-swash-ot1.vf \
tex-fbbP-Regular-lf-swash-t1--base.tfm \
tex-fbbP-Regular-lf-swash-t1.tfm \
tex-fbbP-Regular-lf-swash-t1.vf \
tex-fbbP-Regular-lf-t1--base.tfm \
tex-fbbP-Regular-lf-t1.tfm \
tex-fbbP-Regular-lf-t1.vf \
tex-fbbP-Regular-osf-ly1--base.tfm \
tex-fbbP-Regular-osf-ly1.tfm \
tex-fbbP-Regular-osf-ly1.vf \
tex-fbbP-Regular-osf-ot1.tfm \
tex-fbbP-Regular-osf-ot1.vf \
tex-fbbP-Regular-osf-sc-ly1--base.tfm \
tex-fbbP-Regular-osf-sc-ly1.tfm \
tex-fbbP-Regular-osf-sc-ly1.vf \
tex-fbbP-Regular-osf-sc-ot1--base.tfm \
tex-fbbP-Regular-osf-sc-ot1.tfm \
tex-fbbP-Regular-osf-sc-ot1.vf \
tex-fbbP-Regular-osf-sc-t1--base.tfm \
tex-fbbP-Regular-osf-sc-t1.tfm \
tex-fbbP-Regular-osf-sc-t1.vf \
tex-fbbP-Regular-osf-swash-ly1--base.tfm \
tex-fbbP-Regular-osf-swash-ly1.tfm \
tex-fbbP-Regular-osf-swash-ly1.vf \
tex-fbbP-Regular-osf-swash-ot1.tfm \
tex-fbbP-Regular-osf-swash-ot1.vf \
tex-fbbP-Regular-osf-swash-t1--base.tfm \
tex-fbbP-Regular-osf-swash-t1.tfm \
tex-fbbP-Regular-osf-swash-t1.vf \
tex-fbbP-Regular-osf-t1--base.tfm \
tex-fbbP-Regular-osf-t1.tfm \
tex-fbbP-Regular-osf-t1.vf \
tex-fbbP-Regular-tlf-ly1--base.tfm \
tex-fbbP-Regular-tlf-ly1.tfm \
tex-fbbP-Regular-tlf-ly1.vf \
tex-fbbP-Regular-tlf-ot1.tfm \
tex-fbbP-Regular-tlf-ot1.vf \
tex-fbbP-Regular-tlf-sc-ly1--base.tfm \
tex-fbbP-Regular-tlf-sc-ly1.tfm \
tex-fbbP-Regular-tlf-sc-ly1.vf \
tex-fbbP-Regular-tlf-sc-ot1--base.tfm \
tex-fbbP-Regular-tlf-sc-ot1.tfm \
tex-fbbP-Regular-tlf-sc-ot1.vf \
tex-fbbP-Regular-tlf-sc-t1--base.tfm \
tex-fbbP-Regular-tlf-sc-t1.tfm \
tex-fbbP-Regular-tlf-sc-t1.vf \
tex-fbbP-Regular-tlf-swash-ly1--base.tfm \
tex-fbbP-Regular-tlf-swash-ly1.tfm \
tex-fbbP-Regular-tlf-swash-ly1.vf \
tex-fbbP-Regular-tlf-swash-ot1.tfm \
tex-fbbP-Regular-tlf-swash-ot1.vf \
tex-fbbP-Regular-tlf-swash-t1--base.tfm \
tex-fbbP-Regular-tlf-swash-t1.tfm \
tex-fbbP-Regular-tlf-swash-t1.vf \
tex-fbbP-Regular-tlf-t1--base.tfm \
tex-fbbP-Regular-tlf-t1.tfm \
tex-fbbP-Regular-tlf-t1.vf \
tex-fbbP-Regular-tosf-ly1--base.tfm \
tex-fbbP-Regular-tosf-ly1.tfm \
tex-fbbP-Regular-tosf-ly1.vf \
tex-fbbP-Regular-tosf-ot1.tfm \
tex-fbbP-Regular-tosf-ot1.vf \
tex-fbbP-Regular-tosf-sc-ly1--base.tfm \
tex-fbbP-Regular-tosf-sc-ly1.tfm \
tex-fbbP-Regular-tosf-sc-ly1.vf \
tex-fbbP-Regular-tosf-sc-ot1--base.tfm \
tex-fbbP-Regular-tosf-sc-ot1.tfm \
tex-fbbP-Regular-tosf-sc-ot1.vf \
tex-fbbP-Regular-tosf-sc-t1--base.tfm \
tex-fbbP-Regular-tosf-sc-t1.tfm \
tex-fbbP-Regular-tosf-sc-t1.vf \
tex-fbbP-Regular-tosf-swash-ly1--base.tfm \
tex-fbbP-Regular-tosf-swash-ly1.tfm \
tex-fbbP-Regular-tosf-swash-ly1.vf \
tex-fbbP-Regular-tosf-swash-ot1.tfm \
tex-fbbP-Regular-tosf-swash-ot1.vf \
tex-fbbP-Regular-tosf-swash-t1--base.tfm \
tex-fbbP-Regular-tosf-swash-t1.tfm \
tex-fbbP-Regular-tosf-swash-t1.vf \
tex-fbbP-Regular-tosf-t1--base.tfm \
tex-fbbP-Regular-tosf-t1.tfm \
tex-fbbP-Regular-tosf-t1.vf \
tex-fbbP-ba3tof.enc \
tex-fbbP-bjh4if.enc \
tex-fbbP-enzkw5.enc \
tex-fbbP-f32ejw.enc \
tex-fbbP-f7memx.enc \
tex-fbbP-fmbb57.enc \
tex-fbbP-ivhnor.enc \
tex-fbbP-k3h4c5.enc \
tex-fbbP-kc7qho.enc \
tex-fbbP-lpkr6b.enc \
tex-fbbP-mbwkti.enc \
tex-fbbP-naynxa.enc \
tex-fbbP-ned4xv.enc \
tex-fbbP-nrlzkf.enc \
tex-fbbP-oiqgfb.enc \
tex-fbbP-orcs6b.enc \
tex-fbbP-qfprdo.enc \
tex-fbbP-qznuv4.enc \
tex-fbbP-rkdrjp.enc \
tex-fbbP-tu2qnw.enc \
tex-fbbP-ub5jdu.enc \
tex-fbbP-ulsnvv.enc \
tex-fbbP-uscd66.enc \
tex-fbbP-v6tazz.enc \
tex-fbbP-vo3hij.enc \
tex-fbbP-wblpum.enc \
tex-fbbP-x5klbo.enc \
tex-fbbP-xctm5z.enc \
tex-fbbP-xp6hp3.enc \
tex-fbbP-xyrmbw.enc \
tex-fbbP-y2ahej.enc \
tex-fbbP-yragzx.enc \
texlive-fbb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-ifetex.sty \
tex-ifthen.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-fbb-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
