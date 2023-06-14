SUMMARY = "Latin modern fonts in outline formats"
DESCRIPTION = "The Latin Modern family of fonts consists of 72 text fonts and \
20 mathematics fonts, and is based on the Computer Modern fonts \
released into public domain by AMS (copyright (c) 1997 AMS). \
The lm font set contains a lot of additional characters, mainly \
accented ones, but not exclusively. There is one set of fonts, \
available both in Adobe Type 1 format (*.pfb) and in OpenType \
format (*.otf). There are five sets of TeX Font Metric files, \
corresponding to: Cork encoding (cork-*.tfm); QX encoding \
(qx-*.tfm); TeX'n'ANSI aka LY1 encoding (texnansi-*.tfm); T5 \
(Vietnamese) encoding (t5-*.tfm); and Text Companion for EC \
fonts aka TS1 (ts1-*.tfm)."
LICENSE = "LPPL-1.3c"

PV = "2023.201.2.005svn65956"

RPM_NAME = "texlive-lm-2023.201.2.005svn65956-54.1.noarch.rpm"
RPM_HASH = "cc077dcbb04582772ecbb685a5193620b0991619373d498724ab7dfac6e09d9b77db1748157b533834df9bd2a387565aba1d3a233264b70154a36a9d3f4cffa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cs-lmb10.tfm \
tex-cs-lmbo10.tfm \
tex-cs-lmbx10.tfm \
tex-cs-lmbx12.tfm \
tex-cs-lmbx5.tfm \
tex-cs-lmbx6.tfm \
tex-cs-lmbx7.tfm \
tex-cs-lmbx8.tfm \
tex-cs-lmbx9.tfm \
tex-cs-lmbxi10.tfm \
tex-cs-lmbxo10.tfm \
tex-cs-lmcsc10.tfm \
tex-cs-lmcsco10.tfm \
tex-cs-lmdunh10.tfm \
tex-cs-lmduno10.tfm \
tex-cs-lmr10.tfm \
tex-cs-lmr12.tfm \
tex-cs-lmr17.tfm \
tex-cs-lmr5.tfm \
tex-cs-lmr6.tfm \
tex-cs-lmr7.tfm \
tex-cs-lmr8.tfm \
tex-cs-lmr9.tfm \
tex-cs-lmri10.tfm \
tex-cs-lmri12.tfm \
tex-cs-lmri7.tfm \
tex-cs-lmri8.tfm \
tex-cs-lmri9.tfm \
tex-cs-lmro10.tfm \
tex-cs-lmro12.tfm \
tex-cs-lmro17.tfm \
tex-cs-lmro8.tfm \
tex-cs-lmro9.tfm \
tex-cs-lmss10.tfm \
tex-cs-lmss12.tfm \
tex-cs-lmss17.tfm \
tex-cs-lmss8.tfm \
tex-cs-lmss9.tfm \
tex-cs-lmssbo10.tfm \
tex-cs-lmssbx10.tfm \
tex-cs-lmssdc10.tfm \
tex-cs-lmssdo10.tfm \
tex-cs-lmsso10.tfm \
tex-cs-lmsso12.tfm \
tex-cs-lmsso17.tfm \
tex-cs-lmsso8.tfm \
tex-cs-lmsso9.tfm \
tex-cs-lmssq8.tfm \
tex-cs-lmssqbo8.tfm \
tex-cs-lmssqbx8.tfm \
tex-cs-lmssqo8.tfm \
tex-cs-lmtcsc10.tfm \
tex-cs-lmtcso10.tfm \
tex-cs-lmtk10.tfm \
tex-cs-lmtko10.tfm \
tex-cs-lmtl10.tfm \
tex-cs-lmtlc10.tfm \
tex-cs-lmtlco10.tfm \
tex-cs-lmtlo10.tfm \
tex-cs-lmtt10.tfm \
tex-cs-lmtt12.tfm \
tex-cs-lmtt8.tfm \
tex-cs-lmtt9.tfm \
tex-cs-lmtti10.tfm \
tex-cs-lmtto10.tfm \
tex-cs-lmu10.tfm \
tex-cs-lmvtk10.tfm \
tex-cs-lmvtko10.tfm \
tex-cs-lmvtl10.tfm \
tex-cs-lmvtlo10.tfm \
tex-cs-lmvtt10.tfm \
tex-cs-lmvtto10.tfm \
tex-ec-lmb10.tfm \
tex-ec-lmbo10.tfm \
tex-ec-lmbx10.tfm \
tex-ec-lmbx12.tfm \
tex-ec-lmbx5.tfm \
tex-ec-lmbx6.tfm \
tex-ec-lmbx7.tfm \
tex-ec-lmbx8.tfm \
tex-ec-lmbx9.tfm \
tex-ec-lmbxi10.tfm \
tex-ec-lmbxo10.tfm \
tex-ec-lmcsc10.tfm \
tex-ec-lmcsco10.tfm \
tex-ec-lmdunh10.tfm \
tex-ec-lmduno10.tfm \
tex-ec-lmr10.tfm \
tex-ec-lmr12.tfm \
tex-ec-lmr17.tfm \
tex-ec-lmr5.tfm \
tex-ec-lmr6.tfm \
tex-ec-lmr7.tfm \
tex-ec-lmr8.tfm \
tex-ec-lmr9.tfm \
tex-ec-lmri10.tfm \
tex-ec-lmri12.tfm \
tex-ec-lmri7.tfm \
tex-ec-lmri8.tfm \
tex-ec-lmri9.tfm \
tex-ec-lmro10.tfm \
tex-ec-lmro12.tfm \
tex-ec-lmro17.tfm \
tex-ec-lmro8.tfm \
tex-ec-lmro9.tfm \
tex-ec-lmss10.tfm \
tex-ec-lmss12.tfm \
tex-ec-lmss17.tfm \
tex-ec-lmss8.tfm \
tex-ec-lmss9.tfm \
tex-ec-lmssbo10.tfm \
tex-ec-lmssbx10.tfm \
tex-ec-lmssdc10.tfm \
tex-ec-lmssdo10.tfm \
tex-ec-lmsso10.tfm \
tex-ec-lmsso12.tfm \
tex-ec-lmsso17.tfm \
tex-ec-lmsso8.tfm \
tex-ec-lmsso9.tfm \
tex-ec-lmssq8.tfm \
tex-ec-lmssqbo8.tfm \
tex-ec-lmssqbx8.tfm \
tex-ec-lmssqo8.tfm \
tex-ec-lmtcsc10.tfm \
tex-ec-lmtcso10.tfm \
tex-ec-lmtk10.tfm \
tex-ec-lmtko10.tfm \
tex-ec-lmtl10.tfm \
tex-ec-lmtlc10.tfm \
tex-ec-lmtlco10.tfm \
tex-ec-lmtlo10.tfm \
tex-ec-lmtt10.tfm \
tex-ec-lmtt12.tfm \
tex-ec-lmtt8.tfm \
tex-ec-lmtt9.tfm \
tex-ec-lmtti10.tfm \
tex-ec-lmtto10.tfm \
tex-ec-lmu10.tfm \
tex-ec-lmvtk10.tfm \
tex-ec-lmvtko10.tfm \
tex-ec-lmvtl10.tfm \
tex-ec-lmvtlo10.tfm \
tex-ec-lmvtt10.tfm \
tex-ec-lmvtto10.tfm \
tex-il2lmdh.fd \
tex-il2lmr.fd \
tex-il2lmss.fd \
tex-il2lmssq.fd \
tex-il2lmtt.fd \
tex-il2lmvtt.fd \
tex-l7x-lmb10.tfm \
tex-l7x-lmbo10.tfm \
tex-l7x-lmbx10.tfm \
tex-l7x-lmbx12.tfm \
tex-l7x-lmbx5.tfm \
tex-l7x-lmbx6.tfm \
tex-l7x-lmbx7.tfm \
tex-l7x-lmbx8.tfm \
tex-l7x-lmbx9.tfm \
tex-l7x-lmbxi10.tfm \
tex-l7x-lmbxo10.tfm \
tex-l7x-lmcsc10.tfm \
tex-l7x-lmcsco10.tfm \
tex-l7x-lmdunh10.tfm \
tex-l7x-lmduno10.tfm \
tex-l7x-lmr10.tfm \
tex-l7x-lmr12.tfm \
tex-l7x-lmr17.tfm \
tex-l7x-lmr5.tfm \
tex-l7x-lmr6.tfm \
tex-l7x-lmr7.tfm \
tex-l7x-lmr8.tfm \
tex-l7x-lmr9.tfm \
tex-l7x-lmri10.tfm \
tex-l7x-lmri12.tfm \
tex-l7x-lmri7.tfm \
tex-l7x-lmri8.tfm \
tex-l7x-lmri9.tfm \
tex-l7x-lmro10.tfm \
tex-l7x-lmro12.tfm \
tex-l7x-lmro17.tfm \
tex-l7x-lmro8.tfm \
tex-l7x-lmro9.tfm \
tex-l7x-lmss10.tfm \
tex-l7x-lmss12.tfm \
tex-l7x-lmss17.tfm \
tex-l7x-lmss8.tfm \
tex-l7x-lmss9.tfm \
tex-l7x-lmssbo10.tfm \
tex-l7x-lmssbx10.tfm \
tex-l7x-lmssdc10.tfm \
tex-l7x-lmssdo10.tfm \
tex-l7x-lmsso10.tfm \
tex-l7x-lmsso12.tfm \
tex-l7x-lmsso17.tfm \
tex-l7x-lmsso8.tfm \
tex-l7x-lmsso9.tfm \
tex-l7x-lmssq8.tfm \
tex-l7x-lmssqbo8.tfm \
tex-l7x-lmssqbx8.tfm \
tex-l7x-lmssqo8.tfm \
tex-l7x-lmtcsc10.tfm \
tex-l7x-lmtcso10.tfm \
tex-l7x-lmtk10.tfm \
tex-l7x-lmtko10.tfm \
tex-l7x-lmtl10.tfm \
tex-l7x-lmtlc10.tfm \
tex-l7x-lmtlco10.tfm \
tex-l7x-lmtlo10.tfm \
tex-l7x-lmtt10.tfm \
tex-l7x-lmtt12.tfm \
tex-l7x-lmtt8.tfm \
tex-l7x-lmtt9.tfm \
tex-l7x-lmtti10.tfm \
tex-l7x-lmtto10.tfm \
tex-l7x-lmu10.tfm \
tex-l7x-lmvtk10.tfm \
tex-l7x-lmvtko10.tfm \
tex-l7x-lmvtl10.tfm \
tex-l7x-lmvtlo10.tfm \
tex-l7x-lmvtt10.tfm \
tex-l7x-lmvtto10.tfm \
tex-l7xlmdh.fd \
tex-l7xlmr.fd \
tex-l7xlmss.fd \
tex-l7xlmssq.fd \
tex-l7xlmtt.fd \
tex-l7xlmvtt.fd \
tex-lm-cs.enc \
tex-lm-cs.map \
tex-lm-cssc.enc \
tex-lm-cstt.enc \
tex-lm-ec.enc \
tex-lm-ec.map \
tex-lm-l7x.enc \
tex-lm-l7x.map \
tex-lm-math.map \
tex-lm-mathex.enc \
tex-lm-mathit.enc \
tex-lm-mathsy.enc \
tex-lm-qx.enc \
tex-lm-qx.map \
tex-lm-qxsc.enc \
tex-lm-qxtt.enc \
tex-lm-rep-cmin.enc \
tex-lm-rep-cmit.enc \
tex-lm-rep-cmitt.enc \
tex-lm-rep-cmother.map \
tex-lm-rep-cmrm.enc \
tex-lm-rep-cmsc.enc \
tex-lm-rep-cmtext-interpolated.map \
tex-lm-rep-cmtext.map \
tex-lm-rep-cmtt.enc \
tex-lm-rep-csin.enc \
tex-lm-rep-csrm.enc \
tex-lm-rep-cssc.enc \
tex-lm-rep-cstext.map \
tex-lm-rep-cstt.enc \
tex-lm-rep-plin.enc \
tex-lm-rep-plit.enc \
tex-lm-rep-plitt.enc \
tex-lm-rep-plrm.enc \
tex-lm-rep-plsc.enc \
tex-lm-rep-pltext.map \
tex-lm-rep-pltt.enc \
tex-lm-rep-t5psn.enc \
tex-lm-rep-vntext.map \
tex-lm-rm.enc \
tex-lm-rm.map \
tex-lm-rmsc.enc \
tex-lm-rmtt.enc \
tex-lm-t5.enc \
tex-lm-t5.map \
tex-lm-texnansi.enc \
tex-lm-texnansi.map \
tex-lm-ts1.enc \
tex-lm-ts1.map \
tex-lm.map \
tex-lmbsy10.tfm \
tex-lmbsy5.tfm \
tex-lmbsy7.tfm \
tex-lmex10.tfm \
tex-lmmi10.tfm \
tex-lmmi12.tfm \
tex-lmmi5.tfm \
tex-lmmi6.tfm \
tex-lmmi7.tfm \
tex-lmmi8.tfm \
tex-lmmi9.tfm \
tex-lmmib10.tfm \
tex-lmmib5.tfm \
tex-lmmib7.tfm \
tex-lmodern.sty \
tex-lmsy10.tfm \
tex-lmsy5.tfm \
tex-lmsy6.tfm \
tex-lmsy7.tfm \
tex-lmsy8.tfm \
tex-lmsy9.tfm \
tex-ly1lmdh.fd \
tex-ly1lmr.fd \
tex-ly1lmss.fd \
tex-ly1lmssq.fd \
tex-ly1lmtt.fd \
tex-ly1lmvtt.fd \
tex-omllmm.fd \
tex-omllmr.fd \
tex-omslmr.fd \
tex-omslmsy.fd \
tex-omxlmex.fd \
tex-ot1lmdh.fd \
tex-ot1lmr.fd \
tex-ot1lmss.fd \
tex-ot1lmssq.fd \
tex-ot1lmtt.fd \
tex-ot1lmvtt.fd \
tex-ot4lmdh.fd \
tex-ot4lmr.fd \
tex-ot4lmss.fd \
tex-ot4lmssq.fd \
tex-ot4lmtt.fd \
tex-ot4lmvtt.fd \
tex-qx-lmb10.tfm \
tex-qx-lmbo10.tfm \
tex-qx-lmbx10.tfm \
tex-qx-lmbx12.tfm \
tex-qx-lmbx5.tfm \
tex-qx-lmbx6.tfm \
tex-qx-lmbx7.tfm \
tex-qx-lmbx8.tfm \
tex-qx-lmbx9.tfm \
tex-qx-lmbxi10.tfm \
tex-qx-lmbxo10.tfm \
tex-qx-lmcsc10.tfm \
tex-qx-lmcsco10.tfm \
tex-qx-lmdunh10.tfm \
tex-qx-lmduno10.tfm \
tex-qx-lmr10.tfm \
tex-qx-lmr12.tfm \
tex-qx-lmr17.tfm \
tex-qx-lmr5.tfm \
tex-qx-lmr6.tfm \
tex-qx-lmr7.tfm \
tex-qx-lmr8.tfm \
tex-qx-lmr9.tfm \
tex-qx-lmri10.tfm \
tex-qx-lmri12.tfm \
tex-qx-lmri7.tfm \
tex-qx-lmri8.tfm \
tex-qx-lmri9.tfm \
tex-qx-lmro10.tfm \
tex-qx-lmro12.tfm \
tex-qx-lmro17.tfm \
tex-qx-lmro8.tfm \
tex-qx-lmro9.tfm \
tex-qx-lmss10.tfm \
tex-qx-lmss12.tfm \
tex-qx-lmss17.tfm \
tex-qx-lmss8.tfm \
tex-qx-lmss9.tfm \
tex-qx-lmssbo10.tfm \
tex-qx-lmssbx10.tfm \
tex-qx-lmssdc10.tfm \
tex-qx-lmssdo10.tfm \
tex-qx-lmsso10.tfm \
tex-qx-lmsso12.tfm \
tex-qx-lmsso17.tfm \
tex-qx-lmsso8.tfm \
tex-qx-lmsso9.tfm \
tex-qx-lmssq8.tfm \
tex-qx-lmssqbo8.tfm \
tex-qx-lmssqbx8.tfm \
tex-qx-lmssqo8.tfm \
tex-qx-lmtcsc10.tfm \
tex-qx-lmtcso10.tfm \
tex-qx-lmtk10.tfm \
tex-qx-lmtko10.tfm \
tex-qx-lmtl10.tfm \
tex-qx-lmtlc10.tfm \
tex-qx-lmtlco10.tfm \
tex-qx-lmtlo10.tfm \
tex-qx-lmtt10.tfm \
tex-qx-lmtt12.tfm \
tex-qx-lmtt8.tfm \
tex-qx-lmtt9.tfm \
tex-qx-lmtti10.tfm \
tex-qx-lmtto10.tfm \
tex-qx-lmu10.tfm \
tex-qx-lmvtk10.tfm \
tex-qx-lmvtko10.tfm \
tex-qx-lmvtl10.tfm \
tex-qx-lmvtlo10.tfm \
tex-qx-lmvtt10.tfm \
tex-qx-lmvtto10.tfm \
tex-qxlmdh.fd \
tex-qxlmr.fd \
tex-qxlmss.fd \
tex-qxlmssq.fd \
tex-qxlmtt.fd \
tex-qxlmvtt.fd \
tex-rm-lmb10.tfm \
tex-rm-lmbo10.tfm \
tex-rm-lmbx10.tfm \
tex-rm-lmbx12.tfm \
tex-rm-lmbx5.tfm \
tex-rm-lmbx6.tfm \
tex-rm-lmbx7.tfm \
tex-rm-lmbx8.tfm \
tex-rm-lmbx9.tfm \
tex-rm-lmbxi10.tfm \
tex-rm-lmbxo10.tfm \
tex-rm-lmcsc10.tfm \
tex-rm-lmcsco10.tfm \
tex-rm-lmdunh10.tfm \
tex-rm-lmduno10.tfm \
tex-rm-lmr10.tfm \
tex-rm-lmr12.tfm \
tex-rm-lmr17.tfm \
tex-rm-lmr5.tfm \
tex-rm-lmr6.tfm \
tex-rm-lmr7.tfm \
tex-rm-lmr8.tfm \
tex-rm-lmr9.tfm \
tex-rm-lmri10.tfm \
tex-rm-lmri12.tfm \
tex-rm-lmri7.tfm \
tex-rm-lmri8.tfm \
tex-rm-lmri9.tfm \
tex-rm-lmro10.tfm \
tex-rm-lmro12.tfm \
tex-rm-lmro17.tfm \
tex-rm-lmro8.tfm \
tex-rm-lmro9.tfm \
tex-rm-lmss10.tfm \
tex-rm-lmss12.tfm \
tex-rm-lmss17.tfm \
tex-rm-lmss8.tfm \
tex-rm-lmss9.tfm \
tex-rm-lmssbo10.tfm \
tex-rm-lmssbx10.tfm \
tex-rm-lmssdc10.tfm \
tex-rm-lmssdo10.tfm \
tex-rm-lmsso10.tfm \
tex-rm-lmsso12.tfm \
tex-rm-lmsso17.tfm \
tex-rm-lmsso8.tfm \
tex-rm-lmsso9.tfm \
tex-rm-lmssq8.tfm \
tex-rm-lmssqbo8.tfm \
tex-rm-lmssqbx8.tfm \
tex-rm-lmssqo8.tfm \
tex-rm-lmtcsc10.tfm \
tex-rm-lmtcso10.tfm \
tex-rm-lmtk10.tfm \
tex-rm-lmtko10.tfm \
tex-rm-lmtl10.tfm \
tex-rm-lmtlc10.tfm \
tex-rm-lmtlco10.tfm \
tex-rm-lmtlo10.tfm \
tex-rm-lmtt10.tfm \
tex-rm-lmtt12.tfm \
tex-rm-lmtt8.tfm \
tex-rm-lmtt9.tfm \
tex-rm-lmtti10.tfm \
tex-rm-lmtto10.tfm \
tex-rm-lmu10.tfm \
tex-rm-lmvtk10.tfm \
tex-rm-lmvtko10.tfm \
tex-rm-lmvtl10.tfm \
tex-rm-lmvtlo10.tfm \
tex-rm-lmvtt10.tfm \
tex-rm-lmvtto10.tfm \
tex-t1lmdh.fd \
tex-t1lmr.fd \
tex-t1lmss.fd \
tex-t1lmssq.fd \
tex-t1lmtt.fd \
tex-t1lmvtt.fd \
tex-t5-lmb10.tfm \
tex-t5-lmbo10.tfm \
tex-t5-lmbx10.tfm \
tex-t5-lmbx12.tfm \
tex-t5-lmbx5.tfm \
tex-t5-lmbx6.tfm \
tex-t5-lmbx7.tfm \
tex-t5-lmbx8.tfm \
tex-t5-lmbx9.tfm \
tex-t5-lmbxi10.tfm \
tex-t5-lmbxo10.tfm \
tex-t5-lmcsc10.tfm \
tex-t5-lmcsco10.tfm \
tex-t5-lmdunh10.tfm \
tex-t5-lmduno10.tfm \
tex-t5-lmr10.tfm \
tex-t5-lmr12.tfm \
tex-t5-lmr17.tfm \
tex-t5-lmr5.tfm \
tex-t5-lmr6.tfm \
tex-t5-lmr7.tfm \
tex-t5-lmr8.tfm \
tex-t5-lmr9.tfm \
tex-t5-lmri10.tfm \
tex-t5-lmri12.tfm \
tex-t5-lmri7.tfm \
tex-t5-lmri8.tfm \
tex-t5-lmri9.tfm \
tex-t5-lmro10.tfm \
tex-t5-lmro12.tfm \
tex-t5-lmro17.tfm \
tex-t5-lmro8.tfm \
tex-t5-lmro9.tfm \
tex-t5-lmss10.tfm \
tex-t5-lmss12.tfm \
tex-t5-lmss17.tfm \
tex-t5-lmss8.tfm \
tex-t5-lmss9.tfm \
tex-t5-lmssbo10.tfm \
tex-t5-lmssbx10.tfm \
tex-t5-lmssdc10.tfm \
tex-t5-lmssdo10.tfm \
tex-t5-lmsso10.tfm \
tex-t5-lmsso12.tfm \
tex-t5-lmsso17.tfm \
tex-t5-lmsso8.tfm \
tex-t5-lmsso9.tfm \
tex-t5-lmssq8.tfm \
tex-t5-lmssqbo8.tfm \
tex-t5-lmssqbx8.tfm \
tex-t5-lmssqo8.tfm \
tex-t5-lmtcsc10.tfm \
tex-t5-lmtcso10.tfm \
tex-t5-lmtk10.tfm \
tex-t5-lmtko10.tfm \
tex-t5-lmtl10.tfm \
tex-t5-lmtlc10.tfm \
tex-t5-lmtlco10.tfm \
tex-t5-lmtlo10.tfm \
tex-t5-lmtt10.tfm \
tex-t5-lmtt12.tfm \
tex-t5-lmtt8.tfm \
tex-t5-lmtt9.tfm \
tex-t5-lmtti10.tfm \
tex-t5-lmtto10.tfm \
tex-t5-lmu10.tfm \
tex-t5-lmvtk10.tfm \
tex-t5-lmvtko10.tfm \
tex-t5-lmvtl10.tfm \
tex-t5-lmvtlo10.tfm \
tex-t5-lmvtt10.tfm \
tex-t5-lmvtto10.tfm \
tex-t5lmdh.fd \
tex-t5lmr.fd \
tex-t5lmss.fd \
tex-t5lmssq.fd \
tex-t5lmtt.fd \
tex-t5lmvtt.fd \
tex-texnansi-lmb10.tfm \
tex-texnansi-lmbo10.tfm \
tex-texnansi-lmbx10.tfm \
tex-texnansi-lmbx12.tfm \
tex-texnansi-lmbx5.tfm \
tex-texnansi-lmbx6.tfm \
tex-texnansi-lmbx7.tfm \
tex-texnansi-lmbx8.tfm \
tex-texnansi-lmbx9.tfm \
tex-texnansi-lmbxi10.tfm \
tex-texnansi-lmbxo10.tfm \
tex-texnansi-lmcsc10.tfm \
tex-texnansi-lmcsco10.tfm \
tex-texnansi-lmdunh10.tfm \
tex-texnansi-lmduno10.tfm \
tex-texnansi-lmr10.tfm \
tex-texnansi-lmr12.tfm \
tex-texnansi-lmr17.tfm \
tex-texnansi-lmr5.tfm \
tex-texnansi-lmr6.tfm \
tex-texnansi-lmr7.tfm \
tex-texnansi-lmr8.tfm \
tex-texnansi-lmr9.tfm \
tex-texnansi-lmri10.tfm \
tex-texnansi-lmri12.tfm \
tex-texnansi-lmri7.tfm \
tex-texnansi-lmri8.tfm \
tex-texnansi-lmri9.tfm \
tex-texnansi-lmro10.tfm \
tex-texnansi-lmro12.tfm \
tex-texnansi-lmro17.tfm \
tex-texnansi-lmro8.tfm \
tex-texnansi-lmro9.tfm \
tex-texnansi-lmss10.tfm \
tex-texnansi-lmss12.tfm \
tex-texnansi-lmss17.tfm \
tex-texnansi-lmss8.tfm \
tex-texnansi-lmss9.tfm \
tex-texnansi-lmssbo10.tfm \
tex-texnansi-lmssbx10.tfm \
tex-texnansi-lmssdc10.tfm \
tex-texnansi-lmssdo10.tfm \
tex-texnansi-lmsso10.tfm \
tex-texnansi-lmsso12.tfm \
tex-texnansi-lmsso17.tfm \
tex-texnansi-lmsso8.tfm \
tex-texnansi-lmsso9.tfm \
tex-texnansi-lmssq8.tfm \
tex-texnansi-lmssqbo8.tfm \
tex-texnansi-lmssqbx8.tfm \
tex-texnansi-lmssqo8.tfm \
tex-texnansi-lmtcsc10.tfm \
tex-texnansi-lmtcso10.tfm \
tex-texnansi-lmtk10.tfm \
tex-texnansi-lmtko10.tfm \
tex-texnansi-lmtl10.tfm \
tex-texnansi-lmtlc10.tfm \
tex-texnansi-lmtlco10.tfm \
tex-texnansi-lmtlo10.tfm \
tex-texnansi-lmtt10.tfm \
tex-texnansi-lmtt12.tfm \
tex-texnansi-lmtt8.tfm \
tex-texnansi-lmtt9.tfm \
tex-texnansi-lmtti10.tfm \
tex-texnansi-lmtto10.tfm \
tex-texnansi-lmu10.tfm \
tex-texnansi-lmvtk10.tfm \
tex-texnansi-lmvtko10.tfm \
tex-texnansi-lmvtl10.tfm \
tex-texnansi-lmvtlo10.tfm \
tex-texnansi-lmvtt10.tfm \
tex-texnansi-lmvtto10.tfm \
tex-ts1-lmb10.tfm \
tex-ts1-lmbo10.tfm \
tex-ts1-lmbx10.tfm \
tex-ts1-lmbx12.tfm \
tex-ts1-lmbx5.tfm \
tex-ts1-lmbx6.tfm \
tex-ts1-lmbx7.tfm \
tex-ts1-lmbx8.tfm \
tex-ts1-lmbx9.tfm \
tex-ts1-lmbxi10.tfm \
tex-ts1-lmbxo10.tfm \
tex-ts1-lmcsc10.tfm \
tex-ts1-lmcsco10.tfm \
tex-ts1-lmdunh10.tfm \
tex-ts1-lmduno10.tfm \
tex-ts1-lmr10.tfm \
tex-ts1-lmr12.tfm \
tex-ts1-lmr17.tfm \
tex-ts1-lmr5.tfm \
tex-ts1-lmr6.tfm \
tex-ts1-lmr7.tfm \
tex-ts1-lmr8.tfm \
tex-ts1-lmr9.tfm \
tex-ts1-lmri10.tfm \
tex-ts1-lmri12.tfm \
tex-ts1-lmri7.tfm \
tex-ts1-lmri8.tfm \
tex-ts1-lmri9.tfm \
tex-ts1-lmro10.tfm \
tex-ts1-lmro12.tfm \
tex-ts1-lmro17.tfm \
tex-ts1-lmro8.tfm \
tex-ts1-lmro9.tfm \
tex-ts1-lmss10.tfm \
tex-ts1-lmss12.tfm \
tex-ts1-lmss17.tfm \
tex-ts1-lmss8.tfm \
tex-ts1-lmss9.tfm \
tex-ts1-lmssbo10.tfm \
tex-ts1-lmssbx10.tfm \
tex-ts1-lmssdc10.tfm \
tex-ts1-lmssdo10.tfm \
tex-ts1-lmsso10.tfm \
tex-ts1-lmsso12.tfm \
tex-ts1-lmsso17.tfm \
tex-ts1-lmsso8.tfm \
tex-ts1-lmsso9.tfm \
tex-ts1-lmssq8.tfm \
tex-ts1-lmssqbo8.tfm \
tex-ts1-lmssqbx8.tfm \
tex-ts1-lmssqo8.tfm \
tex-ts1-lmtcsc10.tfm \
tex-ts1-lmtcso10.tfm \
tex-ts1-lmtk10.tfm \
tex-ts1-lmtko10.tfm \
tex-ts1-lmtl10.tfm \
tex-ts1-lmtlc10.tfm \
tex-ts1-lmtlco10.tfm \
tex-ts1-lmtlo10.tfm \
tex-ts1-lmtt10.tfm \
tex-ts1-lmtt12.tfm \
tex-ts1-lmtt8.tfm \
tex-ts1-lmtt9.tfm \
tex-ts1-lmtti10.tfm \
tex-ts1-lmtto10.tfm \
tex-ts1-lmu10.tfm \
tex-ts1-lmvtk10.tfm \
tex-ts1-lmvtko10.tfm \
tex-ts1-lmvtl10.tfm \
tex-ts1-lmvtlo10.tfm \
tex-ts1-lmvtt10.tfm \
tex-ts1-lmvtto10.tfm \
tex-ts1lmdh.fd \
tex-ts1lmr.fd \
tex-ts1lmss.fd \
tex-ts1lmssq.fd \
tex-ts1lmtt.fd \
tex-ts1lmvtt.fd \
texlive-lm"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
