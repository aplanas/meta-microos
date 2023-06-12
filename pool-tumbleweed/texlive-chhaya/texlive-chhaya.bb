SUMMARY = "Linguistic glossing in Marathi language"
DESCRIPTION = "muNbii vidyaapiitthaacyaa chaayaalekhn niymaavliis anusruun \
bhaassaavaijnyaanik chaayaaNgaaNce sNkssep purvnnaaraa \
aajnyaasNc. This package provides macros for linguistic \
glossing as per the rules given by Mumbai University."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-2023.201.0.0.4svn61719-53.1.noarch.rpm"
RPM_HASH = "8800301298dd07b64b77b0682051313ba230c23052ff51c69b7cc79e732e66e7fd9fd191d0b2eb3ff30dc7bbef1bcc298ef14b9694735ce09d2fc17e4c50fa4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chhaya.sty) \
tex(sankshep.tex) \
texlive-chhaya"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(glossaries.sty) \
tex(iftex.sty) \
tex(marathi.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
