SUMMARY = "TeX Fonts extending freely available URW fonts"
DESCRIPTION = "The TeX-GYRE bundle consists of six font families: TeX Gyre \
Adventor is based on the URW Gothic L family of fonts (which is \
derived from ITC Avant Garde Gothic, designed by Herb Lubalin \
and Tom Carnase). TeX Gyre Bonum is based on the URW Bookman L \
family (from Bookman Old Style, designed by Alexander \
Phemister). TeX Gyre Chorus is based on URW Chancery L Medium \
Italic (from ITC Zapf Chancery, designed by Hermann Zapf in \
1979). TeX-Gyre Cursor is based on URW Nimbus Mono L (based on \
Courier, designed by Howard G. Kettler in 1955, for IBM). TeX \
Gyre Heros is based on URW Nimbus Sans L (from Helvetica, \
prepared by Max Miedinger, with Eduard Hoffmann in 1957). TeX \
Gyre Pagella is based on URW Palladio L (from Palatino, \
designed by Hermann Zapf in the 1940s). TeX Gyre Schola is \
based on the URW Century Schoolbook L family (from Century \
Schoolbook, designed by Morris Fuller Benton for the American \
Type Founders). TeX Gyre Termes is based on the URW Nimbus \
Roman No9 L family of fonts (from Times New Roman, designed by \
Stanley Morison together with Starling Burgess and Victor \
Lardent and first offered by Monotype). The constituent \
standard faces of each family have been greatly extended \
(though Chorus omits Greek support and has no small-caps \
family). Each family is available in Adobe Type 1 and Open Type \
formats, and LaTeX support (for use with a variety of \
encodings) is provided. Vietnamese characters were added by Han \
The Thanh. There are companion maths fonts for several of these \
designs, listed in the TeX Gyre Math package."
LICENSE = "LPPL-1.3c"

PV = "2023.201.2.501svn65956"

RPM_NAME = "texlive-tex-gyre-2023.201.2.501svn65956-54.1.noarch.rpm"
RPM_HASH = "214d5465faaf6ef504f5f9c442d1bf344f3bb53b30937d4850f90020e2c601e4f5ea22bfb37503ef3110a7d5c99b731caaa59c537f9f389d3180b41bc4cd3aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cs-qagb-sc.tfm \
tex-cs-qagb.tfm \
tex-cs-qagbi-sc.tfm \
tex-cs-qagbi.tfm \
tex-cs-qagr-sc.tfm \
tex-cs-qagr.tfm \
tex-cs-qagri-sc.tfm \
tex-cs-qagri.tfm \
tex-cs-qbkb-sc.tfm \
tex-cs-qbkb.tfm \
tex-cs-qbkbi-sc.tfm \
tex-cs-qbkbi.tfm \
tex-cs-qbkr-sc.tfm \
tex-cs-qbkr.tfm \
tex-cs-qbkri-sc.tfm \
tex-cs-qbkri.tfm \
tex-cs-qcrb-sc.tfm \
tex-cs-qcrb.tfm \
tex-cs-qcrbi-sc.tfm \
tex-cs-qcrbi.tfm \
tex-cs-qcrr-sc.tfm \
tex-cs-qcrr.tfm \
tex-cs-qcrri-sc.tfm \
tex-cs-qcrri.tfm \
tex-cs-qcsb-sc.tfm \
tex-cs-qcsb.tfm \
tex-cs-qcsbi-sc.tfm \
tex-cs-qcsbi.tfm \
tex-cs-qcsr-sc.tfm \
tex-cs-qcsr.tfm \
tex-cs-qcsri-sc.tfm \
tex-cs-qcsri.tfm \
tex-cs-qhvb-sc.tfm \
tex-cs-qhvb.tfm \
tex-cs-qhvbi-sc.tfm \
tex-cs-qhvbi.tfm \
tex-cs-qhvcb-sc.tfm \
tex-cs-qhvcb.tfm \
tex-cs-qhvcbi-sc.tfm \
tex-cs-qhvcbi.tfm \
tex-cs-qhvcr-sc.tfm \
tex-cs-qhvcr.tfm \
tex-cs-qhvcri-sc.tfm \
tex-cs-qhvcri.tfm \
tex-cs-qhvr-sc.tfm \
tex-cs-qhvr.tfm \
tex-cs-qhvri-sc.tfm \
tex-cs-qhvri.tfm \
tex-cs-qplb-sc.tfm \
tex-cs-qplb.tfm \
tex-cs-qplbi-sc.tfm \
tex-cs-qplbi.tfm \
tex-cs-qplr-sc.tfm \
tex-cs-qplr.tfm \
tex-cs-qplri-sc.tfm \
tex-cs-qplri.tfm \
tex-cs-qtmb-sc.tfm \
tex-cs-qtmb.tfm \
tex-cs-qtmbi-sc.tfm \
tex-cs-qtmbi.tfm \
tex-cs-qtmr-sc.tfm \
tex-cs-qtmr.tfm \
tex-cs-qtmri-sc.tfm \
tex-cs-qtmri.tfm \
tex-cs-qzcmi.tfm \
tex-ec-qagb-sc.tfm \
tex-ec-qagb.tfm \
tex-ec-qagbi-sc.tfm \
tex-ec-qagbi.tfm \
tex-ec-qagr-sc.tfm \
tex-ec-qagr.tfm \
tex-ec-qagri-sc.tfm \
tex-ec-qagri.tfm \
tex-ec-qbkb-sc.tfm \
tex-ec-qbkb.tfm \
tex-ec-qbkbi-sc.tfm \
tex-ec-qbkbi.tfm \
tex-ec-qbkr-sc.tfm \
tex-ec-qbkr.tfm \
tex-ec-qbkri-sc.tfm \
tex-ec-qbkri.tfm \
tex-ec-qcrb-sc.tfm \
tex-ec-qcrb.tfm \
tex-ec-qcrbi-sc.tfm \
tex-ec-qcrbi.tfm \
tex-ec-qcrr-sc.tfm \
tex-ec-qcrr.tfm \
tex-ec-qcrri-sc.tfm \
tex-ec-qcrri.tfm \
tex-ec-qcsb-sc.tfm \
tex-ec-qcsb.tfm \
tex-ec-qcsbi-sc.tfm \
tex-ec-qcsbi.tfm \
tex-ec-qcsr-sc.tfm \
tex-ec-qcsr.tfm \
tex-ec-qcsri-sc.tfm \
tex-ec-qcsri.tfm \
tex-ec-qhvb-sc.tfm \
tex-ec-qhvb.tfm \
tex-ec-qhvbi-sc.tfm \
tex-ec-qhvbi.tfm \
tex-ec-qhvcb-sc.tfm \
tex-ec-qhvcb.tfm \
tex-ec-qhvcbi-sc.tfm \
tex-ec-qhvcbi.tfm \
tex-ec-qhvcr-sc.tfm \
tex-ec-qhvcr.tfm \
tex-ec-qhvcri-sc.tfm \
tex-ec-qhvcri.tfm \
tex-ec-qhvr-sc.tfm \
tex-ec-qhvr.tfm \
tex-ec-qhvri-sc.tfm \
tex-ec-qhvri.tfm \
tex-ec-qplb-sc.tfm \
tex-ec-qplb.tfm \
tex-ec-qplbi-sc.tfm \
tex-ec-qplbi.tfm \
tex-ec-qplr-sc.tfm \
tex-ec-qplr.tfm \
tex-ec-qplri-sc.tfm \
tex-ec-qplri.tfm \
tex-ec-qtmb-sc.tfm \
tex-ec-qtmb.tfm \
tex-ec-qtmbi-sc.tfm \
tex-ec-qtmbi.tfm \
tex-ec-qtmr-sc.tfm \
tex-ec-qtmr.tfm \
tex-ec-qtmri-sc.tfm \
tex-ec-qtmri.tfm \
tex-ec-qzcmi.tfm \
tex-il2qag.fd \
tex-il2qbk.fd \
tex-il2qcr.fd \
tex-il2qcs.fd \
tex-il2qhv.fd \
tex-il2qhvc.fd \
tex-il2qpl.fd \
tex-il2qtm.fd \
tex-il2qzc.fd \
tex-l7x-qagb-sc.tfm \
tex-l7x-qagb.tfm \
tex-l7x-qagbi-sc.tfm \
tex-l7x-qagbi.tfm \
tex-l7x-qagr-sc.tfm \
tex-l7x-qagr.tfm \
tex-l7x-qagri-sc.tfm \
tex-l7x-qagri.tfm \
tex-l7x-qbkb-sc.tfm \
tex-l7x-qbkb.tfm \
tex-l7x-qbkbi-sc.tfm \
tex-l7x-qbkbi.tfm \
tex-l7x-qbkr-sc.tfm \
tex-l7x-qbkr.tfm \
tex-l7x-qbkri-sc.tfm \
tex-l7x-qbkri.tfm \
tex-l7x-qcrb-sc.tfm \
tex-l7x-qcrb.tfm \
tex-l7x-qcrbi-sc.tfm \
tex-l7x-qcrbi.tfm \
tex-l7x-qcrr-sc.tfm \
tex-l7x-qcrr.tfm \
tex-l7x-qcrri-sc.tfm \
tex-l7x-qcrri.tfm \
tex-l7x-qcsb-sc.tfm \
tex-l7x-qcsb.tfm \
tex-l7x-qcsbi-sc.tfm \
tex-l7x-qcsbi.tfm \
tex-l7x-qcsr-sc.tfm \
tex-l7x-qcsr.tfm \
tex-l7x-qcsri-sc.tfm \
tex-l7x-qcsri.tfm \
tex-l7x-qhvb-sc.tfm \
tex-l7x-qhvb.tfm \
tex-l7x-qhvbi-sc.tfm \
tex-l7x-qhvbi.tfm \
tex-l7x-qhvcb-sc.tfm \
tex-l7x-qhvcb.tfm \
tex-l7x-qhvcbi-sc.tfm \
tex-l7x-qhvcbi.tfm \
tex-l7x-qhvcr-sc.tfm \
tex-l7x-qhvcr.tfm \
tex-l7x-qhvcri-sc.tfm \
tex-l7x-qhvcri.tfm \
tex-l7x-qhvr-sc.tfm \
tex-l7x-qhvr.tfm \
tex-l7x-qhvri-sc.tfm \
tex-l7x-qhvri.tfm \
tex-l7x-qplb-sc.tfm \
tex-l7x-qplb.tfm \
tex-l7x-qplbi-sc.tfm \
tex-l7x-qplbi.tfm \
tex-l7x-qplr-sc.tfm \
tex-l7x-qplr.tfm \
tex-l7x-qplri-sc.tfm \
tex-l7x-qplri.tfm \
tex-l7x-qtmb-sc.tfm \
tex-l7x-qtmb.tfm \
tex-l7x-qtmbi-sc.tfm \
tex-l7x-qtmbi.tfm \
tex-l7x-qtmr-sc.tfm \
tex-l7x-qtmr.tfm \
tex-l7x-qtmri-sc.tfm \
tex-l7x-qtmri.tfm \
tex-l7x-qzcmi.tfm \
tex-l7xqag.fd \
tex-l7xqbk.fd \
tex-l7xqcr.fd \
tex-l7xqcs.fd \
tex-l7xqhv.fd \
tex-l7xqhvc.fd \
tex-l7xqpl.fd \
tex-l7xqtm.fd \
tex-l7xqzc.fd \
tex-ly1qag.fd \
tex-ly1qbk.fd \
tex-ly1qcr.fd \
tex-ly1qcs.fd \
tex-ly1qhv.fd \
tex-ly1qhvc.fd \
tex-ly1qpl.fd \
tex-ly1qtm.fd \
tex-ly1qzc.fd \
tex-ot1qag.fd \
tex-ot1qbk.fd \
tex-ot1qcr.fd \
tex-ot1qcs.fd \
tex-ot1qhv.fd \
tex-ot1qhvc.fd \
tex-ot1qpl.fd \
tex-ot1qtm.fd \
tex-ot1qzc.fd \
tex-ot4qag.fd \
tex-ot4qbk.fd \
tex-ot4qcr.fd \
tex-ot4qcs.fd \
tex-ot4qhv.fd \
tex-ot4qhvc.fd \
tex-ot4qpl.fd \
tex-ot4qtm.fd \
tex-ot4qzc.fd \
tex-q-cs-sc.enc \
tex-q-cs.enc \
tex-q-csm-sc.enc \
tex-q-csm.enc \
tex-q-cszc.enc \
tex-q-ec-sc.enc \
tex-q-ec.enc \
tex-q-l7x-sc.enc \
tex-q-l7x.enc \
tex-q-l7xzc.enc \
tex-q-qx-sc.enc \
tex-q-qx.enc \
tex-q-qxm-sc.enc \
tex-q-qxm.enc \
tex-q-qxzc.enc \
tex-q-rm-sc.enc \
tex-q-rm.enc \
tex-q-rmm-sc.enc \
tex-q-rmm.enc \
tex-q-rmzc.enc \
tex-q-t5-sc.enc \
tex-q-t5.enc \
tex-q-texnansi-sc.enc \
tex-q-texnansi.enc \
tex-q-texnansizc.enc \
tex-q-ts1.enc \
tex-qag-cs.map \
tex-qag-ec.map \
tex-qag-l7x.map \
tex-qag-qx.map \
tex-qag-rm.map \
tex-qag-t5.map \
tex-qag-texnansi.map \
tex-qag-ts1.map \
tex-qag.map \
tex-qbk-cs.map \
tex-qbk-ec.map \
tex-qbk-l7x.map \
tex-qbk-qx.map \
tex-qbk-rm.map \
tex-qbk-t5.map \
tex-qbk-texnansi.map \
tex-qbk-ts1.map \
tex-qbk.map \
tex-qbookman.sty \
tex-qcourier.sty \
tex-qcr-cs.map \
tex-qcr-ec.map \
tex-qcr-l7x.map \
tex-qcr-qx.map \
tex-qcr-rm.map \
tex-qcr-t5.map \
tex-qcr-texnansi.map \
tex-qcr-ts1.map \
tex-qcr.map \
tex-qcs-cs.map \
tex-qcs-ec.map \
tex-qcs-l7x.map \
tex-qcs-qx.map \
tex-qcs-rm.map \
tex-qcs-t5.map \
tex-qcs-texnansi.map \
tex-qcs-ts1.map \
tex-qcs.map \
tex-qhv-cs.map \
tex-qhv-ec.map \
tex-qhv-l7x.map \
tex-qhv-qx.map \
tex-qhv-rm.map \
tex-qhv-t5.map \
tex-qhv-texnansi.map \
tex-qhv-ts1.map \
tex-qhv.map \
tex-qpalatin.sty \
tex-qpl-cs.map \
tex-qpl-ec.map \
tex-qpl-l7x.map \
tex-qpl-qx.map \
tex-qpl-rm.map \
tex-qpl-t5.map \
tex-qpl-texnansi.map \
tex-qpl-ts1.map \
tex-qpl.map \
tex-qswiss.sty \
tex-qtimes.sty \
tex-qtm-cs.map \
tex-qtm-ec.map \
tex-qtm-l7x.map \
tex-qtm-qx.map \
tex-qtm-rm.map \
tex-qtm-t5.map \
tex-qtm-texnansi.map \
tex-qtm-ts1.map \
tex-qtm.map \
tex-qx-qagb-sc.tfm \
tex-qx-qagb.tfm \
tex-qx-qagbi-sc.tfm \
tex-qx-qagbi.tfm \
tex-qx-qagr-sc.tfm \
tex-qx-qagr.tfm \
tex-qx-qagri-sc.tfm \
tex-qx-qagri.tfm \
tex-qx-qbkb-sc.tfm \
tex-qx-qbkb.tfm \
tex-qx-qbkbi-sc.tfm \
tex-qx-qbkbi.tfm \
tex-qx-qbkr-sc.tfm \
tex-qx-qbkr.tfm \
tex-qx-qbkri-sc.tfm \
tex-qx-qbkri.tfm \
tex-qx-qcrb-sc.tfm \
tex-qx-qcrb.tfm \
tex-qx-qcrbi-sc.tfm \
tex-qx-qcrbi.tfm \
tex-qx-qcrr-sc.tfm \
tex-qx-qcrr.tfm \
tex-qx-qcrri-sc.tfm \
tex-qx-qcrri.tfm \
tex-qx-qcsb-sc.tfm \
tex-qx-qcsb.tfm \
tex-qx-qcsbi-sc.tfm \
tex-qx-qcsbi.tfm \
tex-qx-qcsr-sc.tfm \
tex-qx-qcsr.tfm \
tex-qx-qcsri-sc.tfm \
tex-qx-qcsri.tfm \
tex-qx-qhvb-sc.tfm \
tex-qx-qhvb.tfm \
tex-qx-qhvbi-sc.tfm \
tex-qx-qhvbi.tfm \
tex-qx-qhvcb-sc.tfm \
tex-qx-qhvcb.tfm \
tex-qx-qhvcbi-sc.tfm \
tex-qx-qhvcbi.tfm \
tex-qx-qhvcr-sc.tfm \
tex-qx-qhvcr.tfm \
tex-qx-qhvcri-sc.tfm \
tex-qx-qhvcri.tfm \
tex-qx-qhvr-sc.tfm \
tex-qx-qhvr.tfm \
tex-qx-qhvri-sc.tfm \
tex-qx-qhvri.tfm \
tex-qx-qplb-sc.tfm \
tex-qx-qplb.tfm \
tex-qx-qplbi-sc.tfm \
tex-qx-qplbi.tfm \
tex-qx-qplr-sc.tfm \
tex-qx-qplr.tfm \
tex-qx-qplri-sc.tfm \
tex-qx-qplri.tfm \
tex-qx-qtmb-sc.tfm \
tex-qx-qtmb.tfm \
tex-qx-qtmbi-sc.tfm \
tex-qx-qtmbi.tfm \
tex-qx-qtmr-sc.tfm \
tex-qx-qtmr.tfm \
tex-qx-qtmri-sc.tfm \
tex-qx-qtmri.tfm \
tex-qx-qzcmi.tfm \
tex-qxqag.fd \
tex-qxqbk.fd \
tex-qxqcr.fd \
tex-qxqcs.fd \
tex-qxqhv.fd \
tex-qxqhvc.fd \
tex-qxqpl.fd \
tex-qxqtm.fd \
tex-qxqzc.fd \
tex-qzapfcha.sty \
tex-qzc-cs.map \
tex-qzc-ec.map \
tex-qzc-l7x.map \
tex-qzc-qx.map \
tex-qzc-rm.map \
tex-qzc-t5.map \
tex-qzc-texnansi.map \
tex-qzc-ts1.map \
tex-qzc.map \
tex-rm-qagb-sc.tfm \
tex-rm-qagb.tfm \
tex-rm-qagbi-sc.tfm \
tex-rm-qagbi.tfm \
tex-rm-qagr-sc.tfm \
tex-rm-qagr.tfm \
tex-rm-qagri-sc.tfm \
tex-rm-qagri.tfm \
tex-rm-qbkb-sc.tfm \
tex-rm-qbkb.tfm \
tex-rm-qbkbi-sc.tfm \
tex-rm-qbkbi.tfm \
tex-rm-qbkr-sc.tfm \
tex-rm-qbkr.tfm \
tex-rm-qbkri-sc.tfm \
tex-rm-qbkri.tfm \
tex-rm-qcrb-sc.tfm \
tex-rm-qcrb.tfm \
tex-rm-qcrbi-sc.tfm \
tex-rm-qcrbi.tfm \
tex-rm-qcrr-sc.tfm \
tex-rm-qcrr.tfm \
tex-rm-qcrri-sc.tfm \
tex-rm-qcrri.tfm \
tex-rm-qcsb-sc.tfm \
tex-rm-qcsb.tfm \
tex-rm-qcsbi-sc.tfm \
tex-rm-qcsbi.tfm \
tex-rm-qcsr-sc.tfm \
tex-rm-qcsr.tfm \
tex-rm-qcsri-sc.tfm \
tex-rm-qcsri.tfm \
tex-rm-qhvb-sc.tfm \
tex-rm-qhvb.tfm \
tex-rm-qhvbi-sc.tfm \
tex-rm-qhvbi.tfm \
tex-rm-qhvcb-sc.tfm \
tex-rm-qhvcb.tfm \
tex-rm-qhvcbi-sc.tfm \
tex-rm-qhvcbi.tfm \
tex-rm-qhvcr-sc.tfm \
tex-rm-qhvcr.tfm \
tex-rm-qhvcri-sc.tfm \
tex-rm-qhvcri.tfm \
tex-rm-qhvr-sc.tfm \
tex-rm-qhvr.tfm \
tex-rm-qhvri-sc.tfm \
tex-rm-qhvri.tfm \
tex-rm-qplb-sc.tfm \
tex-rm-qplb.tfm \
tex-rm-qplbi-sc.tfm \
tex-rm-qplbi.tfm \
tex-rm-qplr-sc.tfm \
tex-rm-qplr.tfm \
tex-rm-qplri-sc.tfm \
tex-rm-qplri.tfm \
tex-rm-qtmb-sc.tfm \
tex-rm-qtmb.tfm \
tex-rm-qtmbi-sc.tfm \
tex-rm-qtmbi.tfm \
tex-rm-qtmr-sc.tfm \
tex-rm-qtmr.tfm \
tex-rm-qtmri-sc.tfm \
tex-rm-qtmri.tfm \
tex-rm-qzcmi.tfm \
tex-t1qag.fd \
tex-t1qbk.fd \
tex-t1qcr.fd \
tex-t1qcs.fd \
tex-t1qhv.fd \
tex-t1qhvc.fd \
tex-t1qpl.fd \
tex-t1qtm.fd \
tex-t1qzc.fd \
tex-t5-qagb-sc.tfm \
tex-t5-qagb.tfm \
tex-t5-qagbi-sc.tfm \
tex-t5-qagbi.tfm \
tex-t5-qagr-sc.tfm \
tex-t5-qagr.tfm \
tex-t5-qagri-sc.tfm \
tex-t5-qagri.tfm \
tex-t5-qbkb-sc.tfm \
tex-t5-qbkb.tfm \
tex-t5-qbkbi-sc.tfm \
tex-t5-qbkbi.tfm \
tex-t5-qbkr-sc.tfm \
tex-t5-qbkr.tfm \
tex-t5-qbkri-sc.tfm \
tex-t5-qbkri.tfm \
tex-t5-qcrb-sc.tfm \
tex-t5-qcrb.tfm \
tex-t5-qcrbi-sc.tfm \
tex-t5-qcrbi.tfm \
tex-t5-qcrr-sc.tfm \
tex-t5-qcrr.tfm \
tex-t5-qcrri-sc.tfm \
tex-t5-qcrri.tfm \
tex-t5-qcsb-sc.tfm \
tex-t5-qcsb.tfm \
tex-t5-qcsbi-sc.tfm \
tex-t5-qcsbi.tfm \
tex-t5-qcsr-sc.tfm \
tex-t5-qcsr.tfm \
tex-t5-qcsri-sc.tfm \
tex-t5-qcsri.tfm \
tex-t5-qhvb-sc.tfm \
tex-t5-qhvb.tfm \
tex-t5-qhvbi-sc.tfm \
tex-t5-qhvbi.tfm \
tex-t5-qhvcb-sc.tfm \
tex-t5-qhvcb.tfm \
tex-t5-qhvcbi-sc.tfm \
tex-t5-qhvcbi.tfm \
tex-t5-qhvcr-sc.tfm \
tex-t5-qhvcr.tfm \
tex-t5-qhvcri-sc.tfm \
tex-t5-qhvcri.tfm \
tex-t5-qhvr-sc.tfm \
tex-t5-qhvr.tfm \
tex-t5-qhvri-sc.tfm \
tex-t5-qhvri.tfm \
tex-t5-qplb-sc.tfm \
tex-t5-qplb.tfm \
tex-t5-qplbi-sc.tfm \
tex-t5-qplbi.tfm \
tex-t5-qplr-sc.tfm \
tex-t5-qplr.tfm \
tex-t5-qplri-sc.tfm \
tex-t5-qplri.tfm \
tex-t5-qtmb-sc.tfm \
tex-t5-qtmb.tfm \
tex-t5-qtmbi-sc.tfm \
tex-t5-qtmbi.tfm \
tex-t5-qtmr-sc.tfm \
tex-t5-qtmr.tfm \
tex-t5-qtmri-sc.tfm \
tex-t5-qtmri.tfm \
tex-t5-qzcmi.tfm \
tex-t5qag.fd \
tex-t5qbk.fd \
tex-t5qcr.fd \
tex-t5qcs.fd \
tex-t5qhv.fd \
tex-t5qhvc.fd \
tex-t5qpl.fd \
tex-t5qtm.fd \
tex-t5qzc.fd \
tex-texnansi-qagb-sc.tfm \
tex-texnansi-qagb.tfm \
tex-texnansi-qagbi-sc.tfm \
tex-texnansi-qagbi.tfm \
tex-texnansi-qagr-sc.tfm \
tex-texnansi-qagr.tfm \
tex-texnansi-qagri-sc.tfm \
tex-texnansi-qagri.tfm \
tex-texnansi-qbkb-sc.tfm \
tex-texnansi-qbkb.tfm \
tex-texnansi-qbkbi-sc.tfm \
tex-texnansi-qbkbi.tfm \
tex-texnansi-qbkr-sc.tfm \
tex-texnansi-qbkr.tfm \
tex-texnansi-qbkri-sc.tfm \
tex-texnansi-qbkri.tfm \
tex-texnansi-qcrb-sc.tfm \
tex-texnansi-qcrb.tfm \
tex-texnansi-qcrbi-sc.tfm \
tex-texnansi-qcrbi.tfm \
tex-texnansi-qcrr-sc.tfm \
tex-texnansi-qcrr.tfm \
tex-texnansi-qcrri-sc.tfm \
tex-texnansi-qcrri.tfm \
tex-texnansi-qcsb-sc.tfm \
tex-texnansi-qcsb.tfm \
tex-texnansi-qcsbi-sc.tfm \
tex-texnansi-qcsbi.tfm \
tex-texnansi-qcsr-sc.tfm \
tex-texnansi-qcsr.tfm \
tex-texnansi-qcsri-sc.tfm \
tex-texnansi-qcsri.tfm \
tex-texnansi-qhvb-sc.tfm \
tex-texnansi-qhvb.tfm \
tex-texnansi-qhvbi-sc.tfm \
tex-texnansi-qhvbi.tfm \
tex-texnansi-qhvcb-sc.tfm \
tex-texnansi-qhvcb.tfm \
tex-texnansi-qhvcbi-sc.tfm \
tex-texnansi-qhvcbi.tfm \
tex-texnansi-qhvcr-sc.tfm \
tex-texnansi-qhvcr.tfm \
tex-texnansi-qhvcri-sc.tfm \
tex-texnansi-qhvcri.tfm \
tex-texnansi-qhvr-sc.tfm \
tex-texnansi-qhvr.tfm \
tex-texnansi-qhvri-sc.tfm \
tex-texnansi-qhvri.tfm \
tex-texnansi-qplb-sc.tfm \
tex-texnansi-qplb.tfm \
tex-texnansi-qplbi-sc.tfm \
tex-texnansi-qplbi.tfm \
tex-texnansi-qplr-sc.tfm \
tex-texnansi-qplr.tfm \
tex-texnansi-qplri-sc.tfm \
tex-texnansi-qplri.tfm \
tex-texnansi-qtmb-sc.tfm \
tex-texnansi-qtmb.tfm \
tex-texnansi-qtmbi-sc.tfm \
tex-texnansi-qtmbi.tfm \
tex-texnansi-qtmr-sc.tfm \
tex-texnansi-qtmr.tfm \
tex-texnansi-qtmri-sc.tfm \
tex-texnansi-qtmri.tfm \
tex-texnansi-qzcmi.tfm \
tex-tgadventor.sty \
tex-tgbonum.sty \
tex-tgchorus.sty \
tex-tgcursor.sty \
tex-tgheros.sty \
tex-tgpagella.sty \
tex-tgschola.sty \
tex-tgtermes.sty \
tex-ts1-qagb.tfm \
tex-ts1-qagbi.tfm \
tex-ts1-qagr.tfm \
tex-ts1-qagri.tfm \
tex-ts1-qbkb.tfm \
tex-ts1-qbkbi.tfm \
tex-ts1-qbkr.tfm \
tex-ts1-qbkri.tfm \
tex-ts1-qcrb.tfm \
tex-ts1-qcrbi.tfm \
tex-ts1-qcrr.tfm \
tex-ts1-qcrri.tfm \
tex-ts1-qcsb.tfm \
tex-ts1-qcsbi.tfm \
tex-ts1-qcsr.tfm \
tex-ts1-qcsri.tfm \
tex-ts1-qhvb.tfm \
tex-ts1-qhvbi.tfm \
tex-ts1-qhvcb.tfm \
tex-ts1-qhvcbi.tfm \
tex-ts1-qhvcr.tfm \
tex-ts1-qhvcri.tfm \
tex-ts1-qhvr.tfm \
tex-ts1-qhvri.tfm \
tex-ts1-qplb.tfm \
tex-ts1-qplbi.tfm \
tex-ts1-qplr.tfm \
tex-ts1-qplri.tfm \
tex-ts1-qtmb.tfm \
tex-ts1-qtmbi.tfm \
tex-ts1-qtmr.tfm \
tex-ts1-qtmri.tfm \
tex-ts1-qzcmi.tfm \
tex-ts1qag.fd \
tex-ts1qbk.fd \
tex-ts1qcr.fd \
tex-ts1qcs.fd \
tex-ts1qhv.fd \
tex-ts1qhvc.fd \
tex-ts1qpl.fd \
tex-ts1qtm.fd \
tex-ts1qzc.fd \
texlive-tex-gyre"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-gyre-fonts"

inherit rpm
