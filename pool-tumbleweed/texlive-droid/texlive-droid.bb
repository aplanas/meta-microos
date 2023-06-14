SUMMARY = "LaTeX support for the Droid font families"
DESCRIPTION = "The Droid typeface family was designed in the fall of 2006 by \
Steve Matteson, as a commission from Google to create a set of \
system fonts for its Android platform. The goal was to provide \
optimal quality and comfort on a mobile handset when rendered \
in application menus, web browsers and for other screen text. \
The Droid family consists of Droid Serif, Droid Sans and Droid \
Sans Mono fonts, licensed under the Apache License Version 2.0. \
The bundle includes the fonts in both TrueType and Adobe Type 1 \
formats. The package does not support the Droid Pro family of \
fonts, available for purchase from the Ascender foundry."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn54512"

RPM_NAME = "texlive-droid-2023.201.3.2svn54512-52.1.noarch.rpm"
RPM_HASH = "af3133ca4357382505cb55d50be086c9cb6a81cab28fae5cf52fc3a6ef6bb0ea4e78ab404ff3f00bc1821c7f4f01bde8751d15d50e511dd8c475b1632accb66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DroidSans-Bold-LGR--base.tfm \
tex-DroidSans-Bold-LGR-Slanted--base.tfm \
tex-DroidSans-Bold-LGR-Slanted.tfm \
tex-DroidSans-Bold-LGR-Slanted.vf \
tex-DroidSans-Bold-LGR.tfm \
tex-DroidSans-Bold-LGR.vf \
tex-DroidSans-Bold-OT1--base.tfm \
tex-DroidSans-Bold-OT1-Slanted--base.tfm \
tex-DroidSans-Bold-OT1-Slanted.tfm \
tex-DroidSans-Bold-OT1-Slanted.vf \
tex-DroidSans-Bold-OT1.tfm \
tex-DroidSans-Bold-OT1.vf \
tex-DroidSans-Bold-T1--base.tfm \
tex-DroidSans-Bold-T1-Slanted--base.tfm \
tex-DroidSans-Bold-T1-Slanted.tfm \
tex-DroidSans-Bold-T1-Slanted.vf \
tex-DroidSans-Bold-T1.tfm \
tex-DroidSans-Bold-T1.vf \
tex-DroidSans-Bold-T2A--base.tfm \
tex-DroidSans-Bold-T2A-Slanted--base.tfm \
tex-DroidSans-Bold-T2A-Slanted.tfm \
tex-DroidSans-Bold-T2A-Slanted.vf \
tex-DroidSans-Bold-T2A.tfm \
tex-DroidSans-Bold-T2A.vf \
tex-DroidSans-Bold-T2B--base.tfm \
tex-DroidSans-Bold-T2B-Slanted--base.tfm \
tex-DroidSans-Bold-T2B-Slanted.tfm \
tex-DroidSans-Bold-T2B-Slanted.vf \
tex-DroidSans-Bold-T2B.tfm \
tex-DroidSans-Bold-T2B.vf \
tex-DroidSans-Bold-T2C--base.tfm \
tex-DroidSans-Bold-T2C-Slanted--base.tfm \
tex-DroidSans-Bold-T2C-Slanted.tfm \
tex-DroidSans-Bold-T2C-Slanted.vf \
tex-DroidSans-Bold-T2C.tfm \
tex-DroidSans-Bold-T2C.vf \
tex-DroidSans-Bold-TS1--base.tfm \
tex-DroidSans-Bold-TS1-Slanted--base.tfm \
tex-DroidSans-Bold-TS1-Slanted.tfm \
tex-DroidSans-Bold-TS1-Slanted.vf \
tex-DroidSans-Bold-TS1.tfm \
tex-DroidSans-Bold-TS1.vf \
tex-DroidSans-Bold-X2--base.tfm \
tex-DroidSans-Bold-X2-Slanted--base.tfm \
tex-DroidSans-Bold-X2-Slanted.tfm \
tex-DroidSans-Bold-X2-Slanted.vf \
tex-DroidSans-Bold-X2.tfm \
tex-DroidSans-Bold-X2.vf \
tex-DroidSans-LGR--base.tfm \
tex-DroidSans-LGR-Slanted--base.tfm \
tex-DroidSans-LGR-Slanted.tfm \
tex-DroidSans-LGR-Slanted.vf \
tex-DroidSans-LGR.tfm \
tex-DroidSans-LGR.vf \
tex-DroidSans-OT1--base.tfm \
tex-DroidSans-OT1-Slanted--base.tfm \
tex-DroidSans-OT1-Slanted.tfm \
tex-DroidSans-OT1-Slanted.vf \
tex-DroidSans-OT1.tfm \
tex-DroidSans-OT1.vf \
tex-DroidSans-T1--base.tfm \
tex-DroidSans-T1-Slanted--base.tfm \
tex-DroidSans-T1-Slanted.tfm \
tex-DroidSans-T1-Slanted.vf \
tex-DroidSans-T1.tfm \
tex-DroidSans-T1.vf \
tex-DroidSans-T2A--base.tfm \
tex-DroidSans-T2A-Slanted--base.tfm \
tex-DroidSans-T2A-Slanted.tfm \
tex-DroidSans-T2A-Slanted.vf \
tex-DroidSans-T2A.tfm \
tex-DroidSans-T2A.vf \
tex-DroidSans-T2B--base.tfm \
tex-DroidSans-T2B-Slanted--base.tfm \
tex-DroidSans-T2B-Slanted.tfm \
tex-DroidSans-T2B-Slanted.vf \
tex-DroidSans-T2B.tfm \
tex-DroidSans-T2B.vf \
tex-DroidSans-T2C--base.tfm \
tex-DroidSans-T2C-Slanted--base.tfm \
tex-DroidSans-T2C-Slanted.tfm \
tex-DroidSans-T2C-Slanted.vf \
tex-DroidSans-T2C.tfm \
tex-DroidSans-T2C.vf \
tex-DroidSans-TS1--base.tfm \
tex-DroidSans-TS1-Slanted--base.tfm \
tex-DroidSans-TS1-Slanted.tfm \
tex-DroidSans-TS1-Slanted.vf \
tex-DroidSans-TS1.tfm \
tex-DroidSans-TS1.vf \
tex-DroidSans-X2--base.tfm \
tex-DroidSans-X2-Slanted--base.tfm \
tex-DroidSans-X2-Slanted.tfm \
tex-DroidSans-X2-Slanted.vf \
tex-DroidSans-X2.tfm \
tex-DroidSans-X2.vf \
tex-DroidSansMono-LGR--base.tfm \
tex-DroidSansMono-LGR-Slanted--base.tfm \
tex-DroidSansMono-LGR-Slanted.tfm \
tex-DroidSansMono-LGR-Slanted.vf \
tex-DroidSansMono-LGR.tfm \
tex-DroidSansMono-LGR.vf \
tex-DroidSansMono-OT1--base.tfm \
tex-DroidSansMono-OT1-Slanted--base.tfm \
tex-DroidSansMono-OT1-Slanted.tfm \
tex-DroidSansMono-OT1-Slanted.vf \
tex-DroidSansMono-OT1.tfm \
tex-DroidSansMono-OT1.vf \
tex-DroidSansMono-T1--base.tfm \
tex-DroidSansMono-T1-Slanted--base.tfm \
tex-DroidSansMono-T1-Slanted.tfm \
tex-DroidSansMono-T1-Slanted.vf \
tex-DroidSansMono-T1.tfm \
tex-DroidSansMono-T1.vf \
tex-DroidSansMono-T2A--base.tfm \
tex-DroidSansMono-T2A-Slanted--base.tfm \
tex-DroidSansMono-T2A-Slanted.tfm \
tex-DroidSansMono-T2A-Slanted.vf \
tex-DroidSansMono-T2A.tfm \
tex-DroidSansMono-T2A.vf \
tex-DroidSansMono-T2B--base.tfm \
tex-DroidSansMono-T2B-Slanted--base.tfm \
tex-DroidSansMono-T2B-Slanted.tfm \
tex-DroidSansMono-T2B-Slanted.vf \
tex-DroidSansMono-T2B.tfm \
tex-DroidSansMono-T2B.vf \
tex-DroidSansMono-T2C--base.tfm \
tex-DroidSansMono-T2C-Slanted--base.tfm \
tex-DroidSansMono-T2C-Slanted.tfm \
tex-DroidSansMono-T2C-Slanted.vf \
tex-DroidSansMono-T2C.tfm \
tex-DroidSansMono-T2C.vf \
tex-DroidSansMono-TS1--base.tfm \
tex-DroidSansMono-TS1-Slanted--base.tfm \
tex-DroidSansMono-TS1-Slanted.tfm \
tex-DroidSansMono-TS1-Slanted.vf \
tex-DroidSansMono-TS1.tfm \
tex-DroidSansMono-TS1.vf \
tex-DroidSansMono-X2--base.tfm \
tex-DroidSansMono-X2-Slanted--base.tfm \
tex-DroidSansMono-X2-Slanted.tfm \
tex-DroidSansMono-X2-Slanted.vf \
tex-DroidSansMono-X2.tfm \
tex-DroidSansMono-X2.vf \
tex-DroidSerif-Bold-LGR-Slanted.tfm \
tex-DroidSerif-Bold-LGR.tfm \
tex-DroidSerif-Bold-OT1--base.tfm \
tex-DroidSerif-Bold-OT1-Slanted--base.tfm \
tex-DroidSerif-Bold-OT1-Slanted.tfm \
tex-DroidSerif-Bold-OT1-Slanted.vf \
tex-DroidSerif-Bold-OT1.tfm \
tex-DroidSerif-Bold-OT1.vf \
tex-DroidSerif-Bold-T1--base.tfm \
tex-DroidSerif-Bold-T1-Slanted--base.tfm \
tex-DroidSerif-Bold-T1-Slanted.tfm \
tex-DroidSerif-Bold-T1-Slanted.vf \
tex-DroidSerif-Bold-T1.tfm \
tex-DroidSerif-Bold-T1.vf \
tex-DroidSerif-Bold-T2A--base.tfm \
tex-DroidSerif-Bold-T2A-Slanted--base.tfm \
tex-DroidSerif-Bold-T2A-Slanted.tfm \
tex-DroidSerif-Bold-T2A-Slanted.vf \
tex-DroidSerif-Bold-T2A.tfm \
tex-DroidSerif-Bold-T2A.vf \
tex-DroidSerif-Bold-T2B--base.tfm \
tex-DroidSerif-Bold-T2B-Slanted--base.tfm \
tex-DroidSerif-Bold-T2B-Slanted.tfm \
tex-DroidSerif-Bold-T2B-Slanted.vf \
tex-DroidSerif-Bold-T2B.tfm \
tex-DroidSerif-Bold-T2B.vf \
tex-DroidSerif-Bold-T2C--base.tfm \
tex-DroidSerif-Bold-T2C-Slanted--base.tfm \
tex-DroidSerif-Bold-T2C-Slanted.tfm \
tex-DroidSerif-Bold-T2C-Slanted.vf \
tex-DroidSerif-Bold-T2C.tfm \
tex-DroidSerif-Bold-T2C.vf \
tex-DroidSerif-Bold-TS1--base.tfm \
tex-DroidSerif-Bold-TS1-Slanted--base.tfm \
tex-DroidSerif-Bold-TS1-Slanted.tfm \
tex-DroidSerif-Bold-TS1-Slanted.vf \
tex-DroidSerif-Bold-TS1.tfm \
tex-DroidSerif-Bold-TS1.vf \
tex-DroidSerif-Bold-X2--base.tfm \
tex-DroidSerif-Bold-X2-Slanted--base.tfm \
tex-DroidSerif-Bold-X2-Slanted.tfm \
tex-DroidSerif-Bold-X2-Slanted.vf \
tex-DroidSerif-Bold-X2.tfm \
tex-DroidSerif-Bold-X2.vf \
tex-DroidSerif-BoldItalic-LGR-Upright.tfm \
tex-DroidSerif-BoldItalic-LGR.tfm \
tex-DroidSerif-BoldItalic-OT1--base.tfm \
tex-DroidSerif-BoldItalic-OT1-Upright--base.tfm \
tex-DroidSerif-BoldItalic-OT1-Upright.tfm \
tex-DroidSerif-BoldItalic-OT1-Upright.vf \
tex-DroidSerif-BoldItalic-OT1.tfm \
tex-DroidSerif-BoldItalic-OT1.vf \
tex-DroidSerif-BoldItalic-T1--base.tfm \
tex-DroidSerif-BoldItalic-T1-Upright--base.tfm \
tex-DroidSerif-BoldItalic-T1-Upright.tfm \
tex-DroidSerif-BoldItalic-T1-Upright.vf \
tex-DroidSerif-BoldItalic-T1.tfm \
tex-DroidSerif-BoldItalic-T1.vf \
tex-DroidSerif-BoldItalic-T2A--base.tfm \
tex-DroidSerif-BoldItalic-T2A-Upright--base.tfm \
tex-DroidSerif-BoldItalic-T2A-Upright.tfm \
tex-DroidSerif-BoldItalic-T2A-Upright.vf \
tex-DroidSerif-BoldItalic-T2A.tfm \
tex-DroidSerif-BoldItalic-T2A.vf \
tex-DroidSerif-BoldItalic-T2B--base.tfm \
tex-DroidSerif-BoldItalic-T2B-Upright--base.tfm \
tex-DroidSerif-BoldItalic-T2B-Upright.tfm \
tex-DroidSerif-BoldItalic-T2B-Upright.vf \
tex-DroidSerif-BoldItalic-T2B.tfm \
tex-DroidSerif-BoldItalic-T2B.vf \
tex-DroidSerif-BoldItalic-T2C--base.tfm \
tex-DroidSerif-BoldItalic-T2C-Upright--base.tfm \
tex-DroidSerif-BoldItalic-T2C-Upright.tfm \
tex-DroidSerif-BoldItalic-T2C-Upright.vf \
tex-DroidSerif-BoldItalic-T2C.tfm \
tex-DroidSerif-BoldItalic-T2C.vf \
tex-DroidSerif-BoldItalic-TS1--base.tfm \
tex-DroidSerif-BoldItalic-TS1-Upright--base.tfm \
tex-DroidSerif-BoldItalic-TS1-Upright.tfm \
tex-DroidSerif-BoldItalic-TS1-Upright.vf \
tex-DroidSerif-BoldItalic-TS1.tfm \
tex-DroidSerif-BoldItalic-TS1.vf \
tex-DroidSerif-BoldItalic-X2--base.tfm \
tex-DroidSerif-BoldItalic-X2-Upright--base.tfm \
tex-DroidSerif-BoldItalic-X2-Upright.tfm \
tex-DroidSerif-BoldItalic-X2-Upright.vf \
tex-DroidSerif-BoldItalic-X2.tfm \
tex-DroidSerif-BoldItalic-X2.vf \
tex-DroidSerif-Italic-LGR-Upright.tfm \
tex-DroidSerif-Italic-LGR.tfm \
tex-DroidSerif-Italic-OT1--base.tfm \
tex-DroidSerif-Italic-OT1-Upright--base.tfm \
tex-DroidSerif-Italic-OT1-Upright.tfm \
tex-DroidSerif-Italic-OT1-Upright.vf \
tex-DroidSerif-Italic-OT1.tfm \
tex-DroidSerif-Italic-OT1.vf \
tex-DroidSerif-Italic-T1--base.tfm \
tex-DroidSerif-Italic-T1-Upright--base.tfm \
tex-DroidSerif-Italic-T1-Upright.tfm \
tex-DroidSerif-Italic-T1-Upright.vf \
tex-DroidSerif-Italic-T1.tfm \
tex-DroidSerif-Italic-T1.vf \
tex-DroidSerif-Italic-T2A--base.tfm \
tex-DroidSerif-Italic-T2A-Upright--base.tfm \
tex-DroidSerif-Italic-T2A-Upright.tfm \
tex-DroidSerif-Italic-T2A-Upright.vf \
tex-DroidSerif-Italic-T2A.tfm \
tex-DroidSerif-Italic-T2A.vf \
tex-DroidSerif-Italic-T2B--base.tfm \
tex-DroidSerif-Italic-T2B-Upright--base.tfm \
tex-DroidSerif-Italic-T2B-Upright.tfm \
tex-DroidSerif-Italic-T2B-Upright.vf \
tex-DroidSerif-Italic-T2B.tfm \
tex-DroidSerif-Italic-T2B.vf \
tex-DroidSerif-Italic-T2C--base.tfm \
tex-DroidSerif-Italic-T2C-Upright--base.tfm \
tex-DroidSerif-Italic-T2C-Upright.tfm \
tex-DroidSerif-Italic-T2C-Upright.vf \
tex-DroidSerif-Italic-T2C.tfm \
tex-DroidSerif-Italic-T2C.vf \
tex-DroidSerif-Italic-TS1--base.tfm \
tex-DroidSerif-Italic-TS1-Upright--base.tfm \
tex-DroidSerif-Italic-TS1-Upright.tfm \
tex-DroidSerif-Italic-TS1-Upright.vf \
tex-DroidSerif-Italic-TS1.tfm \
tex-DroidSerif-Italic-TS1.vf \
tex-DroidSerif-Italic-X2--base.tfm \
tex-DroidSerif-Italic-X2-Upright--base.tfm \
tex-DroidSerif-Italic-X2-Upright.tfm \
tex-DroidSerif-Italic-X2-Upright.vf \
tex-DroidSerif-Italic-X2.tfm \
tex-DroidSerif-Italic-X2.vf \
tex-DroidSerif-Regular-LGR-Slanted.tfm \
tex-DroidSerif-Regular-LGR.tfm \
tex-DroidSerif-Regular-OT1--base.tfm \
tex-DroidSerif-Regular-OT1-Slanted--base.tfm \
tex-DroidSerif-Regular-OT1-Slanted.tfm \
tex-DroidSerif-Regular-OT1-Slanted.vf \
tex-DroidSerif-Regular-OT1.tfm \
tex-DroidSerif-Regular-OT1.vf \
tex-DroidSerif-Regular-T1--base.tfm \
tex-DroidSerif-Regular-T1-Slanted--base.tfm \
tex-DroidSerif-Regular-T1-Slanted.tfm \
tex-DroidSerif-Regular-T1-Slanted.vf \
tex-DroidSerif-Regular-T1.tfm \
tex-DroidSerif-Regular-T1.vf \
tex-DroidSerif-Regular-T2A--base.tfm \
tex-DroidSerif-Regular-T2A-Slanted--base.tfm \
tex-DroidSerif-Regular-T2A-Slanted.tfm \
tex-DroidSerif-Regular-T2A-Slanted.vf \
tex-DroidSerif-Regular-T2A.tfm \
tex-DroidSerif-Regular-T2A.vf \
tex-DroidSerif-Regular-T2B--base.tfm \
tex-DroidSerif-Regular-T2B-Slanted--base.tfm \
tex-DroidSerif-Regular-T2B-Slanted.tfm \
tex-DroidSerif-Regular-T2B-Slanted.vf \
tex-DroidSerif-Regular-T2B.tfm \
tex-DroidSerif-Regular-T2B.vf \
tex-DroidSerif-Regular-T2C--base.tfm \
tex-DroidSerif-Regular-T2C-Slanted--base.tfm \
tex-DroidSerif-Regular-T2C-Slanted.tfm \
tex-DroidSerif-Regular-T2C-Slanted.vf \
tex-DroidSerif-Regular-T2C.tfm \
tex-DroidSerif-Regular-T2C.vf \
tex-DroidSerif-Regular-TS1--base.tfm \
tex-DroidSerif-Regular-TS1-Slanted--base.tfm \
tex-DroidSerif-Regular-TS1-Slanted.tfm \
tex-DroidSerif-Regular-TS1-Slanted.vf \
tex-DroidSerif-Regular-TS1.tfm \
tex-DroidSerif-Regular-TS1.vf \
tex-DroidSerif-Regular-X2--base.tfm \
tex-DroidSerif-Regular-X2-Slanted--base.tfm \
tex-DroidSerif-Regular-X2-Slanted.tfm \
tex-DroidSerif-Regular-X2-Slanted.vf \
tex-DroidSerif-Regular-X2.tfm \
tex-DroidSerif-Regular-X2.vf \
tex-LGRdroidsans.fd \
tex-LGRdroidsansmono.fd \
tex-LGRdroidserif.fd \
tex-OT1droidsans.fd \
tex-OT1droidsansmono.fd \
tex-OT1droidserif.fd \
tex-T1droidsans.fd \
tex-T1droidsansmono.fd \
tex-T1droidserif.fd \
tex-T2Adroidsans.fd \
tex-T2Adroidsansmono.fd \
tex-T2Adroidserif.fd \
tex-T2Bdroidsans.fd \
tex-T2Bdroidsansmono.fd \
tex-T2Bdroidserif.fd \
tex-T2Cdroidsans.fd \
tex-T2Cdroidsansmono.fd \
tex-T2Cdroidserif.fd \
tex-TS1droidsans.fd \
tex-TS1droidsansmono.fd \
tex-TS1droidserif.fd \
tex-X2droidsans.fd \
tex-X2droidsansmono.fd \
tex-X2droidserif.fd \
tex-a-55mctf.enc \
tex-a-6t6vor.enc \
tex-a-7xkq4l.enc \
tex-a-atrmj4.enc \
tex-a-auqje4.enc \
tex-a-dhbph5.enc \
tex-a-es3zal.enc \
tex-a-gyeryq.enc \
tex-a-hyyrer.enc \
tex-a-i77vuw.enc \
tex-a-joxy3n.enc \
tex-a-k2ku5j.enc \
tex-a-l5aj6z.enc \
tex-a-lzb5hy.enc \
tex-a-nm2gjd.enc \
tex-a-nwf7uv.enc \
tex-a-slcnpg.enc \
tex-a-vtfkvv.enc \
tex-a-w466e2.enc \
tex-a-xgvdme.enc \
tex-a-zpgv3j.enc \
tex-droid.sty \
tex-droidsans.map \
tex-droidsans.sty \
tex-droidsansmono.map \
tex-droidsansmono.sty \
tex-droidserif.map \
tex-droidserif.sty \
texlive-droid"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-droid-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
