SUMMARY = "Construct dichotomous identification keys"
DESCRIPTION = "The package can be used to construct dichotomous identification \
keys (used especially in biology for species identification), \
taking care of numbering and indentation of successive key \
steps automatically. An example file is provided, which \
demonstrates usage."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17192"

RPM_NAME = "texlive-dichokey-2023.201.svn17192-52.1.noarch.rpm"
RPM_HASH = "447f40fb81610b415938007b5bfb1d8019555d0d2f93b16e4ba00fe6155bc009704a0c4dcb951fd0549112b474c182ae8f45e7d556c941cb7d43d44712e21035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dichokey.sty) \
texlive-dichokey"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
