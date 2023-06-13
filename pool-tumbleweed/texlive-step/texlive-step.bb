SUMMARY = "A free Times-like font"
DESCRIPTION = "The STEP fonts are a free Times-like (i.e., Times replacement) \
font family, implementing a design first created for The Times \
of London in 1932. These fonts are meant to be compatible in \
design with Adobe's digitization of Linotype Times, commonly \
used in publishing. The fonts were forked from XITS/STIX and \
Type 1 support is provided for legacy TeX engines."
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.5svn57307"

RPM_NAME = "texlive-step-2023.201.2.0.5svn57307-57.1.noarch.rpm"
RPM_HASH = "74f1f0914d5dd50f3dd5da1e7f6aa67fb1f17ae2e9a4b52efe32cffc7530797a3459561d1ce8bfebe1915fce4338e25badb943ad141573773eec4aa2249b775c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(LGRSTEP-Inf.fd) \
tex(LGRSTEP-Sup.fd) \
tex(LGRSTEP-TLF.fd) \
tex(LGRSTEP-TOsF.fd) \
tex(LY1STEP-Inf.fd) \
tex(LY1STEP-Sup.fd) \
tex(LY1STEP-TLF.fd) \
tex(LY1STEP-TOsF.fd) \
tex(OT1STEP-Inf.fd) \
tex(OT1STEP-Sup.fd) \
tex(OT1STEP-TLF.fd) \
tex(OT1STEP-TOsF.fd) \
tex(STEP-Bold-sup-lgr--base.tfm) \
tex(STEP-Bold-sup-lgr.tfm) \
tex(STEP-Bold-sup-lgr.vf) \
tex(STEP-Bold-sup-ly1--base.tfm) \
tex(STEP-Bold-sup-ly1.tfm) \
tex(STEP-Bold-sup-ly1.vf) \
tex(STEP-Bold-sup-ot1.tfm) \
tex(STEP-Bold-sup-t1--base.tfm) \
tex(STEP-Bold-sup-t1.tfm) \
tex(STEP-Bold-sup-t1.vf) \
tex(STEP-Bold-sup-t2a.tfm) \
tex(STEP-Bold-sup-t2b.tfm) \
tex(STEP-Bold-sup-t2c.tfm) \
tex(STEP-Bold-sup-t3--base.tfm) \
tex(STEP-Bold-sup-t3.tfm) \
tex(STEP-Bold-sup-t3.vf) \
tex(STEP-Bold-sup-ts3.tfm) \
tex(STEP-Bold-tlf-lgr--base.tfm) \
tex(STEP-Bold-tlf-lgr.tfm) \
tex(STEP-Bold-tlf-lgr.vf) \
tex(STEP-Bold-tlf-ly1--base.tfm) \
tex(STEP-Bold-tlf-ly1.tfm) \
tex(STEP-Bold-tlf-ly1.vf) \
tex(STEP-Bold-tlf-ot1.tfm) \
tex(STEP-Bold-tlf-t1--base.tfm) \
tex(STEP-Bold-tlf-t1.tfm) \
tex(STEP-Bold-tlf-t1.vf) \
tex(STEP-Bold-tlf-t2a.tfm) \
tex(STEP-Bold-tlf-t2b.tfm) \
tex(STEP-Bold-tlf-t2c.tfm) \
tex(STEP-Bold-tlf-t3--base.tfm) \
tex(STEP-Bold-tlf-t3.tfm) \
tex(STEP-Bold-tlf-t3.vf) \
tex(STEP-Bold-tlf-ts1--base.tfm) \
tex(STEP-Bold-tlf-ts1.tfm) \
tex(STEP-Bold-tlf-ts1.vf) \
tex(STEP-Bold-tlf-ts3.tfm) \
tex(STEP-Bold-tosf-lgr--base.tfm) \
tex(STEP-Bold-tosf-lgr.tfm) \
tex(STEP-Bold-tosf-lgr.vf) \
tex(STEP-Bold-tosf-ly1--base.tfm) \
tex(STEP-Bold-tosf-ly1.tfm) \
tex(STEP-Bold-tosf-ly1.vf) \
tex(STEP-Bold-tosf-ot1.tfm) \
tex(STEP-Bold-tosf-t1--base.tfm) \
tex(STEP-Bold-tosf-t1.tfm) \
tex(STEP-Bold-tosf-t1.vf) \
tex(STEP-Bold-tosf-t2a.tfm) \
tex(STEP-Bold-tosf-t2b.tfm) \
tex(STEP-Bold-tosf-t2c.tfm) \
tex(STEP-Bold-tosf-t3--base.tfm) \
tex(STEP-Bold-tosf-t3.tfm) \
tex(STEP-Bold-tosf-t3.vf) \
tex(STEP-Bold-tosf-ts1--base.tfm) \
tex(STEP-Bold-tosf-ts1.tfm) \
tex(STEP-Bold-tosf-ts1.vf) \
tex(STEP-Bold-tosf-ts3.tfm) \
tex(STEP-BoldItalic-sup-lgr--base.tfm) \
tex(STEP-BoldItalic-sup-lgr.tfm) \
tex(STEP-BoldItalic-sup-lgr.vf) \
tex(STEP-BoldItalic-sup-ly1--base.tfm) \
tex(STEP-BoldItalic-sup-ly1.tfm) \
tex(STEP-BoldItalic-sup-ly1.vf) \
tex(STEP-BoldItalic-sup-ot1.tfm) \
tex(STEP-BoldItalic-sup-t1--base.tfm) \
tex(STEP-BoldItalic-sup-t1.tfm) \
tex(STEP-BoldItalic-sup-t1.vf) \
tex(STEP-BoldItalic-sup-t2a.tfm) \
tex(STEP-BoldItalic-sup-t2b.tfm) \
tex(STEP-BoldItalic-sup-t2c.tfm) \
tex(STEP-BoldItalic-sup-t3.tfm) \
tex(STEP-BoldItalic-sup-ts3.tfm) \
tex(STEP-BoldItalic-tlf-lgr--base.tfm) \
tex(STEP-BoldItalic-tlf-lgr.tfm) \
tex(STEP-BoldItalic-tlf-lgr.vf) \
tex(STEP-BoldItalic-tlf-ly1--base.tfm) \
tex(STEP-BoldItalic-tlf-ly1.tfm) \
tex(STEP-BoldItalic-tlf-ly1.vf) \
tex(STEP-BoldItalic-tlf-ot1.tfm) \
tex(STEP-BoldItalic-tlf-t1--base.tfm) \
tex(STEP-BoldItalic-tlf-t1.tfm) \
tex(STEP-BoldItalic-tlf-t1.vf) \
tex(STEP-BoldItalic-tlf-t2a.tfm) \
tex(STEP-BoldItalic-tlf-t2b.tfm) \
tex(STEP-BoldItalic-tlf-t2c.tfm) \
tex(STEP-BoldItalic-tlf-t3.tfm) \
tex(STEP-BoldItalic-tlf-ts1--base.tfm) \
tex(STEP-BoldItalic-tlf-ts1.tfm) \
tex(STEP-BoldItalic-tlf-ts1.vf) \
tex(STEP-BoldItalic-tlf-ts3.tfm) \
tex(STEP-BoldItalic-tosf-lgr--base.tfm) \
tex(STEP-BoldItalic-tosf-lgr.tfm) \
tex(STEP-BoldItalic-tosf-lgr.vf) \
tex(STEP-BoldItalic-tosf-ly1--base.tfm) \
tex(STEP-BoldItalic-tosf-ly1.tfm) \
tex(STEP-BoldItalic-tosf-ly1.vf) \
tex(STEP-BoldItalic-tosf-ot1.tfm) \
tex(STEP-BoldItalic-tosf-t1--base.tfm) \
tex(STEP-BoldItalic-tosf-t1.tfm) \
tex(STEP-BoldItalic-tosf-t1.vf) \
tex(STEP-BoldItalic-tosf-t2a.tfm) \
tex(STEP-BoldItalic-tosf-t2b.tfm) \
tex(STEP-BoldItalic-tosf-t2c.tfm) \
tex(STEP-BoldItalic-tosf-t3.tfm) \
tex(STEP-BoldItalic-tosf-ts1--base.tfm) \
tex(STEP-BoldItalic-tosf-ts1.tfm) \
tex(STEP-BoldItalic-tosf-ts1.vf) \
tex(STEP-BoldItalic-tosf-ts3.tfm) \
tex(STEP-Italic-sup-lgr--base.tfm) \
tex(STEP-Italic-sup-lgr.tfm) \
tex(STEP-Italic-sup-lgr.vf) \
tex(STEP-Italic-sup-ly1--base.tfm) \
tex(STEP-Italic-sup-ly1.tfm) \
tex(STEP-Italic-sup-ly1.vf) \
tex(STEP-Italic-sup-ot1.tfm) \
tex(STEP-Italic-sup-t1--base.tfm) \
tex(STEP-Italic-sup-t1.tfm) \
tex(STEP-Italic-sup-t1.vf) \
tex(STEP-Italic-sup-t2a.tfm) \
tex(STEP-Italic-sup-t2b.tfm) \
tex(STEP-Italic-sup-t2c.tfm) \
tex(STEP-Italic-sup-t3.tfm) \
tex(STEP-Italic-sup-ts3.tfm) \
tex(STEP-Italic-tlf-lgr--base.tfm) \
tex(STEP-Italic-tlf-lgr.tfm) \
tex(STEP-Italic-tlf-lgr.vf) \
tex(STEP-Italic-tlf-ly1--base.tfm) \
tex(STEP-Italic-tlf-ly1.tfm) \
tex(STEP-Italic-tlf-ly1.vf) \
tex(STEP-Italic-tlf-ot1.tfm) \
tex(STEP-Italic-tlf-t1--base.tfm) \
tex(STEP-Italic-tlf-t1.tfm) \
tex(STEP-Italic-tlf-t1.vf) \
tex(STEP-Italic-tlf-t2a.tfm) \
tex(STEP-Italic-tlf-t2b.tfm) \
tex(STEP-Italic-tlf-t2c.tfm) \
tex(STEP-Italic-tlf-t3.tfm) \
tex(STEP-Italic-tlf-ts1--base.tfm) \
tex(STEP-Italic-tlf-ts1.tfm) \
tex(STEP-Italic-tlf-ts1.vf) \
tex(STEP-Italic-tlf-ts3.tfm) \
tex(STEP-Italic-tosf-lgr--base.tfm) \
tex(STEP-Italic-tosf-lgr.tfm) \
tex(STEP-Italic-tosf-lgr.vf) \
tex(STEP-Italic-tosf-ly1--base.tfm) \
tex(STEP-Italic-tosf-ly1.tfm) \
tex(STEP-Italic-tosf-ly1.vf) \
tex(STEP-Italic-tosf-ot1.tfm) \
tex(STEP-Italic-tosf-t1--base.tfm) \
tex(STEP-Italic-tosf-t1.tfm) \
tex(STEP-Italic-tosf-t1.vf) \
tex(STEP-Italic-tosf-t2a.tfm) \
tex(STEP-Italic-tosf-t2b.tfm) \
tex(STEP-Italic-tosf-t2c.tfm) \
tex(STEP-Italic-tosf-t3.tfm) \
tex(STEP-Italic-tosf-ts1--base.tfm) \
tex(STEP-Italic-tosf-ts1.tfm) \
tex(STEP-Italic-tosf-ts1.vf) \
tex(STEP-Italic-tosf-ts3.tfm) \
tex(STEP-Regular-dnom-lgr--base.tfm) \
tex(STEP-Regular-dnom-lgr.tfm) \
tex(STEP-Regular-dnom-lgr.vf) \
tex(STEP-Regular-dnom-ly1--base.tfm) \
tex(STEP-Regular-dnom-ly1.tfm) \
tex(STEP-Regular-dnom-ly1.vf) \
tex(STEP-Regular-dnom-ot1.tfm) \
tex(STEP-Regular-dnom-t1--base.tfm) \
tex(STEP-Regular-dnom-t1.tfm) \
tex(STEP-Regular-dnom-t1.vf) \
tex(STEP-Regular-dnom-t2a.tfm) \
tex(STEP-Regular-dnom-t2b.tfm) \
tex(STEP-Regular-dnom-t2c.tfm) \
tex(STEP-Regular-dnom-t3--base.tfm) \
tex(STEP-Regular-dnom-t3.tfm) \
tex(STEP-Regular-dnom-t3.vf) \
tex(STEP-Regular-dnom-ts3.tfm) \
tex(STEP-Regular-inf-lgr--base.tfm) \
tex(STEP-Regular-inf-lgr.tfm) \
tex(STEP-Regular-inf-lgr.vf) \
tex(STEP-Regular-inf-ly1--base.tfm) \
tex(STEP-Regular-inf-ly1.tfm) \
tex(STEP-Regular-inf-ly1.vf) \
tex(STEP-Regular-inf-ot1.tfm) \
tex(STEP-Regular-inf-t1--base.tfm) \
tex(STEP-Regular-inf-t1.tfm) \
tex(STEP-Regular-inf-t1.vf) \
tex(STEP-Regular-inf-t2a.tfm) \
tex(STEP-Regular-inf-t2b.tfm) \
tex(STEP-Regular-inf-t2c.tfm) \
tex(STEP-Regular-inf-t3--base.tfm) \
tex(STEP-Regular-inf-t3.tfm) \
tex(STEP-Regular-inf-t3.vf) \
tex(STEP-Regular-inf-ts3.tfm) \
tex(STEP-Regular-numr-lgr--base.tfm) \
tex(STEP-Regular-numr-lgr.tfm) \
tex(STEP-Regular-numr-lgr.vf) \
tex(STEP-Regular-numr-ly1--base.tfm) \
tex(STEP-Regular-numr-ly1.tfm) \
tex(STEP-Regular-numr-ly1.vf) \
tex(STEP-Regular-numr-ot1.tfm) \
tex(STEP-Regular-numr-t1--base.tfm) \
tex(STEP-Regular-numr-t1.tfm) \
tex(STEP-Regular-numr-t1.vf) \
tex(STEP-Regular-numr-t2a.tfm) \
tex(STEP-Regular-numr-t2b.tfm) \
tex(STEP-Regular-numr-t2c.tfm) \
tex(STEP-Regular-numr-t3--base.tfm) \
tex(STEP-Regular-numr-t3.tfm) \
tex(STEP-Regular-numr-t3.vf) \
tex(STEP-Regular-numr-ts3.tfm) \
tex(STEP-Regular-sup-lgr--base.tfm) \
tex(STEP-Regular-sup-lgr.tfm) \
tex(STEP-Regular-sup-lgr.vf) \
tex(STEP-Regular-sup-ly1--base.tfm) \
tex(STEP-Regular-sup-ly1.tfm) \
tex(STEP-Regular-sup-ly1.vf) \
tex(STEP-Regular-sup-ot1.tfm) \
tex(STEP-Regular-sup-t1--base.tfm) \
tex(STEP-Regular-sup-t1.tfm) \
tex(STEP-Regular-sup-t1.vf) \
tex(STEP-Regular-sup-t2a.tfm) \
tex(STEP-Regular-sup-t2b.tfm) \
tex(STEP-Regular-sup-t2c.tfm) \
tex(STEP-Regular-sup-t3--base.tfm) \
tex(STEP-Regular-sup-t3.tfm) \
tex(STEP-Regular-sup-t3.vf) \
tex(STEP-Regular-sup-ts3.tfm) \
tex(STEP-Regular-tlf-lgr--base.tfm) \
tex(STEP-Regular-tlf-lgr.tfm) \
tex(STEP-Regular-tlf-lgr.vf) \
tex(STEP-Regular-tlf-ly1--base.tfm) \
tex(STEP-Regular-tlf-ly1.tfm) \
tex(STEP-Regular-tlf-ly1.vf) \
tex(STEP-Regular-tlf-ot1.tfm) \
tex(STEP-Regular-tlf-sc-lgr--base.tfm) \
tex(STEP-Regular-tlf-sc-lgr.tfm) \
tex(STEP-Regular-tlf-sc-lgr.vf) \
tex(STEP-Regular-tlf-sc-ly1--base.tfm) \
tex(STEP-Regular-tlf-sc-ly1.tfm) \
tex(STEP-Regular-tlf-sc-ly1.vf) \
tex(STEP-Regular-tlf-sc-ot1--base.tfm) \
tex(STEP-Regular-tlf-sc-ot1.tfm) \
tex(STEP-Regular-tlf-sc-ot1.vf) \
tex(STEP-Regular-tlf-sc-t1--base.tfm) \
tex(STEP-Regular-tlf-sc-t1.tfm) \
tex(STEP-Regular-tlf-sc-t1.vf) \
tex(STEP-Regular-tlf-sc-t2a--base.tfm) \
tex(STEP-Regular-tlf-sc-t2a.tfm) \
tex(STEP-Regular-tlf-sc-t2a.vf) \
tex(STEP-Regular-tlf-sc-t2b--base.tfm) \
tex(STEP-Regular-tlf-sc-t2b.tfm) \
tex(STEP-Regular-tlf-sc-t2b.vf) \
tex(STEP-Regular-tlf-sc-t2c--base.tfm) \
tex(STEP-Regular-tlf-sc-t2c.tfm) \
tex(STEP-Regular-tlf-sc-t2c.vf) \
tex(STEP-Regular-tlf-sc-t3--base.tfm) \
tex(STEP-Regular-tlf-sc-t3.tfm) \
tex(STEP-Regular-tlf-sc-t3.vf) \
tex(STEP-Regular-tlf-sc-ts3.tfm) \
tex(STEP-Regular-tlf-t1--base.tfm) \
tex(STEP-Regular-tlf-t1.tfm) \
tex(STEP-Regular-tlf-t1.vf) \
tex(STEP-Regular-tlf-t2a.tfm) \
tex(STEP-Regular-tlf-t2b.tfm) \
tex(STEP-Regular-tlf-t2c.tfm) \
tex(STEP-Regular-tlf-t3--base.tfm) \
tex(STEP-Regular-tlf-t3.tfm) \
tex(STEP-Regular-tlf-t3.vf) \
tex(STEP-Regular-tlf-ts1--base.tfm) \
tex(STEP-Regular-tlf-ts1.tfm) \
tex(STEP-Regular-tlf-ts1.vf) \
tex(STEP-Regular-tlf-ts3.tfm) \
tex(STEP-Regular-tosf-lgr--base.tfm) \
tex(STEP-Regular-tosf-lgr.tfm) \
tex(STEP-Regular-tosf-lgr.vf) \
tex(STEP-Regular-tosf-ly1--base.tfm) \
tex(STEP-Regular-tosf-ly1.tfm) \
tex(STEP-Regular-tosf-ly1.vf) \
tex(STEP-Regular-tosf-ot1.tfm) \
tex(STEP-Regular-tosf-sc-lgr--base.tfm) \
tex(STEP-Regular-tosf-sc-lgr.tfm) \
tex(STEP-Regular-tosf-sc-lgr.vf) \
tex(STEP-Regular-tosf-sc-ly1--base.tfm) \
tex(STEP-Regular-tosf-sc-ly1.tfm) \
tex(STEP-Regular-tosf-sc-ly1.vf) \
tex(STEP-Regular-tosf-sc-ot1--base.tfm) \
tex(STEP-Regular-tosf-sc-ot1.tfm) \
tex(STEP-Regular-tosf-sc-ot1.vf) \
tex(STEP-Regular-tosf-sc-t1--base.tfm) \
tex(STEP-Regular-tosf-sc-t1.tfm) \
tex(STEP-Regular-tosf-sc-t1.vf) \
tex(STEP-Regular-tosf-sc-t2a--base.tfm) \
tex(STEP-Regular-tosf-sc-t2a.tfm) \
tex(STEP-Regular-tosf-sc-t2a.vf) \
tex(STEP-Regular-tosf-sc-t2b--base.tfm) \
tex(STEP-Regular-tosf-sc-t2b.tfm) \
tex(STEP-Regular-tosf-sc-t2b.vf) \
tex(STEP-Regular-tosf-sc-t2c--base.tfm) \
tex(STEP-Regular-tosf-sc-t2c.tfm) \
tex(STEP-Regular-tosf-sc-t2c.vf) \
tex(STEP-Regular-tosf-sc-t3--base.tfm) \
tex(STEP-Regular-tosf-sc-t3.tfm) \
tex(STEP-Regular-tosf-sc-t3.vf) \
tex(STEP-Regular-tosf-sc-ts3.tfm) \
tex(STEP-Regular-tosf-t1--base.tfm) \
tex(STEP-Regular-tosf-t1.tfm) \
tex(STEP-Regular-tosf-t1.vf) \
tex(STEP-Regular-tosf-t2a.tfm) \
tex(STEP-Regular-tosf-t2b.tfm) \
tex(STEP-Regular-tosf-t2c.tfm) \
tex(STEP-Regular-tosf-t3--base.tfm) \
tex(STEP-Regular-tosf-t3.tfm) \
tex(STEP-Regular-tosf-t3.vf) \
tex(STEP-Regular-tosf-ts1--base.tfm) \
tex(STEP-Regular-tosf-ts1.tfm) \
tex(STEP-Regular-tosf-ts1.vf) \
tex(STEP-Regular-tosf-ts3.tfm) \
tex(STEP.map) \
tex(T1STEP-Inf.fd) \
tex(T1STEP-Sup.fd) \
tex(T1STEP-TLF.fd) \
tex(T1STEP-TOsF.fd) \
tex(T2ASTEP-Inf.fd) \
tex(T2ASTEP-Sup.fd) \
tex(T2ASTEP-TLF.fd) \
tex(T2ASTEP-TOsF.fd) \
tex(T2BSTEP-Inf.fd) \
tex(T2BSTEP-Sup.fd) \
tex(T2BSTEP-TLF.fd) \
tex(T2BSTEP-TOsF.fd) \
tex(T2CSTEP-Inf.fd) \
tex(T2CSTEP-Sup.fd) \
tex(T2CSTEP-TLF.fd) \
tex(T2CSTEP-TOsF.fd) \
tex(T3STEP-Inf.fd) \
tex(T3STEP-Sup.fd) \
tex(T3STEP-TLF.fd) \
tex(T3STEP-TOsF.fd) \
tex(TS1STEP-TLF.fd) \
tex(TS1STEP-TOsF.fd) \
tex(TS3STEP-Inf.fd) \
tex(TS3STEP-Sup.fd) \
tex(TS3STEP-TLF.fd) \
tex(TS3STEP-TOsF.fd) \
tex(a_2b3rql.enc) \
tex(a_2gbaam.enc) \
tex(a_3o23m2.enc) \
tex(a_3ovlch.enc) \
tex(a_3rxxvm.enc) \
tex(a_3yxiof.enc) \
tex(a_47wiac.enc) \
tex(a_4otmjh.enc) \
tex(a_4zqdxy.enc) \
tex(a_574n7u.enc) \
tex(a_5mws5y.enc) \
tex(a_5xnggg.enc) \
tex(a_6auynr.enc) \
tex(a_6tnupk.enc) \
tex(a_6vnxue.enc) \
tex(a_6vypkz.enc) \
tex(a_7if24z.enc) \
tex(a_7r4wrj.enc) \
tex(a_7xgfe3.enc) \
tex(a_aevneq.enc) \
tex(a_ahbw5k.enc) \
tex(a_arx325.enc) \
tex(a_az2atq.enc) \
tex(a_bmbu3p.enc) \
tex(a_bonk4u.enc) \
tex(a_bt7ykx.enc) \
tex(a_ccwxvq.enc) \
tex(a_cqqmgz.enc) \
tex(a_ds5txz.enc) \
tex(a_e4dxwh.enc) \
tex(a_enu25g.enc) \
tex(a_euweyh.enc) \
tex(a_f2t6y6.enc) \
tex(a_f5fqnw.enc) \
tex(a_fdcm6h.enc) \
tex(a_ffybip.enc) \
tex(a_fha2fn.enc) \
tex(a_fwzjjs.enc) \
tex(a_g5azuq.enc) \
tex(a_gbbiod.enc) \
tex(a_gl5exx.enc) \
tex(a_gnavrk.enc) \
tex(a_gwrxgc.enc) \
tex(a_gwwgis.enc) \
tex(a_h6i53a.enc) \
tex(a_hgebca.enc) \
tex(a_hnzbfi.enc) \
tex(a_inbzfq.enc) \
tex(a_jhwfjo.enc) \
tex(a_jothuw.enc) \
tex(a_k7io4a.enc) \
tex(a_kht4zk.enc) \
tex(a_kv7n4v.enc) \
tex(a_l3aktj.enc) \
tex(a_laf3gm.enc) \
tex(a_lihfjg.enc) \
tex(a_mjsrji.enc) \
tex(a_mkgnjm.enc) \
tex(a_mmhgd3.enc) \
tex(a_mpy73s.enc) \
tex(a_msql4j.enc) \
tex(a_n6yyi4.enc) \
tex(a_nk3vlt.enc) \
tex(a_nm3vu2.enc) \
tex(a_nm54me.enc) \
tex(a_np5cf6.enc) \
tex(a_nys5r4.enc) \
tex(a_oqx7v6.enc) \
tex(a_owwokh.enc) \
tex(a_ptac7y.enc) \
tex(a_q3sghv.enc) \
tex(a_qboisw.enc) \
tex(a_r2xedm.enc) \
tex(a_rcc5m6.enc) \
tex(a_rcz4zw.enc) \
tex(a_rgssq4.enc) \
tex(a_rx4otu.enc) \
tex(a_smf27h.enc) \
tex(a_sycgav.enc) \
tex(a_tatosb.enc) \
tex(a_tded26.enc) \
tex(a_timzpm.enc) \
tex(a_tmbyhw.enc) \
tex(a_tpegoz.enc) \
tex(a_tqaent.enc) \
tex(a_trfpj6.enc) \
tex(a_u5xlv2.enc) \
tex(a_uda4d5.enc) \
tex(a_udjv2r.enc) \
tex(a_uip2yp.enc) \
tex(a_uki32u.enc) \
tex(a_umr5bj.enc) \
tex(a_vca5tb.enc) \
tex(a_vmnawy.enc) \
tex(a_w7y2wc.enc) \
tex(a_wf6bkr.enc) \
tex(a_wmhjje.enc) \
tex(a_wql5wd.enc) \
tex(a_wzfdme.enc) \
tex(a_x7ixiy.enc) \
tex(a_xfoc2o.enc) \
tex(a_xnivr2.enc) \
tex(a_xscnug.enc) \
tex(a_xxqp46.enc) \
tex(a_xy7ndg.enc) \
tex(a_y3uxyj.enc) \
tex(a_ya3dy4.enc) \
tex(a_ylmzrw.enc) \
tex(a_zbkikv.enc) \
tex(step.sty) \
texlive-step"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-step-fonts"

inherit rpm
