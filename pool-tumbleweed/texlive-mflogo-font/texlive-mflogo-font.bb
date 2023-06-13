SUMMARY = "Metafont logo font"
DESCRIPTION = "These fonts were created in Metafont by Knuth, for his own \
publications. At some stage, the letters 'P' and 'S' were \
added, so that the MetaPost logo could also be expressed. The \
fonts were originally issued (of course) as Metafont source; \
they have since been autotraced and reissued in Adobe Type 1 \
format by Taco Hoekwater."
LICENSE = "SUSE-TeX"

PV = "2023.201.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-2023.201.1.002svn54512-54.1.noarch.rpm"
RPM_HASH = "6416e832c43e16aeff8255c9960812787a09e69f06131b2a5cb801a49c61f1e7faf3adc262d7b5467f444b32106ec312693cf5a59fbff0414f3166559c845367"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mflogo.map) \
texlive-mflogo-font"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mflogo-font-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
