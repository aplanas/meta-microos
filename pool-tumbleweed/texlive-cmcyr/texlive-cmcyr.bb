SUMMARY = "Computer Modern fonts with cyrillic extensions"
DESCRIPTION = "These are the Computer Modern fonts extended with Russian \
letters, in Metafont sources and ATM Compatible Type 1 format. \
The fonts are provided in KOI-7, but virtual fonts are \
available to recode them to three other Russian 8-bit \
encodings."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn60630"

RPM_NAME = "texlive-cmcyr-2023.201.svn60630-53.1.noarch.rpm"
RPM_HASH = "b31c1850189cd0d2767cea9467eda034ad835eeabaf1d3717cea6caf674ddd8c56361656512446bb1d06a26dade032fecd4b456f0b2c50995fd40341ee51705f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cmcb10.tfm) \
tex(cmcbx10.tfm) \
tex(cmcbx12.tfm) \
tex(cmcbx5.tfm) \
tex(cmcbx6.tfm) \
tex(cmcbx7.tfm) \
tex(cmcbx8.tfm) \
tex(cmcbx9.tfm) \
tex(cmcbxsl10.tfm) \
tex(cmcbxti10.tfm) \
tex(cmccsc10.tfm) \
tex(cmccsc8.tfm) \
tex(cmccsc9.tfm) \
tex(cmcinch.tfm) \
tex(cmcitt10.tfm) \
tex(cmcsl10.tfm) \
tex(cmcsl12.tfm) \
tex(cmcsl8.tfm) \
tex(cmcsl9.tfm) \
tex(cmcsltt10.tfm) \
tex(cmcss10.tfm) \
tex(cmcss12.tfm) \
tex(cmcss17.tfm) \
tex(cmcss8.tfm) \
tex(cmcss9.tfm) \
tex(cmcssbx10.tfm) \
tex(cmcssdc10.tfm) \
tex(cmcssi10.tfm) \
tex(cmcssi12.tfm) \
tex(cmcssi17.tfm) \
tex(cmcssi8.tfm) \
tex(cmcssi9.tfm) \
tex(cmcssq8.tfm) \
tex(cmcssqi8.tfm) \
tex(cmcti10.tfm) \
tex(cmcti12.tfm) \
tex(cmcti7.tfm) \
tex(cmcti8.tfm) \
tex(cmcti9.tfm) \
tex(cmctt10.tfm) \
tex(cmctt12.tfm) \
tex(cmctt8.tfm) \
tex(cmctt9.tfm) \
tex(cmcu10.tfm) \
tex(cmcyr.map) \
tex(cmcyr10.tfm) \
tex(cmcyr12.tfm) \
tex(cmcyr17.tfm) \
tex(cmcyr5.tfm) \
tex(cmcyr6.tfm) \
tex(cmcyr7.tfm) \
tex(cmcyr8.tfm) \
tex(cmcyr9.tfm) \
tex(kcmb10.tfm) \
tex(kcmb10.vf) \
tex(kcmbx10.tfm) \
tex(kcmbx10.vf) \
tex(kcmbx12.tfm) \
tex(kcmbx12.vf) \
tex(kcmbx5.tfm) \
tex(kcmbx5.vf) \
tex(kcmbx6.tfm) \
tex(kcmbx6.vf) \
tex(kcmbx7.tfm) \
tex(kcmbx7.vf) \
tex(kcmbx8.tfm) \
tex(kcmbx8.vf) \
tex(kcmbx9.tfm) \
tex(kcmbx9.vf) \
tex(kcmbxsl10.tfm) \
tex(kcmbxsl10.vf) \
tex(kcmbxti10.tfm) \
tex(kcmbxti10.vf) \
tex(kcmcsc10.tfm) \
tex(kcmcsc10.vf) \
tex(kcmcsc8.tfm) \
tex(kcmcsc8.vf) \
tex(kcmcsc9.tfm) \
tex(kcmcsc9.vf) \
tex(kcminch.tfm) \
tex(kcminch.vf) \
tex(kcmitt10.tfm) \
tex(kcmitt10.vf) \
tex(kcmmi10.tfm) \
tex(kcmmi10.vf) \
tex(kcmmi12.tfm) \
tex(kcmmi12.vf) \
tex(kcmmi5.tfm) \
tex(kcmmi5.vf) \
tex(kcmmi6.tfm) \
tex(kcmmi6.vf) \
tex(kcmmi7.tfm) \
tex(kcmmi7.vf) \
tex(kcmmi8.tfm) \
tex(kcmmi8.vf) \
tex(kcmmi9.tfm) \
tex(kcmmi9.vf) \
tex(kcmmib10.tfm) \
tex(kcmmib10.vf) \
tex(kcmr10.tfm) \
tex(kcmr10.vf) \
tex(kcmr12.tfm) \
tex(kcmr12.vf) \
tex(kcmr17.tfm) \
tex(kcmr17.vf) \
tex(kcmr5.tfm) \
tex(kcmr5.vf) \
tex(kcmr6.tfm) \
tex(kcmr6.vf) \
tex(kcmr7.tfm) \
tex(kcmr7.vf) \
tex(kcmr8.tfm) \
tex(kcmr8.vf) \
tex(kcmr9.tfm) \
tex(kcmr9.vf) \
tex(kcmsl10.tfm) \
tex(kcmsl10.vf) \
tex(kcmsl12.tfm) \
tex(kcmsl12.vf) \
tex(kcmsl8.tfm) \
tex(kcmsl8.vf) \
tex(kcmsl9.tfm) \
tex(kcmsl9.vf) \
tex(kcmsltt10.tfm) \
tex(kcmsltt10.vf) \
tex(kcmss10.tfm) \
tex(kcmss10.vf) \
tex(kcmss12.tfm) \
tex(kcmss12.vf) \
tex(kcmss17.tfm) \
tex(kcmss17.vf) \
tex(kcmss8.tfm) \
tex(kcmss8.vf) \
tex(kcmss9.tfm) \
tex(kcmss9.vf) \
tex(kcmssbx10.tfm) \
tex(kcmssbx10.vf) \
tex(kcmssdc10.tfm) \
tex(kcmssdc10.vf) \
tex(kcmssi10.tfm) \
tex(kcmssi10.vf) \
tex(kcmssi12.tfm) \
tex(kcmssi12.vf) \
tex(kcmssi17.tfm) \
tex(kcmssi17.vf) \
tex(kcmssi8.tfm) \
tex(kcmssi8.vf) \
tex(kcmssi9.tfm) \
tex(kcmssi9.vf) \
tex(kcmssq8.tfm) \
tex(kcmssq8.vf) \
tex(kcmssqi8.tfm) \
tex(kcmssqi8.vf) \
tex(kcmti10.tfm) \
tex(kcmti10.vf) \
tex(kcmti12.tfm) \
tex(kcmti12.vf) \
tex(kcmti7.tfm) \
tex(kcmti7.vf) \
tex(kcmti8.tfm) \
tex(kcmti8.vf) \
tex(kcmti9.tfm) \
tex(kcmti9.vf) \
tex(kcmtt10.tfm) \
tex(kcmtt10.vf) \
tex(kcmtt12.tfm) \
tex(kcmtt12.vf) \
tex(kcmtt8.tfm) \
tex(kcmtt8.vf) \
tex(kcmtt9.tfm) \
tex(kcmtt9.vf) \
tex(kcmu10.tfm) \
tex(kcmu10.vf) \
tex(wcmb10.tfm) \
tex(wcmb10.vf) \
tex(wcmbx10.tfm) \
tex(wcmbx10.vf) \
tex(wcmbx12.tfm) \
tex(wcmbx12.vf) \
tex(wcmbx5.tfm) \
tex(wcmbx5.vf) \
tex(wcmbx6.tfm) \
tex(wcmbx6.vf) \
tex(wcmbx7.tfm) \
tex(wcmbx7.vf) \
tex(wcmbx8.tfm) \
tex(wcmbx8.vf) \
tex(wcmbx9.tfm) \
tex(wcmbx9.vf) \
tex(wcmbxsl10.tfm) \
tex(wcmbxsl10.vf) \
tex(wcmbxti10.tfm) \
tex(wcmbxti10.vf) \
tex(wcmcsc10.tfm) \
tex(wcmcsc10.vf) \
tex(wcmcsc8.tfm) \
tex(wcmcsc8.vf) \
tex(wcmcsc9.tfm) \
tex(wcmcsc9.vf) \
tex(wcminch.tfm) \
tex(wcminch.vf) \
tex(wcmitt10.tfm) \
tex(wcmitt10.vf) \
tex(wcmmi10.tfm) \
tex(wcmmi10.vf) \
tex(wcmmi12.tfm) \
tex(wcmmi12.vf) \
tex(wcmmi5.tfm) \
tex(wcmmi5.vf) \
tex(wcmmi6.tfm) \
tex(wcmmi6.vf) \
tex(wcmmi7.tfm) \
tex(wcmmi7.vf) \
tex(wcmmi8.tfm) \
tex(wcmmi8.vf) \
tex(wcmmi9.tfm) \
tex(wcmmi9.vf) \
tex(wcmmib10.tfm) \
tex(wcmmib10.vf) \
tex(wcmr10.tfm) \
tex(wcmr10.vf) \
tex(wcmr12.tfm) \
tex(wcmr12.vf) \
tex(wcmr17.tfm) \
tex(wcmr17.vf) \
tex(wcmr5.tfm) \
tex(wcmr5.vf) \
tex(wcmr6.tfm) \
tex(wcmr6.vf) \
tex(wcmr7.tfm) \
tex(wcmr7.vf) \
tex(wcmr8.tfm) \
tex(wcmr8.vf) \
tex(wcmr9.tfm) \
tex(wcmr9.vf) \
tex(wcmsl10.tfm) \
tex(wcmsl10.vf) \
tex(wcmsl12.tfm) \
tex(wcmsl12.vf) \
tex(wcmsl8.tfm) \
tex(wcmsl8.vf) \
tex(wcmsl9.tfm) \
tex(wcmsl9.vf) \
tex(wcmsltt10.tfm) \
tex(wcmsltt10.vf) \
tex(wcmss10.tfm) \
tex(wcmss10.vf) \
tex(wcmss12.tfm) \
tex(wcmss12.vf) \
tex(wcmss17.tfm) \
tex(wcmss17.vf) \
tex(wcmss8.tfm) \
tex(wcmss8.vf) \
tex(wcmss9.tfm) \
tex(wcmss9.vf) \
tex(wcmssbx10.tfm) \
tex(wcmssbx10.vf) \
tex(wcmssdc10.tfm) \
tex(wcmssdc10.vf) \
tex(wcmssi10.tfm) \
tex(wcmssi10.vf) \
tex(wcmssi12.tfm) \
tex(wcmssi12.vf) \
tex(wcmssi17.tfm) \
tex(wcmssi17.vf) \
tex(wcmssi8.tfm) \
tex(wcmssi8.vf) \
tex(wcmssi9.tfm) \
tex(wcmssi9.vf) \
tex(wcmssq8.tfm) \
tex(wcmssq8.vf) \
tex(wcmssqi8.tfm) \
tex(wcmssqi8.vf) \
tex(wcmti10.tfm) \
tex(wcmti10.vf) \
tex(wcmti12.tfm) \
tex(wcmti12.vf) \
tex(wcmti7.tfm) \
tex(wcmti7.vf) \
tex(wcmti8.tfm) \
tex(wcmti8.vf) \
tex(wcmti9.tfm) \
tex(wcmti9.vf) \
tex(wcmtt10.tfm) \
tex(wcmtt10.vf) \
tex(wcmtt12.tfm) \
tex(wcmtt12.vf) \
tex(wcmtt8.tfm) \
tex(wcmtt8.vf) \
tex(wcmtt9.tfm) \
tex(wcmtt9.vf) \
tex(wcmu10.tfm) \
tex(wcmu10.vf) \
tex(xcmb10.tfm) \
tex(xcmb10.vf) \
tex(xcmbx10.tfm) \
tex(xcmbx10.vf) \
tex(xcmbx12.tfm) \
tex(xcmbx12.vf) \
tex(xcmbx5.tfm) \
tex(xcmbx5.vf) \
tex(xcmbx6.tfm) \
tex(xcmbx6.vf) \
tex(xcmbx7.tfm) \
tex(xcmbx7.vf) \
tex(xcmbx8.tfm) \
tex(xcmbx8.vf) \
tex(xcmbx9.tfm) \
tex(xcmbx9.vf) \
tex(xcmbxsl10.tfm) \
tex(xcmbxsl10.vf) \
tex(xcmbxti10.tfm) \
tex(xcmbxti10.vf) \
tex(xcmcsc10.tfm) \
tex(xcmcsc10.vf) \
tex(xcmcsc8.tfm) \
tex(xcmcsc8.vf) \
tex(xcmcsc9.tfm) \
tex(xcmcsc9.vf) \
tex(xcminch.tfm) \
tex(xcminch.vf) \
tex(xcmitt10.tfm) \
tex(xcmitt10.vf) \
tex(xcmmi10.tfm) \
tex(xcmmi10.vf) \
tex(xcmmi12.tfm) \
tex(xcmmi12.vf) \
tex(xcmmi5.tfm) \
tex(xcmmi5.vf) \
tex(xcmmi6.tfm) \
tex(xcmmi6.vf) \
tex(xcmmi7.tfm) \
tex(xcmmi7.vf) \
tex(xcmmi8.tfm) \
tex(xcmmi8.vf) \
tex(xcmmi9.tfm) \
tex(xcmmi9.vf) \
tex(xcmmib10.tfm) \
tex(xcmmib10.vf) \
tex(xcmr10.tfm) \
tex(xcmr10.vf) \
tex(xcmr12.tfm) \
tex(xcmr12.vf) \
tex(xcmr17.tfm) \
tex(xcmr17.vf) \
tex(xcmr5.tfm) \
tex(xcmr5.vf) \
tex(xcmr6.tfm) \
tex(xcmr6.vf) \
tex(xcmr7.tfm) \
tex(xcmr7.vf) \
tex(xcmr8.tfm) \
tex(xcmr8.vf) \
tex(xcmr9.tfm) \
tex(xcmr9.vf) \
tex(xcmsl10.tfm) \
tex(xcmsl10.vf) \
tex(xcmsl12.tfm) \
tex(xcmsl12.vf) \
tex(xcmsl8.tfm) \
tex(xcmsl8.vf) \
tex(xcmsl9.tfm) \
tex(xcmsl9.vf) \
tex(xcmsltt10.tfm) \
tex(xcmsltt10.vf) \
tex(xcmss10.tfm) \
tex(xcmss10.vf) \
tex(xcmss12.tfm) \
tex(xcmss12.vf) \
tex(xcmss17.tfm) \
tex(xcmss17.vf) \
tex(xcmss8.tfm) \
tex(xcmss8.vf) \
tex(xcmss9.tfm) \
tex(xcmss9.vf) \
tex(xcmssbx10.tfm) \
tex(xcmssbx10.vf) \
tex(xcmssdc10.tfm) \
tex(xcmssdc10.vf) \
tex(xcmssi10.tfm) \
tex(xcmssi10.vf) \
tex(xcmssi12.tfm) \
tex(xcmssi12.vf) \
tex(xcmssi17.tfm) \
tex(xcmssi17.vf) \
tex(xcmssi8.tfm) \
tex(xcmssi8.vf) \
tex(xcmssi9.tfm) \
tex(xcmssi9.vf) \
tex(xcmssq8.tfm) \
tex(xcmssq8.vf) \
tex(xcmssqi8.tfm) \
tex(xcmssqi8.vf) \
tex(xcmti10.tfm) \
tex(xcmti10.vf) \
tex(xcmti12.tfm) \
tex(xcmti12.vf) \
tex(xcmti7.tfm) \
tex(xcmti7.vf) \
tex(xcmti8.tfm) \
tex(xcmti8.vf) \
tex(xcmti9.tfm) \
tex(xcmti9.vf) \
tex(xcmtt10.tfm) \
tex(xcmtt10.vf) \
tex(xcmtt12.tfm) \
tex(xcmtt12.vf) \
tex(xcmtt8.tfm) \
tex(xcmtt8.vf) \
tex(xcmtt9.tfm) \
tex(xcmtt9.vf) \
tex(xcmu10.tfm) \
tex(xcmu10.vf) \
tex(ycmb10.tfm) \
tex(ycmb10.vf) \
tex(ycmbx10.tfm) \
tex(ycmbx10.vf) \
tex(ycmbx12.tfm) \
tex(ycmbx12.vf) \
tex(ycmbx5.tfm) \
tex(ycmbx5.vf) \
tex(ycmbx6.tfm) \
tex(ycmbx6.vf) \
tex(ycmbx7.tfm) \
tex(ycmbx7.vf) \
tex(ycmbx8.tfm) \
tex(ycmbx8.vf) \
tex(ycmbx9.tfm) \
tex(ycmbx9.vf) \
tex(ycmbxsl10.tfm) \
tex(ycmbxsl10.vf) \
tex(ycmbxti10.tfm) \
tex(ycmbxti10.vf) \
tex(ycmcsc10.tfm) \
tex(ycmcsc10.vf) \
tex(ycmcsc8.tfm) \
tex(ycmcsc8.vf) \
tex(ycmcsc9.tfm) \
tex(ycmcsc9.vf) \
tex(ycminch.tfm) \
tex(ycminch.vf) \
tex(ycmitt10.tfm) \
tex(ycmitt10.vf) \
tex(ycmmi10.tfm) \
tex(ycmmi10.vf) \
tex(ycmmi12.tfm) \
tex(ycmmi12.vf) \
tex(ycmmi5.tfm) \
tex(ycmmi5.vf) \
tex(ycmmi6.tfm) \
tex(ycmmi6.vf) \
tex(ycmmi7.tfm) \
tex(ycmmi7.vf) \
tex(ycmmi8.tfm) \
tex(ycmmi8.vf) \
tex(ycmmi9.tfm) \
tex(ycmmi9.vf) \
tex(ycmmib10.tfm) \
tex(ycmmib10.vf) \
tex(ycmr10.tfm) \
tex(ycmr10.vf) \
tex(ycmr12.tfm) \
tex(ycmr12.vf) \
tex(ycmr17.tfm) \
tex(ycmr17.vf) \
tex(ycmr5.tfm) \
tex(ycmr5.vf) \
tex(ycmr6.tfm) \
tex(ycmr6.vf) \
tex(ycmr7.tfm) \
tex(ycmr7.vf) \
tex(ycmr8.tfm) \
tex(ycmr8.vf) \
tex(ycmr9.tfm) \
tex(ycmr9.vf) \
tex(ycmsl10.tfm) \
tex(ycmsl10.vf) \
tex(ycmsl12.tfm) \
tex(ycmsl12.vf) \
tex(ycmsl8.tfm) \
tex(ycmsl8.vf) \
tex(ycmsl9.tfm) \
tex(ycmsl9.vf) \
tex(ycmsltt10.tfm) \
tex(ycmsltt10.vf) \
tex(ycmss10.tfm) \
tex(ycmss10.vf) \
tex(ycmss12.tfm) \
tex(ycmss12.vf) \
tex(ycmss17.tfm) \
tex(ycmss17.vf) \
tex(ycmss8.tfm) \
tex(ycmss8.vf) \
tex(ycmss9.tfm) \
tex(ycmss9.vf) \
tex(ycmssbx10.tfm) \
tex(ycmssbx10.vf) \
tex(ycmssdc10.tfm) \
tex(ycmssdc10.vf) \
tex(ycmssi10.tfm) \
tex(ycmssi10.vf) \
tex(ycmssi12.tfm) \
tex(ycmssi12.vf) \
tex(ycmssi17.tfm) \
tex(ycmssi17.vf) \
tex(ycmssi8.tfm) \
tex(ycmssi8.vf) \
tex(ycmssi9.tfm) \
tex(ycmssi9.vf) \
tex(ycmssq8.tfm) \
tex(ycmssq8.vf) \
tex(ycmssqi8.tfm) \
tex(ycmssqi8.vf) \
tex(ycmti10.tfm) \
tex(ycmti10.vf) \
tex(ycmti12.tfm) \
tex(ycmti12.vf) \
tex(ycmti7.tfm) \
tex(ycmti7.vf) \
tex(ycmti8.tfm) \
tex(ycmti8.vf) \
tex(ycmti9.tfm) \
tex(ycmti9.vf) \
tex(ycmtt10.tfm) \
tex(ycmtt10.vf) \
tex(ycmtt12.tfm) \
tex(ycmtt12.vf) \
tex(ycmtt8.tfm) \
tex(ycmtt8.vf) \
tex(ycmtt9.tfm) \
tex(ycmtt9.vf) \
tex(ycmu10.tfm) \
tex(ycmu10.vf) \
texlive-cmcyr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cmb10.tfm) \
tex(cmbx10.tfm) \
tex(cmbx12.tfm) \
tex(cmbx5.tfm) \
tex(cmbx6.tfm) \
tex(cmbx7.tfm) \
tex(cmbx8.tfm) \
tex(cmbx9.tfm) \
tex(cmbxsl10.tfm) \
tex(cmbxti10.tfm) \
tex(cmcsc10.tfm) \
tex(cmcsc8.tfm) \
tex(cmcsc9.tfm) \
tex(cminch.tfm) \
tex(cmitt10.tfm) \
tex(cmmi10.tfm) \
tex(cmmi12.tfm) \
tex(cmmi5.tfm) \
tex(cmmi6.tfm) \
tex(cmmi7.tfm) \
tex(cmmi8.tfm) \
tex(cmmi9.tfm) \
tex(cmmib10.tfm) \
tex(cmr10.tfm) \
tex(cmr12.tfm) \
tex(cmr17.tfm) \
tex(cmr5.tfm) \
tex(cmr6.tfm) \
tex(cmr7.tfm) \
tex(cmr8.tfm) \
tex(cmr9.tfm) \
tex(cmsl10.tfm) \
tex(cmsl12.tfm) \
tex(cmsl8.tfm) \
tex(cmsl9.tfm) \
tex(cmsltt10.tfm) \
tex(cmss10.tfm) \
tex(cmss12.tfm) \
tex(cmss17.tfm) \
tex(cmss8.tfm) \
tex(cmss9.tfm) \
tex(cmssbx10.tfm) \
tex(cmssdc10.tfm) \
tex(cmssi10.tfm) \
tex(cmssi12.tfm) \
tex(cmssi17.tfm) \
tex(cmssi8.tfm) \
tex(cmssi9.tfm) \
tex(cmssq8.tfm) \
tex(cmssqi8.tfm) \
tex(cmti10.tfm) \
tex(cmti12.tfm) \
tex(cmti7.tfm) \
tex(cmti8.tfm) \
tex(cmti9.tfm) \
tex(cmtt10.tfm) \
tex(cmtt12.tfm) \
tex(cmtt8.tfm) \
tex(cmtt9.tfm) \
tex(cmu10.tfm) \
tex(updmap.cfg) \
texlive \
texlive-cmcyr-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm