SUMMARY = "Sans-math fonts for use with newtx"
DESCRIPTION = "The package provides a maths support that amounts to \
modifications of the STIX sans serif Roman and Greek letters \
with most symbols taken from newtxmath (which must of course be \
installed and its map file enabled)."
LICENSE = "OFL-1.1"

PV = "2023.201.1.054svn59227"

RPM_NAME = "texlive-newtxsf-2023.201.1.054svn59227-54.1.noarch.rpm"
RPM_HASH = "4024808533e5cf3e26c2ea28722c5a07babcbde148d36a78ab41b41352e474a2c3f034437ad1ee15648e5d1be9c8f871ce0d09cd6d6d53f06c478e827ba9d742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newtxsf.map \
tex-newtxsf.sty \
tex-ntxsfbmi.tfm \
tex-ntxsfbmi.vf \
tex-ntxsfbmia.tfm \
tex-ntxsfbmia.vf \
tex-ntxsfmi.tfm \
tex-ntxsfmi.vf \
tex-ntxsfmia.tfm \
tex-ntxsfmia.vf \
tex-omlntxsfmi.fd \
tex-untxsfmia.fd \
tex-zsfmi-bol.tfm \
tex-zsfmi-reg.tfm \
tex-zsfmia-bol.tfm \
tex-zsfmia-reg.tfm \
texlive-newtxsf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-rtxbmi.tfm \
tex-rtxmi.tfm \
tex-txbmia.tfm \
tex-txbsyb.tfm \
tex-txbsyc.tfm \
tex-txmia.tfm \
tex-txsyb.tfm \
tex-txsyc.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newtxsf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
