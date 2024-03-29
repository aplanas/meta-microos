SUMMARY = "LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX support for the Cooper Hewitt family of sans serif fonts"
DESCRIPTION = "Cooper Hewitt is a contemporary sans serif, with characters \
composed of modified-geometric curves and arches. Initially \
commissioned by Pentagram to evolve his Polaris Condensed \
typeface, Chester Jenkins created a new digital form to support \
the newly transformed Smithsonian Design Museum."
LICENSE = "OFL-1.1"

PV = "2023.209.svn64967"

RPM_NAME = "texlive-cooperhewitt-2023.209.svn64967-55.1.noarch.rpm"
RPM_HASH = "1fb43c353db57b5ffc4d4618145a2d0baa00ac3f271a43c7d184cf374ae134327d99e3cdf40eba7ca20e004341737223c5b429fad1089b7f6c2ba5f5264589af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CooperHewitt.map \
tex-CooperHewitt.sty \
tex-CpHwt-Bold-sup-ly1--base.tfm \
tex-CpHwt-Bold-sup-ly1.tfm \
tex-CpHwt-Bold-sup-ly1.vf \
tex-CpHwt-Bold-sup-ot1.tfm \
tex-CpHwt-Bold-sup-t1--base.tfm \
tex-CpHwt-Bold-sup-t1.tfm \
tex-CpHwt-Bold-sup-t1.vf \
tex-CpHwt-Bold-tlf-ly1--base.tfm \
tex-CpHwt-Bold-tlf-ly1.tfm \
tex-CpHwt-Bold-tlf-ly1.vf \
tex-CpHwt-Bold-tlf-ot1--base.tfm \
tex-CpHwt-Bold-tlf-ot1.tfm \
tex-CpHwt-Bold-tlf-ot1.vf \
tex-CpHwt-Bold-tlf-t1--base.tfm \
tex-CpHwt-Bold-tlf-t1.tfm \
tex-CpHwt-Bold-tlf-t1.vf \
tex-CpHwt-Bold-tlf-ts1--base.tfm \
tex-CpHwt-Bold-tlf-ts1.tfm \
tex-CpHwt-Bold-tlf-ts1.vf \
tex-CpHwt-BoldItalic-sup-ly1--base.tfm \
tex-CpHwt-BoldItalic-sup-ly1.tfm \
tex-CpHwt-BoldItalic-sup-ly1.vf \
tex-CpHwt-BoldItalic-sup-ot1.tfm \
tex-CpHwt-BoldItalic-sup-t1--base.tfm \
tex-CpHwt-BoldItalic-sup-t1.tfm \
tex-CpHwt-BoldItalic-sup-t1.vf \
tex-CpHwt-BoldItalic-tlf-ly1--base.tfm \
tex-CpHwt-BoldItalic-tlf-ly1.tfm \
tex-CpHwt-BoldItalic-tlf-ly1.vf \
tex-CpHwt-BoldItalic-tlf-ot1--base.tfm \
tex-CpHwt-BoldItalic-tlf-ot1.tfm \
tex-CpHwt-BoldItalic-tlf-ot1.vf \
tex-CpHwt-BoldItalic-tlf-t1--base.tfm \
tex-CpHwt-BoldItalic-tlf-t1.tfm \
tex-CpHwt-BoldItalic-tlf-t1.vf \
tex-CpHwt-BoldItalic-tlf-ts1--base.tfm \
tex-CpHwt-BoldItalic-tlf-ts1.tfm \
tex-CpHwt-BoldItalic-tlf-ts1.vf \
tex-CpHwt-Book-sup-ly1--base.tfm \
tex-CpHwt-Book-sup-ly1.tfm \
tex-CpHwt-Book-sup-ly1.vf \
tex-CpHwt-Book-sup-ot1.tfm \
tex-CpHwt-Book-sup-t1--base.tfm \
tex-CpHwt-Book-sup-t1.tfm \
tex-CpHwt-Book-sup-t1.vf \
tex-CpHwt-Book-tlf-ly1--base.tfm \
tex-CpHwt-Book-tlf-ly1.tfm \
tex-CpHwt-Book-tlf-ly1.vf \
tex-CpHwt-Book-tlf-ot1--base.tfm \
tex-CpHwt-Book-tlf-ot1.tfm \
tex-CpHwt-Book-tlf-ot1.vf \
tex-CpHwt-Book-tlf-t1--base.tfm \
tex-CpHwt-Book-tlf-t1.tfm \
tex-CpHwt-Book-tlf-t1.vf \
tex-CpHwt-Book-tlf-ts1--base.tfm \
tex-CpHwt-Book-tlf-ts1.tfm \
tex-CpHwt-Book-tlf-ts1.vf \
tex-CpHwt-BookItalic-sup-ly1--base.tfm \
tex-CpHwt-BookItalic-sup-ly1.tfm \
tex-CpHwt-BookItalic-sup-ly1.vf \
tex-CpHwt-BookItalic-sup-ot1.tfm \
tex-CpHwt-BookItalic-sup-t1--base.tfm \
tex-CpHwt-BookItalic-sup-t1.tfm \
tex-CpHwt-BookItalic-sup-t1.vf \
tex-CpHwt-BookItalic-tlf-ly1--base.tfm \
tex-CpHwt-BookItalic-tlf-ly1.tfm \
tex-CpHwt-BookItalic-tlf-ly1.vf \
tex-CpHwt-BookItalic-tlf-ot1--base.tfm \
tex-CpHwt-BookItalic-tlf-ot1.tfm \
tex-CpHwt-BookItalic-tlf-ot1.vf \
tex-CpHwt-BookItalic-tlf-t1--base.tfm \
tex-CpHwt-BookItalic-tlf-t1.tfm \
tex-CpHwt-BookItalic-tlf-t1.vf \
tex-CpHwt-BookItalic-tlf-ts1--base.tfm \
tex-CpHwt-BookItalic-tlf-ts1.tfm \
tex-CpHwt-BookItalic-tlf-ts1.vf \
tex-CpHwt-Heavy-sup-ly1--base.tfm \
tex-CpHwt-Heavy-sup-ly1.tfm \
tex-CpHwt-Heavy-sup-ly1.vf \
tex-CpHwt-Heavy-sup-ot1.tfm \
tex-CpHwt-Heavy-sup-t1--base.tfm \
tex-CpHwt-Heavy-sup-t1.tfm \
tex-CpHwt-Heavy-sup-t1.vf \
tex-CpHwt-Heavy-tlf-ly1--base.tfm \
tex-CpHwt-Heavy-tlf-ly1.tfm \
tex-CpHwt-Heavy-tlf-ly1.vf \
tex-CpHwt-Heavy-tlf-ot1--base.tfm \
tex-CpHwt-Heavy-tlf-ot1.tfm \
tex-CpHwt-Heavy-tlf-ot1.vf \
tex-CpHwt-Heavy-tlf-t1--base.tfm \
tex-CpHwt-Heavy-tlf-t1.tfm \
tex-CpHwt-Heavy-tlf-t1.vf \
tex-CpHwt-Heavy-tlf-ts1--base.tfm \
tex-CpHwt-Heavy-tlf-ts1.tfm \
tex-CpHwt-Heavy-tlf-ts1.vf \
tex-CpHwt-HeavyItalic-sup-ly1--base.tfm \
tex-CpHwt-HeavyItalic-sup-ly1.tfm \
tex-CpHwt-HeavyItalic-sup-ly1.vf \
tex-CpHwt-HeavyItalic-sup-ot1.tfm \
tex-CpHwt-HeavyItalic-sup-t1--base.tfm \
tex-CpHwt-HeavyItalic-sup-t1.tfm \
tex-CpHwt-HeavyItalic-sup-t1.vf \
tex-CpHwt-HeavyItalic-tlf-ly1--base.tfm \
tex-CpHwt-HeavyItalic-tlf-ly1.tfm \
tex-CpHwt-HeavyItalic-tlf-ly1.vf \
tex-CpHwt-HeavyItalic-tlf-ot1--base.tfm \
tex-CpHwt-HeavyItalic-tlf-ot1.tfm \
tex-CpHwt-HeavyItalic-tlf-ot1.vf \
tex-CpHwt-HeavyItalic-tlf-t1--base.tfm \
tex-CpHwt-HeavyItalic-tlf-t1.tfm \
tex-CpHwt-HeavyItalic-tlf-t1.vf \
tex-CpHwt-HeavyItalic-tlf-ts1--base.tfm \
tex-CpHwt-HeavyItalic-tlf-ts1.tfm \
tex-CpHwt-HeavyItalic-tlf-ts1.vf \
tex-CpHwt-Light-sup-ly1--base.tfm \
tex-CpHwt-Light-sup-ly1.tfm \
tex-CpHwt-Light-sup-ly1.vf \
tex-CpHwt-Light-sup-ot1.tfm \
tex-CpHwt-Light-sup-t1--base.tfm \
tex-CpHwt-Light-sup-t1.tfm \
tex-CpHwt-Light-sup-t1.vf \
tex-CpHwt-Light-tlf-ly1--base.tfm \
tex-CpHwt-Light-tlf-ly1.tfm \
tex-CpHwt-Light-tlf-ly1.vf \
tex-CpHwt-Light-tlf-ot1--base.tfm \
tex-CpHwt-Light-tlf-ot1.tfm \
tex-CpHwt-Light-tlf-ot1.vf \
tex-CpHwt-Light-tlf-t1--base.tfm \
tex-CpHwt-Light-tlf-t1.tfm \
tex-CpHwt-Light-tlf-t1.vf \
tex-CpHwt-Light-tlf-ts1--base.tfm \
tex-CpHwt-Light-tlf-ts1.tfm \
tex-CpHwt-Light-tlf-ts1.vf \
tex-CpHwt-LightItalic-sup-ly1--base.tfm \
tex-CpHwt-LightItalic-sup-ly1.tfm \
tex-CpHwt-LightItalic-sup-ly1.vf \
tex-CpHwt-LightItalic-sup-ot1.tfm \
tex-CpHwt-LightItalic-sup-t1--base.tfm \
tex-CpHwt-LightItalic-sup-t1.tfm \
tex-CpHwt-LightItalic-sup-t1.vf \
tex-CpHwt-LightItalic-tlf-ly1--base.tfm \
tex-CpHwt-LightItalic-tlf-ly1.tfm \
tex-CpHwt-LightItalic-tlf-ly1.vf \
tex-CpHwt-LightItalic-tlf-ot1--base.tfm \
tex-CpHwt-LightItalic-tlf-ot1.tfm \
tex-CpHwt-LightItalic-tlf-ot1.vf \
tex-CpHwt-LightItalic-tlf-t1--base.tfm \
tex-CpHwt-LightItalic-tlf-t1.tfm \
tex-CpHwt-LightItalic-tlf-t1.vf \
tex-CpHwt-LightItalic-tlf-ts1--base.tfm \
tex-CpHwt-LightItalic-tlf-ts1.tfm \
tex-CpHwt-LightItalic-tlf-ts1.vf \
tex-CpHwt-Medium-sup-ly1--base.tfm \
tex-CpHwt-Medium-sup-ly1.tfm \
tex-CpHwt-Medium-sup-ly1.vf \
tex-CpHwt-Medium-sup-ot1.tfm \
tex-CpHwt-Medium-sup-t1--base.tfm \
tex-CpHwt-Medium-sup-t1.tfm \
tex-CpHwt-Medium-sup-t1.vf \
tex-CpHwt-Medium-tlf-ly1--base.tfm \
tex-CpHwt-Medium-tlf-ly1.tfm \
tex-CpHwt-Medium-tlf-ly1.vf \
tex-CpHwt-Medium-tlf-ot1--base.tfm \
tex-CpHwt-Medium-tlf-ot1.tfm \
tex-CpHwt-Medium-tlf-ot1.vf \
tex-CpHwt-Medium-tlf-t1--base.tfm \
tex-CpHwt-Medium-tlf-t1.tfm \
tex-CpHwt-Medium-tlf-t1.vf \
tex-CpHwt-Medium-tlf-ts1--base.tfm \
tex-CpHwt-Medium-tlf-ts1.tfm \
tex-CpHwt-Medium-tlf-ts1.vf \
tex-CpHwt-MediumItalic-sup-ly1--base.tfm \
tex-CpHwt-MediumItalic-sup-ly1.tfm \
tex-CpHwt-MediumItalic-sup-ly1.vf \
tex-CpHwt-MediumItalic-sup-ot1.tfm \
tex-CpHwt-MediumItalic-sup-t1--base.tfm \
tex-CpHwt-MediumItalic-sup-t1.tfm \
tex-CpHwt-MediumItalic-sup-t1.vf \
tex-CpHwt-MediumItalic-tlf-ly1--base.tfm \
tex-CpHwt-MediumItalic-tlf-ly1.tfm \
tex-CpHwt-MediumItalic-tlf-ly1.vf \
tex-CpHwt-MediumItalic-tlf-ot1--base.tfm \
tex-CpHwt-MediumItalic-tlf-ot1.tfm \
tex-CpHwt-MediumItalic-tlf-ot1.vf \
tex-CpHwt-MediumItalic-tlf-t1--base.tfm \
tex-CpHwt-MediumItalic-tlf-t1.tfm \
tex-CpHwt-MediumItalic-tlf-t1.vf \
tex-CpHwt-MediumItalic-tlf-ts1--base.tfm \
tex-CpHwt-MediumItalic-tlf-ts1.tfm \
tex-CpHwt-MediumItalic-tlf-ts1.vf \
tex-CpHwt-Semibold-sup-ly1--base.tfm \
tex-CpHwt-Semibold-sup-ly1.tfm \
tex-CpHwt-Semibold-sup-ly1.vf \
tex-CpHwt-Semibold-sup-ot1.tfm \
tex-CpHwt-Semibold-sup-t1--base.tfm \
tex-CpHwt-Semibold-sup-t1.tfm \
tex-CpHwt-Semibold-sup-t1.vf \
tex-CpHwt-Semibold-tlf-ly1--base.tfm \
tex-CpHwt-Semibold-tlf-ly1.tfm \
tex-CpHwt-Semibold-tlf-ly1.vf \
tex-CpHwt-Semibold-tlf-ot1--base.tfm \
tex-CpHwt-Semibold-tlf-ot1.tfm \
tex-CpHwt-Semibold-tlf-ot1.vf \
tex-CpHwt-Semibold-tlf-t1--base.tfm \
tex-CpHwt-Semibold-tlf-t1.tfm \
tex-CpHwt-Semibold-tlf-t1.vf \
tex-CpHwt-Semibold-tlf-ts1--base.tfm \
tex-CpHwt-Semibold-tlf-ts1.tfm \
tex-CpHwt-Semibold-tlf-ts1.vf \
tex-CpHwt-SemiboldItalic-sup-ly1--base.tfm \
tex-CpHwt-SemiboldItalic-sup-ly1.tfm \
tex-CpHwt-SemiboldItalic-sup-ly1.vf \
tex-CpHwt-SemiboldItalic-sup-ot1.tfm \
tex-CpHwt-SemiboldItalic-sup-t1--base.tfm \
tex-CpHwt-SemiboldItalic-sup-t1.tfm \
tex-CpHwt-SemiboldItalic-sup-t1.vf \
tex-CpHwt-SemiboldItalic-tlf-ly1--base.tfm \
tex-CpHwt-SemiboldItalic-tlf-ly1.tfm \
tex-CpHwt-SemiboldItalic-tlf-ly1.vf \
tex-CpHwt-SemiboldItalic-tlf-ot1--base.tfm \
tex-CpHwt-SemiboldItalic-tlf-ot1.tfm \
tex-CpHwt-SemiboldItalic-tlf-ot1.vf \
tex-CpHwt-SemiboldItalic-tlf-t1--base.tfm \
tex-CpHwt-SemiboldItalic-tlf-t1.tfm \
tex-CpHwt-SemiboldItalic-tlf-t1.vf \
tex-CpHwt-SemiboldItalic-tlf-ts1--base.tfm \
tex-CpHwt-SemiboldItalic-tlf-ts1.tfm \
tex-CpHwt-SemiboldItalic-tlf-ts1.vf \
tex-CpHwt-Thin-sup-ly1--base.tfm \
tex-CpHwt-Thin-sup-ly1.tfm \
tex-CpHwt-Thin-sup-ly1.vf \
tex-CpHwt-Thin-sup-ot1.tfm \
tex-CpHwt-Thin-sup-t1--base.tfm \
tex-CpHwt-Thin-sup-t1.tfm \
tex-CpHwt-Thin-sup-t1.vf \
tex-CpHwt-Thin-tlf-ly1--base.tfm \
tex-CpHwt-Thin-tlf-ly1.tfm \
tex-CpHwt-Thin-tlf-ly1.vf \
tex-CpHwt-Thin-tlf-ot1--base.tfm \
tex-CpHwt-Thin-tlf-ot1.tfm \
tex-CpHwt-Thin-tlf-ot1.vf \
tex-CpHwt-Thin-tlf-t1--base.tfm \
tex-CpHwt-Thin-tlf-t1.tfm \
tex-CpHwt-Thin-tlf-t1.vf \
tex-CpHwt-Thin-tlf-ts1--base.tfm \
tex-CpHwt-Thin-tlf-ts1.tfm \
tex-CpHwt-Thin-tlf-ts1.vf \
tex-CpHwt-ThinItalic-sup-ly1--base.tfm \
tex-CpHwt-ThinItalic-sup-ly1.tfm \
tex-CpHwt-ThinItalic-sup-ly1.vf \
tex-CpHwt-ThinItalic-sup-ot1.tfm \
tex-CpHwt-ThinItalic-sup-t1--base.tfm \
tex-CpHwt-ThinItalic-sup-t1.tfm \
tex-CpHwt-ThinItalic-sup-t1.vf \
tex-CpHwt-ThinItalic-tlf-ly1--base.tfm \
tex-CpHwt-ThinItalic-tlf-ly1.tfm \
tex-CpHwt-ThinItalic-tlf-ly1.vf \
tex-CpHwt-ThinItalic-tlf-ot1--base.tfm \
tex-CpHwt-ThinItalic-tlf-ot1.tfm \
tex-CpHwt-ThinItalic-tlf-ot1.vf \
tex-CpHwt-ThinItalic-tlf-t1--base.tfm \
tex-CpHwt-ThinItalic-tlf-t1.tfm \
tex-CpHwt-ThinItalic-tlf-t1.vf \
tex-CpHwt-ThinItalic-tlf-ts1--base.tfm \
tex-CpHwt-ThinItalic-tlf-ts1.tfm \
tex-CpHwt-ThinItalic-tlf-ts1.vf \
tex-LY1CpHwt-Sup.fd \
tex-LY1CpHwt-TLF.fd \
tex-OT1CpHwt-Sup.fd \
tex-OT1CpHwt-TLF.fd \
tex-T1CpHwt-Sup.fd \
tex-T1CpHwt-TLF.fd \
tex-TS1CpHwt-TLF.fd \
tex-cphwt-4je6jj.enc \
tex-cphwt-kvtx4d.enc \
tex-cphwt-psuovm.enc \
tex-cphwt-r6y6f6.enc \
tex-cphwt-sz67he.enc \
tex-cphwt-tjvrzf.enc \
tex-cphwt-vrwj46.enc \
texlive-cooperhewitt"

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
texlive-cooperhewitt-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
