SUMMARY = "A reworking of STIX2"
DESCRIPTION = "SticksToo is a reworking of the STIX2 fonts with support files \
focussing on enhancements of support for LaTeX users wishing to \
be able to access more of its features. A companion addition to \
the newtxmath package (version 1.55) provides a matching math \
package using STIX2 letters (Roman and Greek) with newtxmath \
symbols."
LICENSE = "OFL-1.1"

PV = "2023.201.1.035svn60793"

RPM_NAME = "texlive-stickstoo-2023.201.1.035svn60793-57.1.noarch.rpm"
RPM_HASH = "3255db2cefd6c23b3fd5c419186443a5ccbdcfe71230978a44b102ff1416dd6182025905e613e567a9837753f3c8cc7b6b35ca8df3dcb2ee29387bca7dbb3862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1SticksTooText-Dnom.fd \
tex-LY1SticksTooText-Inf.fd \
tex-LY1SticksTooText-LF.fd \
tex-LY1SticksTooText-Numr.fd \
tex-LY1SticksTooText-OsF.fd \
tex-LY1SticksTooText-Sup.fd \
tex-LY1SticksTooText-TLF.fd \
tex-LY1SticksTooText-TOsF.fd \
tex-OT1SticksTooText-Dnom.fd \
tex-OT1SticksTooText-Inf.fd \
tex-OT1SticksTooText-LF.fd \
tex-OT1SticksTooText-Numr.fd \
tex-OT1SticksTooText-OsF.fd \
tex-OT1SticksTooText-Sup.fd \
tex-OT1SticksTooText-TLF.fd \
tex-OT1SticksTooText-TOsF.fd \
tex-SticksTooText-Bold-dnom-ly1--base.tfm \
tex-SticksTooText-Bold-dnom-ly1.tfm \
tex-SticksTooText-Bold-dnom-ly1.vf \
tex-SticksTooText-Bold-dnom-ot1.tfm \
tex-SticksTooText-Bold-dnom-t1--base.tfm \
tex-SticksTooText-Bold-dnom-t1.tfm \
tex-SticksTooText-Bold-dnom-t1.vf \
tex-SticksTooText-Bold-inf-ly1--base.tfm \
tex-SticksTooText-Bold-inf-ly1.tfm \
tex-SticksTooText-Bold-inf-ly1.vf \
tex-SticksTooText-Bold-inf-ot1.tfm \
tex-SticksTooText-Bold-inf-t1--base.tfm \
tex-SticksTooText-Bold-inf-t1.tfm \
tex-SticksTooText-Bold-inf-t1.vf \
tex-SticksTooText-Bold-lf-ly1--base.tfm \
tex-SticksTooText-Bold-lf-ly1.tfm \
tex-SticksTooText-Bold-lf-ly1.vf \
tex-SticksTooText-Bold-lf-ot1.tfm \
tex-SticksTooText-Bold-lf-sc-ly1--base.tfm \
tex-SticksTooText-Bold-lf-sc-ly1.tfm \
tex-SticksTooText-Bold-lf-sc-ly1.vf \
tex-SticksTooText-Bold-lf-sc-ot1--base.tfm \
tex-SticksTooText-Bold-lf-sc-ot1.tfm \
tex-SticksTooText-Bold-lf-sc-ot1.vf \
tex-SticksTooText-Bold-lf-sc-t1--base.tfm \
tex-SticksTooText-Bold-lf-sc-t1.tfm \
tex-SticksTooText-Bold-lf-sc-t1.vf \
tex-SticksTooText-Bold-lf-t1--base.tfm \
tex-SticksTooText-Bold-lf-t1.tfm \
tex-SticksTooText-Bold-lf-t1.vf \
tex-SticksTooText-Bold-lf-ts1--base.tfm \
tex-SticksTooText-Bold-lf-ts1.tfm \
tex-SticksTooText-Bold-lf-ts1.vf \
tex-SticksTooText-Bold-numr-ly1--base.tfm \
tex-SticksTooText-Bold-numr-ly1.tfm \
tex-SticksTooText-Bold-numr-ly1.vf \
tex-SticksTooText-Bold-numr-ot1.tfm \
tex-SticksTooText-Bold-numr-t1--base.tfm \
tex-SticksTooText-Bold-numr-t1.tfm \
tex-SticksTooText-Bold-numr-t1.vf \
tex-SticksTooText-Bold-osf-ly1--base.tfm \
tex-SticksTooText-Bold-osf-ly1.tfm \
tex-SticksTooText-Bold-osf-ly1.vf \
tex-SticksTooText-Bold-osf-ot1.tfm \
tex-SticksTooText-Bold-osf-sc-ly1--base.tfm \
tex-SticksTooText-Bold-osf-sc-ly1.tfm \
tex-SticksTooText-Bold-osf-sc-ly1.vf \
tex-SticksTooText-Bold-osf-sc-ot1--base.tfm \
tex-SticksTooText-Bold-osf-sc-ot1.tfm \
tex-SticksTooText-Bold-osf-sc-ot1.vf \
tex-SticksTooText-Bold-osf-sc-t1--base.tfm \
tex-SticksTooText-Bold-osf-sc-t1.tfm \
tex-SticksTooText-Bold-osf-sc-t1.vf \
tex-SticksTooText-Bold-osf-t1--base.tfm \
tex-SticksTooText-Bold-osf-t1.tfm \
tex-SticksTooText-Bold-osf-t1.vf \
tex-SticksTooText-Bold-osf-ts1--base.tfm \
tex-SticksTooText-Bold-osf-ts1.tfm \
tex-SticksTooText-Bold-osf-ts1.vf \
tex-SticksTooText-Bold-ot1.tfm \
tex-SticksTooText-Bold-sup-ly1--base.tfm \
tex-SticksTooText-Bold-sup-ly1.tfm \
tex-SticksTooText-Bold-sup-ly1.vf \
tex-SticksTooText-Bold-sup-ot1.tfm \
tex-SticksTooText-Bold-sup-t1--base.tfm \
tex-SticksTooText-Bold-sup-t1.tfm \
tex-SticksTooText-Bold-sup-t1.vf \
tex-SticksTooText-Bold-tlf-ly1--base.tfm \
tex-SticksTooText-Bold-tlf-ly1.tfm \
tex-SticksTooText-Bold-tlf-ly1.vf \
tex-SticksTooText-Bold-tlf-ot1.tfm \
tex-SticksTooText-Bold-tlf-ot1G.tfm \
tex-SticksTooText-Bold-tlf-ot1G.vf \
tex-SticksTooText-Bold-tlf-sc-ly1--base.tfm \
tex-SticksTooText-Bold-tlf-sc-ly1.tfm \
tex-SticksTooText-Bold-tlf-sc-ly1.vf \
tex-SticksTooText-Bold-tlf-sc-ot1--base.tfm \
tex-SticksTooText-Bold-tlf-sc-ot1.tfm \
tex-SticksTooText-Bold-tlf-sc-ot1.vf \
tex-SticksTooText-Bold-tlf-sc-t1--base.tfm \
tex-SticksTooText-Bold-tlf-sc-t1.tfm \
tex-SticksTooText-Bold-tlf-sc-t1.vf \
tex-SticksTooText-Bold-tlf-t1--base.tfm \
tex-SticksTooText-Bold-tlf-t1.tfm \
tex-SticksTooText-Bold-tlf-t1.vf \
tex-SticksTooText-Bold-tlf-ts1--base.tfm \
tex-SticksTooText-Bold-tlf-ts1.tfm \
tex-SticksTooText-Bold-tlf-ts1.vf \
tex-SticksTooText-Bold-tosf-ly1--base.tfm \
tex-SticksTooText-Bold-tosf-ly1.tfm \
tex-SticksTooText-Bold-tosf-ly1.vf \
tex-SticksTooText-Bold-tosf-ot1.tfm \
tex-SticksTooText-Bold-tosf-sc-ly1--base.tfm \
tex-SticksTooText-Bold-tosf-sc-ly1.tfm \
tex-SticksTooText-Bold-tosf-sc-ly1.vf \
tex-SticksTooText-Bold-tosf-sc-ot1--base.tfm \
tex-SticksTooText-Bold-tosf-sc-ot1.tfm \
tex-SticksTooText-Bold-tosf-sc-ot1.vf \
tex-SticksTooText-Bold-tosf-sc-t1--base.tfm \
tex-SticksTooText-Bold-tosf-sc-t1.tfm \
tex-SticksTooText-Bold-tosf-sc-t1.vf \
tex-SticksTooText-Bold-tosf-t1--base.tfm \
tex-SticksTooText-Bold-tosf-t1.tfm \
tex-SticksTooText-Bold-tosf-t1.vf \
tex-SticksTooText-Bold-tosf-ts1--base.tfm \
tex-SticksTooText-Bold-tosf-ts1.tfm \
tex-SticksTooText-Bold-tosf-ts1.vf \
tex-SticksTooText-BoldItalic-dnom-ly1--base.tfm \
tex-SticksTooText-BoldItalic-dnom-ly1.tfm \
tex-SticksTooText-BoldItalic-dnom-ly1.vf \
tex-SticksTooText-BoldItalic-dnom-ot1.tfm \
tex-SticksTooText-BoldItalic-dnom-t1--base.tfm \
tex-SticksTooText-BoldItalic-dnom-t1.tfm \
tex-SticksTooText-BoldItalic-dnom-t1.vf \
tex-SticksTooText-BoldItalic-inf-ly1--base.tfm \
tex-SticksTooText-BoldItalic-inf-ly1.tfm \
tex-SticksTooText-BoldItalic-inf-ly1.vf \
tex-SticksTooText-BoldItalic-inf-ot1.tfm \
tex-SticksTooText-BoldItalic-inf-t1--base.tfm \
tex-SticksTooText-BoldItalic-inf-t1.tfm \
tex-SticksTooText-BoldItalic-inf-t1.vf \
tex-SticksTooText-BoldItalic-lf-ly1--base.tfm \
tex-SticksTooText-BoldItalic-lf-ly1.tfm \
tex-SticksTooText-BoldItalic-lf-ly1.vf \
tex-SticksTooText-BoldItalic-lf-ot1.tfm \
tex-SticksTooText-BoldItalic-lf-sc-ly1--base.tfm \
tex-SticksTooText-BoldItalic-lf-sc-ly1.tfm \
tex-SticksTooText-BoldItalic-lf-sc-ly1.vf \
tex-SticksTooText-BoldItalic-lf-sc-ot1--base.tfm \
tex-SticksTooText-BoldItalic-lf-sc-ot1.tfm \
tex-SticksTooText-BoldItalic-lf-sc-ot1.vf \
tex-SticksTooText-BoldItalic-lf-sc-t1--base.tfm \
tex-SticksTooText-BoldItalic-lf-sc-t1.tfm \
tex-SticksTooText-BoldItalic-lf-sc-t1.vf \
tex-SticksTooText-BoldItalic-lf-t1--base.tfm \
tex-SticksTooText-BoldItalic-lf-t1.tfm \
tex-SticksTooText-BoldItalic-lf-t1.vf \
tex-SticksTooText-BoldItalic-lf-ts1--base.tfm \
tex-SticksTooText-BoldItalic-lf-ts1.tfm \
tex-SticksTooText-BoldItalic-lf-ts1.vf \
tex-SticksTooText-BoldItalic-numr-ly1--base.tfm \
tex-SticksTooText-BoldItalic-numr-ly1.tfm \
tex-SticksTooText-BoldItalic-numr-ly1.vf \
tex-SticksTooText-BoldItalic-numr-ot1.tfm \
tex-SticksTooText-BoldItalic-numr-t1--base.tfm \
tex-SticksTooText-BoldItalic-numr-t1.tfm \
tex-SticksTooText-BoldItalic-numr-t1.vf \
tex-SticksTooText-BoldItalic-osf-ly1--base.tfm \
tex-SticksTooText-BoldItalic-osf-ly1.tfm \
tex-SticksTooText-BoldItalic-osf-ly1.vf \
tex-SticksTooText-BoldItalic-osf-ot1.tfm \
tex-SticksTooText-BoldItalic-osf-sc-ly1--base.tfm \
tex-SticksTooText-BoldItalic-osf-sc-ly1.tfm \
tex-SticksTooText-BoldItalic-osf-sc-ly1.vf \
tex-SticksTooText-BoldItalic-osf-sc-ot1--base.tfm \
tex-SticksTooText-BoldItalic-osf-sc-ot1.tfm \
tex-SticksTooText-BoldItalic-osf-sc-ot1.vf \
tex-SticksTooText-BoldItalic-osf-sc-t1--base.tfm \
tex-SticksTooText-BoldItalic-osf-sc-t1.tfm \
tex-SticksTooText-BoldItalic-osf-sc-t1.vf \
tex-SticksTooText-BoldItalic-osf-t1--base.tfm \
tex-SticksTooText-BoldItalic-osf-t1.tfm \
tex-SticksTooText-BoldItalic-osf-t1.vf \
tex-SticksTooText-BoldItalic-osf-ts1--base.tfm \
tex-SticksTooText-BoldItalic-osf-ts1.tfm \
tex-SticksTooText-BoldItalic-osf-ts1.vf \
tex-SticksTooText-BoldItalic-ot1.tfm \
tex-SticksTooText-BoldItalic-sup-ly1--base.tfm \
tex-SticksTooText-BoldItalic-sup-ly1.tfm \
tex-SticksTooText-BoldItalic-sup-ly1.vf \
tex-SticksTooText-BoldItalic-sup-ot1.tfm \
tex-SticksTooText-BoldItalic-sup-t1--base.tfm \
tex-SticksTooText-BoldItalic-sup-t1.tfm \
tex-SticksTooText-BoldItalic-sup-t1.vf \
tex-SticksTooText-BoldItalic-tlf-ly1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-ly1.tfm \
tex-SticksTooText-BoldItalic-tlf-ly1.vf \
tex-SticksTooText-BoldItalic-tlf-ot1.tfm \
tex-SticksTooText-BoldItalic-tlf-ot1G.tfm \
tex-SticksTooText-BoldItalic-tlf-ot1G.vf \
tex-SticksTooText-BoldItalic-tlf-sc-ly1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-ly1.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-ly1.vf \
tex-SticksTooText-BoldItalic-tlf-sc-ot1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-ot1.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-ot1.vf \
tex-SticksTooText-BoldItalic-tlf-sc-t1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-t1.tfm \
tex-SticksTooText-BoldItalic-tlf-sc-t1.vf \
tex-SticksTooText-BoldItalic-tlf-t1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-t1.tfm \
tex-SticksTooText-BoldItalic-tlf-t1.vf \
tex-SticksTooText-BoldItalic-tlf-ts1--base.tfm \
tex-SticksTooText-BoldItalic-tlf-ts1.tfm \
tex-SticksTooText-BoldItalic-tlf-ts1.vf \
tex-SticksTooText-BoldItalic-tosf-ly1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-ly1.tfm \
tex-SticksTooText-BoldItalic-tosf-ly1.vf \
tex-SticksTooText-BoldItalic-tosf-ot1.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-ly1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-ly1.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-ly1.vf \
tex-SticksTooText-BoldItalic-tosf-sc-ot1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-ot1.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-ot1.vf \
tex-SticksTooText-BoldItalic-tosf-sc-t1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-t1.tfm \
tex-SticksTooText-BoldItalic-tosf-sc-t1.vf \
tex-SticksTooText-BoldItalic-tosf-t1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-t1.tfm \
tex-SticksTooText-BoldItalic-tosf-t1.vf \
tex-SticksTooText-BoldItalic-tosf-ts1--base.tfm \
tex-SticksTooText-BoldItalic-tosf-ts1.tfm \
tex-SticksTooText-BoldItalic-tosf-ts1.vf \
tex-SticksTooText-Italic-dnom-ly1--base.tfm \
tex-SticksTooText-Italic-dnom-ly1.tfm \
tex-SticksTooText-Italic-dnom-ly1.vf \
tex-SticksTooText-Italic-dnom-ot1.tfm \
tex-SticksTooText-Italic-dnom-t1--base.tfm \
tex-SticksTooText-Italic-dnom-t1.tfm \
tex-SticksTooText-Italic-dnom-t1.vf \
tex-SticksTooText-Italic-inf-ly1--base.tfm \
tex-SticksTooText-Italic-inf-ly1.tfm \
tex-SticksTooText-Italic-inf-ly1.vf \
tex-SticksTooText-Italic-inf-ot1.tfm \
tex-SticksTooText-Italic-inf-t1--base.tfm \
tex-SticksTooText-Italic-inf-t1.tfm \
tex-SticksTooText-Italic-inf-t1.vf \
tex-SticksTooText-Italic-lf-ly1--base.tfm \
tex-SticksTooText-Italic-lf-ly1.tfm \
tex-SticksTooText-Italic-lf-ly1.vf \
tex-SticksTooText-Italic-lf-ot1.tfm \
tex-SticksTooText-Italic-lf-sc-ly1--base.tfm \
tex-SticksTooText-Italic-lf-sc-ly1.tfm \
tex-SticksTooText-Italic-lf-sc-ly1.vf \
tex-SticksTooText-Italic-lf-sc-ot1--base.tfm \
tex-SticksTooText-Italic-lf-sc-ot1.tfm \
tex-SticksTooText-Italic-lf-sc-ot1.vf \
tex-SticksTooText-Italic-lf-sc-t1--base.tfm \
tex-SticksTooText-Italic-lf-sc-t1.tfm \
tex-SticksTooText-Italic-lf-sc-t1.vf \
tex-SticksTooText-Italic-lf-t1--base.tfm \
tex-SticksTooText-Italic-lf-t1.tfm \
tex-SticksTooText-Italic-lf-t1.vf \
tex-SticksTooText-Italic-lf-th-ly1--base.tfm \
tex-SticksTooText-Italic-lf-th-ly1.tfm \
tex-SticksTooText-Italic-lf-th-ly1.vf \
tex-SticksTooText-Italic-lf-th-ot1.tfm \
tex-SticksTooText-Italic-lf-th-t1--base.tfm \
tex-SticksTooText-Italic-lf-th-t1.tfm \
tex-SticksTooText-Italic-lf-th-t1.vf \
tex-SticksTooText-Italic-lf-ts1--base.tfm \
tex-SticksTooText-Italic-lf-ts1.tfm \
tex-SticksTooText-Italic-lf-ts1.vf \
tex-SticksTooText-Italic-numr-ly1--base.tfm \
tex-SticksTooText-Italic-numr-ly1.tfm \
tex-SticksTooText-Italic-numr-ly1.vf \
tex-SticksTooText-Italic-numr-ot1.tfm \
tex-SticksTooText-Italic-numr-t1--base.tfm \
tex-SticksTooText-Italic-numr-t1.tfm \
tex-SticksTooText-Italic-numr-t1.vf \
tex-SticksTooText-Italic-osf-ly1--base.tfm \
tex-SticksTooText-Italic-osf-ly1.tfm \
tex-SticksTooText-Italic-osf-ly1.vf \
tex-SticksTooText-Italic-osf-ot1.tfm \
tex-SticksTooText-Italic-osf-sc-ly1--base.tfm \
tex-SticksTooText-Italic-osf-sc-ly1.tfm \
tex-SticksTooText-Italic-osf-sc-ly1.vf \
tex-SticksTooText-Italic-osf-sc-ot1--base.tfm \
tex-SticksTooText-Italic-osf-sc-ot1.tfm \
tex-SticksTooText-Italic-osf-sc-ot1.vf \
tex-SticksTooText-Italic-osf-sc-t1--base.tfm \
tex-SticksTooText-Italic-osf-sc-t1.tfm \
tex-SticksTooText-Italic-osf-sc-t1.vf \
tex-SticksTooText-Italic-osf-t1--base.tfm \
tex-SticksTooText-Italic-osf-t1.tfm \
tex-SticksTooText-Italic-osf-t1.vf \
tex-SticksTooText-Italic-osf-th-ly1--base.tfm \
tex-SticksTooText-Italic-osf-th-ly1.tfm \
tex-SticksTooText-Italic-osf-th-ly1.vf \
tex-SticksTooText-Italic-osf-th-ot1.tfm \
tex-SticksTooText-Italic-osf-th-t1--base.tfm \
tex-SticksTooText-Italic-osf-th-t1.tfm \
tex-SticksTooText-Italic-osf-th-t1.vf \
tex-SticksTooText-Italic-osf-ts1--base.tfm \
tex-SticksTooText-Italic-osf-ts1.tfm \
tex-SticksTooText-Italic-osf-ts1.vf \
tex-SticksTooText-Italic-ot1.tfm \
tex-SticksTooText-Italic-sup-ly1--base.tfm \
tex-SticksTooText-Italic-sup-ly1.tfm \
tex-SticksTooText-Italic-sup-ly1.vf \
tex-SticksTooText-Italic-sup-ot1.tfm \
tex-SticksTooText-Italic-sup-t1--base.tfm \
tex-SticksTooText-Italic-sup-t1.tfm \
tex-SticksTooText-Italic-sup-t1.vf \
tex-SticksTooText-Italic-tlf-ly1--base.tfm \
tex-SticksTooText-Italic-tlf-ly1.tfm \
tex-SticksTooText-Italic-tlf-ly1.vf \
tex-SticksTooText-Italic-tlf-ot1.tfm \
tex-SticksTooText-Italic-tlf-ot1G.tfm \
tex-SticksTooText-Italic-tlf-ot1G.vf \
tex-SticksTooText-Italic-tlf-sc-ly1--base.tfm \
tex-SticksTooText-Italic-tlf-sc-ly1.tfm \
tex-SticksTooText-Italic-tlf-sc-ly1.vf \
tex-SticksTooText-Italic-tlf-sc-ot1--base.tfm \
tex-SticksTooText-Italic-tlf-sc-ot1.tfm \
tex-SticksTooText-Italic-tlf-sc-ot1.vf \
tex-SticksTooText-Italic-tlf-sc-t1--base.tfm \
tex-SticksTooText-Italic-tlf-sc-t1.tfm \
tex-SticksTooText-Italic-tlf-sc-t1.vf \
tex-SticksTooText-Italic-tlf-t1--base.tfm \
tex-SticksTooText-Italic-tlf-t1.tfm \
tex-SticksTooText-Italic-tlf-t1.vf \
tex-SticksTooText-Italic-tlf-th-ly1--base.tfm \
tex-SticksTooText-Italic-tlf-th-ly1.tfm \
tex-SticksTooText-Italic-tlf-th-ly1.vf \
tex-SticksTooText-Italic-tlf-th-ot1.tfm \
tex-SticksTooText-Italic-tlf-th-t1--base.tfm \
tex-SticksTooText-Italic-tlf-th-t1.tfm \
tex-SticksTooText-Italic-tlf-th-t1.vf \
tex-SticksTooText-Italic-tlf-ts1--base.tfm \
tex-SticksTooText-Italic-tlf-ts1.tfm \
tex-SticksTooText-Italic-tlf-ts1.vf \
tex-SticksTooText-Italic-tosf-ly1--base.tfm \
tex-SticksTooText-Italic-tosf-ly1.tfm \
tex-SticksTooText-Italic-tosf-ly1.vf \
tex-SticksTooText-Italic-tosf-ot1.tfm \
tex-SticksTooText-Italic-tosf-sc-ly1--base.tfm \
tex-SticksTooText-Italic-tosf-sc-ly1.tfm \
tex-SticksTooText-Italic-tosf-sc-ly1.vf \
tex-SticksTooText-Italic-tosf-sc-ot1--base.tfm \
tex-SticksTooText-Italic-tosf-sc-ot1.tfm \
tex-SticksTooText-Italic-tosf-sc-ot1.vf \
tex-SticksTooText-Italic-tosf-sc-t1--base.tfm \
tex-SticksTooText-Italic-tosf-sc-t1.tfm \
tex-SticksTooText-Italic-tosf-sc-t1.vf \
tex-SticksTooText-Italic-tosf-t1--base.tfm \
tex-SticksTooText-Italic-tosf-t1.tfm \
tex-SticksTooText-Italic-tosf-t1.vf \
tex-SticksTooText-Italic-tosf-th-ly1--base.tfm \
tex-SticksTooText-Italic-tosf-th-ly1.tfm \
tex-SticksTooText-Italic-tosf-th-ly1.vf \
tex-SticksTooText-Italic-tosf-th-ot1.tfm \
tex-SticksTooText-Italic-tosf-th-t1--base.tfm \
tex-SticksTooText-Italic-tosf-th-t1.tfm \
tex-SticksTooText-Italic-tosf-th-t1.vf \
tex-SticksTooText-Italic-tosf-ts1--base.tfm \
tex-SticksTooText-Italic-tosf-ts1.tfm \
tex-SticksTooText-Italic-tosf-ts1.vf \
tex-SticksTooText-Regular-dnom-ly1--base.tfm \
tex-SticksTooText-Regular-dnom-ly1.tfm \
tex-SticksTooText-Regular-dnom-ly1.vf \
tex-SticksTooText-Regular-dnom-ot1.tfm \
tex-SticksTooText-Regular-dnom-t1--base.tfm \
tex-SticksTooText-Regular-dnom-t1.tfm \
tex-SticksTooText-Regular-dnom-t1.vf \
tex-SticksTooText-Regular-inf-ly1--base.tfm \
tex-SticksTooText-Regular-inf-ly1.tfm \
tex-SticksTooText-Regular-inf-ly1.vf \
tex-SticksTooText-Regular-inf-ot1.tfm \
tex-SticksTooText-Regular-inf-t1--base.tfm \
tex-SticksTooText-Regular-inf-t1.tfm \
tex-SticksTooText-Regular-inf-t1.vf \
tex-SticksTooText-Regular-lf-ly1--base.tfm \
tex-SticksTooText-Regular-lf-ly1.tfm \
tex-SticksTooText-Regular-lf-ly1.vf \
tex-SticksTooText-Regular-lf-ot1.tfm \
tex-SticksTooText-Regular-lf-sc-ly1--base.tfm \
tex-SticksTooText-Regular-lf-sc-ly1.tfm \
tex-SticksTooText-Regular-lf-sc-ly1.vf \
tex-SticksTooText-Regular-lf-sc-ot1--base.tfm \
tex-SticksTooText-Regular-lf-sc-ot1.tfm \
tex-SticksTooText-Regular-lf-sc-ot1.vf \
tex-SticksTooText-Regular-lf-sc-t1--base.tfm \
tex-SticksTooText-Regular-lf-sc-t1.tfm \
tex-SticksTooText-Regular-lf-sc-t1.vf \
tex-SticksTooText-Regular-lf-t1--base.tfm \
tex-SticksTooText-Regular-lf-t1.tfm \
tex-SticksTooText-Regular-lf-t1.vf \
tex-SticksTooText-Regular-lf-ts1--base.tfm \
tex-SticksTooText-Regular-lf-ts1.tfm \
tex-SticksTooText-Regular-lf-ts1.vf \
tex-SticksTooText-Regular-numr-ly1--base.tfm \
tex-SticksTooText-Regular-numr-ly1.tfm \
tex-SticksTooText-Regular-numr-ly1.vf \
tex-SticksTooText-Regular-numr-ot1.tfm \
tex-SticksTooText-Regular-numr-t1--base.tfm \
tex-SticksTooText-Regular-numr-t1.tfm \
tex-SticksTooText-Regular-numr-t1.vf \
tex-SticksTooText-Regular-osf-ly1--base.tfm \
tex-SticksTooText-Regular-osf-ly1.tfm \
tex-SticksTooText-Regular-osf-ly1.vf \
tex-SticksTooText-Regular-osf-ot1.tfm \
tex-SticksTooText-Regular-osf-sc-ly1--base.tfm \
tex-SticksTooText-Regular-osf-sc-ly1.tfm \
tex-SticksTooText-Regular-osf-sc-ly1.vf \
tex-SticksTooText-Regular-osf-sc-ot1--base.tfm \
tex-SticksTooText-Regular-osf-sc-ot1.tfm \
tex-SticksTooText-Regular-osf-sc-ot1.vf \
tex-SticksTooText-Regular-osf-sc-t1--base.tfm \
tex-SticksTooText-Regular-osf-sc-t1.tfm \
tex-SticksTooText-Regular-osf-sc-t1.vf \
tex-SticksTooText-Regular-osf-t1--base.tfm \
tex-SticksTooText-Regular-osf-t1.tfm \
tex-SticksTooText-Regular-osf-t1.vf \
tex-SticksTooText-Regular-osf-ts1--base.tfm \
tex-SticksTooText-Regular-osf-ts1.tfm \
tex-SticksTooText-Regular-osf-ts1.vf \
tex-SticksTooText-Regular-ot1.tfm \
tex-SticksTooText-Regular-sup-ly1--base.tfm \
tex-SticksTooText-Regular-sup-ly1.tfm \
tex-SticksTooText-Regular-sup-ly1.vf \
tex-SticksTooText-Regular-sup-ot1.tfm \
tex-SticksTooText-Regular-sup-t1--base.tfm \
tex-SticksTooText-Regular-sup-t1.tfm \
tex-SticksTooText-Regular-sup-t1.vf \
tex-SticksTooText-Regular-tlf-ly1--base.tfm \
tex-SticksTooText-Regular-tlf-ly1.tfm \
tex-SticksTooText-Regular-tlf-ly1.vf \
tex-SticksTooText-Regular-tlf-ot1.tfm \
tex-SticksTooText-Regular-tlf-ot1G.tfm \
tex-SticksTooText-Regular-tlf-ot1G.vf \
tex-SticksTooText-Regular-tlf-sc-ly1--base.tfm \
tex-SticksTooText-Regular-tlf-sc-ly1.tfm \
tex-SticksTooText-Regular-tlf-sc-ly1.vf \
tex-SticksTooText-Regular-tlf-sc-ot1--base.tfm \
tex-SticksTooText-Regular-tlf-sc-ot1.tfm \
tex-SticksTooText-Regular-tlf-sc-ot1.vf \
tex-SticksTooText-Regular-tlf-sc-t1--base.tfm \
tex-SticksTooText-Regular-tlf-sc-t1.tfm \
tex-SticksTooText-Regular-tlf-sc-t1.vf \
tex-SticksTooText-Regular-tlf-t1--base.tfm \
tex-SticksTooText-Regular-tlf-t1.tfm \
tex-SticksTooText-Regular-tlf-t1.vf \
tex-SticksTooText-Regular-tlf-ts1--base.tfm \
tex-SticksTooText-Regular-tlf-ts1.tfm \
tex-SticksTooText-Regular-tlf-ts1.vf \
tex-SticksTooText-Regular-tosf-ly1--base.tfm \
tex-SticksTooText-Regular-tosf-ly1.tfm \
tex-SticksTooText-Regular-tosf-ly1.vf \
tex-SticksTooText-Regular-tosf-ot1.tfm \
tex-SticksTooText-Regular-tosf-sc-ly1--base.tfm \
tex-SticksTooText-Regular-tosf-sc-ly1.tfm \
tex-SticksTooText-Regular-tosf-sc-ly1.vf \
tex-SticksTooText-Regular-tosf-sc-ot1--base.tfm \
tex-SticksTooText-Regular-tosf-sc-ot1.tfm \
tex-SticksTooText-Regular-tosf-sc-ot1.vf \
tex-SticksTooText-Regular-tosf-sc-t1--base.tfm \
tex-SticksTooText-Regular-tosf-sc-t1.tfm \
tex-SticksTooText-Regular-tosf-sc-t1.vf \
tex-SticksTooText-Regular-tosf-t1--base.tfm \
tex-SticksTooText-Regular-tosf-t1.tfm \
tex-SticksTooText-Regular-tosf-t1.vf \
tex-SticksTooText-Regular-tosf-ts1--base.tfm \
tex-SticksTooText-Regular-tosf-ts1.tfm \
tex-SticksTooText-Regular-tosf-ts1.vf \
tex-SticksTooText.map \
tex-T1SticksTooText-Dnom.fd \
tex-T1SticksTooText-Inf.fd \
tex-T1SticksTooText-LF.fd \
tex-T1SticksTooText-Numr.fd \
tex-T1SticksTooText-OsF.fd \
tex-T1SticksTooText-Sup.fd \
tex-T1SticksTooText-TLF.fd \
tex-T1SticksTooText-TOsF.fd \
tex-TS1SticksTooText-LF.fd \
tex-TS1SticksTooText-OsF.fd \
tex-TS1SticksTooText-TLF.fd \
tex-TS1SticksTooText-TOsF.fd \
tex-ntxstx2bmi.tfm \
tex-ntxstx2bmi.vf \
tex-ntxstx2bmia.tfm \
tex-ntxstx2bmia.vf \
tex-ntxstx2mi.tfm \
tex-ntxstx2mi.vf \
tex-ntxstx2mia.tfm \
tex-ntxstx2mia.vf \
tex-stickstooMath-Bold.tfm \
tex-stickstooMath-BoldItalic.tfm \
tex-stickstooMath-Italic.tfm \
tex-stickstooMath-Regular.tfm \
tex-stickstootext.sty \
tex-stx2-3t3wpf.enc \
tex-stx2-3vezss.enc \
tex-stx2-4fcdhj.enc \
tex-stx2-57cumc.enc \
tex-stx2-5xzouo.enc \
tex-stx2-7bhcze.enc \
tex-stx2-7fpfyw.enc \
tex-stx2-ao4o3i.enc \
tex-stx2-b3i2vo.enc \
tex-stx2-bg3hea.enc \
tex-stx2-btooep.enc \
tex-stx2-c34sac.enc \
tex-stx2-dbm33u.enc \
tex-stx2-eexofg.enc \
tex-stx2-eqh7z7.enc \
tex-stx2-gbmh45.enc \
tex-stx2-gxpwoy.enc \
tex-stx2-hfcbd6.enc \
tex-stx2-irreni.enc \
tex-stx2-iximus.enc \
tex-stx2-m7frfq.enc \
tex-stx2-nb7tts.enc \
tex-stx2-nl7rkm.enc \
tex-stx2-noim42.enc \
tex-stx2-opxk4k.enc \
tex-stx2-ot1.enc \
tex-stx2-pu4fsw.enc \
tex-stx2-pwkoq7.enc \
tex-stx2-qdtmbx.enc \
tex-stx2-quvxut.enc \
tex-stx2-rejbux.enc \
tex-stx2-rfrl5v.enc \
tex-stx2-sdn3a4.enc \
tex-stx2-slv267.enc \
tex-stx2-srw4fv.enc \
tex-stx2-t6nmmd.enc \
tex-stx2-tu2ozo.enc \
tex-stx2-uab2xo.enc \
tex-stx2-uhazou.enc \
tex-stx2-uofyr3.enc \
tex-stx2-v3a2cx.enc \
tex-stx2-vydqhu.enc \
tex-stx2-w6fsfr.enc \
tex-stx2-wfth6k.enc \
tex-stx2-wwmqdh.enc \
tex-stx2-wwolpm.enc \
tex-stx2-wxq2z6.enc \
tex-stx2-y4oioo.enc \
tex-stx2-ym7moh.enc \
tex-stx2-zscetg.enc \
tex-stx2i-ot1.enc \
texlive-stickstoo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-DSSerifUni-Bold.tfm \
tex-DSSerifUni.tfm \
tex-NewTXBMI.tfm \
tex-NewTXMI.tfm \
tex-etoolbox.sty \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-mweights.sty \
tex-stxscr.tfm \
tex-textcomp.sty \
tex-txbmiaSTbb.tfm \
tex-txbmiaX.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-stickstoo-fonts"

inherit rpm
