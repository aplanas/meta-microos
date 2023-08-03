SUMMARY = "Virtual fonts for T1 encoded CMR-fonts"
DESCRIPTION = "A set of virtual fonts which emulates T1 coded fonts using the \
standard CM fonts. The package name, AE fonts, supposedly \
stands for 'Almost European'. The main use of the package was \
to produce PDF files using Adobe Type 1 versions of the CM \
fonts instead of bitmapped EC fonts. Note that direct \
substitutes for the bitmapped EC fonts are now available, via \
the CM-super, Latin Modern and (in a restricted way) CM-LGC \
font sets."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-ae-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "f92f4838b0fffe4ff17b0a3831630b2667af280c120e0131b79ab9f4842e8af2b902b3a475ac2762cb6b5647bb20313404cffeaa8b8e7efe5f8dafc50a78b4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ae.sty \
tex-aeb10.tfm \
tex-aeb10.vf \
tex-aebx10.tfm \
tex-aebx10.vf \
tex-aebx12.tfm \
tex-aebx12.vf \
tex-aebx5.tfm \
tex-aebx5.vf \
tex-aebx6.tfm \
tex-aebx6.vf \
tex-aebx7.tfm \
tex-aebx7.vf \
tex-aebx8.tfm \
tex-aebx8.vf \
tex-aebx9.tfm \
tex-aebx9.vf \
tex-aebxsl10.tfm \
tex-aebxsl10.vf \
tex-aebxti10.tfm \
tex-aebxti10.vf \
tex-aecompl.sty \
tex-aecsc10.tfm \
tex-aecsc10.vf \
tex-aeitt10.tfm \
tex-aeitt10.vf \
tex-aer10.tfm \
tex-aer10.vf \
tex-aer12.tfm \
tex-aer12.vf \
tex-aer17.tfm \
tex-aer17.vf \
tex-aer5.tfm \
tex-aer5.vf \
tex-aer6.tfm \
tex-aer6.vf \
tex-aer7.tfm \
tex-aer7.vf \
tex-aer8.tfm \
tex-aer8.vf \
tex-aer9.tfm \
tex-aer9.vf \
tex-aesl10.tfm \
tex-aesl10.vf \
tex-aesl12.tfm \
tex-aesl12.vf \
tex-aesl8.tfm \
tex-aesl8.vf \
tex-aesl9.tfm \
tex-aesl9.vf \
tex-aesltt10.tfm \
tex-aesltt10.vf \
tex-aess10.tfm \
tex-aess10.vf \
tex-aess12.tfm \
tex-aess12.vf \
tex-aess17.tfm \
tex-aess17.vf \
tex-aess8.tfm \
tex-aess8.vf \
tex-aess9.tfm \
tex-aess9.vf \
tex-aessbx10.tfm \
tex-aessbx10.vf \
tex-aessdc10.tfm \
tex-aessdc10.vf \
tex-aessi10.tfm \
tex-aessi10.vf \
tex-aessi12.tfm \
tex-aessi12.vf \
tex-aessi17.tfm \
tex-aessi17.vf \
tex-aessi8.tfm \
tex-aessi8.vf \
tex-aessi9.tfm \
tex-aessi9.vf \
tex-aetcsc10.tfm \
tex-aetcsc10.vf \
tex-aeti10.tfm \
tex-aeti10.vf \
tex-aeti12.tfm \
tex-aeti12.vf \
tex-aeti7.tfm \
tex-aeti7.vf \
tex-aeti8.tfm \
tex-aeti8.vf \
tex-aeti9.tfm \
tex-aeti9.vf \
tex-aett10.tfm \
tex-aett10.vf \
tex-aett12.tfm \
tex-aett12.vf \
tex-aett8.tfm \
tex-aett8.vf \
tex-aett9.tfm \
tex-aett9.vf \
tex-laess8.tfm \
tex-laess8.vf \
tex-laessb8.tfm \
tex-laessb8.vf \
tex-laessi8.tfm \
tex-laessi8.vf \
tex-omlaer.fd \
tex-omsaer.fd \
tex-ot1aer.fd \
tex-ot1aess.fd \
tex-ot1aett.fd \
tex-ot1laess.fd \
tex-ot1laett.fd \
tex-t1aer.fd \
tex-t1aess.fd \
tex-t1aett.fd \
tex-t1laess.fd \
tex-t1laett.fd \
texlive-ae"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmb10.tfm \
tex-cmbsy10.tfm \
tex-cmbx10.tfm \
tex-cmbx12.tfm \
tex-cmbx5.tfm \
tex-cmbx6.tfm \
tex-cmbx7.tfm \
tex-cmbx8.tfm \
tex-cmbx9.tfm \
tex-cmbxsl10.tfm \
tex-cmbxti10.tfm \
tex-cmcsc10.tfm \
tex-cmitt10.tfm \
tex-cmmi10.tfm \
tex-cmmi12.tfm \
tex-cmmi5.tfm \
tex-cmmi6.tfm \
tex-cmmi7.tfm \
tex-cmmi8.tfm \
tex-cmmi9.tfm \
tex-cmmib10.tfm \
tex-cmr10.tfm \
tex-cmr12.tfm \
tex-cmr17.tfm \
tex-cmr5.tfm \
tex-cmr6.tfm \
tex-cmr7.tfm \
tex-cmr8.tfm \
tex-cmr9.tfm \
tex-cmsl10.tfm \
tex-cmsl12.tfm \
tex-cmsl8.tfm \
tex-cmsl9.tfm \
tex-cmsltt10.tfm \
tex-cmss10.tfm \
tex-cmss12.tfm \
tex-cmss17.tfm \
tex-cmss8.tfm \
tex-cmss9.tfm \
tex-cmssbx10.tfm \
tex-cmssdc10.tfm \
tex-cmssi10.tfm \
tex-cmssi12.tfm \
tex-cmssi17.tfm \
tex-cmssi8.tfm \
tex-cmssi9.tfm \
tex-cmsy10.tfm \
tex-cmsy5.tfm \
tex-cmsy6.tfm \
tex-cmsy7.tfm \
tex-cmsy8.tfm \
tex-cmsy9.tfm \
tex-cmtcsc10.tfm \
tex-cmti10.tfm \
tex-cmti12.tfm \
tex-cmti7.tfm \
tex-cmti8.tfm \
tex-cmti9.tfm \
tex-cmtt10.tfm \
tex-cmtt12.tfm \
tex-cmtt8.tfm \
tex-cmtt9.tfm \
tex-cmu10.tfm \
tex-fontenc.sty \
tex-lcmss8.tfm \
tex-lcmssb8.tfm \
tex-lcmssi8.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
